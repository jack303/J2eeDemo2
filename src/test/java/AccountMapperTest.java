import com.hwadee.entity.Account;
import com.hwadee.dao.AccountMapper;
import com.hwadee.model.AccountDto;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by localdomain on 2017/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class AccountMapperTest {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session = null;

    AccountMapper accountMapper;

    /*@BeforeClass
    public static void beforeClass() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
*/
    @Before
    public void before() {
        session = sqlSessionFactory.openSession();
        accountMapper = session.getMapper(AccountMapper.class);
    }

    @Test
    public void testGetAccountById() {
        Account account = accountMapper.getAccountById(2);
        System.out.print(account.toString());
    }

    @Test
    public void testFindAll() {
        AccountDto accountDto = new AccountDto();
        accountDto.setNickName("张");
        accountDto.setStart(0);
        accountDto.setSize(5);
        List<Account> list = accountMapper.findAll(accountDto);
        System.out.print(list.toString());
    }

    @After
    public void after() {
        session.close();
    }


}

import com.hwadee.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by localdomain on 2017/3/6.
 */
public class AccountTest {

    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession session =null;

//    @BeforeClass
//    public static void beforeClass() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    }

    @Before
    public void before()
    {
        session = sqlSessionFactory.openSession();
    }

    @Test
    public void testGetAccountById()
    {
        Account account = session.selectOne("com.hwadee.dao.AccountMapper.getAccountById");
        System.out.print(account.toString());
    }

    @Test
    public void testFindAll()
    {
        List<Account> list = session.selectList("com.hwadee.dao.AccountMapper.findAll");
        System.out.print(list.toString());
    }

    @After
    public void after()
    {
        session.close();
    }
}

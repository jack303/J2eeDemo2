<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>我的首页-微博 随时随地发现新鲜事</title>
	<link rel="shortcut icon" type="image/x-icon" href="http://weibo.com/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="/assets/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="/assets/css/index.css"/>
	<link rel="stylesheet" type="text/css" href="/assets/css/Font-Awesome-3.2.1/css/font-awesome.min.css"/>
	<style type="text/css">
		bbbb {
			border:1px solid #163156;
		}
	</style>
	<script type="text/javascript" src="/assets/js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="/assets/js/index.js"></script>

</head>
<body>
	<div class="wrapper">
		<div class="content-center clearfix">
			<div style="visibility: hidden;width:140px;height: 1px;float:left;">&nbsp;</div>
			<div class="menu">
				<ul>
					<li><a href="">首页</a></li>
					<li><a href="">我的收藏</a></li>
					<li><a href="">我的赞</a></li>
				</ul>
				<ul class="hot">
					<li><a href=""><i class="icon-fire"></i>&nbsp;热门微博</a><em></em></li>
					<li class="cog"><i class="icon-cog"></i></li>
				</ul>
				<ul>
					<li><a href=""><i class="icon-heart-empty"></i>&nbsp;好友圈</a></li>
					<li><a href="">群微博</a></li>
					<li><a href="">特别关注</a></li>
					<li><a href="">小学</a></li>
					<li><a href="">校友</a></li>
					
				</ul>
				
			</div>
			<div class="m-list">
				<div class="send">
					<textarea class="content"></textarea>
					<input class="btn" type="button" />
				</div>
				<div class="w-list">
				
					<%--<c:forEach items="${pi.list }" var="w">
					<div class="weibo">
						<div class="weibo-content">
							<img class="header" src="/assets/image/${w.account.pic }" />
							<h3><a>${w.account.nickName }</a></h3>
							<span>
								<a>48 分钟以前</a> 来自
								<a>${w.weibo.service }</a>
							</span>
							<p>${w.weibo.wcontent }</p>
						</div>
						<ul class="clearfix">
							<li><a href="">
							<i class="icon-star-empty"></i>
							<span>收藏</span></a></li>
							<li><a href=""><i class=" icon-share"></i><span>0</span></a></li>
							<li><a href="">
							<i class="icon-comment-alt"></i>
							<span>${w.weibo.comment }</span></a></li>
							<li class="last">
								<c:if test="${w.liked.aid != -1 }">
								<a style="color:red" href="${w.weibo.wid }">
								</c:if>
								<c:if test="${w.liked.aid == -1 }">
								<a href="${w.weibo.wid }">
								</c:if>
									<i class="icon-thumbs-up"></i>
									<span>${w.weibo.liked }</span>
								</a>
							</li>
						</ul>--%>

						<%--<div class="comment">
							<dl>
								<dt><input type="text" /> <input type="button" value="评论"/></dt>
								<dd>
									<a href="">张三</a>:
									<span>测试评论</span>
								</dd>
							</dl>
						</div>

					</div>
					</c:forEach>--%>
					<!-- 
					<div class="weibo">
						<div class="weibo-content">
							<img class="header" src="image/1.jpg" />
							<h3><a>蘑菇街</a></h3>
							<span>
								<a>48 分钟以前</a> 来自
								<a>iPhone 6s</a>
							</span>
							<p>谁的衣柜里没有几件条纹衣服裤子裙子外套打底衫……</p>
						</div>
						<ul class="clearfix">
							<li><a href="">
							<i class="icon-star-empty"></i>
							<span>收藏</span></a></li>
							<li><a href=""><i class=" icon-share"></i><span>0</span></a></li>
							<li><a href="">
							<i class="icon-comment-alt"></i>
							<span>0</span></a></li>
							<li class="last"><a href="">
							<i class="icon-thumbs-up"></i>
							<span>0</span></a></li>
						</ul>
					</div>
					<div class="weibo">
						<div class="weibo-content">
							<img class="header" src="image/1.jpg" />
							<h3><a>蘑菇街</a></h3>
							<span>
								<a>48 分钟以前</a> 来自
								<a>iPhone 6s</a>
							</span>
							<p>谁的衣柜里没有几件条纹衣服裤子裙子外套打底衫……</p>
						</div>
						<ul class="clearfix">
							<li><a href="">
							<i class="icon-star-empty"></i>
							<span>收藏</span></a></li>
							<li><a href=""><i class=" icon-share"></i><span>0</span></a></li>
							<li><a href="">
							<i class="icon-comment-alt"></i>
							<span>0</span></a></li>
							<li class="last"><a class="liked" href="">
							<i class="icon-thumbs-up"></i>
							<span>0</span></a></li>
						</ul>
					</div>
					<div class="weibo">
						<div class="weibo-content">
							<img class="header" src="image/1.jpg" />
							<h3><a>蘑菇街</a></h3>
							<span>
								<a>48 分钟以前</a> 来自
								<a>iPhone 6s</a>
							</span>
							<p>谁的衣柜里没有几件条纹衣服裤子裙子外套打底衫……</p>
						</div>
						<ul class="clearfix">
							<li><a href="">
							<i class="icon-star-empty"></i>
							<span>收藏</span></a></li>
							<li><a href=""><i class=" icon-share"></i><span>0</span></a></li>
							<li><a href="">
							<i class="icon-comment-alt"></i>
							<span>0</span></a></li>
							<li class="last"><a href="">
							<i class="icon-thumbs-up"></i>
							<span>0</span></a></li>
						</ul>
					</div>
					 -->
				</div>
			</div>
			<c:set value="${sessionScope.user }" var="a"></c:set>
			<div class="nav">
				<div class="myinfo">
					<div class="person-info">
						
						<img src="/assets/image/${sessionScope.get("user").pic}">
					</div>
					<div class="innerwrap">

						<h3><a>${sessionScope.get("user").nickName}</a></h3>
						<ul class="clearfix">
							<li>
								<a href="">
								<strong>${sessionScope.get("user").follow}</strong>
								<span>关注</span>
								</a>
							</li>
							<li>
								<a href="">
									<strong>
										${sessionScope.get("user").fans}
									</strong>
									<span>
										粉丝
									</span>
								</a>
							</li>
							<li class="last">
							<a href="">
							<strong>
								${sessionScope.get("user").weibo}
							</strong>
							<span>微博</span>
							</a>
							</li>
						</ul>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">

    wb.init({
        aid:${a.aid}
    });

</script>
</html>
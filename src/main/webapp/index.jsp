<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/common/js/jquery-3.2.1.min.js" />

</head>

<body>
	<img src="./test.jpg" /> This is my JSP page.
	<br>
	<h3>测试@ModelAttribute的不同用法</h3>
	<a href="/zz/model/loginForm1">测试@ModelAttribute(value="")的方法</a>
	<a href="/zz/model/loginForm2">测试@ModelAttribute注释void返回值的方法</a>
	<a href="/zz/model/loginForm3">测试@ModelAttribute注释返回具体类的方法</a>
	<a href="/zz/model/loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a>
	<a href="/zz/model/loginForm5">测试@ModelAttribute注释一个方法的参数</a>
	<br> 编号：
	<span id="id"></span>
	<br> 书名：
	<span id="name"></span>
	<br> 作者：
	<span id="author"></span>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		testRequestBody();
	});

	function testRequestBody() {
		$.ajax("${pageContext.request.contextPath}/json/testRequestBody", {
			dataType : "json", //预期服务器返回的数据类型
			type : "post",
			contextType : "application/json", //发送信息至服务器的数据类型
			data : JSON.stringify({
				id : 88
			}), //json格式传入后台
			async : true, //设置为同步请求，默认是false（异步请求）
			success : function(data) {
				console.log(data);
				$("#id").html(data.id);
				$("#name").html(data.name);
				$("#author").html(data.author);
			},
			error : function() {
				alert("发送失败");
			}
		});
	}
</script>
</html>

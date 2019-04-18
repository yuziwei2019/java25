<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2019/4/18
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改页面</h1>

<form action="/update2" method="post">

    <div>

        <input type="hidden" value="${users.id}" name="id">
    </div>

    <div>
        <label>姓名</label>
        <input type="text" name="name" value="${users.name}">
    </div>

    <div>
        <label>班级号</label>
        <input type="text" name="sid" value="${users.sid}">
    </div>

    <div>

        <input type="submit" value="提交">

    </div>

</form>

</body>
</html>

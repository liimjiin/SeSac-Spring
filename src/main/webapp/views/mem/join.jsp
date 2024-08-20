<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Spring</title>
</head>
<body>
<h1>JoinForm</h1>
<h3>회원가입</h3>
<form action="/mem/join" method="post">
    id:<input type="text" name="id"><br/>
    pw:<input type="text" name="pwd"><br/>
    name:<input type="text" name="name"><br/>
    email:<input type="text" name="email"><br/>
    <input type="submit" value="완료">
</form>
</body>
</html>

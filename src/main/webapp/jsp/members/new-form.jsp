<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
jsp는 자바 코드를 그대로 다 사용 가능, jsp는 html 중심, 윗처럼 해줘야 외부 내용을 받아서 사용 가능
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username /">
    age: <input type="text" name="age"/>
    <button type="submit">전송</button>
</form>
</body>
</html>

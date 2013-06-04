<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dfdfdf</title>
</head>
<body>
    <g:each var="user" in="${users}">
        <tr>
            <td>${user.userName}</td>
        </tr>
    </g:each>
</body>
</html>
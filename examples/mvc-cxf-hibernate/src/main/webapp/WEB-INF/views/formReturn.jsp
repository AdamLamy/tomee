<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Return Message</title>
</head>
<body>
    <jsp:include page="/templates/menu.jsp"></jsp:include>
    <h1 align="center">This page says hello to ${form.formName} who is ${form.formAge} years old!</h1>
</body>
</html>
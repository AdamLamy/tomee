<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
  <title>Personal Information</title>
</head>
<body>
  <jsp:include page="/templates/menu.jsp"></jsp:include>

  <h1>Personal Information Form</h1>

  <form action="return" method="post">
    <label for="formName">Name:</label>
    <input type="text" id="formName" name="formName" value = "${form.formName}" required><br><br>

    <label for="formAge">Age:</label>
    <input type="number" id="formAge" name="formAge" value = "${form.formAge}" required><br><br>

    <input type="submit" value="Submit">
  </form>

</body>
</html>
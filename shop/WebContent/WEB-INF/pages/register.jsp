<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body {
  background-color: violet;
}
</style>
</head>
<body>

<h2>REGISTER FORM</h2>

<form action="save.jsp" method="post">

  <label>User Name</label>
  <input type="text" name="uname">
  <br><br><br>
  <label> Create Password</label>
  <input type="password" name="pwd">
  <br><br><br>
  <label>Mobile Number</label>
  <input type="number" name="num">
  <br><br><br>
  
  <input type="submit" value="REGISTER">
 </form> 

</body>
</html>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>


    
        <h1>ADD NEW MEDIUM</h1>
        <form:form action="saveMedium" method="post" modelAttribute="medium">
      <table>
        <tr>
          <th>Medium Desc</th>
          <td>
            <form:input path="mediumDesc" /> 
          </td>
          <td><button type="submit">Submit</button></td>
        </tr>
      </table>
      </form:form>
       
</body>

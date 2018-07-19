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


    
        <h1>New/Edit Employee</h1>
        <form:form action="saveBook" method="post" modelAttribute="book">
      <table>
        <tr>
          <th>BookID</th>
          <td>
            <form:input path="bookID" /> 
          </td>
          <th>Title</th>
          <td>
            <form:input path="bookTitle" /> 
          </td>
          <td><button type="submit">Submit</button></td>
        </tr>
      </table>
      </form:form>
       
</body>

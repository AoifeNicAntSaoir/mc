<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>

<style>
	table, td, th {
    border: 1px solid black;
}

table {
    border-collapse: collapse;
}

</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
  <h1>Welcome to the Media Centre</h1>
  <p>This is some text.</p> 
</div>

<div class="row">
  <div class="col-sm-4">
  		<h2>Add a New Book</h2>
  		<a href="newBook">New Book</a>
  </div>
  <div class="col-sm-8"><h2>View all Books</h2>
  		<table border="1">
            <th>Book ID</th>
            <th>book Title</th>
            <c:forEach var="book" items="${listBook}">
                <tr>
                    <td>${book.bookId}</td>
                    <td>${book.title}</td> 
                </tr>
            </c:forEach>
         </table>
  </div>
    
</div>

            
   
            
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href = "https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
integrity = "sha384-GJzZqFGwb1QTTN6wy59ffF1BuGpLSa9DKKMp0DgiMDm4iYMj70gZWKYbI706tWS"
crossorigin = "anonymous">
<title>student Form</title>
</head>
<body>

	<div class="container">
		<h3>Add Student </h3>
		<hr>
		<p class="h4 mb-4">student</p>
		<form action="/StudentManagement/student/save" method="POST">
			<input type="hidden" name="id" value="${Student.id }" />

			<div class="form-inline">
				<input type="text" name="firstName" value="${student.firstName }"
					class="form-control mb-4 col-4" placeholder="FirstName">
			</div>

			<div class="form-inline">
				<input type="text" name="lastName" value="${student.lastName }"
					class="form-control mb-4 col-4" placeholder="LastName">
			</div>

			<div class="form-inline">
				<input type="text" name="course" value="${student.course }"
					class="form-control mb-4 col-4" placeholder="course">
			</div>

			<div class="form-inline">
				<input type="text" name="country" value="${student.country }"
					class="form-control mb-4 col-4" placeholder="country">
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		<hr>
		<a href="StudentManagement/student/List">back to student list</a>
	</div>

</body>
</html>
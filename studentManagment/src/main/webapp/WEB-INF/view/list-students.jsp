<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGpLSa9DKKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">


<title>Students Directory</title>
</head>
<body>

	<div class="container">
		<h3>Student List</h3>
		<hr>
		<form action="StudentManagement/student/list" class="form-inline">
			<a href="StudentManagement/student/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Student</a>
		</form>


		<table class="table table-bordered table-stripped">
			<thead class="thead-dark">
				<tr>

					<th>First Name</th>
					<th>Last name</th>
					<th>course</th>
					<th>country</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Students }" var="tempStudent">
					<tr>
						<td><c:out value=${ tempStudent.firstName} /></td>
						<td><c:out value=${ tempStudent.lirstName} /></td>
						<td><c:out value=${ tempStudent.course} /></td>
						<td><c:out value=${ tempStudent.country} /></td>
						<td><a
							href="StudentManagement/student/showFormForUpdate? id = ${tempStudent }"
							class="btn btn-info btn-sm ">Update</a> <a
							href="StudentManagement/student/delete? id = ${tempStudent }"
							class="btn btn-danger btn-sm "
							onlick="if(!(confirm('are you sure you want to delete?'))) return false">delete</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>


</body>
</html>


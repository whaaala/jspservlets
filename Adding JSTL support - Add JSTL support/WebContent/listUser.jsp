<%@include file="/include/header.jsp"%>
<%@ page import="java.util.List"%>
<%@ page import="org.java.entity.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<h1>Listing users</h1>
			<hr />
			<table border="1">
				<thead>
					<th>User ID</th>
					<th>Username</th>
					<th>Email</th>
					<th>Operation</th>
				</thead>

				<c:forEach items="${listUsers}" var="user">
					<c:url var="updateURL" value="operation">
						<c:param name="page" value="updateUser"></c:param>
						<c:param name="usersId" value="${user.user_id}"></c:param>
						<c:param name="username" value="${user.username}"></c:param>
						<c:param name="email" value="${user.email}"></c:param>
					</c:url>

					<c:url var="deleteUser" value="operation">
						<c:param name="page" value="deleteUser"></c:param>
						<c:param name="usersId" value="${user.user_id}"></c:param>
					</c:url>
					<tr>
						<td>${user.user_id}</td>
						<td>${user.username}</td>
						<td>${user.email}</td>
						<td><a href="${updateURL}">Update</a>| <a
							href="${deleteUser}"
							onclick="if(!confirm('Are you sure you want to delete the user?')) return false">Delete</a>
						</td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>

<%@include file="/include/footer.jsp"%>

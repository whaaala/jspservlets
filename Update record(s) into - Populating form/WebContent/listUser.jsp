<%@include file="/include/header.jsp" %>
<%@ page import="java.util.List"%>
<%@ page import="org.java.entity.User"%>

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
				<%
			List<User> listUsers = (List)request.getAttribute("listUsers");
				String tempURL;
			for(int i =0; i<listUsers.size(); i++){
				out.print("<tr>");
				out.print("<td>"+listUsers.get(i).getUser_id()+"</td>");
				out.print("<td>"+listUsers.get(i).getUsername()+"</td>");
				out.print("<td>"+listUsers.get(i).getEmail()+"</td>");
				tempURL = request.getContextPath()+"/operation?page=updateUser"+
						"&usersId="+listUsers.get(i).getUser_id()+
						"&username="+listUsers.get(i).getUsername()+
						"&email="+listUsers.get(i).getEmail();;
				out.print("<td><a href="+tempURL+">Update</a></td>");
				out.print("</tr>");
			}
			
			%>
			</table>
		</div>
	</div>
</div>

<%@include file="/include/footer.jsp" %>

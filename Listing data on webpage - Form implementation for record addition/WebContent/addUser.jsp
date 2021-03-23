<%@include file="/include/header.jsp" %>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<h1>Add a user</h1>
			<form action="${pageContext.request.contextPath}/appController">
			Username: <input type="text" name="username"/><br/><br/>
			Email: <input type="text" name="email"/><br/><br/>
			<input type="submit" value="Add User">
			
			</form>
		</div>
	</div>
</div>

<%@include file="/include/footer.jsp" %>
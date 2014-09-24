<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>GwtpSpringSecurity</title>
    <script type="text/javascript" src="<c:url value="./GwtpSpringSecurity/GwtpSpringSecurity.nocache.js"/>"></script>
    <link href="${pageContext.request.contextPath}/static/icerm.css" rel="stylesheet">
</head>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
		<!-- For login user -->
		<c:url value="/logout-process" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>
				User : ${pageContext.request.userPrincipal.name} | <a
					href="javascript:formSubmit()"> Logout</a>
			</h2>
		</c:if>

		<!-- OPTIONAL: include this if you want history support -->
	    <iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1'
	        style="position: absolute; width: 0;height: 0; border: 0;"></iframe>
	
	    <!-- RECOMMENDED if your web app will not function without JavaScript enabled -->
	    <noscript>
	        <div style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; 
	            background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif;">
	            Your web browser must have JavaScript enabled
	            in order for this application to display correctly.
	        </div>
	    </noscript>
</body>
</html>
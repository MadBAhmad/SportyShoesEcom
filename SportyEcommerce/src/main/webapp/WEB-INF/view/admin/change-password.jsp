<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - Change Password</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/headers/admin-header.jsp" ></jsp:include>
<jsp:include page="/WEB-INF/view/headers/admin-topbar.jsp" ></jsp:include>

${error }
${Success }
<form name=frmPwd method=post action="adminchangepwdaction">
<table border=1 cellspacing=2 cellpadding=4>
 	<tr>
 		<td width=25%>Enter new password*</td>
 		<td><input name=pwd maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td width=25%>Confirm new Password*</td>
 		<td><input name=pwd2 maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td colspan=2>
 			<button>Login</button>
 			${Success }
 		</td>
 	</tr>
 </table>
</form>

<jsp:include page="/WEB-INF/view/headers/admin-footer.jsp"></jsp:include>
</body>
</html>
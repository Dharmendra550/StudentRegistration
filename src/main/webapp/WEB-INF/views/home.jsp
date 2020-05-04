<br>
<br>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="border:2px solid cyan; color:indigo;">
<c:if test="${message ne null }">
<c:out value="${message}"/>
</c:if>
</h2>
<br>
1.New Student<a href="studentRegister">SignUp</a><br>
2.Existing Student<a href="studentLogin">SignIn</a>

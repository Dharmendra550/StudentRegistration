<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="loginStudent" method="post">
<table>
<tr>
   <td>id</td>
   <td><input type="text" name="studentid"></td>
 </tr>

<tr>
   <td>password</td>
   <td><input type="text" name="studentname"></td>
</tr>

<tr>
   <td colspan="2"><input type="submit" value="login">
   </td>
   </tr>
   </table>
</form:form>

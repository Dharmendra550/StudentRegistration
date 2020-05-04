<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<table border="1" bgcolor="orange" height="500" width="500">
<form:form action="saveStudent" method="post" modelAttribute="estd">
 
 <tr>
    <td>studentid</td>
    <td><form:input path="studentid"/></td><br>
 </tr>

<tr>
    <td>studentname</td>
    <td><form:input path="studentname"/></td><br>
 </tr>

<tr>
    <td>marks</td>
    <td><form:input path="marks"/></td><br>
 </tr>
 
 <tr>
    <td>streamname</td>
    <td><form:input path="streamname"/></td><br>
 </tr>
 
 <tr>
 <td colspan="2" align="center"><br>
 <input type="submit" value="Register">
 </td>
 </tr>
</form:form>
</table>
</h2>
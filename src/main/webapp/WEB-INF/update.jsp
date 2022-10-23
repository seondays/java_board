<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Employee</h1>
<form:form method="POST" action="/update" >
    <table >
        <tr>
            <td>SEQ : </td>
            <td>${command.getSEQ()}</td>
            <td><form:hidden  path="SEQ" /></td>
        </tr>
        <tr>
            <td>WRITER : </td>
            <td><form:input path="WRITER"  /></td>
        </tr>
        <tr>
            <td>TITLE :</td>
            <td><form:input path="TITLE" /></td>
        </tr>
        <tr>
            <td>CONTENT :</td>
            <td><form:input path="CONTENT" /></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Edit Save" /></td>
        </tr>
    </table>
</form:form>
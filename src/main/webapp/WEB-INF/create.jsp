<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h1>Add New Post</h1>
<form:form method="POST" action="save" >
    <table >
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
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>



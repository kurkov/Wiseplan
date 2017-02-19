<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.title"/></title>
</head>
<body>

<h2><spring:message code="label.title"/></h2>

<form:form method="post" action="add" commandName="task">

    <table>
        <tr>
            <td colspan="2"><input type="submit" value="<spring:message code="label.addtask"/>"/></td>
        </tr>
    </table>
</form:form>

<h3><spring:message code="label.tasks"/></h3>
<c:if test="${!empty taskList}">
    <table class="data">
        <c:forEach items="${taskList}" var="task">
            <tr>
                <td><a href="delete/${task.id}"><spring:message code="label.delete"/></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>

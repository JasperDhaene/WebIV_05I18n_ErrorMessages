<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

    <head>
        <link rel="stylesheet" href="css/styles.css" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" /> 
        <title>Example validation</title>
    </head>

    <body>

        <form:form method="Post" action="registration.htm"
                   modelAttribute="registration">

            <p><label>User Name:</label>
                <form:input path="userName" size = "20"/>&nbsp;
                <form:errors path="userName" cssClass="error"/>
            </p>

            <p><label>Password:</label>
                <form:password path="password" size = "20"/>&nbsp;
                <form:errors path="password" cssClass="error"/>
            </p>     

            <p><label>confirmPassword:</label>
                <form:password path="confirmPassword" size = "20"/>&nbsp;
                <form:errors path="confirmPassword" cssClass="error"/>
            </p>  
 
            <p><input type="submit" value="Submit" /></p>

            <!--
            <c:if test="${not empty message}">
                <div id="message" 
                     class="${message.type}">${message.message}
                </div>
            </c:if>
            -->

        </form:form>
    </body>
</html>
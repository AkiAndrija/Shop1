<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
<form:form action="new_buyer.htm" method="post" commandName="buyers">

            <div class="field">
                <form:label path="name">Name</form:label>
                <form:input path="name"/>
                <form:errors path="name"></form:errors>
            </div>

            <div class="field">
                <form:label path="date">Date</form:label>
                <form:input path="date" type="date"/>
                <form:errors path="date"></form:errors>
            </div>
            <form:label path="email">Email</form:label>
            <form:input path="email" type="email"/>
            <form:errors path="email"></form:errors>
        <div>

        </div>

            <input type="submit" value="Submit"/>
        </form:form>
</body>
</html>
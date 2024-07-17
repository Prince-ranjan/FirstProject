<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h1>Add User</h1>
    <form action="users" method="post">
        <input type="hidden" name="action" value="add"/>
        Name: <input type="text" name="name"/><br/>
        Email: <input type="text" name="email"/><br/>
        <input type="submit" value="Add User"/>
    </form>
</body>
</html>

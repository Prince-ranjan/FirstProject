<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Edit User</title>
</head>
<body>
    <h1>Edit User</h1>
    <form action="users" method="post">
        <input type="hidden" name="action" value="edit"/>
        <input type="hidden" name="id" value="${user.id}"/>
        Name: <input type="text" name="name" value="${user.name}"/><br/>
        Email: <input type="text" name="email" value="${user.email}"/><br/>
        <input type="submit" value="Update User"/>
    </form>
</body>
</html>

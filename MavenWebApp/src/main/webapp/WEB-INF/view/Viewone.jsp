<%-- <%@include file="src/main/java/com/nucleus/model/Book.java" %> --%>
<%@page import="com.nucleus.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<s:form action="" modelAttribute="book"><br>
Book Id : <s:input path="bookId" value="${book.bookId}"/><br>
Book Name : <s:input path="bookName" value="${book.bookName}"/><br>
Book Price : <s:input path="price" value="${book.price}"/><br>
Book Category :
<s:radiobutton path="category" value="horror" checked="${(book.category).equals('horror')? 'checked' :''}"/>A
<s:radiobutton path="category" value="comedy" checked=" ${(book.category).equals('comedy')? 'checked' :''  }"/>B
<s:radiobutton path="category" value="technology" checked="${(book.category).equals('technology')? 'checked' :' '  }"/>C<br>
Book Publication
<s:checkbox path="publication" value="abc" checked="${(book.publication).contains('abc')? 'checked' :'' }" />ABC
<s:checkbox path="publication" value="bcd" checked="${(book.publication).contains('bcd')? 'checked' :'' }"/>BCD
<s:checkbox path="publication" value="cde" checked="${(book.publication).contains('cde')? 'checked' :'' }"/>CDE<br>
Book Description<s:textarea path="description" rows="4" cols="10" /><br>
<a href="index.jsp">Menu</a>
</s:form>
</body>
</html>
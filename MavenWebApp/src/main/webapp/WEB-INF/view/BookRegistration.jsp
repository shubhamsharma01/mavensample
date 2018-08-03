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
<s:form action="booksubmit" modelAttribute="book"><br>
Book Id<s:input path="bookId"/><s:errors path="bookId"/><br>
Book Name<s:input path="bookName"/><s:errors path="bookName"/><br>
Book Price<s:input path="price"/><s:errors path="price"/><br>
Book Category
<s:radiobutton path="category" value="horror"/>A
<s:radiobutton path="category" value="comedy"/>B
<s:radiobutton path="category" value="technology"/>C<s:errors path="category"/><br>
Book Publication
<s:checkbox path="publication" value="abc"/>ABC
<s:checkbox path="publication" value="bcd"/>BCD
<s:checkbox path="publication" value="cde"/>CDE				<s:errors path="publication"/><br>
Book Description<s:textarea path="description" rows="4" cols="10"/><s:errors path="description"/> <br>
<input type="submit" value="submit" name="submit">
</s:form>
</body>
</html>
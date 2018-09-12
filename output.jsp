<%@page import="data.studentpro"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.String"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	table,td,th{
		border-collapse:collapse;
	}
</style>
</head>
<body>
<h1>here's the details of the student:</h1>
<%
//String newjsp= request.getAttribute("studentbranch").toString();
//out.println(newjsp);
List<studentpro> stude = (List) request.getAttribute("studentbranch");

out.print("<table border=1>");
for(studentpro studentp : stude)
{
out.print("<tr><td>"+studentp.getId()+"</td>");
out.print("<td>"+studentp.getBranch()+"</td>");
out.print("<td>"+studentp.getName()+"</td>");
out.print("<td>"+studentp.getGender()+"</td>");
out.print("<td>"+studentp.getAge()+"</td>");
out.print("<td>"+studentp.getMob_no()+"</td></tr>");

}

out.print("</table>");
%>




</body>
</html>
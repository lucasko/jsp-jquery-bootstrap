<%@ page contentType="application/json" %>

 <%@ page import="org.lucasko.*"%>

<% BookService bookService = new BookService();

%>

<%= bookService.getBook() %>

<%
   // Returns all employees (active and terminated) as json.
   response.setContentType("application/json");
   response.setCharacterEncoding("UTF-8");
   response.setHeader("Access-Control-Allow-Origin", "*");
%>
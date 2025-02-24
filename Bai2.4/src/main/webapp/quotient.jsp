<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kết quả chia</title>
</head>
<body>
<%
	String strA = request.getParameter("a");
 	float valueA = Float.parseFloat( strA );	
 	
 	String strB = request.getParameter("b");
 	float valueB = Float.parseFloat( strB );
 	
 	out.print("TỔNG CỦA ");
 	out.print(valueA);
 	out.print(" và ");
 	out.print(valueB);
 	out.print(" là ");
 	out.print(valueA / valueB);
%>
</body>
</html>
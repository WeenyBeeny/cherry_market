<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<ul>
	<c:forEach var="tmp" items="${list }">
		<li>${tmp.mid } : ${tmp.occomment }</li>
	</c:forEach>
</ul>
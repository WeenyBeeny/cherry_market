<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/home.jsp</title>
<style>
	#textBox{
		width:500px;
		height:450px;
		overflow: auto;
		overflow-y:450px;
	}
</style>
</head>
<body>
<div id="main">
	<div id="openchat">
		<div id="textBox">
			
		</div>
		<div id="inputBox">
			<input type="text" id="temp_id" name="temp_id" placeholder="임시 id"/>
			<input type="text" id="occomment" name="occomment" placeholder="메세지 보내기"/>
		</div>
	</div>
</div>
<script>
	var before;
	let updateBox=function(){
		fetch("updateBox")
		.then(function(response){
			return response.text();
		})
		.then(function(data){
			before=document.querySelector("#textBox").innerHTML;
			data=data.replaceAll('\r','');
			if(before!=data){
				console.log(data);
				document.querySelector("#textBox").innerHTML=data;
				var objDiv = document.getElementById("textBox");
				objDiv.scrollTop = objDiv.scrollHeight;
				console.log("scrolldown");
			}
		})
	}
	let interval=setInterval(updateBox,50)
	document.querySelector("#occomment").addEventListener("keyup",function(e){
		if (e.key=="Enter"){

			fetch("uploadchat",{
				method:"POST",
				headers:{"Content-Type":"application/x-www-form-urlencoded; charset=utf-8"},
				body:"data="+document.querySelector("#temp_id").value
				+"!!!seperate!!!"
				+document.querySelector("#occomment").value
			})
			.then();
			updateBox();
			document.querySelector("#occomment").value="";
			document.querySelector("#occomment").placeholder="메세지 보내기";
		}
	});
</script>
<p>wow</p>
</body>
</html>
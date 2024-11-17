<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://showcases.yalco.kr/html-css/01-06/table.css">
<style>
th, td {
	padding: 5px;
	text-align: left;
}

#title {
	text-align: center;
	background-color: #49516b;
	color: white;
}

div {
	text-align: center;
	margin-top: 20px;
}

table {
	margin: 0 auto;
}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
	<img style ="width: 200px; height: 200px;" src="${pageContext.request.contextPath}/resources/bootstrap/images/rogo.png">
</div>

	<div>
		<h1>로그인</h1>
	</div>
	<form method="post" action="/product/login">
		<table>
			<tbody>
				<tr>
					<td><input type="text" id="id" name="id" placeholder="아이디"></td>
				</tr>

				<tr>
					<td><input type="password" id="pwd" name="pwd"
						placeholder="비밀번호"></td>
				</tr>
			</tbody>
		</table>

		<div>
			<input type="submit" value="로그인"> 
			<input type="button" value="메인화면" onclick="location.href='/'">
		</div>
	</form>

		<div>
			<button onclick="location.href='/product/join'">회원가입</button>
		</div>






</body>
</html>
<!-- 이메일찾기(이메일틀렸을때) -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript">
function emailclose(){
	window.close();
}
</script>
<title>Email 찾기</title>
</head>
<body>
<div style="margin:auto; width:50%">
	<h3 align="center">해당 Email 은 존재하지 않습니다.</h3>
	<input type="button" value="닫기" onclick="emailclose()">
</div>

</body>
</html>
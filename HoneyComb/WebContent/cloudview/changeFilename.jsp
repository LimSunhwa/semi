<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script src="/HoneyComb/cloudview/cloudScript.js" type="text/javascript"></script>
<script>
window.opener.location.reload();
</script>
<style type="text/css">
body{
text-align:  center;
background-color: #E9EBEE;
}
/* 기본버튼설정 */
.indexbutton{
position:static;
color:black;
width:70px;
height: 31px;
background-color: #F8F8F8 ;	
border: 1px solid silver;
margin-left: -6px;
text-align: center;
cursor: pointer;
}
.indexbutton:HOVER{
background-color: silver;
}
.renametext{
height: 23px;
padding-top: 3px;
}
/* 기본버튼설정 끝 */
</style>
<title>Insert title here</title>
</head>
<body>
	<form action="/HoneyComb/cloud/cloudRenameItem.cloud" method="post"
		onsubmit="emptyck('itemName')">
		<h3>새로운 파일이름을 입력해주세요</h3>
		<input type="text" name="itemName"id="itemName" class="renametext">
		<input type="submit" value="확인" class="indexbutton">
		<input type="hidden" name="promgr_num" value="${param.promgr_num}">

		<c:if test="${param.dupli == 'y'}">
	취소버튼을 누를경우 파일이 업로드 되지 않습니다
	<a href="/HoneyComb/cloud/cloudDeleteItem.cloud">취소</a>
		</c:if>
	</form>
</body>
</html>
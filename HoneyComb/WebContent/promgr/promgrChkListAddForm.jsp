<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>checklist write</title>

<script>
	function writeSave() {

		if (document.chkListAddform.promgr_list_title.value == "") {
			alert("내용을 입력하십시요.");
			document.chkListAddform.promgr_list_title.focus();
			return false;
		}

		return true;
	}
</script>

</head>
<body>

	<form method="post" name="chkListAddform"
		action="/HoneyComb/promgr/promgrChkListAddPro.promgr?promgr_num=${promgr_num}"
		onsubmit="return writeSave()">

		<input type="text" name="promgr_list_title" size="30" maxlength="40" placeholder="check list name" />
		<input type="submit" value="Add List" />
		
	</form>

</body>
</html>
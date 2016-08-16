function fileUploader(folder){
	url="/HoneyComb/cloud/fileUploader.cloud?upload=true&folder="+folder;
	open(url, "confirm", "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=550, height=200");
}

function createfolder(folder){
	folder = encodeURIComponent(folder);
	url="/HoneyComb/cloudview/createfolder.jsp?folder="+folder;
	open(url, "confirm", "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=550, height=200");
	
}
function movefolder(folder, name){
	if(folder == null){
		window.location="/HoneyComb/cloud/cloudForm.cloud?folder="+name+"|";
	}else{
	window.location="/HoneyComb/cloud/cloudForm.cloud?folder="+folder+name+"|";
	}
}

function refresh(){
window.opener.location.reload();
}

function test(){
	alert(file_name.val())
	
}
function emptyck(value){
	var item = document.getElementById(value).value;
	
	if(item  == null||item == ""){
		alert("빈 공간을 업로드할 수 없습니다.");
		return false;
	}
	
}
function download(){
	$("input[name=itemBox]:checked").each(function(){
		var file_name = $(this).data('file_name');
		var file_path = $(this).data('file_path');
		alert(file_name);
		var url="/HoneyComb/cloud/cloudDownItem.cloud?file_name="+file_name+"&file_path="+file_path;
		$(location).attr('href',url);
	});
};
function deleteitem(){
	$("input[name=itemBox]:checked").each(function(){
		var file_name = $(this).data('file_name');
		var file_path = $(this).data('file_path');
		var result = confirm(file_name+'을 삭제하시겠습니까?');
		if(result){
			var url="/HoneyComb/cloud/cloudDeleteItem.cloud?file_path="+file_path;
			$(location).attr('href',url);
			
		}else{
			return false;
		}
	});
}


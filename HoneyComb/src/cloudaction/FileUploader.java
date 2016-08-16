package cloudaction;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import clouddb.CloudDBBean;
import clouddb.CloudDataBean;

public class FileUploader implements CommandActionCloud{
	
	public String requestPro(HttpServletRequest request, HttpServletResponse response)throws Throwable{
		
		
		if (request.getParameter("upload")==null){
			//기본설정
			String filename= null;//file_name에 입력될 값
			String oldPath = null;//multipart 가 설정한 처 경로
			String newPath = null;//바꿀Path
			File file = null;
			CloudDataBean cloudDB = new CloudDataBean();
			CloudDBBean cloud = CloudDBBean.getInstance();
			
			//저장 기본경로
			String savefilepath = "E://cloud//";
			HttpSession session = request.getSession();
						
			//세션입시설정
			session.setAttribute("mem_num", "11");
			session.setAttribute("com_num", "1");
			session.setAttribute("name", "tester");
			//파일먼저 업로드
			MultipartRequest mr = new MultipartRequest (request,savefilepath, 1024*1024*100,"utf-8");
			//기본경로 받기
			file = mr.getFile("uploadFile");
			String tempPath = String.valueOf(file);//바꿀 파일
			oldPath = tempPath.replace("\\", "/");//escape 연산때문에 정리
			
			//작성한 파일이름
			filename = mr.getParameter("filename");
			//파일이름을 작성하지 않았을 경우
			if(filename.length() == 0){
				int i = oldPath.lastIndexOf('.');//확장자
				int j = oldPath.lastIndexOf('/');//경로
				String tempoldPath = oldPath.substring(0, i);//확장자 지우기
				filename = tempoldPath.substring(j+1);//파일경로 지우기
			}
			
			//파일경로 재설정
			CreateFilePath createfilePath =  CreateFilePath.getInstance();
			newPath = createfilePath.FilePath(oldPath,filename, request);
					
			//파일이름 변경
			File oldfile = new File(oldPath);
			File newfile = new File(newPath);
			oldfile.renameTo(newfile);
			
			//dataBean 에 저장
				//session 불러오기
				int com_num = Integer.parseInt((String)session.getAttribute("com_num"));
				String name = (String)session.getAttribute("name");
				String folder = request.getParameter("folder");
			cloudDB.setFile_name(filename);
			cloudDB.setFile_path(newPath);
			cloudDB.setFile_uploader(name);
			cloudDB.setFile_size((int)newfile.length());
			cloudDB.setCom_num(com_num);
			cloudDB.setFolder(folder);
			//DBinsert
			int filecheck = cloud.cloudInsert(cloudDB);
		
		
			//이름바꿔줄 file_num session으로 저장
			session.setAttribute("file_path", cloudDB.getFile_path());
			
			if(filecheck == 0){
				return "/cloudview/uploadForm.jsp?filecheck="+cloudDB.getFile_name();
			}else{
				return "/cloudview/uploadForm.jsp?upload=done";
			}
		
			}
		return "/cloudview/uploadForm.jsp";
	}

}

/*?占쎈쐻占쎈짗占쎌굲占쎈쐻�뜝占�?(xxxxxx)com_num(xxxx), mem_num(xxxxxx), file�뵓怨뺣쐡占쎄퉰(xxxxxx)
?占쎈쐻占쎈짗占쎌굲?占쎈쐻占쎈짗占쎌굲 占쎈쐻�뜝占�??占쎈쐻占쎈짗占쎌굲 ?占쎈쐻占쎈짗占쎌굲?占쎈쐻占쎈짗占쎌굲?占쎈쐻占쎈짗占쎌굲占쎈쐻�뜝占�? ?占쎈쐻占쎈짗占쎌굲占쎈쐻�뜝占�?(milli)*/
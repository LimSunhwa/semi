package promgr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PromgrMemberEditorFormAction implements PromgrFormAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		int promgr_num = Integer.parseInt(request.getParameter("promgr_num"));
		
		PromgrDBBean dbPro = PromgrDBBean.getInstance(); // DB처리
		List memberList = dbPro.getMemberDataList(promgr_num);
		List memberSearchList = dbPro.getMemberSearchList(promgr_num);
		
		System.out.println(memberSearchList.size());
		
		// 해당 view에서 사용할 속성
		request.setAttribute("promgr_num", promgr_num);
		request.setAttribute("memberList", memberList);
		request.setAttribute("memberSearchList", memberSearchList);
		
		return "/promgr/PromgrMemberEditorForm.jsp";

	} // String requestPro end

} // class ProMgrWriteProAction implements ProMgrFormAction end

package promgr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PromgrChkListDelAction implements PromgrFormAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		int promgr_num = Integer.parseInt(request.getParameter("promgr_num"));
		int list_num = Integer.parseInt(request.getParameter("list_num"));
		
		PromgrDBBean dbPro = PromgrDBBean.getInstance();
		int promgr_update_count = dbPro.delChkList(promgr_num, list_num);

		// 해당 view에서 사용할 속성
		request.setAttribute("promgr_update_count", promgr_update_count);

		return "/promgr/promgrPro.jsp";

	} // String requestPro end

} // class ProMgrWriteProAction implements ProMgrFormAction end

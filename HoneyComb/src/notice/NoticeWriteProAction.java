package notice;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoticeWriteProAction implements NoticeFormAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		request.setCharacterEncoding("utf-8");

		NoticeDataBean article = new NoticeDataBean();
		article.setNotice_title(request.getParameter("notice_title"));
		article.setNotice_content(request.getParameter("notice_content"));
		article.setNotice_member((String) request.getSession().getAttribute("name"));
		article.setCom_num((int) request.getSession().getAttribute("com_num"));
		article.setNotice_date(new Timestamp(System.currentTimeMillis()));

		NoticeDBBean dbPro = NoticeDBBean.getInstance();
		int notice_insert_count = dbPro.insertArticle(article); // 삽입된 row 갯수 호출

		// 해당 view에서 사용할 속성
		request.setAttribute("notice_insert_count", notice_insert_count);

		return "/notice/noticeWritePro.jsp";

	} // String requestPro end

} // class NoticeMainAction implements FormAction end

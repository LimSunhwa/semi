package promgr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PromgrFormAction {

	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable;

} // public interface PromgrFormAction end

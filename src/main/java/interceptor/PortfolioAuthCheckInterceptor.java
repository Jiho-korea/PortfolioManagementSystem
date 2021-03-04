/*
========================================================================
파    일    명 : PortfolioAuthCheckInterceptor.java
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.03.03
작  성  내  용 : 학생이 다른 학생의 포트폴리오는 못보도록 하는 인터셉터
========================================================================
*/
package interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import vo.MemberInfo;

public class PortfolioAuthCheckInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		String memberId = request.getParameter("memberId");
		if (session != null) {
			MemberInfo memberInfo = (MemberInfo) session.getAttribute("login");
			if (memberId == null) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('잘못된 접근입니다.');");
				out.println("location.href='" + request.getContextPath() + "/main';");
				out.println("</script>");
				out.flush();
				return false;
			} else if ("ML03".equals(memberInfo.getMemberLevelCode()) && !(memberInfo.getMemberId().equals(memberId))) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('권한이 없습니다.');");
				out.println("location.href='" + request.getContextPath() + "/main';");
				out.println("</script>");
				out.flush();
				return false;
			}
		}

		return true;
	}

}

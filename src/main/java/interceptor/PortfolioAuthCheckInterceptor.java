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

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import exception.MemberNotFoundException;
import service.MemberInfoService;
import vo.MemberInfo;

public class PortfolioAuthCheckInterceptor implements HandlerInterceptor {

	@Resource(name = "memberInfoService")
	MemberInfoService memberInfoService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession(false);
		String memberId = request.getParameter("memberId");

		if (session != null) {
			MemberInfo login = (MemberInfo) session.getAttribute("login");
			if (memberId == null
					|| (!"ML03".equals(login.getMemberLevelCode()) && login.getMemberId().equals(memberId))) {
				// memberId 파라미터가 없거나 학생이 아닌 사람(관리자, 교수, 조교)이 자신의 포트폴리오를 보려고 할 때
				write("존재하지 않는 포트폴리오입니다.", request, response);
				return false;
			} else if ("ML03".equals(login.getMemberLevelCode()) && !(login.getMemberId().equals(memberId))) {
				// 학생이 자기가 아닌 멤버의 포트폴리오를 보려고 할 때
				write("권한이 없습니다.", request, response);
				return false;
			}

			try {
				// 학생이 아닌 멤버의 포트폴리오를 보려고 할 때
				MemberInfo memberInfo = memberInfoService.getMemberInfo(memberId);
				if (!memberInfo.getMemberLevelCode().equals("ML03")) {
					write("존재하지 않는 포트폴리오입니다.", request, response);
					return false;
				}
			} catch (MemberNotFoundException e) {
				// 존재하지 않는 멤버의 포트폴리오를 보려고 할 때
				write("존재하지 않는 포트폴리오입니다.", request, response);
				return false;
			}

			return true;
		}

		return false;
	}

	private void write(String message, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('" + message + "');");
		out.println("location.href='" + request.getContextPath() + "/main';");
		out.println("</script>");
		out.flush();
		return;
	}
}

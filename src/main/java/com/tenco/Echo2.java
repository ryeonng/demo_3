package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "echo2", urlPatterns = {"/echo2"})
public class Echo2 extends HttpServlet{

	public Echo2() {
		super();
	}
	
	// get 요청 방식으로 요청 시, 아래 메서드 동작 
	// http://localhost:8080/demo_3/echo2
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// request -> req (
		System.out.println("doGet 메서드 호출 확인");
		// 자바.io에 있는 객체를 이용헤 (스트림 통해 데이터를 넣을 예정)
		
		PrintWriter pw = resp.getWriter();
		pw.print("<!DOCTYPE html>");
		pw.print("<html lang=\"en\">");
		pw.print("<head>");
		pw.print("<meta charset=\"UTF-8\">");
		pw.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">>");
		pw.print("<title>Document</title>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<section>");
		pw.print("<p style=\"color: red;\">Hello First Srvlet 반가워</p>");
		pw.print("</section>");
		pw.print("</body>");
		pw.print("</html>");
		resp.setContentType("text/html; charset=utf-8");
	}
	
	// post 요청 방식 요청 시 동작
	// http://localhost:8080/demo_3/echo2
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPost(req, resp);
	}
	
}

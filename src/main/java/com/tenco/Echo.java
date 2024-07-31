package com.tenco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "echo", urlPatterns = {"/echo"})
public class Echo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Echo() {
        super();
    }

    @Override // init메서드 : 메모리에 올라갈 때 딱 한 번만 호출되는 메서드
    public void init() throws ServletException {
    	System.out.println("Echo 서블릿 클래스가 --> 컴파일 --> .class 파일로 변환");
    	System.out.println("init() 메서드는 인스턴스화 될 때 딱 한 번 호출 되는 메서드");
    }
    
    // 여러번 호출되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// POST 요청 시 동작하는 메서드
	// 주소 설계
	// http://localhost:8080/demo_3/echo
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("안녕, 서버 측 콘솔에서 출력 합니다.");
	}

	@Override
	public void destroy() {
		System.out.println("메모리에서 내려갈 때 호출되는 메서드");
	}
	
}

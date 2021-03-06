package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet that reads a code snippet from the request and displays it inside a
 * PRE tag. Filters the special HTML characters.
 * <p>
 * From <a href="http://courses.coreservlets.com/Course-Materials/">the
 * coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and
 * Java</a>.
 */

//	?Quiz : The TestServlet, accessed via the URL 
//	Hint : matching between ? , <FORM ACTION="?"> and @WebServlet("?")
// @WebServlet("?")
public class SimpleGetPost extends HttpServlet {

	private static final long serialVersionUID = -2689059705108017275L;
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		// servlert 컨테이너는 서블릿 객체가 생성된후,단한번 init() 메소드를
		// 호출하고 서블리는 init() 메소드가 완료되어야 서비스 할수있다.
		message = "Hello World";
	}
	
	
	
	// 대부분의 Servlet은 doGet 또는 doPost만 작성하며,
    // 컨테이너가 생성한 Request와 Response 객체를 전달 받는다.↓
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		handleRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		handleRequest(request, response);
	}

	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// Get Parameter From HttpServletRequest
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		// Set response content type-> setContentType()
		// 응답 데이터의 MIME 타입을 설정.
		// HTML은 text/html, 일반 텍스트는 text/plain, 
		// 바이너리 데이터는 application/octet-stream 으로 설정
		// 이 메소드는 getWriter() 메소드 전에 호출되어야 한다.
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		out.println("<h1>" + firstName + " " + lastName + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}
	
//	<!-- web.xml 맵핑하는법  -->
//	<servlet>
//	      <servlet-name>invoker</servlet-name>
//	      <servlet-class>
//	        org.apache.catalina.servlets.InvokerServlet
//	      </servlet-class>
//	      <init-param>
//	          <param-name>debug</param-name>
//	          <param-value>0</param-value>
//	      </init-param>
//	      <load-on-startup>2</load-on-startup>
//	  </servlet>
//
//	<!-- 382라인 -->
//	  <servlet-mapping>
//	      <servlet-name>invoker</servlet-name>
//	      <url-pattern>/servlet/*</url-pattern>
//	  </servlet-mapping>
	

}

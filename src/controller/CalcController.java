package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/CalcController.do")
public class CalcController extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String oper1 = request.getParameter("operand1");
		String oper2 = request.getParameter("operand2");
		String operator = request.getParameter("operator");
		int result = 0;
		
		switch (operator) {
		case "+":
			result = Integer.parseInt(oper1) + Integer.parseInt(oper2);
			break;
		case "-":
			result = Integer.parseInt(oper1) - Integer.parseInt(oper2);
			break;
		case "*":
			result = Integer.parseInt(oper1) * Integer.parseInt(oper2);
			break;
		case "/":
			result = Integer.parseInt(oper1) / Integer.parseInt(oper2);
			break;
		}		
		request.setAttribute("result", result);
		
		String page = "/calc_result.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(page);
		// forward: fixed address, screen will be changed
		rd.forward(request, response);
	}
				   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

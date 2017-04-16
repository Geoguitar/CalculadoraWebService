package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularSalario
 */
//@WebServlet("/CalcularSalario")
public class CalcularSalario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcularSalario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nomeFuncionarioInput");
		String salario = request.getParameter("salarioAtualInput");
		
		float salarioFuncionario = Float.valueOf(salario);
		float aumentoSalario = 0;
		float salarioFinal = 0;

		if (salarioFuncionario <= 1000) {

			aumentoSalario = 10;
			
		}else if((salarioFuncionario > 1000)&&(salarioFuncionario<=2000)){
			
			aumentoSalario = 7;
			
		}else if(salarioFuncionario > 2000){
			
			aumentoSalario = 5;
		}
		
		salarioFinal = salarioFuncionario + (salarioFuncionario * aumentoSalario/100);
		
		getServletContext().setAttribute("Nome", nome);
		getServletContext().setAttribute("AumentoSalario", aumentoSalario);
		getServletContext().setAttribute("SalarioFinal", salarioFinal);
		
		response.sendRedirect("ExibirResultado.jsp");
		
	}
}

package com.afpa.cda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.afpa.cda.service.IPersonneService;

/**
 * Servlet implementation class Accueil
 */
@WebServlet(urlPatterns = {"/index.html"})
public class ss extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private IPersonneService personneService;

	public void init(ServletConfig config) throws ServletException {
		super.init(config); 
		ServletContext context = getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
		personneService = ctx.getBean(IPersonneService.class);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<table class=\"table\">");
		writer.append("<thead class=\"thead-dark\">");
		writer.append("<tr>");
		writer.append("<td>id</td>");
		writer.append("<td>name</td>");
		writer.append("<td>prenom</td>");
		writer.append("<td>metier</td>");
		writer.append("<td>Adresse</td>");
		writer.append("</tr>");
		writer.append("</thead>");
		
		writer.append("<tbody>");
		this.personneService.chercherToutesLesPersonnes()
		.forEach(p->{
			writer.append("<tr>");
			writer.append("<td>").append(Integer.toString(p.getId())).append("</td>");
			writer.append("<td>").append(p.getNom()).append("</td>");
			writer.append("<td>").append(p.getPrenom()).append("</td>");
			writer.append("<td>").append(p.getMetier()).append("</td>");
			writer.append("<td>").append(p.getAdresse()).append("</td>");
			writer.append("</tr>");
		});
		writer.append("</table>");
		
		writer.append("</table>");
		writer.append("</body>");
		writer.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

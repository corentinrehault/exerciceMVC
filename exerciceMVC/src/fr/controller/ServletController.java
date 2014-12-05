package fr.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ServletController
 */

public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @param request
	 * @param response
	 * @param param 
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void testAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String urlReturn = null;
		String uri = (String) request.getAttribute("uri");
		int lastSlash = uri.lastIndexOf("/");
		String cutIt = uri.substring(lastSlash + 1);
		ActionRules.buildArrayActionList();

		if (ActionRules.arrayActionList.contains(cutIt)) {

			System.out.println("in !" + cutIt);
			switch (cutIt) {

			case "":
				urlReturn = "index.jsp";
				break;

			case "toLogin":
				urlReturn = "formlogin.jsp";
				break;

			case "doLogin":
				urlReturn = "successlogin.jsp";
				break;

			case "doLogout":
				urlReturn = "disconnect.jsp";
				break;

			default:
				urlReturn = "forbidden.jsp";
				break;
			}

			request.getRequestDispatcher(urlReturn).forward(request, response);


		} else {
			System.out.println("out !");
			urlReturn = "forbidden.jsp";
			request.getRequestDispatcher(urlReturn).forward(request, response);
		}

	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		testAction(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		testAction(request, response);
	}
}

package co.simplon.web;
import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.* ;
//import java.text.* ;
//import java.util.* ;
//import javax.servlet.* ;
import javax.servlet.http.* ;
/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("log");
		String password=request.getParameter("pass");
		if(login == null) login="";
		if(password==null) password="";
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>banque</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bonjour et bienvenue<br>Veuillez vous authentifiez ?<br>"+new Date()+"</h1>");
		out.println("<form  method='POST'>");
		out.println("<label>LOGIN:</label><input name='log' style='margin-left: 85px;' type='text' value='"+login+"'><br>");
		out.println("<label>PASSWORD:</label> <input name='pass' style='margin-left: 40px;'  type='password' value='"+password+"'><br>");
		out.println("<input style='margin-left: 90px;' type='submit' value='Envoyer'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("log");
		String password=request.getParameter("pass");
		if(login.contentEquals("root") && password.contentEquals("darki")) {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("connected");
		}else
			doGet(request, response);
	}

}

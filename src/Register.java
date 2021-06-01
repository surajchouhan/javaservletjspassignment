

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		
		String FirstName=request.getParameter("firstname");
		String LastName=request.getParameter("lastname");
		String Address=request.getParameter("address");
		String City=request.getParameter("city");
		String State=request.getParameter("state");
		String Country=request.getParameter("country");
		String Zip=request.getParameter("zip");
		String Phone=request.getParameter("phone");
		String UserLoginId=request.getParameter("userloginid");
		String Password=request.getParameter("password");
		
		Member member=new Member(FirstName,LastName,Address,City,State,Country,Zip,Phone,UserLoginId,Password);
		
		RegisterDAO rdao=new RegisterDAO();
		
		String result=rdao.insert(member);
		
		response.getWriter().print(result);
		
		
		
		
		   
		
		
		
		
		
		
		
	}

}

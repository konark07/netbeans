
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
    PrintWriter out= res.getWriter();
    String name=req.getParameter("name");
    String password=req.getParameter("password");
    if(name.equals("konark")&&password.equals("konark07"))
    {
        out.println("succesfull nigga");
        
    }
    else
    {
        out.println("unsuccessfull");
        
    }
            
            
            
}
}

package au.edu.unsw.soacourse.founditclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import au.edu.unsw.soacourse.founditappdefinitions.InputType;
import au.edu.unsw.soacourse.founditappdefinitions.ObjectFactory;
import au.edu.unsw.soacourse.founditappserver.FoundITAppPT;
import au.edu.unsw.soacourse.founditappserver.FoundITAppServer;

//import au.edu.unsw.soacourse.marketservice.ImportMarketDataRequest;
//import au.edu.unsw.soacourse.marketservice.ImportMarketDataResponse;
//import au.edu.unsw.soacourse.marketservice.ImportMarketFaultMsg;
//import au.edu.unsw.soacourse.marketservice.ObjectFactory;
//import au.edu.unsw.soacourse.marketservice.TopDownSimpleService;
//import au.edu.unsw.soacourse.marketservice.TopDownSimpleServiceImplService;

/**
 * Servlet implementation class FoundITServiceClient
 */
@WebServlet("/FoundITServlet")
public class FoundITServiceClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FoundITServiceClient() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

//			String input = request.getParameter("license");
			String input = "1s2d4f4g";
			
			FoundITAppServer service = new FoundITAppServer(new URL(
					"http://localhost:6060/ode/processes/AutoCheck/process?wsdl"
//					"http://localhost:8080/FoundITServiceClient/founditappserver?wsdl"
					));
			FoundITAppPT port = service.getFoundITAppServerSOAP();
			ObjectFactory objectFactory = new ObjectFactory();
			InputType req = objectFactory.createInputType();
			req.setInput(input);
			
			InputType resp = port.check(req);

			// Display as html
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<HEAD>");
			out.println("<TITLE>FoundITService Client Page</TITLE>");
			out.println("</HEAD>");
			out.println("<body>");
			out.println("<CENTER>");
			out.print(resp.getInput());
			out.println("</CENTER>");
			out.println("</BODY>");
			out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}

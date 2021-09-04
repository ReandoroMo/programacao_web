package aula_03;

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Data_e_Hora
 */
@WebServlet("/Data_e_Hora")
public class Data_e_Hora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     */

    public Data_e_Hora() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	
    	super.init();
    	log("Data_e_hora iniciado em " + formato.format(new Date()));
    }
    
    @Override
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		PrintWriter saida = resp.getWriter();
    		saida.write("<HTML><BODY>A data e hora de agora é ");
    		saida.write(formato.format(new Date()));
    		saida.write("<BODY><HTML>");
    		saida.close();
    	} 
}

package exercicio_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nome_sobrenome
 */
@WebServlet("/Nome_sobrenome")
public class Nome_sobrenome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Nome_sobrenome() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	//criação de variáveis para tratar o "null"
    	String nome = req.getParameter("nome");
    	String sobrenome = req.getParameter("sobrenome");
    	
    	//criação da variável de PrintWriter
    	PrintWriter saida =  resp.getWriter();
    	
    	//inicio da tag html
    	saida.write("<HTML> <BODY>");
    	saida.write("Seja bem vindo");
    	
    	//condição de tratamento para o "null"
    	if (nome != null) {
    	    saida.write(", " + nome);
    	    if (sobrenome != null) {
        	    saida.write(" " + sobrenome);
        	}
    	}
    	
    	saida.write("!");
    	saida.write("</HTML> </BODY>");
    	saida.close();
    }  
}

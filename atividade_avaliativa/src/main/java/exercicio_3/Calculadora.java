package exercicio_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	
    	//criação da variável de soma
    	float soma = 0;
 
    	//criação da variável de PrintWriter
    	PrintWriter saida =  resp.getWriter();
    	
    	//criação do enumeration
    	Enumeration<String> parametros = req.getParameterNames();
    	
    	//criação do laço de repetição para percorrer todas as variaveis
    	while (parametros.hasMoreElements()) {
    		// criação de tratamento para impedir erros em que o
    		// usuário coloca uma string como parametro
    		try {
    			String string = parametros.nextElement().toString();
    			soma += Float.parseFloat(req.getParameter(string));	
    		} catch(NumberFormatException a) {;}
    	}
    	//inicio da tag html
    	saida.write("<HTML> <BODY>");
    	saida.write("<h3>" + "A soma numérica é:" + "</h3>");
    	saida.write(String.valueOf(soma));
    	saida.write("</HTML> </BODY>");
    	saida.close();
    }  
    
}


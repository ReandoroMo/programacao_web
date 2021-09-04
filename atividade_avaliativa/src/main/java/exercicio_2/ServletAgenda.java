package exercicio_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
    	//criação de variavel para os dados recebidos do form
		String nome = req.getParameter("nome").toString();
		String telefone = req.getParameter("telefone").toString();
		String nascimento = req.getParameter("dta_de_nascimento").toString();
		
		//criação da variável de PrintWriter
    	PrintWriter saida =  resp.getWriter();
    	
    	//inicio da tag html
    	saida.write("<HTML> <BODY>");
    	saida.write("<h3>" + "Foram recebidos esses dados do formulário:" + "</h3>");
    	
    	//chamada das variáveis recebidas
    	saida.write("Nome: " + nome + "<BR>");
    	saida.write("Telefone: " + telefone + "<BR>");
    	saida.write("Data de nascimento: " + nascimento + "<BR>");
    	saida.write("</HTML> </BODY>");
    	saida.close();
    	
	}
}

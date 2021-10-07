package Criando_sessao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cria_sessao
 */
@WebServlet("/Cria_sessao")
public class Cria_sessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cria_sessao() {
        super();
        // TODO Auto-generated constructor stub
    }

       

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter resposta = resp.getWriter();
		
		HttpSession sessao = req.getSession();
		
		resposta.write("<html>");
    	resposta.write("<head>");
    	resposta.write("<title>Dados</title>");
    	resposta.write("<body>");
    	resposta.write("<h1>Sessão Iniciada</h1>");
    	resposta.write(sessao.getId());
    	resposta.write("</body>");
    	resposta.write("</head>");
    	resposta.write("</html>");
		
    	sessao.invalidate();
	}

}

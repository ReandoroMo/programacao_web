package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class ServletTela2Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
				HttpSession sessao_cadastro = req.getSession();
			

		
				//criação de variavel para os dados recebidos do form
				String nome = (String) sessao_cadastro.getAttribute("id_nome");
				String sobrenome = (String) sessao_cadastro.getAttribute("id_sobrenome");
				String rua = (String) sessao_cadastro.getAttribute("id_rua");
				String complemento = (String) sessao_cadastro.getAttribute("id_complemento");
				String cidade = (String) sessao_cadastro.getAttribute("id_cidade");
				String cep = (String) sessao_cadastro.getAttribute("id_cep");
				String estado = (String) sessao_cadastro.getAttribute("id_estado");
				String empresa = req.getParameter("empresa");
				String rua_empresa = req.getParameter("rua_empresa");
				String compl_empresa = req.getParameter("compl_empresa");
				String cid_empresa = req.getParameter("cid_empresa");
				String cep_empresa = req.getParameter("cep_empresa");
				String est_empresa = req.getParameter("est_empresa");
				
				
				//criação da variável de PrintWriter
		    	PrintWriter saida =  resp.getWriter();

		    	
		    	//inicio da tag html
		    	saida.write("<HTML> <BODY>");
		    	saida.write("<h3>" + "Foram recebidos esses dados dos formulários:" + "</h3>");
		    	
		    	//chamada das variáveis recebidas
		    	saida.write("<h3>Dados:</h3><BR>");
		    	saida.write("Nome: " + nome + "<BR>");
		    	saida.write("Sobrenome: " +sobrenome + "<BR>");
		    	saida.write("<h3>Endereço:</h3><BR>");
		    	saida.write("Rua: " + rua + "<BR>");
		    	saida.write("Complemento: " + complemento + "<BR>");
		    	saida.write("Cidade: " + cidade + "<BR>");
		    	saida.write("CEP: " + cep + "<BR>");
		    	saida.write("Estado: " + estado + "<BR>");
		    	saida.write("<h3>Empresa:</h3><BR>");
		    	saida.write("Nome da empresa: " + empresa + "<BR>");
		    	saida.write("<h3>Endereço da empresa:</h3><BR>");
		    	saida.write("Rua: " + rua_empresa + "<BR>");
		    	saida.write("Complemento: " + compl_empresa + "<BR>");
		    	saida.write("Cidade: " + cid_empresa + "<BR>");
		    	saida.write("CEP: " + cep_empresa + "<BR>");
		    	saida.write("Estado: " + est_empresa + "<BR>");
		    	saida.write("</HTML> </BODY>");
		    	saida.close();
	}

}

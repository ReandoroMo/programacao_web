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
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter resposta = resp.getWriter();
    	

    	
    	String nome = req.getParameter(NOME);
    	String sobrenome = req.getParameter(SOBRENOME);
    	String rua = req.getParameter(RUA);
    	String complemento = req.getParameter(COMPLEMENTO);
    	String cidade = req.getParameter(CIDADE);
    	String cep = req.getParameter(CEP);
    	String estado = req.getParameter(ESTADO);
    	
    	HttpSession sessao_cadastro = req.getSession();
    	sessao_cadastro.setAttribute("id_nome", nome); 
    	sessao_cadastro.setAttribute("id_sobrenome",sobrenome); 
    	sessao_cadastro.setAttribute("id_rua", rua);
    	sessao_cadastro.setAttribute("id_complemento", complemento);
    	sessao_cadastro.setAttribute("id_cidade", cidade);
    	sessao_cadastro.setAttribute("id_cep", cep);
    	sessao_cadastro.setAttribute("id_estado", estado);
    	//resposta.write((String)sessao_cadastro.getAttribute(NOME));
    	
    	resposta.write("<html>");
    	resposta.write("<head>");
    	resposta.write("<title>Dados</title>");
    	resposta.write("<body>");
    	resposta.write("<form action=\"ServletTela2Cadastro\" method=\"post\">");
    	resposta.write("Empresa: <input type=\"text\" name=\"empresa\"> <br>");
    	resposta.write("Endereço Profissional: <br>");
    	resposta.write("Logradouro: <input type=\"text\" name=\"rua_empresa\"> <br>");
    	resposta.write("Complemento: <input type=\"text\" name=\"compl_empresa\"> <br>");
    	resposta.write("Cidade: <input type=\"text\" name=\"cid_empresa\"> <br>");
    	resposta.write("CEP: <input type=\"text\" name=\"cep_empresa\"> <br>");
    	resposta.write("Estado: <input type=\"text\" name=\"est_empresa\"> <br>");
    	resposta.write("<input type=\"submit\" value=\"Próxima Tela\"> <br>");
    	resposta.write("</form>");
    	resposta.write("</body>");
    	resposta.write("</head>");
    	resposta.write("</html>");
    }
    
}

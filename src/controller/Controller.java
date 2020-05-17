package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//criar as variaveis
		//id 1-clientes // id 2-cursos // id 3-pagamentos
		int idFormulario;
		// 1.1-consultas...
		int tipoFormulario;
		
		String cpfMascara;
		long cpf;
		String nome, email;
		
		String curso, site;
		Float valor;
		
		String dataInscricao;
		
		idFormulario = Integer.parseInt(request.getParameter("idFormulario"));
		tipoFormulario = Integer.parseInt(request.getParameter("tipoFormulario"));
		
		if(idFormulario == 1) {
			//clientes		
			switch (tipoFormulario){
			
			case 12: //CONSULTAR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
			
				out.println("<h2> Clientes => Consultar => cpf: "+cpf);
				break;
			
			case 13: //CADASTRAR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");
				
				out.println("<h2> Clientes => Cadastrar => <br>cpf: "+cpf
								+ "<br>nome: "+nome
								+ "<br>email: "+email);
				break;
			
			case 14: //ALTERAR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");
				
				out.println("<h2> Clientes => Alterar => <br>cpf: "+cpf
								+ "<br>nome: "+nome
								+ "<br>email: "+email);
				break;
		
			case 15: //EXCLUIR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				
				out.println("<h2> Clientes => Excluir => cpf: "+cpf);
				break;
				
			}
			
		} else if(idFormulario == 2) {
			//cursos
			switch (tipoFormulario){
			case 22://CONSULTAR
				curso = request.getParameter("cdcurso");
				
				out.println("<h2> Cursos => Consultar => curso: "+curso);
				break;
			
			case 23://CADASTRAR
				curso = request.getParameter("cdcurso");
				nome = request.getParameter("nome");
				String valorRequest = request.getParameter("valor");
				valor = Float.parseFloat(valorRequest);
				site = request.getParameter("site");
				
				out.println("<h2> Cursos => Cadastrar => curso: "+curso
								+ "<br>nome: "+nome
								+ "<br>valor: "+valor
								+ "<br>site: "+site);
				break;
			
			case 24://ALTERAR
				curso = request.getParameter("cdcurso");
				nome = request.getParameter("nome");
				valorRequest = request.getParameter("valor");
				valor = Float.parseFloat(valorRequest);
				site = request.getParameter("site");
				
				out.println("<h2> Cursos => Alterar => curso: "+curso
								+ "<br>nome: "+nome
								+ "<br>valor: "+valor
								+ "<br>site: "+site);
				break;
			
			case 25://EXCLUIR
				curso = request.getParameter("cdcurso");
				
				out.println("<h2> Cursos => Excluir => curso: "+curso);
				break;
			
			}
			
			
		} else if(idFormulario == 3) {
			//pagamentos
			switch(tipoFormulario) {
			
			case 32://CONSULTAR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				curso = request.getParameter("cdcurso");
				
				out.println("<h2> PAGAMENTOS => Consultar => cpf: "+cpf
								+ "<br>curso: "+curso);
				break;
				
			case 33://CADASTRAR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				curso = request.getParameter("cdcurso");
				dataInscricao = request.getParameter("datainscricao");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")	;
				LocalDate date = LocalDate.parse(dataInscricao, formatter);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
				out.println("<h2> PAGAMENTOS => Consultar => cpf: "+cpf
								+ "<br>curso: "+curso
								+ "<br>data inscrição: "+fmt.format(date));
				break;
				
			case 34://ALTERAÇÃO
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				curso = request.getParameter("cdcurso");
				dataInscricao = request.getParameter("datainscricao");
				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd")	;
				LocalDate date1 = LocalDate.parse(dataInscricao, formatter1);
				DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
				out.println("<h2> PAGAMENTOS => Consultar => cpf: "+cpf
								+ "<br>curso: "+curso
								+ "<br>data inscrição: "+fmt1.format(date1));
				break;
				
			case 35://EXCLUIR
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]", "");
				cpf = Long.parseLong(cpfMascara);
				curso = request.getParameter("cdcurso");
				
				out.println("<h2> PAGAMENTOS => Excluir => cpf: "+cpf
								+ "<br>curso: "+curso);
				break;
			
			}
		}
		
	}

}

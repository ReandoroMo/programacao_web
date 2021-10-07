package Criando_sessao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Contador {

	private static int contador;
	public static String dataFormatada = "";
	
	public static void novoAcesso() {
		contador +=1;
	}
	
	public static int getContadorAcesso() {
		return contador;
	}
	
	
	public static String getDataEHora1() {
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (contador == 1) {
			Date data = new Date();
			dataFormatada = formatoData.format(data);
			return dataFormatada;
		}
		return dataFormatada;
	}
	
	public static String getDataEHora2() {
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		return formatoData.format(data);
	}
	
}

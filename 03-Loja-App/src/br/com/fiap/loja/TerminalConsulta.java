package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TerminalConsulta {
	
	public static void main(String[] args) {
	
	//C�DIGO DO PROFESSOR
		Scanner sc = new Scanner(System.in);
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	do {		
		System.out.println("FIAPStore " + sdf.format(dataAtual.getTime()));
		System.out.println("Digite o c�digo: ");
		int codigo = sc.nextInt();
		
		switch (codigo) {
			case 401: 
				System.out.println("Camiseta Branca");
				break;
			case 402: 
				System.out.println("Camiseta Azul");
				break;
			case 403: 
				System.out.println("Camiseta Rosa");
				break;
			default: 
				System.out.println("Produto n�o encontrado");
				break;
			}	
			
			System.out.println("Deseja sair? S/N");
			
		} while(sc.next().equals("N"));
		System.out.println("Obrigado!");
		sc.close();
		
		
	//MEU C�DIGO
		
		/*Produto p = new Produto();
		String nomeLoja;
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		nomeLoja = JOptionPane.showInputDialog("Digite o nome da loja");
		p.setCdProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto")));	
		System.out.println(nomeLoja + " =============== " + date.format(data) + "\n" + p);
		*/
	}
	

}

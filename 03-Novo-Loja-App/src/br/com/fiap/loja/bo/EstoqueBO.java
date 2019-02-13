package br.com.fiap.loja.bo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.fiap.loja.ProdutoTO;

public class EstoqueBO {
	
	public ProdutoTO consultarProduto(int codProduto) {
		ProdutoTO p = new ProdutoTO();
		String nomeLoja;
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		
		nomeLoja = JOptionPane.showInputDialog("Digite o nome da loja");
		p.setCdProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto")));	
		System.out.println(nomeLoja + " =============== " + date.format(data) + "\n" + p);	
		return p;
	}

}

package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {
	//Criar o objeto para realizar o log
		private static Logger log = Logger.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		log.warn("Inicio da aplica��o");
		
		Scanner sc = new Scanner(System.in);
		EstoqueBO bo = new EstoqueBO();
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		log.debug("LOG de debug do projeto: ");
		
		System.out.println("FIAPStore " + sdf.format(data.getTime()));
		System.out.println("Digite o c�digo: ");
		int codigo = sc.nextInt();
		
		try {
			ProdutoTO produto = bo.consultarProduto(codigo);
			System.out.println(produto.getDescricao());
			System.out.println("Pre�o: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
		} catch (ProdutoNaoEncontradoException e) {
			System.err.println("Produto n�o encontrado");
			log.error("Log de erro de digita��o do usu�rio");
			e.printStackTrace();
		}
		log.warn("Fim da aplica��o");
		
		


				
		sc.close();
	}

}

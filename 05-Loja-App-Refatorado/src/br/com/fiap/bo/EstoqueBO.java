package br.com.fiap.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.TerminalConsulta;
import br.com.fiap.loja.exception.ProdutoNaoEncontradoException;
import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO {
	private static Logger log = Logger.getLogger(EstoqueBO.class);

	
	public ProdutoTO consultarProduto(int codigo) throws ProdutoNaoEncontradoException{
		ProdutoTO produto;
		
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401, 10, 100, "Camiseta Branca");
			break;
		case 402:
			produto = new ProdutoTO(402, 20, 50, "Camiseta Azul");
			break;
		case 403:
			produto = new ProdutoTO(403, 30, 20, "Camiseta Rosa");
			break;

		default:
			throw new ProdutoNaoEncontradoException();
		}
		
		log.debug("LOG de debug do projeto (EstoqueBO): ");

		
		return produto;
		
	}

}

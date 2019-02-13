package br.com.fiap.loja;

import java.io.Serializable;

public class ProdutoTO implements Serializable {
	private int cdProduto;
	private float preco;
	private int quantidade;
	private String descricao;
	
	
	public int getCdProduto() {
		return cdProduto;
	}
	public void setCdProduto(int cdProduto) {
		if (cdProduto == 401) {
			descricao = "Camiseta branca";
			
		}else if(cdProduto == 402) {
			descricao = "Camiseta azul";
		}else if(cdProduto == 403) {
			descricao = "Camiseta rosa";
		}else {
			descricao = "Produto não encontrado";
		}
		
		this.cdProduto = cdProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public ProdutoTO(int cdProduto, String descricao) {
		super();
		this.cdProduto = cdProduto;
		this.descricao = descricao;
	}
	public ProdutoTO() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Código: " + cdProduto + "\n" +
				"Descrição: " + descricao;
	}
	
		
	
}

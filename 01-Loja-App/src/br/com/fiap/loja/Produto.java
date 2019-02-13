package br.com.fiap.loja;

public class Produto {
	private int cdProduto;
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
	public Produto(int cdProduto, String descricao) {
		super();
		this.cdProduto = cdProduto;
		this.descricao = descricao;
	}
	public Produto() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Código: " + cdProduto + "\n" +
				"Descrição: " + descricao;
	}
	
		
	
}

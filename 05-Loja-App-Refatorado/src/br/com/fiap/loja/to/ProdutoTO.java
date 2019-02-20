package br.com.fiap.loja.to;

public class ProdutoTO {
	
	private int codigo;
	private	int quantidade;
	private float preco;
	private String descricao;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ProdutoTO(int codigo, int quantidade, float preco, String descricao) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
		this.descricao = descricao;
	}
	public ProdutoTO() {
		super();
	}
	
	

}

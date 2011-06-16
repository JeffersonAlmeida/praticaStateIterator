package iteratorState;

public abstract class Estado {
	
	private Produto produto;	
	
	private int quantidade;
	
	private int unidadeMin;
	private int unidadeMax;
	
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getUnidadeMin() {
		return unidadeMin;
	}
	public void setUnidadeMin(int unidadeMin) {
		this.unidadeMin = unidadeMin;
	}
	public int getUnidadeMax() {
		return unidadeMax;
	}
	public void setUnidadeMax(int unidadeMax) {
		this.unidadeMax = unidadeMax;
	}
		
	abstract void aumentarEstoque(int quant);
	abstract void diminuirEstoque(int quant);
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}	
	
	
}

package iteratorState;

public class EstadoNormal extends Estado {
	
	public EstadoNormal(Estado estado){
		this(estado.getQuantidade(), estado.getProduto());
	}
	
	public EstadoNormal(int quantidade, Produto produto){
		setQuantidade(quantidade);
		setProduto(produto);	
		inicializar();
	}

	private void inicializar() {
		setUnidadeMin(1);
		setUnidadeMax(10);
	}

	@Override
	void aumentarEstoque(int quant) {
		setQuantidade(getQuantidade()+quant);	
		verificarAlteracaoEstado();
	}

	@Override
	void diminuirEstoque(int quant) {
		setQuantidade(getQuantidade()-quant);
		verificarAlteracaoEstado();
	}

	private void verificarAlteracaoEstado() {
		if((getQuantidade()> getUnidadeMin()) && (getQuantidade()<getUnidadeMax())){
			getProduto().setEstado(new EstadoCritico(this));
		}else if(getQuantidade() < getUnidadeMin()){
			getProduto().setEstado(new EstadoEmFalta(this));
		}
	}

}

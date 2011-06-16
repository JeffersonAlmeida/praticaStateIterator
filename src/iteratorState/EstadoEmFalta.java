package iteratorState;

public class EstadoEmFalta extends Estado{
	
	private Produto produto;
	
	public EstadoEmFalta(Estado estado){
		this(estado.getQuantidade(), estado.getProduto());
	}
	
	public EstadoEmFalta(int quantidade, Produto produto){
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
		if(getQuantidade()>getUnidadeMin() && getQuantidade() < getUnidadeMax()){
			getProduto().setEstado(new EstadoCritico(this));
		}else if(getQuantidade() >= getUnidadeMax()){
			getProduto().setEstado(new EstadoNormal(this));
		}
	}


}

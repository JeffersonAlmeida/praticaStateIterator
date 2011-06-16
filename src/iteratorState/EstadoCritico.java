package iteratorState;

public class EstadoCritico extends Estado{
	
	public EstadoCritico(Estado estado){
		this(estado.getQuantidade(), estado.getProduto());
	}
	
	public EstadoCritico(int quantidade, Produto produto){
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
		if(getQuantidade()< getUnidadeMin()){
			getProduto().setEstado(new EstadoEmFalta(this));
		}else if (getQuantidade() >= getUnidadeMax()){
			getProduto().setEstado(new EstadoNormal(this));
		}
		
	}

}

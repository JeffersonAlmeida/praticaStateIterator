package iteratorState;


// produto neste caso é o contexto
public class Produto {
	
	private Estado estado;
	private String nome;
	
	public Produto(Estado estado, String nome){		
		this.estado = estado;
		this.nome = nome;
	}
	
	public Produto(String nString){
		this.nome = nString;
		this.estado = new EstadoNormal(10,this);
		// criar um estado default
	}
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void aumentarEstoque(int quant){
		this.estado.aumentarEstoque(quant);
		System.out.println("\n\nAumentando o estoque\n");
		System.out.println("Estoque :: " + estado.getQuantidade());
		System.out.println("Estado :: " + estado.getClass().getName());
		System.out.println("************************************");
	}
	
	public void diminuirEstoque(int quant){
		this.estado.diminuirEstoque(quant);
		System.out.println("\n\nDiminuindo o estoque\n");
		System.out.println("Estoque :: " + estado.getQuantidade());
		System.out.println("Estado :: " + estado.getClass().getName());
		System.out.println("************************************");
	}

	@Override
	public String toString() {
		return "Produto [estado=" + estado.getClass().getName() + ", nome=" + nome + ", quant : "+estado.getQuantidade()+"]";
	}
	
	
}

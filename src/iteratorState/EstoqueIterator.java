package iteratorState;

public class EstoqueIterator implements Iterator {
	
	private Estoque estoque;
	private int pos = 0;
	
	public EstoqueIterator(Estoque estoque){
		this.estoque =  estoque;
	}
	
	@Override
	public boolean hasNext() {
		return (pos < this.estoque.getProdutos().size());
	}

	@Override
	public Object next() {		
		Object object = this.estoque.getProdutos().get(pos); 
		this.pos++;
		return object;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getPos() {
		return pos;
	}

}

package iteratorState;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Produto> produtos;
	
	public Estoque(){
		this.produtos = new ArrayList<Produto>();
	}
	
	public void encheEstoque(Produto p){
		produtos.add(p);
	}
		
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Iterator iterator(){
		return new EstoqueIterator(this);
	}
}

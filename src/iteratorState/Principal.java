package iteratorState;

public class Principal {


	public static void main(String[] args) {

			Produto produto = new Produto("PEN DRIVE");
			produto.aumentarEstoque(10);
			produto.diminuirEstoque(20);
			produto.aumentarEstoque(5);
			
			Produto p2 = new Produto("CD");
			Produto p3 = new Produto("DVD");
			Produto p4 = new Produto("MOUSE");
			Produto p5 = new Produto("TECLADO");
			
			
			
			Estoque estoque = new Estoque();
			estoque.encheEstoque(produto);
			estoque.encheEstoque(p2);
			estoque.encheEstoque(p3);
			estoque.encheEstoque(p4);
			estoque.encheEstoque(p5);
			
			System.out.println("\n\n## Nosso Estoque ##\n");
			Iterator iterator = estoque.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
			
			

	}

}

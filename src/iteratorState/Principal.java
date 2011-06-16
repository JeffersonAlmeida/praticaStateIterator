package iteratorState;

public class Principal {


	public static void main(String[] args) {

			Produto produto = new Produto("Pen Drive");
			produto.aumentarEstoque(10);
			produto.diminuirEstoque(20);
			produto.aumentarEstoque(5);

	}

}

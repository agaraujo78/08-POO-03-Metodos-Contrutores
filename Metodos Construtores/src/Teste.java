
public class Teste {
	public static void main(String[] args) {
		
		Produto prod = new Produto(/*"Notebook Genérico", 1500.00*/);
		
		
		System.out.println("PRODUTO: "+ prod.descricao);
	 	System.out.printf("VALOR: R$ %.2f\n", prod.valor);
	
		prod.descricao = "Notebook Avell LIV G1750 i7";
		prod.valor = 7000.00;
		
		System.out.println("PRODUTO: "+ prod.descricao);
		System.out.printf("VALOR: R$ %.2f\n", prod.valor);
	}

}


public class Teste01 {
	public static void main(String[] args) {
		
		Produto prod1 = new Produto();
		
		Produto prod2 = new Produto("Notebook Avell LIV G1750 i7");
		
		Produto prod3 = new Produto("Notebook Genérico", 1500.00);
		
		prod1.descricao = "Mouse Microsoft 3000pm";
		prod1.valor = 350.00;
		
		prod2.valor = 7500.00;
		 
		System.out.println("PRODUTO 1: "+ prod1.descricao);
	 	System.out.printf("VALOR    : R$ %.2f\n", prod1.valor);
		
		System.out.println("PRODUTO 2: "+ prod2.descricao);
		System.out.printf("VALOR    : R$ %.2f\n", prod2.valor);
		
		System.out.println("PRODUTO 3: "+ prod3.descricao);
		System.out.printf("VALOR    : R$ %.2f\n", prod3.valor);
	
	}

}

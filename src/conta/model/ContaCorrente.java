package conta.model;

//Contacorrente herda de Conta
public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		// Metodo construtor da super classe
		// Conta(numero, agencia, tipo,titular, saldo)
		super(numero, agencia, tipo, titular, saldo);
		// Atributo da classe
		this.limite = limite;
	}
	
	// Metodos de acesso.

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// Métodos Especificos da Classe ContaCorrente
	
	@Override 
	public void visualizar() {
		//Super == chamada da superclasse => conta.visualizar();
		super.visualizar();
		System.out.println("Limite de crédito" + this.limite);
	}
	
}

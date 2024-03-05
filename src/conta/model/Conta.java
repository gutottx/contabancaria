package conta.model;

public class Conta {

	// Atributos / Características

	// Encapsulamento: Encapsular/Proteger algo
	// Private / Protected / Public / Friendly
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Método construtor => Auxilia na criação/instanciação de um objeto da clase.
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {

		// This representa o nome da própria Classe (Conta)

		this.numero = numero; // Conta.numero recebe o valor do argumento numero
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	
	//Metodos de acesso (Métodos Get/Set)
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
}

package br.com.zup;

public class Pessoa {

	private String olhos;
	private int idade;
	private String nome;
	private double tamanho;
	private double peso;
	
	public Pessoa(String olhos, int idade , String nome) {
		this.olhos = olhos;
		this.idade = idade;
		this.nome = nome;
	
	
	}
	
	public Pessoa (String nome , double tamanho) {
	this.nome = nome;
	this.tamanho = tamanho;
	}
	
	public String getOlhos() { 
		return this.olhos;
	} 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setOlhos(String corDosOlhos) { 
		this.olhos = corDosOlhos;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodos de pessoa
	public String andar() {
		return "Está andando...";
		
	}
	
	public String pular() {
		return "Está pulando ... ";
		
	}
	public String correr() {
		return "Está correndo...";
	}
	public String toString() { 
		String aux = "";
		aux += "Nome->" + this.nome + "\n";
		return aux += "Tamanho -> " + this.tamanho;
		
	}
}

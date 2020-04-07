package proJetoPoli;

public  abstract class  Pessoa {
	
	private String nome;
	private int idade;
	private int dataNascimento;
	private double registroGeral;
	private double numeroCPF;
	private String nomeMae;
	private String nomePai;
	
	
	public   abstract double  salario();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(double registroGeral) {
		this.registroGeral = registroGeral;
	}
	public double getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(double numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	
	
	
	
	
	
	

}

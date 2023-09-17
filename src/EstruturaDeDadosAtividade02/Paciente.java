package EstruturaDeDadosAtividade02;

public class Paciente {
	private String nome;
	private boolean preferencial;
	
	public Paciente(String nome, boolean preferencial) {
		this.nome = nome;
		this.preferencial = preferencial;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreferencial(boolean preferencial) {
		this.preferencial = preferencial;
	}
	
	public boolean getPreferencial() {
		return this.preferencial;
	}
	
	public String getNome() {
		return this.nome;
	}
}

package usuario;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setsenha(String senha) {
		this.senha = senha;
	}
	public Usuario(int id, String nome, String email, String senha) {
		super();
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	@Override
	public String toString() {
		return " \nUsuario [ nome= " + nome + ", email= " + email + "] \n";
	}
	

}

package bytebank.herancas;

public class Administrator extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Administrator() {
		this.autenticador = new AutenticacaoUtil();
	}

	
	public double getBonificacao() {
		return 100;
	}

	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
		
	}

	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
		
	}
	}


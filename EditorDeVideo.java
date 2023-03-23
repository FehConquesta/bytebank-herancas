package bytebank.herancas;

public class EditorDeVideo extends Funcionario {
	
	
	public double getBonificacao() {
		System.out.println("Metodo de bonificacao do Editor de Video");
		return super.getBonificacao()+ 100;
	
}

}

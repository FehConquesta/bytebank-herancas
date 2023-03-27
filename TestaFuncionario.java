package bytebank.herancas;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente luiz = new Gerente();
		
		luiz.setNome("Luiz");
		luiz.setCpf("111.111.111-11");
		luiz.setSalario(2700);
		
		System.out.println(luiz.getNome());
		System.out.println(luiz.getBonificacao());
	}
}

package bytebank.herancas;

public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Luiz");
		g1.setSalario(5000);
		 
		Designer f = new Designer();
		
		f.setNome("Bia");
		f.setSalario(2500);
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setNome("Carlos");
		ev.setSalario(3000);
			
		
		ControleBonificacao controle = new ControleBonificacao();
		
		
		controle.registra(f);
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());	
		
	}

}

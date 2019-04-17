package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe5Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas5 = valor / 5;
		if(qtdNotas5 > 0 )
			System.out.printf("%d notas de 5.\n", qtdNotas5);
		if (valor % 5 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 5);			}
		} 
	}
	
}
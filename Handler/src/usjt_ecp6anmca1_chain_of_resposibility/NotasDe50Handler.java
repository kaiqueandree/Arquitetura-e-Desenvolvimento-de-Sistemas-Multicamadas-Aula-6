package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe50Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas50 = valor / 50;
		if(qtdNotas50 > 0 )
			System.out.printf("%d notas de 50.\n", qtdNotas50);
		if (valor % 50 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 50);			}
		} 
	}
	
}

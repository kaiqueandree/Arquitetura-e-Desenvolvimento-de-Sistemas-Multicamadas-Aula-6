package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe30Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas30 = valor / 30;
		if(qtdNotas30 > 0 )
			System.out.printf("%d notas de 30.\n", qtdNotas30);
		if (valor % 30 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 30);			}
		}
	}
	
}

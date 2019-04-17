package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe2Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas2 = valor / 2;
		if(qtdNotas2 > 0 )
			System.out.printf("%d notas de 2.\n", qtdNotas2);
		if (valor % 2 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 2);			}
		}
	}
	
}
package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe20Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas20 = valor / 20;
		if(qtdNotas20 > 0 )
			System.out.printf("%d notas de 20.\n", qtdNotas20);
		if (valor % 20 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 20);			}
		} 
	}
}

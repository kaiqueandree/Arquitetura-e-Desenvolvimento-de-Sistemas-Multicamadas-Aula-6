package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe10Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdNotas10 = valor / 10;
		if(qtdNotas10 > 0 )
			System.out.printf("%d notas de 10.\n", qtdNotas10);
		if (valor % 10 != 0) {
			if(getHandler() != null) {
				getHandler().process(valor % 10);			}
		} 
	}
	
}
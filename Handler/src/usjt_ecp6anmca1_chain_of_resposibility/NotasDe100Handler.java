package usjt_ecp6anmca1_chain_of_resposibility;

public class NotasDe100Handler extends Handler {

	@Override
	public void process(int valor) {
		int qtdDeNotas100 = valor / 100;
		if (qtdDeNotas100 > 0 ) 
			System.out.printf("%d notas de 100. ", qtdDeNotas100);
			if (valor % 100 != 0) {
				if(getHandler() != null) {
					getHandler().process(valor % 100);
				} else {
					System.out.printf("Notas Indisponiveis para %d\n", valor % 100);
			}
		}		
	}
}

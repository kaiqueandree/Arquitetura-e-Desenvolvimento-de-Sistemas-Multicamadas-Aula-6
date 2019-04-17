package usjt_ecp6anmca1_chain_of_resposibility;

public class CaixaEletronico {

	public static void main(String[] args) {
		int valor = 990;
		Handler notas100Handler = new NotasDe100Handler();
		Handler notas50Handler = new NotasDe50Handler();
		Handler notas30Handler = new NotasDe30Handler();
		Handler notas20Handler = new NotasDe20Handler();
		Handler notas10Handler = new NotasDe10Handler();
		Handler notas5Handler = new NotasDe5Handler();
		Handler notas2Handler = new NotasDe2Handler();
		Handler notas1Handler = new NotasDe1Handler();
		
		notas100Handler.setHandler(notas50Handler);
		notas50Handler.setHandler(notas30Handler);
		notas30Handler.setHandler(notas20Handler);
		notas20Handler.setHandler(notas10Handler);
		notas10Handler.setHandler(notas5Handler);
		notas5Handler.setHandler(notas2Handler);
		notas2Handler.setHandler(notas1Handler);
		
		notas100Handler.process(valor);
	}

}

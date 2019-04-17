package usjt_ecp6anmca1_chain_of_resposibility;

public abstract class Handler {

	private Handler handler;

	public abstract void process(int valor);
	public void setHandler (Handler handler) {
	this.handler = handler;
	
	
	}
	public Handler getHandler() {
		return handler;
	}
}
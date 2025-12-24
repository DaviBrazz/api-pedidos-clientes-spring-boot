package api.pedidos.clientes.services.exceptions;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = -3981570614643025197L;

	public DatabaseException(String msg) {
		super(msg);
	}
}

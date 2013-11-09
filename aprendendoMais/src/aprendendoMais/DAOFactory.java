package aprendendoMais;

public class DAOFactory {
	
	
	public static ClienteDAO criaClienteDAO(){
		HibernateDAOCliente hDC = new HibernateDAOCliente();
		return hDC;
	}
}

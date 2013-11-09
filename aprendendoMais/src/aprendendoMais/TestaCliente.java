package aprendendoMais;


public class TestaCliente {
	
	private ClienteDAO cDAO;
	public TestaCliente(){
		this.cDAO = DAOFactory.criaClienteDAO();

	}
	
	public ClienteDAO getcDAO() {
		return cDAO;
	}
	public void setcDAO(ClienteDAO cDAO) {
		this.cDAO = cDAO;
	}
	
	public void mostra(){
		this.cDAO.mostra();
	}
}

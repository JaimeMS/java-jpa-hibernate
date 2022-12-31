package modelo.basico;

import infra.DAO;

public class ProdutoDAO extends DAO<Produto>{

	public ProdutoDAO() {
		super(Produto.class);
	}
	
}

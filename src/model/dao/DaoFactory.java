package model.dao;

import model.dao.impl.FuncionarioDaoJDBC;

public class DaoFactory {
	
	public static FuncionarioDao criaFuncionarioDao() {
		return new FuncionarioDaoJDBC();
	}

}

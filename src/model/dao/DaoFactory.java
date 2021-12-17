package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();//a classe expoe um metodo que retorna o tipo da interface mas internamente faz a implementação
	}
}

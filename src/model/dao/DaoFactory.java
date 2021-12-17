package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());//a classe expoe um metodo que retorna o tipo da interface mas internamente faz a implementa��o
	}
}

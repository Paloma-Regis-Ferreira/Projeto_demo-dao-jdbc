package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();//inje��o de dependencia
		
		System.out.println("=== TEST seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}

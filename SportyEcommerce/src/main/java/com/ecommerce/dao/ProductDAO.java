package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Product;

@Repository
@Component
public class ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public Product getProductById(long id) {
		String strId = String.valueOf(id);
		List<Product> list = this.sessionFactory.getCurrentSession().createQuery("from Product where id=" + strId).list();
		if (list.size() > 0)
			return (Product) list.get(0);
		else
			return null;
		
	}

	public void updateProduct(Product product)
	{
	String sql = "";
	if(product.getID()==0)
		this.sessionFactory.getCurrentSession().save(product);
	else if(product.getID()>0){
		sql = "update Product set name=:name, price=:price, category_id=:category_id where " + "ID=:id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(sql);
		query.setParameter("name", product.getName());
		query.setParameter("price", product.getPrice());
		query.setParameter("category_id", product.getCategoryId());
		query.setParameter("id", product.getID());
		
		query.executeUpdate();
	}
	}
	
	@SuppressWarnings("unchecked")
	public void deleteProduct(long id) {
	
		
		
		String sql = "";
		sql = "delete from Product where ID=:id";
		Query query = this.sessionFactory.getCurrentSession().createQuery(sql);
		query.setParameter("id", id);
		 
		query.executeUpdate();
		
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		List<Product> list = this.sessionFactory.getCurrentSession().createQuery("from Product order by name").list(); 

		return list;
	}
	}
		
	


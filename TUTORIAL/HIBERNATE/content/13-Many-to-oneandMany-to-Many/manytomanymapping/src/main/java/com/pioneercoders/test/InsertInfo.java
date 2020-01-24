package com.pioneercoders.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entities.Cart;
import com.pioneercoders.entities.Item;
import com.pioneercoders.util.HibernateUtil;

public class InsertInfo {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		Item item1 = new Item();
		item1.setDescription("samsung");
		item1.setPrice(300);
		Item item2 = new Item();
		item2.setDescription("nokia");
		item2.setPrice(200);
		Cart cart = new Cart();
		cart.setTotal(500);
		Set<Item> items = new HashSet<Item>();
		items.add(item1);
		items.add(item2);
		cart.setItems(items);
		ses.save(cart);
		ses.getTransaction().commit();
	}

	/*
	 * Hibernate: insert into CART (cart_total) values (?)
	 *  Hibernate: insert
	 * into ITEM (item_desc, item_price) values (?, ?) 
	 * Hibernate: insert into
	 * ITEM (item_desc, item_price) values (?, ?) 
	 * Hibernate: insert into
	 * CART_ITEMS (cart_id, item_id) values (?, ?) 
	 * Hibernate: insert into
	 * CART_ITEMS (cart_id, item_id) values (?, ?)
	 */

}

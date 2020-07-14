package com.mardrasmarket.api.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Oder_Master {

	@Id
	private int order_id;
	private int user_id;
	private String timestamp;
}

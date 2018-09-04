package com.lee.DesignPatternsDemo.creat.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName：Prototype
 * @Description：原型模式
 * @company:zhph
 * @author liting
 * @date 2017年11月29日 上午9:23:36
 */
 
public class Prototype implements Cloneable,Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private String haha = "haha";
	
	public Prototype(String haha) {
		this.haha = haha;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();  
        return proto;  
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getHaha() {
		return haha;
	}

	public void setHaha(String haha) {
		this.haha = haha;
	}
	
}

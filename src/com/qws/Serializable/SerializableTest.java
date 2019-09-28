package com.qws.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：SerializableTest   
 * 类描述：          static修饰的变量和transient修饰的变量不会被序列化
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 上午9:56:33   
 * 
 */
public class SerializableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		serializeComputer();
		computerSerialize();

	}
	
	//序列化
	public static void serializeComputer() throws Exception {
		Computer com = new Computer();
		com.setBrand("lenovo");
		com.setCar("auto");
		com.setPrice(6000.00);
		OutputStream out = new FileOutputStream(new File("src/com/qws/Serializable/computer.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(com);
		System.out.println("序列化成功！");
		oos.close();
		out.close();
	}
	
	public static void computerSerialize() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/com/qws/Serializable/computer.txt")));
		Computer com = (Computer)ois.readObject();
		System.out.println(com);
		ois.close();
		
	}

}

package com.qws.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�SerializableTest   
 * ��������          static���εı�����transient���εı������ᱻ���л�
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����9:56:33   
 * 
 */
public class SerializableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		serializeComputer();
		computerSerialize();

	}
	
	//���л�
	public static void serializeComputer() throws Exception {
		Computer com = new Computer();
		com.setBrand("lenovo");
		com.setCar("auto");
		com.setPrice(6000.00);
		OutputStream out = new FileOutputStream(new File("src/com/qws/Serializable/computer.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(com);
		System.out.println("���л��ɹ���");
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

package com.qws.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�IOTest   
 * ��������   IO��ϵ
 * 			�� Java �������� ������ �ĸ������ʾ�κ���������������Դ��������
 * 			��������Դ�Ķ�������Դ���������ˮԴ����ˮ����ˮ����ˮ��һ��ˮ��
 * 			�ȡ����ݴ����������Ϊˮ�����䣬�Ŵ�����Ͱ��ˮ���������ˮ�ģ�����
 * 			�иֹ���ˮ����ͬ�����䷽ʽ��Ӧ��ͬ���������ԡ�
 * 			�ֽ�������
 * 			InputStream��ByteArrayInputStream��FilterInputStream��ObjectInputStream
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����11:39:53   
 * 
 */
public class IOTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		copy();
		copy3();
		copy4();
		copy2();
		Vector  v = new Vector<Integer>();

	}
	
	public static void copy() throws Exception {
		InputStream in = new FileInputStream(new File("src/com/qws/IO/dili.TIF"));
		OutputStream out = new FileOutputStream(new File("src/com/qws/IO/dili2.TIF"));
		long start = System.currentTimeMillis();
		byte[] bt = new byte[1024];
		while(in.read(bt) != -1) {
			out.write(bt);
		}
		out.flush();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		in.close();
		out.close();
	}
	
	public static void copy2() throws Exception {
		InputStream in = new FileInputStream(new File("src/com/qws/IO/dili.TIF"));
		OutputStream out = new FileOutputStream(new File("src/com/qws/IO/dili2.TIF"));
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		long start = System.currentTimeMillis();
		byte[] bt = new byte[1024];
		while(bin.read(bt) != -1) {
			bout.write(bt);
		}
		bout.flush();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		bin.close();
		bout.close();
		in.close();
		out.close();
	}
	
	public static void copy3() throws Exception {
		InputStream in = new FileInputStream(new File("src/com/qws/IO/dili.TIF"));
		OutputStream out = new FileOutputStream(new File("src/com/qws/IO/dili2.TIF"));
		BufferedInputStream bin = new BufferedInputStream(in);
		long start = System.currentTimeMillis();
		byte[] bt = new byte[1024];
		while(bin.read(bt) != -1) {
			out.write(bt);
		}
		out.flush();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		bin.close();
		in.close();
		out.close();
	}
	
	public static void copy4() throws Exception {
		InputStream in = new FileInputStream(new File("src/com/qws/IO/dili.TIF"));
		OutputStream out = new FileOutputStream(new File("src/com/qws/IO/dili2.TIF"));
		BufferedOutputStream bout = new BufferedOutputStream(out);
		long start = System.currentTimeMillis();
		byte[] bt = new byte[1024];
		while(in.read(bt) != -1) {
			bout.write(bt);
		}
		bout.flush();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		bout.close();
		in.close();
		out.close();
	}


}

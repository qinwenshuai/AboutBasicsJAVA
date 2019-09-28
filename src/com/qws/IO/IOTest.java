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
 * 项目名称：AboutBasicsJAVA   
 * 类名称：IOTest   
 * 类描述：   IO体系
 * 			在 Java 中引入了 “流” 的概念，它表示任何有能力产生数据源或有能力
 * 			接收数据源的对象。数据源可以想象成水源，海水、河水、湖水、一杯水等
 * 			等。数据传输可以想象为水的运输，古代有用桶运水，用竹管运水的，现在
 * 			有钢管运水，不同的运输方式对应不同的运输特性。
 * 			字节输入流
 * 			InputStream、ByteArrayInputStream、FilterInputStream、ObjectInputStream
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 上午11:39:53   
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

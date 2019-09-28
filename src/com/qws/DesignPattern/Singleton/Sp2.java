package com.qws.DesignPattern.Singleton;

/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Sp2   
 * 类描述：   饿汉式单例模式，比较常用，但容易产生垃圾，线程安全！
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 下午3:14:57   
 * 
 */
public class Sp2 {
	private static Sp2 sp = new Sp2();

	private Sp2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Sp2 getInstance() {
		return sp;
	}

}

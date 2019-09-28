package com.qws.DesignPattern.Singleton;

/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Sp3   
 * 类描述：  双重锁模式，线程安全，延迟加载。多线程下保持高性能！ 
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 下午3:30:13   
 * 
 */
public class Sp3 {
	private volatile static Sp3 sp;

	private Sp3() {
		super();
	}
	
	public static Sp3 getInstance() {
		if(sp == null) {
			synchronized(Sp3.class) {
				if(sp == null) {
					sp = new Sp3();
				}
			}
		}
		return sp;
	}
	

}

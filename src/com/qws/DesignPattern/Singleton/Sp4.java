package com.qws.DesignPattern.Singleton;

/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Sp4   
 * 类描述：  静态内部类单例模式 
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 下午3:39:11   
 * 
 */
public class Sp4 {
	private Sp4() {
		
	}
	
	public static Sp4 getInstance() {
		return Inner.sp;
	}
	
	private static class Inner{
		private static final Sp4 sp = new Sp4(); 
	}

}

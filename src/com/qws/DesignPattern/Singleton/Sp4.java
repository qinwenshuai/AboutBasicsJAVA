package com.qws.DesignPattern.Singleton;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Sp4   
 * ��������  ��̬�ڲ��൥��ģʽ 
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����3:39:11   
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

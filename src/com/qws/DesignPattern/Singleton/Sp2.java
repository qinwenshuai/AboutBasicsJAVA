package com.qws.DesignPattern.Singleton;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Sp2   
 * ��������   ����ʽ����ģʽ���Ƚϳ��ã������ײ����������̰߳�ȫ��
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����3:14:57   
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

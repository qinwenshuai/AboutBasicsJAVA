package com.qws.DesignPattern.Singleton;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Sp3   
 * ��������  ˫����ģʽ���̰߳�ȫ���ӳټ��ء����߳��±��ָ����ܣ� 
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����3:30:13   
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

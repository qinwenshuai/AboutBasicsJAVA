package com.qws.DesignPattern.Singleton;

/**
 *����ģʽ
 *	Ӧ�ó������������ʵ�֣���������Ķ�����Ҫ������Դ��
 *	�ص㣺�๹����˽��
 *		�����������͵�����
 *		�����ṩ��ȡʵ���ľ�̬����
 *������Spring����ע��ʱ��ʹ����˫���жϼ����ĵ���ģʽ��
 *
 *
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Sp1   
 * ��������   ��������ģʽ�����̰߳�ȫ���ӳټ��أ�
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����3:09:52   
 * 
 */
public class Sp1 {
	private static Sp1 sp= null;

	public static Sp1 getInstance() {
		if(sp == null) {
			sp = new Sp1();
		}else {
			
		}
		return sp;
	}

	private Sp1() {
		super();
	}
	

}

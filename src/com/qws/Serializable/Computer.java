package com.qws.Serializable;

import java.io.Serializable;

/**
 *
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Computer   
 * �����������л��뷴���л����֪ʶ��
 * 			��java�У������ж��ط�ʽ���������󣬲���ֻҪ����û�б����վͿ��Ը��øö��󡣵���
 * 			���Ǵ�����������Щjava�����Ǵ�����jvm�Ķ�ջ�У�ֻ����jvm��������״̬��ʱ����Щ
 * 			����ſ��ܴ��ڡ�һ��jvmֹͣ���У���Щ�����״̬Ҳ����֮��ʧ�ˡ�
 * 				1.ʲô�����л��ͷ����л���
 * 					���л���ָ��java����ת��Ϊ�ֽ����еĹ���
 * 					�����л���ָ���ֽ����лָ��ɶ���Ĺ���
 * 				2.Ӧ�ó���
 * 					�ڴ��еĶ��󱣴浽�ļ������ݿ���	
 * 					�������紫��
 * 					��RMI�ϴ������
 * 
 * ������ժ�� jdk api �ĵ�������ڽӿ� Serializable ������
��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�
δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
�����л�������������ͱ����ǿ����л��ġ���Ϊʵ�ֽӿ�Ҳ�Ǽ�ӵĵ�ͬ�ڼ̳С�
���л��ӿ�û�з������ֶΣ������ڱ�ʶ�����л������塣

���� serialVersionUID ������
���л�����ʱʹ��һ����Ϊ serialVersionUID �İ汾����ÿ�������л���������������к��ڷ����л�����
��������֤���л�����ķ����ߺͽ������Ƿ�Ϊ�ö�������������л����ݵ��ࡣ��������߼��صĸö������� 
serialVersionUID ���Ӧ�ķ����ߵ���İ汾�Ų�ͬ�������л����ᵼ�� InvalidClassException��
�����л������ͨ��������Ϊ "serialVersionUID" ���ֶΣ����ֶα����Ǿ�̬ (static)������ (final) 
�� long ���ֶΣ���ʽ�������Լ��� serialVersionUID��

��������л���δ��ʽ���� serialVersionUID�������л�����ʱ�����ڸ���ĸ��������������Ĭ��
 serialVersionUID ֵ���硰Java(TM) �������л��淶����������������ǿ�ҽ��� ���п����л��඼
 ��ʽ���� serialVersionUID ֵ��ԭ���Ǽ���Ĭ�ϵ� serialVersionUID �������ϸ��Ϣ���нϸ�
 �������ԣ����ݱ�����ʵ�ֵĲ�ͬ����ǧ����������ڷ����л������п��ܻᵼ������� InvalidClassException��
 ��ˣ�Ϊ��֤ serialVersionUID ֵ�粻ͬ java ������ʵ�ֵ�һ���ԣ����л����������һ����ȷ�� 
 serialVersionUID ֵ����ǿ�ҽ���ʹ�� private ���η���ʾ���� serialVersionUID��������ܣ���
 ԭ��������������Ӧ����ֱ�������� -- serialVersionUID �ֶ���Ϊ�̳г�Աû���ô��������಻������
 һ����ȷ�� serialVersionUID������������Ǿ���Ĭ�ϵļ���ֵ������������û��ƥ�� serialVersionUID ֵ��Ҫ��
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��28�� ����9:34:17   
 * 
 */
public class Computer implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String belong = "ylx";
	private String brand;
	private double price;
	transient private String car;
	private String addTip;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer{" +
        "brand='" + brand + '\'' +
        ", price='" + price + '\'' +
        ", car='" + car + '\'' +
        ", belong='" + belong + '\'' +
        ", addTip='" + addTip + '\'' +
        '}';
	}
	public String getAddTip() {
		return addTip;
	}
	public void setAddTip(String addTip) {
		this.addTip = addTip;
	}
	
}

package com.qws.Serializable;

import java.io.Serializable;

/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Computer   
 * 类描述：序列化与反序列化相关知识：
 * 			在java中，我们有多重方式来创建对象，并且只要对象没有被回收就可以复用该对象。但是
 * 			我们创建出来的这些java对象是存在于jvm的堆栈中，只有在jvm处于运行状态的时候，这些
 * 			对象才可能存在。一旦jvm停止运行，这些对象的状态也就随之丢失了。
 * 				1.什么是序列化和反序列化？
 * 					序列化是指把java对象转化为字节序列的过程
 * 					反序列化是指把字节序列恢复成对象的过程
 * 				2.应用场景
 * 					内存中的对象保存到文件或数据库中	
 * 					进行网络传输
 * 					在RMI上传输对象
 * 
 * 下面是摘自 jdk api 文档里面关于接口 Serializable 的描述
类通过实现 java.io.Serializable 接口以启用其序列化功能。
未实现此接口的类将无法使其任何状态序列化或反序列化。
可序列化类的所有子类型本身都是可序列化的。因为实现接口也是间接的等同于继承。
序列化接口没有方法或字段，仅用于标识可序列化的语义。

关于 serialVersionUID 的描述
序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，该序列号在反序列化过程
中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。如果接收者加载的该对象的类的 
serialVersionUID 与对应的发送者的类的版本号不同，则反序列化将会导致 InvalidClassException。
可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final) 
的 long 型字段）显式声明其自己的 serialVersionUID：

如果可序列化类未显式声明 serialVersionUID，则序列化运行时将基于该类的各个方面计算该类的默认
 serialVersionUID 值，如“Java(TM) 对象序列化规范”中所述。不过，强烈建议 所有可序列化类都
 显式声明 serialVersionUID 值，原因是计算默认的 serialVersionUID 对类的详细信息具有较高
 的敏感性，根据编译器实现的不同可能千差万别，这样在反序列化过程中可能会导致意外的 InvalidClassException。
 因此，为保证 serialVersionUID 值跨不同 java 编译器实现的一致性，序列化类必须声明一个明确的 
 serialVersionUID 值。还强烈建议使用 private 修饰符显示声明 serialVersionUID（如果可能），
 原因是这种声明仅应用于直接声明类 -- serialVersionUID 字段作为继承成员没有用处。数组类不能声明
 一个明确的 serialVersionUID，因此它们总是具有默认的计算值，但是数组类没有匹配 serialVersionUID 值的要求。
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 上午9:34:17   
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

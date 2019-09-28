package com.qws.DesignPattern.Singleton;

/**
 *单例模式
 *	应用场景：工具类的实现，创建过多的对象需要消耗资源。
 *	特点：类构造器私有
 *		持有自身类型的属性
 *		对外提供获取实例的静态方法
 *举例：Spring依赖注入时，使用了双重判断加锁的单例模式。
 *
 *
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Sp1   
 * 类描述：   懒汉单例模式，非线程安全，延迟加载！
 * 创建人：秦文帅   
 * 创建时间：2019年9月28日 下午3:09:52   
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

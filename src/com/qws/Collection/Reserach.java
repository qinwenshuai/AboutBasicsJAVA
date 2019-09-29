package com.qws.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;


/**
 *
 * 项目名称：AboutBasicsJAVA   
 * 类名称：Reserach   
 * 类描述：   Iterable  Collection List(ArrayList、LinkedList、Vector)  Set(HashSet、LinkedHashSet、TreeSet)
 * 			Map(HashMap、LinkedHashMap、TreeMap)
 * 			List有序，可存储重复元素，可按照索引查找
 * 			Set无序（对用户）、不可存储重复元素
 * 			Map存储键值对
 * 创建人：秦文帅   
 * 创建时间：2019年9月29日 上午9:04:41   
 * 
 */
public class Reserach implements Iterable<Reserach> {
	
	/**
	 * LinkedList和ArrayList的对比：
1、顺序插入速度ArrayList会比较快，因为ArrayList是基于数组实现的，数组是事先new好的，只要往指定位置塞一个数据就好了；LinkedList则不同，每次顺序插入的时候LinkedList将new一个对象出来，如果对象比较大，那么new的时间势必会长一点，再加上一些引用赋值的操作，所以顺序插入LinkedList必然慢于ArrayList
2、基于上一点，因为LinkedList里面不仅维护了待插入的元素，还维护了Entry的前置Entry和后继Entry，如果一个LinkedList中的Entry非常多，那么LinkedList将比ArrayList更耗费一些内存
3、数据遍历的速度，看最后一部分，这里就不细讲了，结论是：使用各自遍历效率最高的方式，ArrayList的遍历效率会比LinkedList的遍历效率高一些
4、有些说法认为LinkedList做插入和删除更快，这种说法其实是不准确的：
（1）LinkedList做插入、删除的时候，慢在寻址，快在只需要改变前后Entry的引用地址
（2）ArrayList做插入、删除的时候，慢在数组元素的批量copy，快在寻址
所以，如果待插入、删除的元素是在数据结构的前半段尤其是非常靠前的位置的时候，LinkedList的效率将大大快过ArrayList，因为ArrayList将批量copy大量的元素；越往后，对于LinkedList来说，因为它是双向链表，所以在第2个元素后面插入一个数据和在倒数第2个元素后面插入一个元素在效率上基本没有差别，但是ArrayList由于要批量copy的元素越来越少，操作速度必然追上乃至超过LinkedList。
	 */
	public static void main(String[] args) {
		/**
		 * 线性列表  数组方式实现  线程不安全 效率高 适用于查询数据  允许null值
		 * 实现RandomAcess、Cloneable、Serializable接口
		 * 初始容量大小为10   1.5倍扩容   最大Integer.Max_VALUE
		 * 对ArrayList扩容是一个即消耗时间又消耗空间的操作
		 */
		List numbers = new ArrayList<Integer>();
		
		/**
		 * 链式列表 双向链表结构实现 线程不安全  效率高 适用于插入和产出 不利于遍历查询 允许null值
		 * foreach 底层由迭代器实现 
		 * 插入删除并不一定      插入删除在前半段（linkedList） 在后半段（ArrayList）
		 */
		List numbers2 = new LinkedList<Integer>();
		
		/**
		 * 线性列表  数组方式实现  线程安全 效率低 适用于查询数据  允许null值
		 * 实现RandomAcess、Cloneable、Serializable接口
		 * 初始容量大小为10      最大Integer.Max_VALUE
		 * 扩容是一个即消耗时间又消耗空间的操作
		 * 遍历方式（随机访问）
		 */
		List numbers3 = new Vector<Integer>();
		
		/**
		 * HashMap 实现  Cloneable和Serializable接口  存储在HashSet中的数据作为Map的key
		 * 无参构造方法（默认初始容量为16、加载因子为0.75）允许null值
		 * 
		 */
		Set set = new HashSet<Integer>();
		
		/**
		 * HashMap 实现  Cloneable和Serializable接口  存储在HashSet中的数据作为Map的key
		 * 无参构造方法（默认初始容量为16、加载因子为0.75）允许null值  
		 * 具有可预测的迭代顺序（就是我们插入的顺序）
		 * 
		 */
		Set set2 = new LinkedHashSet<Integer>();
		
		/**
		 * 红黑树实现   元素按特定顺序排序。自然排序（实现comparable接口，并实现compareTo方法）和指定排序（
		 * 自定义比较类，继承Compartor接口，并重写compare方法）
		 */
		Set set3 = new TreeSet<Integer>();
		
		/**
		 * HashMap和Hashtable区别
			hash数组初始化时机不同，Hashtable是在构造函数初始化，而HashMap是在第一次put()初始化hash数组。
			在HashTable中，hash数组默认大小是11，增加的方式是old*2+1。在HashMap中，hash数组默认大小是16，增加的方式是2*old而且一定是2的整数.
			HashMap允许空（null）键值（key），而HashTable不允许。
			HashMap把Hashtable的contains()方法去掉了，改成了containsvalue()和containsKey()。
			Hashtable的方法是线程安全的，而HashMap不支持线程的同步，不是线程安全的。
			Hashtable使用Enumeration,HashMap使用Iterator。
			hash值的使用不同，HashTable直接使用对象的hashCode。
		 */
		Map map = new HashMap<>();
		Map map2 = new Hashtable<>();
		Map map3 = new LinkedHashMap<>();
		Map map4 = new TreeMap<>();
		Map map5 = new ConcurrentHashMap<>();
		
		
		
		for (int i = 1 ; i<10 ;i++) {
			numbers.add(i);
		}
		
		for(int i = 0; i<numbers.size(); i++) {
			numbers.get(i);
			numbers.remove(i);
		}
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
		}
	}

	@Override
	public Iterator<Reserach> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

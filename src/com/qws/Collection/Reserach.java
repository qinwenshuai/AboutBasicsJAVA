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
 * ��Ŀ���ƣ�AboutBasicsJAVA   
 * �����ƣ�Reserach   
 * ��������   Iterable  Collection List(ArrayList��LinkedList��Vector)  Set(HashSet��LinkedHashSet��TreeSet)
 * 			Map(HashMap��LinkedHashMap��TreeMap)
 * 			List���򣬿ɴ洢�ظ�Ԫ�أ��ɰ�����������
 * 			Set���򣨶��û��������ɴ洢�ظ�Ԫ��
 * 			Map�洢��ֵ��
 * �����ˣ�����˧   
 * ����ʱ�䣺2019��9��29�� ����9:04:41   
 * 
 */
public class Reserach implements Iterable<Reserach> {
	
	/**
	 * LinkedList��ArrayList�ĶԱȣ�
1��˳������ٶ�ArrayList��ȽϿ죬��ΪArrayList�ǻ�������ʵ�ֵģ�����������new�õģ�ֻҪ��ָ��λ����һ�����ݾͺ��ˣ�LinkedList��ͬ��ÿ��˳������ʱ��LinkedList��newһ������������������Ƚϴ���ônew��ʱ���Ʊػ᳤һ�㣬�ټ���һЩ���ø�ֵ�Ĳ���������˳�����LinkedList��Ȼ����ArrayList
2��������һ�㣬��ΪLinkedList���治��ά���˴������Ԫ�أ���ά����Entry��ǰ��Entry�ͺ��Entry�����һ��LinkedList�е�Entry�ǳ��࣬��ôLinkedList����ArrayList���ķ�һЩ�ڴ�
3�����ݱ������ٶȣ������һ���֣�����Ͳ�ϸ���ˣ������ǣ�ʹ�ø��Ա���Ч����ߵķ�ʽ��ArrayList�ı���Ч�ʻ��LinkedList�ı���Ч�ʸ�һЩ
4����Щ˵����ΪLinkedList�������ɾ�����죬����˵����ʵ�ǲ�׼ȷ�ģ�
��1��LinkedList�����롢ɾ����ʱ������Ѱַ������ֻ��Ҫ�ı�ǰ��Entry�����õ�ַ
��2��ArrayList�����롢ɾ����ʱ����������Ԫ�ص�����copy������Ѱַ
���ԣ���������롢ɾ����Ԫ���������ݽṹ��ǰ��������Ƿǳ���ǰ��λ�õ�ʱ��LinkedList��Ч�ʽ������ArrayList����ΪArrayList������copy������Ԫ�أ�Խ���󣬶���LinkedList��˵����Ϊ����˫�����������ڵ�2��Ԫ�غ������һ�����ݺ��ڵ�����2��Ԫ�غ������һ��Ԫ����Ч���ϻ���û�в�𣬵���ArrayList����Ҫ����copy��Ԫ��Խ��Խ�٣������ٶȱ�Ȼ׷����������LinkedList��
	 */
	public static void main(String[] args) {
		/**
		 * �����б�  ���鷽ʽʵ��  �̲߳���ȫ Ч�ʸ� �����ڲ�ѯ����  ����nullֵ
		 * ʵ��RandomAcess��Cloneable��Serializable�ӿ�
		 * ��ʼ������СΪ10   1.5������   ���Integer.Max_VALUE
		 * ��ArrayList������һ��������ʱ�������Ŀռ�Ĳ���
		 */
		List numbers = new ArrayList<Integer>();
		
		/**
		 * ��ʽ�б� ˫������ṹʵ�� �̲߳���ȫ  Ч�ʸ� �����ڲ���Ͳ��� �����ڱ�����ѯ ����nullֵ
		 * foreach �ײ��ɵ�����ʵ�� 
		 * ����ɾ������һ��      ����ɾ����ǰ��Σ�linkedList�� �ں��Σ�ArrayList��
		 */
		List numbers2 = new LinkedList<Integer>();
		
		/**
		 * �����б�  ���鷽ʽʵ��  �̰߳�ȫ Ч�ʵ� �����ڲ�ѯ����  ����nullֵ
		 * ʵ��RandomAcess��Cloneable��Serializable�ӿ�
		 * ��ʼ������СΪ10      ���Integer.Max_VALUE
		 * ������һ��������ʱ�������Ŀռ�Ĳ���
		 * ������ʽ��������ʣ�
		 */
		List numbers3 = new Vector<Integer>();
		
		/**
		 * HashMap ʵ��  Cloneable��Serializable�ӿ�  �洢��HashSet�е�������ΪMap��key
		 * �޲ι��췽����Ĭ�ϳ�ʼ����Ϊ16����������Ϊ0.75������nullֵ
		 * 
		 */
		Set set = new HashSet<Integer>();
		
		/**
		 * HashMap ʵ��  Cloneable��Serializable�ӿ�  �洢��HashSet�е�������ΪMap��key
		 * �޲ι��췽����Ĭ�ϳ�ʼ����Ϊ16����������Ϊ0.75������nullֵ  
		 * ���п�Ԥ��ĵ���˳�򣨾������ǲ����˳��
		 * 
		 */
		Set set2 = new LinkedHashSet<Integer>();
		
		/**
		 * �����ʵ��   Ԫ�ذ��ض�˳��������Ȼ����ʵ��comparable�ӿڣ���ʵ��compareTo��������ָ������
		 * �Զ���Ƚ��࣬�̳�Compartor�ӿڣ�����дcompare������
		 */
		Set set3 = new TreeSet<Integer>();
		
		/**
		 * HashMap��Hashtable����
			hash�����ʼ��ʱ����ͬ��Hashtable���ڹ��캯����ʼ������HashMap���ڵ�һ��put()��ʼ��hash���顣
			��HashTable�У�hash����Ĭ�ϴ�С��11�����ӵķ�ʽ��old*2+1����HashMap�У�hash����Ĭ�ϴ�С��16�����ӵķ�ʽ��2*old����һ����2������.
			HashMap����գ�null����ֵ��key������HashTable������
			HashMap��Hashtable��contains()����ȥ���ˣ��ĳ���containsvalue()��containsKey()��
			Hashtable�ķ������̰߳�ȫ�ģ���HashMap��֧���̵߳�ͬ���������̰߳�ȫ�ġ�
			Hashtableʹ��Enumeration,HashMapʹ��Iterator��
			hashֵ��ʹ�ò�ͬ��HashTableֱ��ʹ�ö����hashCode��
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

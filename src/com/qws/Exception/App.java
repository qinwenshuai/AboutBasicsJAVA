package com.qws.Exception;

/**
 * 1.�쳣
 *  ����Ա ����ͨ��������ֶν�����������
 * 2.����
 *  �޷�ͨ��������ֶν���������
 *
 * ThrowableҲ�Ƕ���
 * --Error����jvm���ɲ��׳�������������
 * --Exception�� �����쳣�ĸ���
 *
 * �쳣��
 *     1.���ʱ�쳣(�������쳣)
 *      �����б���Ҫ��������쳣�����ִ�������
 *      a.�͵ؽ��(�Լ����)try-catch��
 *      b.���쳣�����׳�throws Exception��
 *     2.����ʱ�쳣(�����в���)
 */
public class App {

    //���ʱ�쳣
    public static void f1(){
        try {
            throw new Exception("������");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //����ʱ�쳣,���з�������Ĭ���׳�RuntimeException��Error
    public static void f2(){
        throw new RuntimeException("�ٺٺ�");
    }
    public static void main(String[] args) {

        /**
         * һ�������쳣��������벻ִ��
         * ִֻ��һ��catch��
         * finally�����������ζ���ִ��
         */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } finally {
            //����
        }

    }
}

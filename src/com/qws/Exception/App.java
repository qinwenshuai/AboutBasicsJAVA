package com.qws.Exception;

/**
 * 1.异常
 *  程序员 可以通过编码的手段解决掉的情况；
 * 2.错误
 *  无法通过编码的手段解决的情况。
 *
 * Throwable也是对象
 * --Error，由jvm生成并抛出，程序不做处理
 * --Exception， 所有异常的父类
 *
 * 异常：
 *     1.检查时异常(编译期异常)
 *      程序中必须要处理掉的异常，两种处理方法：
 *      a.就地解决(自己解决)try-catch；
 *      b.把异常向上抛出throws Exception。
 *     2.运行时异常(程序中不用)
 */
public class App {

    //检查时异常
    public static void f1(){
        try {
            throw new Exception("哈哈哈");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //运行时异常,所有方法都会默认抛出RuntimeException和Error
    public static void f2(){
        throw new RuntimeException("嘿嘿嘿");
    }
    public static void main(String[] args) {

        /**
         * 一旦发生异常，后面代码不执行
         * 只执行一个catch块
         * finally代码块无论如何都会执行
         */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } finally {
            //……
        }

    }
}

package org.example.design.pattern;

/**
 * 单例模式
 */
public class SingleTon {

    private volatile static SingleTon SINGLE_TON = null;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        //刚进来判断不需要直接锁
        if (SINGLE_TON == null) {
            synchronized (SingleTon.class){
                if (SINGLE_TON == null) {
                    SINGLE_TON = new SingleTon();
                }
            }
        }
        return SINGLE_TON;
    }
}

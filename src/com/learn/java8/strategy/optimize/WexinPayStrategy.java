package com.learn.java8.strategy.optimize;

import com.learn.java8.strategy.IPayStrategy;

/**
 * 微信支付
 *
 * @author Yiuanhm
 */
//这里就拿微信支付这种支付方式作为例子，其他支付方式的类跟这类似
//特别说明：因我们的策略想要让系统更加智能，选择对应策略。所以都需要使用单例模式，并且提供 getInstance()
//           方法,以获取这个单例对象；
public class WexinPayStrategy implements IPayStrategy {

    private static WexinPayStrategy wexinPayStrategy;

    //单例的基本特点：私有化构造，提供获取单例的静态方法
    private WexinPayStrategy() {

    }

    //给外界提供单例
    public static WexinPayStrategy getInstance() {
        if (null == wexinPayStrategy) {
            wexinPayStrategy = new WexinPayStrategy();
        }
        return wexinPayStrategy;
    }


    /**
     * 微信支付使用
     */
    @Override
    public void pay() {
        System.out.println("微信支付.");
    }


}

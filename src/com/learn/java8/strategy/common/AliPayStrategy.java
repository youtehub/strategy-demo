package com.learn.java8.strategy.common;

import com.learn.java8.strategy.IPayStrategy;

/**
 *
 * 支付宝支付
 *
 * @author Yiuanhm
 */
public class AliPayStrategy implements IPayStrategy {
    /**
     * 支付宝支付使用
     */
    @Override
    public void pay() {
        System.out.println("支付宝支付.");
    }
}

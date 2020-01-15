package com.learn.java8.strategy.common;

import com.learn.java8.strategy.IPayStrategy;

/**
 * 微信支付
 *
 * @author Yiuanhm
 */
public class WexinPayStrategy implements IPayStrategy {
    /**
     * 微信支付使用
     */
    @Override
    public void pay() {
        System.out.println("微信支付.");
    }
}

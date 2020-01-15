package com.learn.java8.strategy.common;

import com.learn.java8.strategy.IPayStrategy;

/**
 *
 * 银联支付
 *
 * @author Yiuanhm
 */
public class EBankPayStrategy implements IPayStrategy {
    /**
     * 银联支付使用
     */
    @Override
    public void pay() {
        System.out.println("银联支付.");
    }
}

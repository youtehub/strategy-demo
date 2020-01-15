package com.learn.java8.strategy;

/**
 * 支付执行入口的上下文
 *
 * @author Yiuanhm
 */
public class PayStrategyContext {

    private IPayStrategy payStrategy;


    /**
     * 执行支付
     */
    public void excutePay() {
        if (null == payStrategy) {
            throw new RuntimeException("支付策略未配置");
        }
        payStrategy.pay();
    }


    public IPayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(IPayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}

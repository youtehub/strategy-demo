package com.learn.java8.strategy.test;

import com.learn.java8.strategy.IPayStrategy;
import com.learn.java8.strategy.PayStrategyContext;
import com.learn.java8.strategy.PayStrategyUtils;
import com.learn.java8.strategy.common.AliPayStrategy;
import com.learn.java8.strategy.common.EBankPayStrategy;
import com.learn.java8.strategy.common.WexinPayStrategy;

/**
 * 支付的策略模式测试类
 *
 * @author Yiuanhm
 */
public interface MainTest {
    public static void main(String[] args) {
//        commonTest();
        optimizeTest();


    }

    public  static void commonTest() {
        //执行上下文
        PayStrategyContext payStrategyContext = new PayStrategyContext();
        IPayStrategy payStrategy = null;

        //1.支付宝支付
        payStrategy = new AliPayStrategy();
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
        //2.微信支付
        payStrategy = new WexinPayStrategy();
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
        //3.银联支付
        payStrategy = new EBankPayStrategy();
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
    }

    public  static void optimizeTest() {
        //执行上下文
        PayStrategyContext payStrategyContext = new PayStrategyContext();
        IPayStrategy payStrategy = null;

        //1.支付宝支付
        payStrategy = PayStrategyUtils.getPayStrategy("Ali");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
        //2.微信支付
        payStrategy = PayStrategyUtils.getPayStrategy("Wexin");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
        //3.银联支付
        payStrategy = PayStrategyUtils.getPayStrategy("EBank");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
    }
}

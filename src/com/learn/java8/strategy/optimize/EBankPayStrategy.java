package com.learn.java8.strategy.optimize;

import com.learn.java8.strategy.IPayStrategy;

/**
 * 私有化，提供对外接口
 * 银联支付
 *
 * @author Yiuanhm
 */
public class EBankPayStrategy implements IPayStrategy {


    private static EBankPayStrategy eBankPayStrategy;

    private EBankPayStrategy(){

    }

    public static EBankPayStrategy getInstance(){
        if(null == eBankPayStrategy){
            eBankPayStrategy = new EBankPayStrategy();
        }
        return eBankPayStrategy;
    }

    /**
     * 银联支付使用
     */
    @Override
    public void pay() {
        System.out.println("银联支付.");
    }
}

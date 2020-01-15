package com.learn.java8.strategy;

/**
 * 支付的工具类
 *
 * @author Yiuanhm
 */
public interface PayStrategyUtils {
    public static IPayStrategy getPayStrategy(String payType) {
        try {
            //这个路径需要根据你来定义，属于一种规则，
            // 这样一来，将所有策略都写在该包下即可，后期写入配置文件
            String path = "com.learn.java8.strategy.optimize."
                    + payType.concat("PayStrategy");
            //反射，类加载器
            Class<?> clazz = Class.forName(path);
            IPayStrategy instance = (IPayStrategy) clazz
                    .getDeclaredMethod("getInstance")
                    .invoke(null, null);
            return instance;
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("Load ["
                    + payType.concat("PayStrategy")+"] Error :"+exception);
        }
        //调用instance()方法获取单例对象

    }
}

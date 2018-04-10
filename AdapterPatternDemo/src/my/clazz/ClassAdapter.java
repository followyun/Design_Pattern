package my.clazz;

import my.AliPay;
import my.ChannelCharge;

/**
 * 举例：MouseAdapter
 * 类适配器
 */
public class ClassAdapter extends ChannelCharge implements AliPay  {
    @Override
    public void notifys() {
        System.out.println("获取阿里支付结果通知！");
        getResult();
    }

    @Override
    public void pay() {
        System.out.println("进行充值！");
        recharge();
    }
}

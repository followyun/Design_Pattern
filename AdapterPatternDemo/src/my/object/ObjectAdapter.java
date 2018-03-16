package my.object;

import my.AliPay;
import my.ChannelCharge;

/**
 * 对象适配器
 */
public class ObjectAdapter implements AliPay {
    private ChannelCharge channelCharge;
    @Override
    public void notifys() {
        System.out.println("获取阿里支付结果通知！");
        channelCharge.getResult();
    }

    @Override
    public void pay() {
        System.out.println("进行充值！");
        channelCharge.recharge();
    }

    public ObjectAdapter(ChannelCharge channelCharge) {
        this.channelCharge = channelCharge;
    }
}

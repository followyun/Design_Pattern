package my;

import my.clazz.ClassAdapter;
import my.interf.AddArithmetic;
import my.object.ObjectAdapter;

/**
 */
public class Demo {

    public static void objectAdapterTest(){
        ChannelCharge channelCharge = new ChannelCharge();
        ObjectAdapter adapter = new ObjectAdapter(channelCharge);
        adapter.pay();
        adapter.notifys();
    }

    public static void classAdapterTest(){
        ClassAdapter adapter = new ClassAdapter();
        adapter.pay();
        adapter.notifys();
    }

    public static void interfaceAdapterTest(){
        AddArithmetic addArithmetic = new AddArithmetic();
        addArithmetic.add();
    }
}

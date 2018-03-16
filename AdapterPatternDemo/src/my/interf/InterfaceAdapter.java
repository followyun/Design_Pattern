package my.interf;

/**
 * 接口适配器
 */
public abstract class InterfaceAdapter implements ArithmeticInterface{
    @Override
    public void add() {
        throw new UnsupportedOperationException("不允许直接调用该方法！");
    }

    @Override
    public  void sub(){
        throw new UnsupportedOperationException("不允许直接调用该方法！");
    }


    @Override
    public  void divide(){
        throw new UnsupportedOperationException("不允许直接调用该方法！");
    }

    @Override
    public  void mul(){
        throw new UnsupportedOperationException("不允许直接调用该方法！");
    }

    @Override
    public  void sqrt(){
        throw new UnsupportedOperationException("不允许直接调用该方法！");
    }
}

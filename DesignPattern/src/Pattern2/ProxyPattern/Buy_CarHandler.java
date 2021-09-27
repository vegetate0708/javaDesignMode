package Pattern2.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lx on 2018/9/28.
 */
public class Buy_CarHandler implements InvocationHandler {
    private People object;

    public Buy_CarHandler() {
    }

    public People getObject() {
        return object;
    }

    public void setObject(People object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        if (object.getVip() == "vip") {
            System.out.println(object.getUsername() + "Vip用户免费获得！");
        } else if (object.getCash() >= 50000) {
            System.out.println(object.getUsername() + "买了新车，交易结束！");
            object.setCash(object.getCash() - 50000);
        } else {
            System.out.println(object.getUsername() + "钱不够，不能买车，继续比赛！");
        }
        ret = method.invoke(object, args);
        return ret;
    }
}

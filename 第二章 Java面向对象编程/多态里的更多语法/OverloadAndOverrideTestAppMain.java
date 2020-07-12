package 多态里的更多语法;

import 多态里的更多语法.supermarket.LittleSuperMarket;
import 多态里的更多语法.supermarket.MerchandiseV2;
import 多态里的更多语法.supermarket.Phone;
import 多态里的更多语法.supermarket.ShellColorChangePhone;

public class OverloadAndOverrideTestAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);
        MerchandiseV2 m = superMarket.getMerchandiseOf(100); // 100实例对象是ShellColorChangePhone类

        // TODO 让重载的归重载，剩下的是覆盖的舞台
        // TODO 重载决定了要调用参数为int的方法，这个方法要在m指向的对象上执行
        // TODO 好巧不巧，这个对象老复杂了，是个ShellColorChangePhone对象，好戏上演了
        // TODO， 分别用true， 1， 3， 6做参数，运行结果是什么，为什么？
        m.buy(6);

    }
}

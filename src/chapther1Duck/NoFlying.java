package chapther1Duck;

/**
 * 不能飞行
 *
 * @author Administrator
 * @create 2017-12-12-11:33
 */
public class NoFlying extends FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}

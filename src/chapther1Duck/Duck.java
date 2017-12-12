package chapther1Duck;

/**
 * 鸭子类
 *
 * @author Administrator
 * @create 2017-12-12-11:53
 */
public abstract class Duck  {
    public FlyBehavior flyBehavior;
    public QuackBehaver quackBehaver;
    public abstract void display();
    public void swimming(){
        System.out.println("鸭子在游泳");
    }
    public void setFlyBehavior(FlyBehavior flyBehavior1){
        flyBehavior = flyBehavior1;
    }
    public void  setQuackBehaver(QuackBehaver quackBehaver1){
        quackBehaver = quackBehaver1;
    }
}

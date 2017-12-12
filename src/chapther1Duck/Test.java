package chapther1Duck;

/**
 * @author Administrator
 * @create 2017-12-12-12:18
 */
public  class Test {
    @org.junit.Test
    public   void Test(){
        Duck duck = new RedHeadDuck();
        duck.display();
        duck.swimming();
        duck.setFlyBehavior(new Flying());
        duck.flyBehavior.fly();
        duck.setQuackBehaver(new QuackGua());
        duck.quackBehaver.quack();
        System.out.println("----------------------------------------");
        Duck suliao = new SuLiaoDuck();
        suliao.display();
        suliao.swimming();
        suliao.setFlyBehavior(new NoFlying());
        suliao.setQuackBehaver(new QuackZhi());
        suliao.flyBehavior.fly();
        suliao.quackBehaver.quack();
    }
}

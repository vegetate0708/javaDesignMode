package Pattern3.TempleteMethodPattern;

/*
 * 咖啡因饮料的基类
 */
public abstract class CoffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater(); //烧水
        brew();    //准备
        pourInCup(); //倒入杯子
        if (customerWantsCondiments()) {  //加入顾客是否需要调料判断
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();   //添加调料

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {//这是一个钩子，子类可以覆盖这个方法，视情况而定
        return true;
    }
}

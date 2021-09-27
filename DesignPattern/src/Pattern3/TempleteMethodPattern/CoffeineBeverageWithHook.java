package Pattern3.TempleteMethodPattern;

/*
 * ���������ϵĻ���
 */
public abstract class CoffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater(); //��ˮ
        brew();    //׼��
        pourInCup(); //���뱭��
        if (customerWantsCondiments()) {  //����˿��Ƿ���Ҫ�����ж�
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();   //��ӵ���

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {//����һ�����ӣ�������Ը���������������������
        return true;
    }
}

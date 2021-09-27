package Pattern2.AdapterPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Durk says....");
        duck.quack();
        duck.fly();

        System.out.println("\n the TurkeyAdapter says....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

package MementoPattern;

/**
 * 〈测试类〉
 *
 * @author vegetate
 * @create 2018/11/12 17:14
 */
public class Test {

    public static void main(String[] args) {
        // 新建备忘录发起者对象
        MemoRole role = new MemoRole("发电机", 0, 1);
        // 新建备忘录管理者
        MemoManager manager = new MemoManager();
        // 角色初始状态
        System.out.println("机器开始发电:");
        role.getCurrentState();
        // 利用备忘录模式保存当前状态
        System.out.println("---保存当前的机器状态---");
        manager.setMemento(role.createMemoObject());
        role.setDeviceName("发电机");
        role.setStateLevel(5);
        role.setUseTime(1000);
        System.out.println("已经持续发电1000小时");
        role.getCurrentState();
        // 恢复保存的角色状态
        role.setMemento(manager.getMemento());
        System.out.println("恢复后发电机当前状态：");
        role.getCurrentState();
    }

}

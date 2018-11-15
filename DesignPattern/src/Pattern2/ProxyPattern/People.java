package Pattern2.ProxyPattern;

/**
 * Created by lx on 2018/9/28.
 */
public class People implements Buy_car {
    private int cash;
    private String vip;
    private String username;
    @Override
    public void buy_car() {
        System.out.println("Ê£Óà½ð¶î"+getCash());
    }
    public int getCash(){
        return cash;
    }
    public void setCash(int cash){
        this.cash = cash;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getVip(){
        return vip;
    }
    public void setVip(String vip){
        this.vip = vip;
    }
}

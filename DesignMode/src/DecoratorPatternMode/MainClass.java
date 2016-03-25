package DecoratorPatternMode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainClass {
public static void main(String[] args) throws Exception {
	//新点一杯浓缩咖啡
	Beverage beverage=new Espresso();
	beverage=new Mocha(beverage);//添加摩卡 使用摩卡装饰
	beverage=new Whip(beverage);//添加奶泡    使用奶泡装饰
	beverage=new Soy(beverage);//添加豆浆      使用豆浆装饰
	System.out.println(beverage.getDescription()+";价钱为:"+beverage.cost());
	int c;
	InputStream in=new LowerCaseInputStream(
			new BufferedInputStream(new FileInputStream(new File("./src/DecoratorPatternMode/装饰者模式"))));
	while ((c=in.read())>=0) {
		System.out.print((char)c);
	}
    in.close();	
}
}

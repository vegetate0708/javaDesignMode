package DecoratorPatternMode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainClass {
public static void main(String[] args) throws Exception {
	//�µ�һ��Ũ������
	Beverage beverage=new Espresso();
	beverage=new Mocha(beverage);//���Ħ�� ʹ��Ħ��װ��
	beverage=new Whip(beverage);//�������    ʹ������װ��
	beverage=new Soy(beverage);//��Ӷ���      ʹ�ö���װ��
	System.out.println(beverage.getDescription()+";��ǮΪ:"+beverage.cost());
	int c;
	InputStream in=new LowerCaseInputStream(
			new BufferedInputStream(new FileInputStream(new File("./src/DecoratorPatternMode/װ����ģʽ"))));
	while ((c=in.read())>=0) {
		System.out.print((char)c);
	}
    in.close();	
}
}

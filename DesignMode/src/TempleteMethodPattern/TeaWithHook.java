package TempleteMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * ²è
 */
public class TeaWithHook extends CoffeineBeverageWithHook{
	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Tea through filter");
	}

	@Override
    public	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}
	public boolean customerWantsCondiments(){
		String answer=getUserInput();
		if (answer.toLowerCase().startsWith("y")){
			return true;
		}else {
			return false;
		}
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer=null;
		System.out.print("Would you like Lemon with you Tea(y/n)?");
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer==null){
			return "no";
		}
		return answer;
	}
}

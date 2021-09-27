package Pattern3.TempleteMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CoffeineBeverageWithHook {

    @Override
    public void brew() {
        // TODO Auto-generated method stub
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        // TODO Auto-generated method stub
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // TODO Auto-generated method stub
        String answer = null;
        System.out.print("Would you like milk and sugar with you coffee(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }


}

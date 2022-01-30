import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Calculater {

    public float add(Float a, Float b) {
        float c = a+b;
        return c;
    }
    public float sub(float a, float b){
        float c = a-b;
        return c;
    }
    public float mult(float a, float b){
        float c = a*b;
        return c;
    }
    public float div(float a, float b){
        float c = a/b;
        return c:
    }
     public static void main(String[] args) {
         Calculater cal=new Calculater();
        ArrayList<String> t=new ArrayList<String>();
        t.add("add");
        t.add("sub");
        t.add("mul");
        t.add("div");
        Scanner useroper=new Scanner(System.in);
        System.out.println("Please select the operation from list to porform in calculator");
        System.out.println(t);
        String oper = useroper.next();
        //System.out.println(oper);
        //String s = "add";
        System.out.println("Enter first number");
        float a=useroper.nextInt();
        System.out.println("Enter second number");
        float b=useroper.nextInt();
        if(oper.contentEquals("add")){
            System.out.println(cal.add(a, b));
        }
        else if(oper.contentEquals("sub")){
            System.out.println(cal.sub(a, b));
        }
        else if(oper.contentEquals("mul")){
            System.out.println(cal.mult(a, b));
        }
        else{
            System.out.println(cal.div(a, b));
        }
        //System.out.println(useroper);
        //Calculater r=new Calculater();
        //System.out.println("Sum of two numbers is\t" + r.add(2, 3));
        
    }
    
}


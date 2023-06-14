package Calculator;

import java.util.ArrayList;
import java.util.*;

import static java.lang.Character.isDigit;

public class CalculatorMain{
    public static void main(String args[]){
    Input exp=new Input();
    final String expression=exp.inputExpression();
    String[] splitExp=expression.split("");
    List<Integer> numbers=new ArrayList<>();
    List<String> operation=new ArrayList<>();
    for(int i=0;i<splitExp.length;i++)
    {
        if(splitExp[i].equals("*")||splitExp[i].equals("+")||splitExp[i].equals("-")||splitExp.equals("/")){
            operation.add(splitExp[i]);
        }
        else {
            int n=Integer.parseInt(splitExp[i]);
            numbers.add(n);
        }
    }
    int i=0,j=0;
    Operation result;
    result=new Add();
    double res=numbers.get(j);;
    while(operation.size()>0){

        switch (operation.get(i)){
            case "+":result=new Add();
            break;
            case "-":result=new Sub();
            break;
            case "*":result=new Multiply();
            break;
            case "/":result=new Divide();
            break;
            default:break;
        }
        operation.remove(i);
        double num=numbers.get(++j);
        res= result.operate(res,num);
    }
        System.out.println("Result of the expression:"+res);
    }
}

package Calculator;
import javax.crypto.spec.PSource;
import java.util.*;
public class Input {
    Scanner sc=new Scanner(System.in);
    public String inputExpression(){
    System.out.println("Enter the expression");
    String expression=sc.next();
    return expression;
    }
}

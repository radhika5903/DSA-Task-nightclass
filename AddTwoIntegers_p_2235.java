import javax.swing.text.View;

public class AddTwoIntegers_p_2235 {
    public int sum(int num1, int num2) {
       if (num2==0){
        return num1;
       }
       while(num2<0){
        num2++;
        num1--;
       }
       while(num2>0){
        num2--;
        num1++;
       }
       return num1;
        
    }


}

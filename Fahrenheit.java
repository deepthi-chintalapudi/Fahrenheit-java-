import java.util.Scanner;
public class Fahrenheit{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Input a degree in fahrenheit");
        double fahrenheit=input.nextDouble();
        double celsius=((5*(fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit +" degree fahrenheit is equal to"+ celsius +"in Celsius");
    }
}
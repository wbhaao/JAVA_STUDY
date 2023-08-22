// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = 0, num1 = 2, num2;
        num2 = num1++ + ++num1 + num1++;
        System.out.printf("%d %d\n", num1 , num2);
        System.out.printf("%d\n", ++x + x++ + x + ++x + x++ + ++x);
        int data = 10;
        System.out.printf("%s\n", Integer.toBinaryString(data));
        System.out.printf("%s\n",Integer.toOctalString(data));
        System.out.printf("%s\n",Integer.toHexString(data));
    }
}
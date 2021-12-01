public class Addition {
    //Method to calculate the sum of two numbers
    //Declare an instance method sum with two parameters a and b having data type int.
    void sum(int a,int b){
        int s = a+b;
        System.out.println("Sum of two numbers:" + s);
    }
    //Method can calculate sum of three numbers
    //Declare an instance method sum with three parameters a,b and c having data type int.
    //Here the method sum() is overloaded having the same method name.
    void sum(int a, int b, int c){
        int t = a+b+c;
        System.out.println("Sum of three numbers:" + t);
    }
    public static void main (String[] args){
        Addition a = new Addition();
        a.sum(10,20);//it will call sum() method to calculate sum of two numbers.
        a.sum(10,50,100);//it will call sum() method to calculate sum of three numbers.

    }
}

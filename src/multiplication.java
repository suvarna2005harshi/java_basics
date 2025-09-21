public class multiplication {
    public static void main(String[] args)
    {
        int num=5;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
/*
5x1=5                                  a for loop that repetas a block of code while a condition true.
5x2=10                                 int i=1(the loop counter i starts at 1)
5x3=15                                 i<=10(the loop continues as long as i is less that or equal to 10.
5x4=20                                  i++(after each iteration,i increases by 1)
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50
*/
class method
{
    static void display()
    {
        System.out.println("Student Management system");
    }
    static int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        display();
        int result= add(20,30);
        System.out.println("the sum of two no is:" +result);

    }
}
class array
{
    public static void main(String args[])
    {
        int marks[] = {70,80,90,85,75};
        int sum =0;
        for(int i =0;i<marks.length;i++)
        {
            sum =sum+marks[i];
        }
        System.out.println(sum);
    }
}
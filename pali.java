class pali{
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0;
        int onum=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(onum==rev)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("N");
        }



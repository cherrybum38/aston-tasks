public class NumberSum {



    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++)
            if(i % 3 == 0 && i % 5 != 0 && numberSum(i) < 10)
                System.out.println(i);
    }
    public static int numberSum(int in){
        int res = 0;
        while (in > 0)
        {
            res += in %10;
            in = in /10;
        }
        return res;
    }
}


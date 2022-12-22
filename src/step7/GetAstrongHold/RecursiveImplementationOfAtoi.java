package step7.GetAstrongHold;

public class RecursiveImplementationOfAtoi {
    static int solution(String str)
    {
        int sum=0;
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(i==0 && str.charAt(0)=='-'){
                flag=1;
                continue;
            }
            char a=str.charAt(i);
            int digit=(char)a-48;
            if(digit>=10 || digit<0)
                return -1;
            sum=sum*10+digit;
        }
        if(flag==1)
            return -sum;
        return sum;
    }
    private static int SolutionRecursive(String str,int i,int sum,int flag)
    {
            if(i>=str.length())
            {
                if(flag==0)return sum;
                return -sum;
            }
            else{

                if(i==0 && str.charAt(0)=='-')
                {
                    flag=1;
                    return SolutionRecursive(str,++i,sum,flag);
                }

                char a =str.charAt(i);
                int digit=(char)a-48;
                if(digit>=10||digit<0)
                    return -1;
                else
                {
                    sum=sum*10+digit;
                    return SolutionRecursive(str,++i,sum,flag);
                }



            }
    }
    static int RecursiveSolution(String str)
    {
        return SolutionRecursive(str,0,0,0);
    }

    public static void main(String[] args) {
        System.out.println(solution("-2000"));
    }
}

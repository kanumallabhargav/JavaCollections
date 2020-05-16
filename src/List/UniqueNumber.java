package List;

import java.util.ArrayList;

public class UniqueNumber
{
    public static void main(String[] args)
    {
        int BaseArray[] = {5,5,6,7,5,3,5,6,7,6};

        ArrayList<Integer> BaseAL = new ArrayList<Integer>();
        for(int i = 0;i<BaseArray.length;i++)
        {
            int count=0;
            if (!BaseAL.contains(BaseArray[i]))
            {
                BaseAL.add(BaseArray[i]);
                count++;
                for(int j=i+1;j<BaseArray.length;j++)
                {
                    if(BaseArray[i]==BaseArray[j])
                        count++;
                }
                System.out.println(BaseArray[i]+" is repeated "+count+" time(s)");
                if(count==1)
                {
                    System.out.println( BaseArray[i]+" is the unique number");
                }
            }
        }
    }
}

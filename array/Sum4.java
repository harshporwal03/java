import java.util.*;
class Sum4 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4, int size) {
        int c=0;
        int i,j,k,l;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                for(k=0;k<size;k++)
                {
                    for(l=0;l<size;l++)
                    {
                        if(nums1[i] + nums2[j] + nums3[k] + nums4[l] ==0)
                        c++;
                    }
                }
            }
        }
        return c;
    }

public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int size,count;
    int nums1[]={1,2};
    int nums2[]={-2,-1};
    int nums3[]={-1,2};
    int nums4[]={0,2};
    size=2;
    count = fourSumCount(nums1,nums2,nums3,nums4,size);
    System.out.println(+count);
}
}
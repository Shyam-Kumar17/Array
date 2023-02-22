package Array;

public class Optimized {

	public static void main(String[] args) {
		int a[]= {7,5,3,5,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		//to print elements
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]);
     }
 }
}

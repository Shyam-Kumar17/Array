package Array;

public class OddindexEvenindex {

	public static void main(String[] args, int[] y, int[] x) {
		int a[]= {7,5,3,2,1};
		if(a.length%2 !=0)
		{
			//odd Logic
			int x1[]=new int [a.length/2];
			int y1[]=new int [a.length/2+1];
		}
		// Transfer a to x
		for(int i=0;i<a.length;i++)
		{
		   
			x[i]=a[i];
			System.out.println(x[i]);
		}
		// Transfer a to y
		for(int i=0;i<a.length;i++)
		{
			
			y[i]=a[i];
			System.out.println(y[i]);
		}
	

/*Even Logic
int x[]=new int [a.length/2];
int y[]=new int [a.length/2];

 // Transfer a to x
  for(int i=0;i<a.length;i++)
  {
  x[i]=a[i];
  System.out.println(x[i]);
  }
  
  //Transfer a to y
    for(int i=0;i<a.length;i++)
    {
    y[i]=a[i];
    System.out.println(y[i]);
    }
   */
	}
}

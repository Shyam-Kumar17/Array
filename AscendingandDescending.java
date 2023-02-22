package Array;

public class AscendingandDescending {

	public static void main(String[] args) {
		int a[]= {7,5,4,2,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		// T o print Elements
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}


/*
 int a[]={7,5,4,2,9};
 for(int i=0;i<a.length;i++)
 {
 for(int j=i+1;j<a.length;j++)
 {
 if(a[i]<a[j])
 {
 int temp=a[i];
 a[i]=a[j];
 a[j]=a[i];
 }
 }
 }
 To print elements
 for(int i=0;i<a.length;i++)
 {
 System.out.println(a[i]);
 }
 }}
 */
		
		
		
		
		
		
		
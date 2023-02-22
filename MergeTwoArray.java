package Array;
public class MergeTwoArray {

	public static void main(String[] args) {
		  int a[]= {7,3};
		  int b[]= {4,8,5};
		  int c[]=new int[a.length+b.length];
			 
			 // Transfer a to c
			 for(int i=0;i<a.length;i++)
			 {
				c[i]=a[i]; 
				
			 }
			 // Transfer b to c
			 for(int i=0;i<b.length;i++)
			 {
				 c[a.length+i]=b[i];
			 }
			 for(int i=0;i<c.length;i++)
			 {
				 System.out.println(c[i]);
			 }
		}
	}




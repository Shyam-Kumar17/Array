package Array;

public class Searchanelement {

	public static void main(String[] args) {
		int a[]= {7,5,3,2,9};
		int search=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("found"+search);
			}
		}
	}
}

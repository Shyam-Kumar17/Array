package Array;

public class Indexofnumber {

	public static void main(String[] args) {
		int a[]= {7,5,3,3,9};
		int number=3;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				System.out.println(i);
			}
		}
	}
}

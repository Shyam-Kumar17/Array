package Array;

public class OddElement {

	public static void main(String[] args) {
		int a[]= {7,5,3,2,8};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}

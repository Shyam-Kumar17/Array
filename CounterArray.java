package Array;

public class CounterArray {

	public static void main(String[] args) {
		int a[]= {7,5,3,5,9};
		int search=5;
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				counter=counter+1;
			}
		}
			System.out.println(search+ "is present" +counter+"times");
		}
	}


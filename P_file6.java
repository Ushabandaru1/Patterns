package patterns;
public class P_file6 {
	public static void main(String[] args) {
		int x = 1;
		for(int i = 1; i<=5; i++)
		{
		for(int j = 5; j>=1; j--)
		{
			System.out.print(x+" ");
			x++;
		}
		System.out.println();
		}
	}
}

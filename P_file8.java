package patterns;
public class P_file8 {
	public static void main(String[] args) {
		int x = 2;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>=1; j--)
			{
				System.out.print(x+" ");
				x = x+2;
			}
			System.out.println();
		}
	}
}

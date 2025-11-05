package pack;

public class islower {
	public static void main(String[] args) {
		String str="WeLcOmE";
		String output="";
		for (int i=0; i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				output+=Character.isLowerCase(str.charAt(i));	
			}
			else
			{
				output+=Character.isUpperCase(str.charAt(i));
			}
		}
		System.out.println(output);
	}
}

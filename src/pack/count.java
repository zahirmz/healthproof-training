package pack;

public class count {
	public static void main(String[] args) {
		String str="welcome";
		str=str.toLowerCase();
		char[] chars=str.toCharArray();
		boolean[] b=new boolean[str.length()];
		for(int i=0;i<chars.length;i++)
		{
			if (b[i]) continue;
			int c=1;
			for (int j=i+1;j<chars.length;j++)
			{
				if(chars[i]==chars[j]) {
					c++;
					b[j]=true;
				}
				
				
			}
			System.out.println(chars[i]+":"+c);
			
		}
		
	}

}

package codingQusetions;

public class CountWordsInAString {
	
	//Count Words in a String: Write a program to count the number of words in a given string.
	
	static int Wordcount(String s) {
		int n = 0;
		if(s=="" || s==null) {
			return 0;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				n++;
			}
		}
		return n+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//let say i have a string
		//"hello rishabh how are you? are you fine"
		//than this string haiving words 8 
		//so what i need to do just see the space break...
		
		String s = "hello rishabh how are you? are you fine";
		System.out.println(Wordcount(s));
		//output - 8
		
		//but what if string s = "" null?
		//let see
		System.out.println(Wordcount(""));
		//output 0
		
		//but what if string s = "hello rishabh how are you    are    you good"   to kya hoga?
		//let see
		String s1 = "hello rishabh how are you    are    you good";
		System.out.println(Wordcount(s1));  //yahooo its giving only 8 that's good.
		//output 8
		
		
		

	}

}

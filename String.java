import java.util.ArrayList;


public class String {

	public static void main(String[] args) {
		ArrayList<String> searchString.add = new ArrayList<String>();
		searchString.add("fox");
		searchString.add("dog");
		
		
		MyStrings str = new MyStrings();
		
		str.myLongString = "The quick brown fox jumps over the lazy dog";
		
		ArrayList<String> foundString = str.FindInLongString(searchString.add);
		
		for(String s : foundString)
		{
			System.out.println(s);
		}
	}

}

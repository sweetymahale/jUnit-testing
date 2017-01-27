import java.util.ArrayList;

public class MyStrings {
	
	public String longString = "";	
	
	public ArrayList<String> FindInLongString(ArrayList<String> searchString){
		ArrayList<String> foundStr = new ArrayList<String>();
		
		for(String search : searchString)
		{
			if (myLongString.contains(search)){
				foundStr.add(search);
			}
		}
		
		return foundStr;		
	}
	

}

package namehashtable;

public class NameHashTableApp {

	public static void main(String[] args) {
		
		 DataItem aDataItem;
		 String [] nameArray = {"George", "Mark", "Mary", "Jane", "Edgar", "Tom", "Pat", "Sally", "Joe",
		"Matt", "Susan"};
		 int [] asciiCode = new int[nameArray.length];
		 DataItem [] hash = new DataItem [ nameArray.length * 2];
		 HashTable theHashTable = new HashTable(nameArray.length * 2);

		 for (int index = 0; index < nameArray.length; index++)
		 {
		 asciiCode[index] = convertNameToCode(nameArray[index]);
		 //System.out.print(asciiCode[index] + " ");
		 aDataItem = new DataItem(asciiCode[index], nameArray[index]);
		 theHashTable.insert(aDataItem);
		 }
		 hash = theHashTable.getHashArray();

		 for (int index = 0; index < hash.length; index++)
		 {
		 aDataItem = theHashTable.getItem(index);

		 if (aDataItem != null)
		 {
		 String theName = aDataItem.name;
		 System.out.print(theName + " ");
		 }
		 else
		 System.out.print("Null" + " ");
		 }
	}
	
	  public static int convertNameToCode(String name) {
	        int totalAscii = 0;
	        for (int i = 0; i < name.length(); i++) {
	            totalAscii += Character.toLowerCase(name.charAt(i));
	        }
	        return totalAscii;
	    }

}

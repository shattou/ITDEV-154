package namehashtable;

public class DataItem {
	private int iData; // data item (key)
	   public String name; // name associated with the key

	   public DataItem(int ii, String n) { // constructor
	      iData = ii;
	      name = n;
	   }

	   public int getKey() {
	      return iData;
	   }
}

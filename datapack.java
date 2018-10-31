import java.util.ArrayList;

public class datapack {
	S1 S1 = new S1();
	static ArrayList<Integer> listID = new ArrayList<Integer>();//

	public void addID(Integer addID) {
		listID.add(addID);
	}

	static ArrayList<String> listValue = new ArrayList<String>();//

	public void addValue(String addValue) {
		listValue.add(addValue);
		/* System.out.println("CK!"); */}

	static ArrayList<Integer> listIndex = new ArrayList<Integer>();//

	public void addIndex(Integer addIndex) {
		listIndex.add(addIndex);
	}

	public int index(String GetValueIn) {
		int idx = listValue.indexOf(GetValueIn);
		return (listIndex.get(idx));
	}

	public void save(int addI, String addV) {
		addValue(addV);
		addIndex(addI);
	}

	public Integer num(Integer numIn) {
		return (listIndex.get(numIn));
	}

	public String txt(Integer txtIn) {
		return (listValue.get(txtIn));
	}

	public Integer id(Integer idIn) {
		return (listID.get(idIn));
	}

	public Integer numL() {
		return (listIndex.size());
	}

	public Integer txtL() {
		return (listValue.size());
	}

	public Integer idL() {
		return (listID.size());
	}

	public static class S1 {
		public String S1 = new String();
	}

	public void listset(int ind,Integer val) {
		listID.set(ind,val);
	}
	
	
}
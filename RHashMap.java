import java.util.HashMap;

public class RHashMap {


	public static void main(String[] args){

		HashMap<String,String> map = new HashMap<>();

		map.put("Rengaraj","datascience");
		map.put("mukesh","security");
		map.put("prabhu","devops");
		map.put("hari","security");
		map.put("Srikanth","datascience");
		// map.put("Rengaraj","android");
		// map.put(null,"core java");
		// map.put(null,"algorithms");
		map.put("patrick",null);
		map.put("pascal", null);


		System.out.println(map);

	}

}
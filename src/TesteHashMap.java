import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {

		Map<String,Integer> hashMap = new HashMap <String,Integer>();
		hashMap.put("Segunda-feira", 100);
		hashMap.put("Terça-feira", 179);
		hashMap.put("Quarta-feira", 25);
		
		System.out.println(hashMap.containsKey("Segunda-feira"));
		hashMap.containsValue(100);
		hashMap.replace("Segunda-feira", 100,500);
		System.out.println(hashMap.values());
		
		
	}

}

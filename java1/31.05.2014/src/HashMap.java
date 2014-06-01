import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.HashMap mapList = new java.util.HashMap<>();
		List liste =new ArrayList<>();
		
		mapList.put("bir","1");
		mapList.put("iki","2");
		mapList.put("üç","3");
				
		Iterator iterator =mapList.entrySet().iterator();
		while (iterator.hasNext())
		{
			// "Map" sýnýfý içinde "Entry" adýnda bir inner class var.....
			Map.Entry deger = (Entry) iterator.next();
			liste.add(deger.getKey());
			System.out.println("Key :" + deger.getKey());
			System.out.println("Value :" + deger.getValue());
		}
		
		Collections.sort(liste);
		
		for (int i = 0; i < liste.size(); i++)
		{
		System.out.println(mapList.get(liste.get(i)));	
		}
	}

}

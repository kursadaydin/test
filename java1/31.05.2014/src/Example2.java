import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList<Grup> grupList =new LinkedList<>();
	
	Seans seans1 = new Seans();
	
	
	seans1.setId(1);
	seans1.setSeansName("Hafta Sonu");
	
	Grup grup =new Grup();
	grup.setGrupName("Java Grubu");
	grup.setSeans(seans1);
	
	
	grup.setId(1);
	
	grupList.addFirst(grup);
	
	
	Grup grup1 =new Grup();	
	grup1.setGrupName("C# Grubu");
	grup1.setSeans(seans1);
	grup1.setId(2);	

	grupList.addLast(grup1);
	
	Grup grup2 =new Grup();	
	grup2.setGrupName("Pyton Grubu");
	grup2.setSeans(seans1);
	grup2.setId(3);	

	grupList.addFirst(grup2);
	
	
		
	for (int i = 0; i < grupList.size(); i++) {
		
	System.out.println("ID :" +grupList.get(i).getId() + " Name :" +grupList.get(i).getGrupName() + " Seans : " + grupList.get(i).getSeans().getSeansName());
	}
	
	
	}

}

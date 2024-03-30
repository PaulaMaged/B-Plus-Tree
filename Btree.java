import java.util.ArrayList;

public class Btree {
	public static void main(String[] args) {
		
		bplustree bpt = new bplustree(4);

		for(int i = 0; i < 21; i++) {

		//create key using i to create unique ones
			// Key<Integer> k = new Key<>(i);
		
		//create pages where each key resides in the same page
			String pageName = "Page" + i;
			ArrayList<String> pages = new ArrayList<>();
			pages.add(pageName);

		//insert into bpt
			bpt.insert(bpt.createDictionaryPair(bpt.createKey(i % 10), pages));
		}

		//create key using createKey method and use it to add keys to insert method
		
		ArrayList<String> array = bpt.search(bpt.createKey(9));
		array.forEach((element) -> {System.out.println(element);});

		System.out.println(bpt.delete(bpt.createDictionaryPair(bpt.createKey(8), null)));
		array.addAll(bpt.search(bpt.createKey(20)));

		array.forEach((element) -> {System.out.println(element);});
		
	}
}
import java.util.ArrayList;

public interface BtreeInterface {

    public void insert(bplustree.DictionaryPair dp);

    public ArrayList<String> search(Key key); 

    public ArrayList<String> search(Key lowerbound, Key upperbound);

    public ArrayList<String> delete(bplustree.DictionaryPair dp);

    public void update(bplustree.DictionaryPair oldDP, Key newkey);
}
import java.util.ArrayList;

import exceptions.KeyNotFound;

public interface BtreeInterface {

    public void insert(Key key, String pageName);

    public ArrayList<String> search(Key key); 

    // public ArrayList<String> search(Key lowerbound, Key upperbound);

    public ArrayList<String> delete(Key key);

    // ArrayList<String> update(Key oldKey, Key newKey);
}
package algorithm;

/**
 * Created by simpumind on 3/6/17.
 */
public class Pair {

    private final String key;
    private final String value;

    public Pair(String aKey, String aValue) {
        key   = aKey;
        value = aValue;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String key()   { return key; }
    public String value() { return value; }
}

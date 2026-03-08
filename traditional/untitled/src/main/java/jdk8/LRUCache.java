package main.java.jdk8;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        // accessOrder = true enables LRU order
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // Automatically remove the eldest entry when size exceeds capacity
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    // Optional: get method for illustration
    public V getValue(K key) {
        return super.getOrDefault(key, null);
    }

    public void putValue(K key, V value) {
        super.put(key, value);
    }

    public void displayCache() {
        System.out.println("Cache: " + super.toString());
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.putValue(1, "A");
        cache.putValue(2, "B");
        cache.putValue(3, "C");
        cache.displayCache(); // {1=A, 2=B, 3=C}

        cache.getValue(1); // Access key 2, now 1 is LRU
        cache.putValue(4, "D"); // Evicts key 1
        cache.displayCache(); // {3=C, 2=B, 4=D}
    }
}
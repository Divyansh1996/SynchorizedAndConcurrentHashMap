import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {
    //synchornizedHashMap
    // 1) Thread Safe, but works with only 1 thread at a time, Since it locks the entire map at a time for a thread.
    // 2) Allows null key and value

    //ConcurrentHashMap
    // 1) Thread Safe, it works with multiple thread at a time, Since it allows bucket wise access and it's faster
    // 2) Doesn't Allows null key and value, if any one of them is null, then we will get Exception.

    public static void main(String[] args){
        Map<Integer, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<>());
        synchronizedHashMap.put(null, null);

        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(23, "Hello");

    }
}

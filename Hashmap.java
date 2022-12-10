//https://leetcode.com/problems/design-hashmap/description/

class MyHashMap {
    int arr[];
    //intializing HashMap
    public MyHashMap() {
        arr = new int[10000000];
        
    }
    //inserting key,values
    public void put(int key, int value) {
        arr[key] = value+1;
        
    }
    //getting vavlue from key
    public int get(int key) {
        long max = arr[key]==-1?0:arr[key]-1;
        return arr[key]-1;
    }
    
    public void remove(int key) {
        arr[key] =0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

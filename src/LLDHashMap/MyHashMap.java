package LLDHashMap;

import LLDTicTacToe.Objects.PieceType;

public class MyHashMap<K,V> {

    private final static int INITIAL_CAPACITY = 1 << 4;
    private Entry<K,V>[] hashtable;

    MyHashMap(){
        this.hashtable = new Entry[INITIAL_CAPACITY];
    }
    public void put(K key, V value){
        int hashcode = key.hashCode() % INITIAL_CAPACITY;
        if(hashtable[hashcode] == null){
            hashtable[hashcode] = new Entry<>(key,value);
        }
        else{
            Entry<K,V> node = hashtable[hashcode];
            Entry<K,V> prevNode = node;
            while(node!=null){
                if(node.key.equals(key)){
                    node.value = value;
                    return;
                }
                prevNode = node;
                node = node.next;
            }
            prevNode.next = new Entry<>(key,value);
        }
    }
    public V get(K key){
        int hashcode = key.hashCode() % INITIAL_CAPACITY;
        Entry<K,V> node = hashtable[hashcode];
        while(node!=null){
            if(node.key.equals(key))
                return node.value;
            node = node.next;
        }
        return null;
    }
    private class Entry<K,V> {
        public K key;
        public V value;
        Entry next;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        myHashMap.put(1,"hey");
        myHashMap.put(2,"hello");
        myHashMap.put(10,"Where");
        System.out.println(myHashMap.get(10));
    }
}

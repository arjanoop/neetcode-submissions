class MyHashSet {

    private ArrayList<Object> data;

    public MyHashSet() {
        data = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key)){
            data.add(key);
        }
    }
    
    public void remove(int key) {
        int index = data.indexOf(key);
        if(index!=-1){
            data.remove(index);
        }
    }
    
    public boolean contains(int key) {
        return data.indexOf(key) != -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
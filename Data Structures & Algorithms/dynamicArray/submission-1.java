class DynamicArray {
    int capacity;
    int arr[];
    int size;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        if(i < this.arr.length) {
            return this.arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        if(i < this.arr.length) {
            this.arr[i] = n;
        }
    }

    public void pushback(int n) {
        int len = this.arr.length;
        if(this.size >= len) {
            this.resize();
            this.arr[len] = n;
        }
        else {
            this.arr[size] = n;
        }
        this.size++;
    }

    public int popback() {
        int element = this.arr[this.size-1];
        this.arr[this.size-1] = 0;
        this.size--;
        return element;
    }

    private void resize() {
        int arr2[] = new int[this.arr.length+this.arr.length];
        for(int i=0; i<arr2.length; i++) {
            if(i < this.arr.length) {
                arr2[i] = this.arr[i];
            }
        }
        this.arr = arr2;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.arr.length;
    }
}

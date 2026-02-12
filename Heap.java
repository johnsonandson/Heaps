public class Heap {

//the actual storage structure for your heap

private int[] arr;
private int indexLast=-1;

//constructor for your heap

//feel free to make one that takes in an array if you prefer for your testing purposes.

//note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing

//the array
//pre condition:
//post condition: 
public Heap() {

    arr = new int[100];

}
//pre condition:index is greater than zero and less than the size of the heap
//post condition: returns the integer held in the heap at index
public int getInt(int index){
    return arr[index];
}

 

//create this function to add elements to your heap

//all heap properties must be preserved

// 5 points
//pre condition: toAdd is an initialized integer
//post condition: adds the integer to the end of the used part of the array and sifts it up to fix the max heap
public void add(int toAdd) {
    indexLast++;
    arr[indexLast]=toAdd;
    siftUp(indexLast);
}

 

//remove the largest element of the heap (the root) and re-heapafy

//5 points
//pre condition: heap is initialized
//post condition: removes the root of the heap, the largest number
public void removeMax() {
    if (indexLast==0) return;
    arr[0]=arr[indexLast];
    arr[indexLast]=0;
    indexLast--;
    siftDown(0);
}

 

//this should check and alter the tree after an item is inserted

//3 points
//pre condition: index is a positive integer less than the length of the array
//post condition: switches the object at index with its parent until it is smaller than its parent
private void siftUp(int index) {
    if(index==0) return;
    if(arr[index]>arr[(index-1)/2]){
        int temp=arr[(index-1)/2];
        arr[(index-1)/2]=arr[index];
        arr[index]=temp;
        siftUp((index-1)/2);
    }
}

 

//this should check and alter the tree after an item is deleted.

//3 points
//pre condition: index is a positive integer less than the length of the array
//post condition: switches the object at index with its largest child, until it has no children or is larger than both
private void siftDown(int index) {
    int i=0;
    if(index>= indexLast) return;
    
    if(index*2+2<=indexLast){
        if(arr[index*2+1]>arr[index*2+2]&&arr[index]<arr[index*2+1]){
            i=index*2+1;
        }
        else if(arr[index]<arr[index*2+2]){
            i=index*2+2;
        }
    }
    else if(index*2+1<=indexLast && arr[index]<arr[index*2+1]){
        i=index*2+1;
    }
    
    else{return;}
    int temp=arr[index];
    arr[index]=arr[i];
    arr[i]=temp;
    siftDown(i);
    }
}

 

//4 points for syntax conventions.

 




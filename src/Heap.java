public class Heap {

    private int[] items = new int[10];
    private int size;

    public void insert(int value){

        if(size == items.length)
            throw new IllegalStateException();
        // this is how we will assign every value in the array in the heap itself in the next available slot
       items[size++] = value;

       //Now we will take care of the bubble up of the element in the heap
        //if newItem > parent
        var index = size -1;
        var parentIndex = (index -1 )/2;
        while(index > 0 && items[index] > items[parentIndex]){
            swap(index, parentIndex); //swap the two

            //but its not ended, the element keep on bubbling up till the time it finds its right place
            index = (index -1) /2;

        }
    }

    public void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}

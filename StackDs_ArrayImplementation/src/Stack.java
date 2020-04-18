public class Stack {
    /**Declaring the array for the stack**/
    String[] stackArray;
    /**Array to hold values during the resizing process**/
    String [] tempCopyArray;
    int N = 0;

    /**Function that resizes the stack array based on the new capacity**/
    public void resizingTheArray(int capacity){
       tempCopyArray = new String[capacity];
        for(int i = 0; i < stackArray.length; i++){
            tempCopyArray[i] = stackArray[i];
        }
        stackArray = tempCopyArray;
    }
    /**Constructor to initializeof the array**/
    Stack(){
        stackArray = new String[1];
    }

    /**function to check if the array is empty**/
    public Boolean isEmpty(){
        return stackArray[0] == null;
    }

    /**Pushing elements into the stack**/
    public void push(String inputForStack){
        /**If the array is full, double the size**/
        if (N == stackArray.length){
            resizingTheArray(2 * stackArray.length);
        }
        /**Use the value N to index into the array, then increement N value by 1**/
        stackArray[N++] = inputForStack;
    }

    /**Poping elements out of the stack**/
    public String pop() {
        /**Check if the array is empty before poping**/
        if (isEmpty()) {
            return "The stack is empty";
        } else {
            /**If the array is 1/4 full, reduce the size to half the original size**/
            if(N == stackArray.length/4){
                resizingTheArray(stackArray.length/2);
            }
             /**Return the top most element in the array, by decreementing the value of N by 1, and then using it**/
            String dataPopped = stackArray[--N];
            /**Set the value in the index of the pop item to null
             * this is to avoid loitering i.e holding reference to a value that is no longer in us.
             * Now the garbage collector can proceed to reclaim the memory**/
            stackArray[N] = null;
            return dataPopped;

    }
}
}

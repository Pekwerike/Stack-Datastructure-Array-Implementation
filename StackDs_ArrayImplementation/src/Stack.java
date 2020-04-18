public class Stack {
    /**Declaring the array for the stack**/
    String[] stackArray;
    int N = 0;
    /**Constructor for the client to initialize the size of the array**/
    Stack(int stackSize){
        stackArray = new String[stackSize];
    }

    public Boolean isEmpty(){
        return stackArray[0] == null;
    }

    /**Pushing elements into the stack**/
    public void push(String inputForStack){
        /**Use the value N to index into the array, then increement N value by 1**/
        stackArray[N++] = inputForStack;
    }

    /**Poping elements out of the stack**/
    public String pop() {
        /**Check if the array is empty before poping**/
        if (isEmpty()) {
            return "The stack is empty";
        } else {
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

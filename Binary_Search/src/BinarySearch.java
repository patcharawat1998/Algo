public class BinarySearch {


    public  boolean binarySearchRecursive(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == data[mid]) // found a match
                return true;
            else if (target < data[mid])
                high = mid - 1; // only consider values left of mid
            else
                low = mid + 1; // only consider values right of mid
        }
        return false; // loop ended without success
    }

    public  boolean binarySearchRecursive(int[] data, int target, int high, int low){
        if(low>high) return false;
        else{
            int mid = (low + high)/2;
            if (target==data[mid]) return true;
            else if(target<data[mid]) return binarySearchRecursive(data,target,mid-1,low);
            else return binarySearchRecursive(data,target,high,mid+1);
        }
    }
}
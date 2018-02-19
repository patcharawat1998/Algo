public class Main {
    public static void main(String[] args) {
        int[] keyList = {4, 7, 8, 10, 17, 21, 22, 36, 62, 77, 81, 91};
        BinarySearch b = new BinarySearch();
        System.out.println(b.binarySearchRecursive(keyList,92));
        System.out.println(b.binarySearchRecursive(keyList,91,keyList.length-1,0));
    }
}

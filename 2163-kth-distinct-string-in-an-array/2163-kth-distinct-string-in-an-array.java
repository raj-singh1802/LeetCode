class Solution {
    public String kthDistinct(String[] arr, int k) {
        int DistinctCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(isDistinct(arr,i)) {
                DistinctCount++;
                if(DistinctCount == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
    private boolean isDistinct(String[] arr, int index) {
        for(int i=0; i<arr.length; i++) {
            if(i != index && arr[i].equals(arr[index])) {
                return false;
            }
        }
        return true;
    }
}
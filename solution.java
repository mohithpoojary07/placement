class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) {
                break;
            }
        }
        return i+1;
    }
}
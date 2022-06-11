class Solution {
    public String removeKdigits(String num, int k) {
        char[] arr = num.toCharArray();
        int top = -1;
        for (int i = 0; i <= arr.length; i++) {
            while (k > 0 && top > -1 && arr[top] > (i == arr.length ? Integer.MIN_VALUE : arr[i])) {
                --top;
                if (--k == 0) break;
            }
            if (i < arr.length && (arr[i] != '0' || top >= 0)) {
                arr[++top] = arr[i];
            }
        }
        return top == -1 ? "0" : new String(arr, 0, top + 1);
        
        
    }
}
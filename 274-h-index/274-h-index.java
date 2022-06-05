class Solution {
    public int hIndex(int[] citations) {
Arrays.sort(citations);
        int low = 0;
        int high = citations.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            final int numberOfCitationsGreaterThanOrEqualToCurrentMidElement = citations.length - mid; // array is ascending order. .
            // so the number of elements after the mid elements is the number of citations greater than equal to the mid Element.
            if (citations[mid] == numberOfCitationsGreaterThanOrEqualToCurrentMidElement)
                return citations[mid];
            else if (citations[mid] < numberOfCitationsGreaterThanOrEqualToCurrentMidElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return citations.length - low;
        
    }
}
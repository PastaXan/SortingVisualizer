/**
 * =====================================================================
 *  BONUS  -  QUICKSORT
 * =====================================================================
 *
 *  THE IDEA  (divide and conquer)
 *   1. Pick a PIVOT item (try the last item in the range).
 *   2. PARTITION: rearrange the range so everything smaller than the pivot is on
 *      its left and everything else is on its right. The pivot is now in its
 *      final, correct spot.
 *   3. Quicksort the left part and the right part (recursion!).
 *  A range with 0 or 1 items is already sorted - that's your base case.
 *
 *  SUGGESTED STRUCTURE:
 *      private void quickSort(SortArray arr, int lo, int hi)
 *      private int partition(SortArray arr, int lo, int hi)   // returns the pivot's final index
 *
 *  TOOLS: arr.size(), arr.less(i, j), arr.swap(i, j)
 *
 *  ANALYSIS QUESTIONS
 *   1. Run quicksort on "Already sorted" data with the last item as the pivot. What happens? Why?
 *   2. Change the pivot to the MIDDLE item (swap it to the end first). Does that fix it?
 *   3. Quicksort vs. merge sort on Random data: who wins on comparisons? On swaps/writes?
 */
public class QuickSort implements SortAlgorithm {

    @Override
    public String getName() { return "Quicksort"; }


    @Override
    public void sort(SortArray arr) {
        // TODO: write quicksort here (add helper methods below)
        if(arr.size()==0||arr.size()==1){return;}
        //int ind = arr.get(arr.size()/2);

    }
}

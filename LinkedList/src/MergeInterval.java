import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeInterval {

    public static int[][] mergeIntervals(int[][] intervals) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> firstSlot = new ArrayList<>();
        firstSlot.add(intervals[0][0]);
        firstSlot.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++) {
            int endTimeOfCurrentInterval = Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]);
            int startTimeOfNextInterval = intervals[i][0];

            if(startTimeOfNextInterval <= endTimeOfCurrentInterval) {
                ans.get(ans.size() - 1).remove(1);
                ans.get(ans.size() - 1).add(endTimeOfCurrentInterval);
            }
            else {
                ArrayList<Integer> currentSlot = new ArrayList<>();
                currentSlot.add(intervals[i][0]);
                currentSlot.add(intervals[i][1]);
                ans.add(currentSlot);
            }
        }

        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }

    public static int[][] insertInterval(int[][] existingIntervals, int[] newInterval) {

        LinkedList<int[]> ans = new LinkedList<>();

        ans.add(existingIntervals[0]);

        int newIntervalStart = newInterval[0];
        int newIntervalEnd = newInterval[1];

        boolean alreadyAdded = false;

        for(int i = 1; i < existingIntervals.length; i++) {
            int currentStart = existingIntervals[i][0];
            int currentEnd = existingIntervals[i][1];

            int[] lastIntervalAdded = ans.getLast();

            int lastIntervalAddedStart = lastIntervalAdded[0];
            int lastIntervalAddedEnd = lastIntervalAdded[1];

            if(currentEnd < lastIntervalAddedEnd) {
                ans.remove(ans.size() - 1);
                ans.add(new int []{Math.min(currentStart, lastIntervalAddedStart), Math.max(lastIntervalAddedEnd, currentEnd)});
            }
            else {
                ans.add(existingIntervals[i]);
            }

            lastIntervalAdded = ans.getLast();
            lastIntervalAddedStart = lastIntervalAdded[0];
            lastIntervalAddedEnd = lastIntervalAdded[1];


            if(lastIntervalAddedEnd >= newIntervalStart && !alreadyAdded) {
                ans.remove(ans.size() - 1);
                ans.add(new int []{Math.min(newIntervalStart, lastIntervalAddedStart), Math.max(lastIntervalAddedEnd, newIntervalEnd)});
                alreadyAdded = true;
            }

        }

        if(!alreadyAdded) {
            ans.add(newInterval);
        }
        return ans.toArray(new int [][] {});
    }

    public static int[][] intervalsIntersection(int[][] intervalLista, int[][] intervalListb) {

        int a = 0;
        int b = 0;
        ArrayList<int[]> ans =  new ArrayList<>();

        while(a < intervalLista.length && b < intervalListb.length) {
            int[] intervalA = intervalLista[a];
            int[] intervalB = intervalListb[b];

            int startA = intervalA[0];
            int endA = intervalA[1];

            int startB = intervalB[0];
            int endB = intervalB[1];

            if(startB <= endA) {
                ans.add(new int[]{Math.max(startA, startB), Math.min(endA, endB)});
            }

            if(endA  == endB) {
                a++;
                b++;
            }
            else if(endA > endB) {
                b++;
            }
            else{
                a++;
            }
         }

        return ans.toArray(new int[][]{});
    }

}

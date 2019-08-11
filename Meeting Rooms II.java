class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.start);
        //the below is a lamba fucntion
        //we are basically sorting them by their start and end times

        //root of the minheap is going to contain the end times of the meetings
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.end - b.end);

        //creating a meeting room
        minHeap.add(intervals[0]);

        //going through the intervals of the meetings
        for(int i = 0; i < intervals.length; i++) {
            Interval current = intervals[i];
            Interval earliest = minHeap.remove();   //earliest of the meeting room
            
            if(current.start >= earliest.end) {     //if the start and the end of the meetings are the same
                earliest.end = current.end;
            }
            else {
                minHeap.add(current);
            }

            minHeap.add(earliest);      //because we removed the earliest we need to add this for comparison
        }
        return minHeap.size();
    }
}



//we use a min heap 
//we mostly need to worry about the end times then look at the start times 
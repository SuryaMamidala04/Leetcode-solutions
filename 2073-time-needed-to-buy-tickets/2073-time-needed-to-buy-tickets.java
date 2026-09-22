class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue q = new ArrayDeque<>();
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }
        int steps = 0;
        while(tickets[k] != 0){
            int i = (int)q.poll();
            tickets[i] -= 1;
            if(tickets[i] != 0){
                q.offer(i);
            }
            steps++;
        }
        return steps;
    }
}
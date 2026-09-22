class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq = new ArrayDeque<>();
        Queue<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i) == 'R') rq.offer(i);
            else dq.offer(i);
        }
        while(!rq.isEmpty() && !dq.isEmpty()){
            if(rq.peek()<dq.peek()){
                dq.poll();
                rq.offer(rq.poll()+senate.length());
            }
            else{
                rq.poll();
                dq.offer(dq.poll()+senate.length());
            }
        }
        return dq.size()==0? "Radiant" : "Dire";

    }
}
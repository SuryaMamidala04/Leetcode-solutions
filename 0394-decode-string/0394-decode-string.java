class Solution {
    public String decodeString(String s) {
        StringBuilder curStr = new StringBuilder();
        ArrayDeque<StringBuilder> stack1 = new ArrayDeque<>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
         int cnum = 0;
        for(char ch : s.toCharArray()){
           
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                cnum = cnum*10 + digit;
            }
            else if(ch == '['){
                stack2.push(cnum);
                stack1.push(curStr);

                curStr = new StringBuilder();
                cnum = 0;
            }
            else if(ch == ']'){
                int k = stack2.pop();
                StringBuilder decoded = stack1.pop();

                for(int i=0; i<k; i++){
                    decoded.append(curStr);
                }

                curStr = decoded;
            }
            else{
                curStr.append(ch);
            }
            
             System.out.println(stack1);
             System.out.println(stack2);
        }
       

        return curStr.toString();
    }
}
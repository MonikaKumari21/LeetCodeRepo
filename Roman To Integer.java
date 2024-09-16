class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMapping = new HashMap<>();
        romanMapping.put('I',1);
        romanMapping.put('V',5);
        romanMapping.put('X',10);
        romanMapping.put('L',50);
        romanMapping.put('C',100);
        romanMapping.put('D',500);
        romanMapping.put('M',1000);
        int sum =0;

        char prev ='M';
        for(int i=0;i<s.length();i++){
            if(romanMapping.get(prev)<romanMapping.get(s.charAt(i))){
                //System.out.println(s.charAt(i));
                sum=sum+romanMapping.get(s.charAt(i))-2*(romanMapping.get(prev));
            } else{
                 sum+=romanMapping.get(s.charAt(i));
            }
           
            prev = s.charAt(i);
        }        
        return sum;
    }
}

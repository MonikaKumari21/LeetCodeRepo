class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int lineLength = 0 , i = 0;
        List<String> result = new ArrayList();
        while(i<words.length){
            int j = i+1;
            lineLength = words[i].length();
            while(j< words.length  && (lineLength+words[j].length()+j-i-1)<maxWidth){
                lineLength += words[j].length();
                j++;
            }
            int diff = maxWidth - lineLength;
            if(j>=words.length || (j-i)==1){
                result.add(rightJustify(words, i, j, diff));
            } else{
                result.add(leftJustify(words, i, j, diff));
            }
            i = j;
        }
        return result;  
    }

    private String rightJustify(String[] words, int i, int j, int diff){
        int spacesInRight = diff-(j-i-1);
        int k = i+1;
        StringBuilder result = new StringBuilder(words[i]);
        while(k<j){
            result.append(" "+ words[k]);
            k++;
        }
        result.append(" ".repeat(spacesInRight));
        return result.toString();
    }

    private String leftJustify(String[] words, int i, int j, int diff){
        int spacesRequired = j-i-1;
        int spaceInBetween = diff/spacesRequired;
        int extraSpaces = diff%spacesRequired;
        int k = i+1;
        StringBuilder result = new StringBuilder(words[i]);
        while(k<j){
            int spaces = spaceInBetween + (extraSpaces-- > 0?1:0);
            result.append(" ".repeat(spaces) + words[k]);
            k++;
        }
        return result.toString();
    }
}

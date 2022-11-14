public class StringLoops {
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
        String slow = searchString.toLowerCase();
        String clow = character.toLowerCase();
        int count = 0;

        for (int i = 0; i<slow.length(); i++){
            String c = slow.substring(i, i+1);
            if (c.equals(clow)){
                count++;
            }
        }
        return count;
    }

    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length()-1; i>=0; i--){
            String ch = origString.substring(i, i + 1);
            newString +=ch;
        }
        return newString;
    }

    public String reverseString2(String origString){
        String newString = "";
        for (int i = 0; i<origString.length(); i++){
            String ch = origString.substring(i, i+1);
            newString = ch + newString;
        }
        return newString;
    }
}

package string;
public class LengthOfLastString {
    public int lengthOfLastWord(String s) {
        s=s.trim();

        int indexlast=s.lastIndexOf(' ');
        return s.length()-indexlast-1;
    }   
}

public class CodeWordChecker implements StringChecker {
    private int max;
    private int min;
    private String kWord;

    public CodeWordChecker(int min, int max, String kWord) {
        this.min = min;
        this.max = max;
        this.kWord = kWord;
    }

    public CodeWordChecker(String kWord) {
        this.min = 6;
        this.max = 20;
        this.kWord = kWord;
    }

    public boolean isValid(String str)
    {
        boolean isValid=true;

        if(str.length()<=this.max && str.length()>= this.min)
        {
            if (str.indexOf(this.kWord)>=0)
            {
                isValid=false;
            }
        }else{
            isValid=false;
        }
        return isValid;
    }
}

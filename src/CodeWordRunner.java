public class CodeWordRunner {
    public static void main(String[] args) {

        StringChecker sc1= new CodeWordChecker(5,6,"$");
        StringChecker sc2= new CodeWordChecker("pass");

        System.out.println(((CodeWordChecker) sc1).isValid("happy"));
        System.out.println(((CodeWordChecker) sc1).isValid("happy$"));
        System.out.println(((CodeWordChecker) sc1).isValid("Code"));
        System.out.println(((CodeWordChecker) sc1).isValid("happyCode"));

        System.out.println(((CodeWordChecker) sc2).isValid("MyPass"));
        System.out.println(((CodeWordChecker) sc2).isValid("MypassPort"));
        System.out.println(((CodeWordChecker) sc2).isValid("happy"));
        System.out.println(((CodeWordChecker) sc2).isValid("1,000,000,000,000"));

    }
}

class Programming_Language {
    private String Language;
    //default constructor
    public Programming_Language(){
        Language = "Java";
    }
    public Programming_Language(String lang){
        Language = lang;
    }
    public void getLanguage(){
        System.out.println(Language);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Programming_Language Object1 = new Programming_Language();
        Programming_Language Object2 = new Programming_Language("C");
        Object1.getLanguage();
        Object2.getLanguage();
    }
}

public class MethodService {
    public static void cut (String str){
        System.out.println(String.join(" ", str.substring(0, 4), str.substring(9, 13)));
    }

    public static void change (String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(5, 8, "***");
        stringBuilder.replace(14, 17, "***");
        System.out.println(stringBuilder);
    }

    public static void docNumber (String str) {
        System.out.println(String.join("/", str.substring(5, 8), str.substring(14, 17), str.substring(19, 20),
                str.substring(21)).toLowerCase());
    }

    public static void letters (String str){
        StringBuilder letters = new StringBuilder(String.join("/", str.substring(5, 8),
                str.substring(14, 17), str.substring(19, 20), str.substring(21)).toUpperCase());
        letters.insert(0, "Letters: ");
        System.out.println(letters);
    }

    public static void search (String str) {
        if (str.contains("abc") || str.contains("ABC")) {
            System.out.println("Данный фрагмент содержится");
        } else {
            System.out.println("Данный фрагмент отсутствует");
        }
    }

    public static void beginOfDocument (String str){
        System.out.println(str.startsWith("555"));
    }

    public static void endOfDocument (String str){
        System.out.println(str.endsWith("1a2b"));
    }

}

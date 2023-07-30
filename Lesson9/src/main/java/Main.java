public class Main {
    public static void main(String[] args) {

        String document = "7521-aaa-6235-AAA-2j9n";
        MethodService.change(document);
        MethodService.cut(document);
        MethodService.docNumber(document);
        MethodService.letters(document);
        MethodService.beginOfDocument(document);
        MethodService.endOfDocument(document);
        MethodService.search(document);

    }
}

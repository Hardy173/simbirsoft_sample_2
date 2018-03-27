public class Summary_java {
    public static void main(String[] args) {
        CreateHTML createHTML = new ServiceImplement("bd.properties");
        createHTML.generation("index.html");
    }
}

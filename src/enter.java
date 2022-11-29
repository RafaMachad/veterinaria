import java.io.Console;
public class enter {

    public static Console console = System.console();

    
    public static void enter() {
        System.out.println("Aperte ENTER para continuar...");
        console.readLine();
    }
}


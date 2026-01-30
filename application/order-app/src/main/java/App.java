import java.io.InputStream;
import java.util.Properties;

public class App {
	public static void main(String[] args) {
        System.out.println("Iniciando aplicación de pedidos...");
        printEnvironment();
        
        OrderService service = new OrderService();
        service.processOrder("Laptop Gamer");
    }
	private static void printEnvironment() {
        try (InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("No se encontró config.properties");
                return;
            }
            prop.load(input);
            System.out.println("ENTORNO ACTUAL: " + prop.getProperty("ambiente"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;


public class Loggerex {
    private static final Logger logger = Logger.getLogger(Loggerex.class.getName());

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Inciando o Log:");
            return;
        }
        String comentario = args[0];
        try {
            // Armazenando o log no arquivo log.txt
            FileHandler fileHandler = new FileHandler("log.txt");
            fileHandler.setLevel(Level.ALL);

            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            logger.addHandler(fileHandler);

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);

            logger.addHandler(consoleHandler);

            logger.info("Usuario " + comentario);
            

            boolean resultado = logger(comentario);
        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean logger(String comentario) {
      return true;
    }
}
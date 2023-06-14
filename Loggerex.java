
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Loggerex {
    private static final Logger logger = Logger.getLogger(Loggerex.class.getName());

    public static void main(String[] args) {

      if(args.length !=2){
        System.out.println("Inciando o Log: <email> <senha>");
        return;
      }
      //Recebendo info de outra aplicação via linha de comando
      String email = args[0];
      String password = args[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
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

                    String email = "usuario@gmail.com";
                    String password = "Senha3214";

                    logger.info("Realizando o login do usuário: " + email);
                    Thread.sleep(3000);

                    if (login(email, password)) {
                        logger.info("Login bem sucedido para o usuário: " + email + "\n");
                    } else {
                        logger.severe("Falha ao fazer login para o usuário: " + email + "\n");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

    private static boolean login(String email, String password) {
        return true;
    }
}
      

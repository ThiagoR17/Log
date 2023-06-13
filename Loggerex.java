import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;





public class Loggerex{
    private static final Logger logger = Logger.getLogger(Logger.class.getName());

  public static void main(String [] args){
    try{
      // armazenando o log no arquivo log.txt//
      FileHandler fileHandler = new FileHandler("Log.txt");
      fileHandler.setLevel(Level.ALL);
      

      SimpleFormatter formatter = new SimpleFormatter();
      fileHandler.setFormatter(formatter);

      logger.addHandler(fileHandler);

      ConsoleHandler consoleHandler = new ConsoleHandler();
      consoleHandler.setLevel(Level.ALL);

      logger.addHandler(consoleHandler);

      String email = "usuario@gmail.com";
      String password = "Senha3214";

      logger.info("Realizando o login do user: " + email);

      if (login(email, password)) {
            logger.info("Login bem sucedido para o user: " + email );
      } else {
              logger.severe("Falha ao fazer login para o user: " + email);
      }
    } catch (Exception e) {
              e.printStackTrace();
          }
      }

    private static boolean login(String email, String password) {
          return true;
    }
}

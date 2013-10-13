package listener;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ab.SetupDao;

public class ServletContextInitializer implements ServletContextListener{

   @Override
   public void contextInitialized(ServletContextEvent arg0) {
      SetupDao setupDao = new SetupDao();

      if(!databaseExists()) {
         setupDao.createSchema();
         setupDao.addTestData();
      }
   }

   @Override
   public void contextDestroyed(ServletContextEvent arg0) {
      
   }

   private boolean databaseExists() {
      return new File(System.getProperty("user.home") + "/data/KristjanLuik/dbtore.script").exists();
   }
}
package esimene;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounterListener
 *
 */
public class SessionCounterListener implements HttpSessionListener {
	
	private static int totalActiveSessions = 0;

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
	@Override
    public void sessionCreated(HttpSessionEvent arg0) {
    	totalActiveSessions++;
        // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	totalActiveSessions--;
        // TODO Auto-generated method stub
    }
    
    public static int getTotalActiveSessions() {
		return totalActiveSessions;
	}
	
}

package com.pioneercoders.listener;

public class ListenerTheory {
	
	
	/*  What is the need of ServletContextListener?

      Sometime we may have a requirement that some code should run before a web application starts. 
      For example, we need to create a database connection so that web application can use it whenever it performs some operations and when application shuts down, we can close database connection.
	 * 
	 * We can write our own listeners also by implementing ServletContextListener and HttpListener 
	 * 
	 * ex: Java EE specification provides an interface named ServletContextListener which serves our purpose. ServletContextListener listens to the lifecycle events of a servlet context. This interface gets notified whenever an application with which listener is associated starts up and shuts down. Here is what javadoc says about it.

          Implementations of this interface receive notifications about changes to the servlet context of the web application they are part of. To receive notification events, the implementation class must be configured in the deployment descriptor for the web application.

         If you want to listen when web application starts, use contextInitialized(ServletContextEvent event) method.

        Notification that the web application initialization process is starting. All ServletContextListeners are notified of context initialization before any filter or servlet in the web application is initialized.

        If you want to listen when web application stops, use contextDestroyed(ServletContextEvent event) method.

        Notification that the servlet context is about to be shut down. All servlets and filters have been destroyed()  before any ServletContextListeners are notified of context destruction.

        Create a listener as follows

        MyServletContextListenerJava

        package com.pioneercoders

        import javax.servlet.ServletContextEvent;
        import javax.servlet.ServletContextListener;

         public class MyServletContextListener implements ServletContextListener {

	    public void contextInitialized(ServletContextEvent event) {
		System.out.println("context initialized");
	    }

	   public void contextDestroyed(ServletContextEvent event) {
	   }

       }





package com.pioneercoders;
 
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
 
public class MyServletContextListener implements ServletContextListener {
 
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("context initialized");
	}
 
	public void contextDestroyed(ServletContextEvent event) {
	}
 
}
	 *  some of the important methods of ServletRequestListener  
	 *  
	 *  Java EE specification provides an interface called ServletRequestListener which receives notifications whenever a new request is about to come to the web application.  This is what javadoc says about it.

        A ServletRequest is defined as coming into scope of a web application when it is about to enter the first servlet or filter of the web application, and as going out of scope as it exits the last servlet or the first filter in the chain.

       requestInitialized(ServletRequestEvent event) :

       Receives notification that a ServletRequest is about to come into scope of the web application.

       requestDestroyed(ServletRequestEvent event) :

       Receives notification that a ServletRequest is about to go out of scope of the web application.
	 * 
	 * 
	 * How to configure listener in web.xml
	 * <listener>
       <listener-class>com.pioneercoders.MyRequestListener</listener-class>
       </listener>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

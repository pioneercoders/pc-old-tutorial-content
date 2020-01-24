package com.pioneercoders.jdbcdrivers;

public class JdbcDrivers {
	public static void main(String[] args) {
		/*
		 * JDBC Driver is a software component that enables java application to interact with the database.There are 4 types of JDBC drivers:
          1.JDBC-ODBC bridge driver
          2.Native-API driver (partially java driver)
          3.Network Protocol driver (fully java driver)
          4.Thin driver (fully java driver)
          driver-1
          Advantages:

easy to use.
can be easily connected to any database.
Disadvantages:

Performance degraded because JDBC method call is converted into the ODBC function calls.
The ODBC driver needs to be installed on the client machine.
          
          driver-2
          Advantage:

performance upgraded than JDBC-ODBC bridge driver.
Disadvantage:

The Native driver needs to be installed on the each client machine.
The Vendor client library needs to be installed on client machine.
      
      driver-3
      Advantage:

No client side library is required because of application server that can perform many tasks like auditing, load balancing, logging etc.
Disadvantages:

Network support is required on client machine.
Requires database-specific coding to be done in the middle tier.
Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in the middle tier.
   driver-4
    we are using driver-4
   Advantage:

Better performance than all other drivers.
No software is required at client side or server side.
Disadvantage:

Drivers depends on the Database.
  
  
		 */
		
	}

}

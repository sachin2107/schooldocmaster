# schooldocmaster
First commit message - used jndi for db connection, JPA repository, and it works when we hit /school/welcome url
For JNDI to work 
1. in web.xml add <resource-ref> tag with info.
2. In eclipse -> server folder -> configure server.xml and context.xml
3. In tomcat folder->configure server.xml and context.xml
4. In tomcat lib folder, make sure mysql-connector jar is present with compatible version.
5. Add jee namespace in spring-servlet.xml from namespaces tag so that we can use <jee-jndi> tag in that xml.
6. Maven Clean and install -> run on server.
7. If you get any error related to driver and url is empty or null - add username password and url in context.xml tag also
8. If you get DispatcherServlet ClassNotFoundException, make sure in project properties->deployment assembly->you have added maven dependancies.

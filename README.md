# Welcome, in this git I explain how applied technology works
##### any questions just send me a message
*note: this git is only explanatory about how the technologies applied in the project work, with an example from the code above.
I recommend downloading and testing while enjoying reading how it works.*
###### thanks and good reading

------------
**project prints:**
![Screenshot_7](https://user-images.githubusercontent.com/59379254/82153163-34d42700-983c-11ea-9e87-1e0483b0f0c5.png)
.
![Screenshot_1](https://user-images.githubusercontent.com/59379254/82153159-33a2fa00-983c-11ea-85dd-338b2470fe00.png)
.
![Screenshot_2](https://user-images.githubusercontent.com/59379254/82153161-343b9080-983c-11ea-948b-ce2f612cce0c.png)
.
![Screenshot_3](https://user-images.githubusercontent.com/59379254/82153162-34d42700-983c-11ea-89cf-a8e3d29efdb8.png)

------------

### JAVA SERVLETS
#### WEB JEE Components
**JEE Application Model**
The JEE platform uses a distributed application model
multilayer.
![Screenshot_1](https://user-images.githubusercontent.com/59379254/82152513-21bf5800-9838-11ea-8fb3-75c77040fc99.png)
The application logic is divided into components according to the its function.
The various components that make up a JEE application are installed on different equipment.
The JEE Platform defines four basic technologies for building WEB Applications:
1. Java Servlets 3.1
1. JavaServer Pages 2.2
1. JavaServer Faces 2.2
1. JavaServer Pages Standard Tag Library 1.2.1

![Screenshot_2](https://user-images.githubusercontent.com/59379254/82152583-9c887300-9838-11ea-8dd2-ccd5345b60a8.png)

#### JAVA SERVLETS
Definition
- Servlets are modules that extend server-oriented
request / response, such as JEE Web servers.
- A servlet is similar to the proprietary extension of a server, being executed in the same JVM.
- This technology appeared in 1997, aiming to be the new programming paradigm for WEB servers.
- Servlets are used to create WEB applications with java.

##### Architecture

![Screenshot_3](https://user-images.githubusercontent.com/59379254/82152626-fc7f1980-9838-11ea-9dcd-dfca7a2b1e0d.png)

##### API SERVLET
- The Servlet API consists of two packages: javax.servlet and javax.servlet.http.

- The javax.servlet package defines a set of classes and interfaces used in communication between servlets and their environment execution (web container).

- Example: Servlet, ServletConfig, ServletContext,
ServletContextListener, ServletRequest, ServletResponse, etc.

- The javax.servlet.http package defines a set of classes and interfaces used in communication - via HTTP protocol - between servlets and their execution environment (web container).

- Example: HttpSession, HttpServletRequest, HttpServletResponse, etc.

##### SERVLET MODEL
- Every servlet created by the developer should implement the Servlet interface and be a subclass of HttpServlet.

- The javax.servlet.Servlet interface defines all the methods that a servlet should to implement.

- The abstract class javax.servlet.http.HttpServlet defines a servlet to use the protocol of hypermedia HTTP communication.

- The subclass of javax.servlet.http.HttpServlet (MyServlet) must cancel at least 01 that superclass method.

![Screenshot_4](https://user-images.githubusercontent.com/59379254/82152741-c42c0b00-9839-11ea-83de-2c719dbd005d.png)

##### CLASSE HTTPSERVLET
Main methods of this class:
- doGet (...), to support the protocol's GET methods
HTTP;

- doPost (...), to support HTTP POST methods;

- doPut (...), to support HTTP PUT methods;

- doDelete (...), to support the DELETE methods of HTTP;

- init (...) and destroy (...), to manage the life cycle of a servlet;

- getServletInfo (...), to provide servlet information.

##### HTTP GET e POST
Request methods defined in the HTTP protocol
- GET (normal requests)
- POST (requests through forms)
- PUT
- DELETE
![Screenshot_5](https://user-images.githubusercontent.com/59379254/82152811-3d2b6280-983a-11ea-8bbf-957cd8cde35e.png)

##### MAIN INTERFACES
HttpServletRequest and HttpServletResponse
![Screenshot_6](https://user-images.githubusercontent.com/59379254/82153063-9ea00100-983b-11ea-809e-df18b5ce2272.png)

##### HTTPSERVLETREQUEST
This interface provides request information to servlets.
- Its main methods are defined below:

- String getParameter (String parameter) → Returns the value of a parameter.

- String [] getParameterValues ​​(String parameter) → Returns a String vector containing all the values that the given parameter has, or null if not.

- String getRequestedURI () → Returns the requested URI.

- String getQueryString () → Returns a string containing all associated parameters and values in a query.

##### HTTPSERVLETRESPONSE
This interface provides servlet response information.

- Its main methods are defined below:

- PrintWriter getWriter () throws IOException → Returns an object PrintWriter that can send text in response to a request.

- ServletOuputStream getOuputStream () throws IOException → Returns a ServletOutputStream object that can send data binary in response to a request.

- public void setContentType (String type) → Defines the format of the response (text / html; charset = UTF-8; etc.) that will be sent by the servlet.

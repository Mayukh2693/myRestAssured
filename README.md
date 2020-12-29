#Install all the dependencies from MVN Repository(Here all of them are included in pom.xml)
 ~TestNG
 ~Rest Assured
 ~Hamcrest Matchers
 

#test/java- contains all the real tests

#main/java has been divided into 3 components
 ~config- Contains the required configs to run the tests like username,password, endpoints
 ~POJO- Contains classes which help in building JSON objects that need to be sent as body in requests
 ~Utils- Contains Basetest class which initializes the baseURI and Utilites need to run the test 
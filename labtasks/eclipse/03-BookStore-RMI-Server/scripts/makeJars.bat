del /f ..\\libs\\BookStore*.jar
cd ..\\src
javac -cp ..\\libs\\hibernate-jpa-2.1-api-1.0.0.Final.jar ro\\pub\\cs\\aipi\\lab03\\businesslogic\\*Interface.java ro\\pub\\cs\\aipi\\lab03\\general\\Constants.java ro\\pub\\cs\\aipi\\lab03\\entities\\PersistentEntity.java ro\\pub\\cs\\aipi\\lab03\\result\\*.java
jar cvf bookstore-common.jar ro\\pub\\cs\\aipi\\lab03\\general\\Constants.class ro\\pub\\cs\\aipi\\lab03\\entities\\PersistentEntity.class
jar cvf bookstore-bookmanager.jar ro\\pub\\cs\\aipi\\lab03\\businesslogic\\BookManagerInterface.class ro\\pub\\cs\\aipi\\lab03\\result\\BookInformation.class ro\\pub\\cs\\aipi\\lab03\\result\\BookInformationDetailed.class
rem exercise 5e1
rem exercise 7e1
move *.jar ..\\libs
del /f ro\\pub\\cs\\aipi\\lab03\\businesslogic\\*Interface.class ro\\pub\\cs\\aipi\\lab03\\general\\Constants.class ro\\pub\\cs\\aipi\\lab03\\entities\\PersistentEntity.class ro\\pub\\cs\\aipi\\lab03\\result\\*.class
del /f ..\\..\\03-BookStore-RMI-Client-BookManager\\libs\\*.jar
mkdir ..\\..\\03-BookStore-RMI-Client-BookManager\\libs
copy ..\\libs\\bookstore-common.jar ..\\..\\03-BookStore-RMI-Client-BookManager\\libs\\
copy ..\\libs\\bookstore-bookmanager.jar ..\\..\\03-BookStore-RMI-Client-BookManager\\libs\\
rem exercise 5e2
rem exercise 7e2
pause
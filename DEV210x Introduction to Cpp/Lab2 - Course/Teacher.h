#pragma once

#include <string>

class Teacher {
	//The Student and Teacher classes need to have private member variables for 
	//first and last names, 
	//age, 
	//address, 
	//city, and 
	//phone along with 
	//public accessors for these.

	//Each class needs to have a 
	//default constructor and 
	//one that sets the values of the member variables when the object is created.
	//Each class should also have a destructor.

	//Ensure that you are using a header(.h) and an implementation file(.cpp) for each class.

	//The Teacher class needs to have a method called GradeStudent() 
	//that accepts no arguments and returns nothing.
	//Have this method output an appropriate message to the console such as "Student graded".

	//Add a method to both Student and Teacher called SitInClass().
	//it should take no arguments and return no arguments but, 
	//to illustrate class scope, have the method output, 
	//"Sitting at front of class" for the teacher and 
	//"Sitting in main theater" for the students.

private:
	std::string firstName;
	std::string lastName;
	int age;
	std::string city;
	std::string phone;

public:
	std::string getFirstName();
	std::string getLastName();
	int getAge();
	std::string getCity();
	std::string getPhone();

	Teacher();

	Teacher(std::string, std::string, int, std::string, std::string);

	~Teacher();

	void GradeStudent();

	void SitInClass();

};
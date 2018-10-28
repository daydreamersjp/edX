// Course.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include "Course.h"
#include "Student.h"
#include "Teacher.h"
#include <iostream>

int main()
{
	
	Student *student1 = new Student("Tom", "Ruff", 15, "New York", "1234");
	Student *student2 = new Student("Emily", "Ruff", 14, "New Jorsey", "2222");
	Student *student3 = new Student("Frank", "Sinatora", 100, "Orlando", "5555");

	Teacher *teacher = new Teacher("Pico", "Smith", 35, "LA", "9999");
	
	Student student [3] = { *student1, *student2, *student3 };

	Course *course = new Course(student, *teacher, "Intermediate C++");

	std::cout << course->getName() << std::endl;

	teacher->GradeStudent();


}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file

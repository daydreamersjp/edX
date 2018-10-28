#include "pch.h"
#include "Student.h"
#include <iostream>

std::string Student::getFirstName()
{
	return this->firstName;
}

std::string Student::getLastName()
{
	return this->lastName;
}

int Student::getAge()
{
	return this->age;
}

std::string Student::getCity()
{
	return this->city;
}

std::string Student::getPhone()
{
	return this->phone;
}

Student::Student()
{ }

Student::Student(std::string fName, std::string lName, int a, std::string c, std::string p)
{
	this->firstName = fName;
	this->lastName = lName;
	this->age = a;
	this->city = c;
	this->phone = p;
}

Student::~Student()
{ }

void Student::SitInClass()
{
	std::cout << "Sitting in main theater" << std::endl;
}

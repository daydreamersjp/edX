#include "pch.h"
#include "Teacher.h"
#include <iostream>

std::string Teacher::getFirstName()
{
	return this->firstName;
}

std::string Teacher::getLastName()
{
	return this->lastName;
}

int Teacher::getAge()
{
	return this->age;
}

std::string Teacher::getCity()
{
	return this->city;
}

std::string Teacher::getPhone()
{
	return this->phone;
}

Teacher::Teacher()
{ }

Teacher::Teacher(std::string fName, std::string lName, int a, std::string c, std::string p)
{
	this->firstName = fName;
	this->lastName = lName;
	this->age = a;
	this->city = c;
	this->phone = p;
}

Teacher::~Teacher()
{ }

void Teacher::GradeStudent()
{
	std::cout << "Student graded" << std::endl;
}

void Teacher::SitInClass()
{
	std::cout << "Sitting at front of class" << std::endl;
}


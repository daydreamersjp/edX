// Course.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include "Course.h"
#include "Student.h"
#include "Teacher.h"
#include <string>

Course::Course(){ }

Course::Course(Student student[3], Teacher teacher, std::string courseName) {
	//student = new Student[3];
	for (int i = 0; i < 3; i++) {
		this->student[i] = student[i];
	}
	this->teacher = teacher;
	this->courseName = courseName;
}

Course::~Course()
{ }

std::string Course::getName()
{
	return courseName;
}

//void Course::addStudent(Student)
//{
//	this->student
//}

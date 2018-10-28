#pragma once
#include "Student.h"
#include "Teacher.h"
#include <string>

class Course {
private:
	Student student[3];
	Teacher teacher;

	std::string courseName;

public:
	Course();

	Course(Student[3], Teacher, std::string);

	~Course();

	std::string getName();

};

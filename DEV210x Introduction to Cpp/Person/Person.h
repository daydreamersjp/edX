#pragma once

#include <string>

class Person {

private:
	std::string firstName;
	std::string lastName;

	int age;

public:
	Person();

	Person(std::string, std::string);

	Person(std::string, std::string, int);

	~Person();

	void SayHello();

};
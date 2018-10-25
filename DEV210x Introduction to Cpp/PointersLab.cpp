// PointersLab.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
//#include "Person.h"

using namespace std;

void PassByValue(int);
void PassByRef(int &);

class Person {
private:
	string name;
	int age;
	double height;
	double weight;

public:
	Person(string name, int age, double height, double weight) {
		this->name = name;
		this->age = age;
		this->height = height;
		this->weight = weight;
	}

	~Person() { };

	string getName() { return this->name; }
	int getAge() { return this->age; }
	double getHeight() { return this->height; }
	double getWeight() { return this->weight; }

	void setName(string newName) { this->name = newName; }

};

void ModifyPerson(Person);



int main()
{
	int num1 = 3;
	int *pNum = new int;
	*pNum = 5;

	PassByValue(num1);
	cout << "In main()" << endl;
	cout << "Number is " << num1 << endl;

	PassByRef(*pNum);
	cout << "In main()" << endl;
	cout << "Number is " << *pNum << endl;

	//PassByValue(pNum);

	double *pDouble = new double;
	*pDouble = 10.0;
	cout << "pDouble's number is " << *pDouble << endl;

	delete pDouble;

	//cout << "pDouble's number is" << *pDouble << endl;

	Person *member = new Person("Smith", 45, 80.5, 200.3);

	ModifyPerson(*member);

	cout << "Person's name is now ";
	cout << member->getName() << endl;

	delete member;

	delete &num1;
	delete pNum;
	return 0;
}

void PassByValue(int num0) {
	cout << "In PassByValue()" << endl;
	cout << "Number is " << num0 << endl;
	num0++;
	cout << "Now number is " << num0 << endl;
}

void PassByRef(int &num0) {
	cout << "In PassByRef()" << endl;
	cout << "Number is " << num0 << endl;
	num0 = 50;
	cout << "Now number is " << num0 << endl;

}

void ModifyPerson(Person *person) {
	person->setName(person->getName() + " Jr.");
}




#include "iostream"

using namespace std;

void passByValue(int &num1);

int main() {

	int num = 3;
	cout << "In main()" << endl;
	cout << "Value of num is " << num << endl;

	passByValue(num);

	cout << "Back in main and the value num is " << num << endl;

}

void passByValue(int &num1) {
	cout << "In passByValue()" << endl;
	cout << "Value of num1 is " << num1 << endl;

	num1++;

	cout << "num1 is now " << num1 << endl;


}

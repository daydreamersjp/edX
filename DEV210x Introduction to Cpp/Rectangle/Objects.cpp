#include "Rectangle.h"

int main() {
	Rectangle value{};
	Rectangle aggregate{ 4, 7 };
	value.resize(5, 5);
	aggregate.resize(1, 2);
	Rectangle const immutable{ 5, 10 };

	int area_of_value{ value.area() };
	int area_of_aggregate{ aggregate.area() };
	int area_of_immutable{ immutable.area() };

	return 0;
}

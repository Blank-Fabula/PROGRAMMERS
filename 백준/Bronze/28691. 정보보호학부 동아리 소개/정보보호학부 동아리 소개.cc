#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	char c; cin >> c;
	if (c == 'M') { cout << "MatKor";
	} else if (c == 'W') { cout << "WiCys";
	} else if (c == 'C') { cout << "CyKor";
	} else if (c == 'A') { cout << "AlKor";
	} else { cout << "$clear"; }
return 0; }
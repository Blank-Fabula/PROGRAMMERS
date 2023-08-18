#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	ios::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	int result = 0;
	int N; cin >> N;
	for (int i = 0; i < N; i++) {
		int num = i, sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		} if (i + sum == N) { result = i; break; }
	} cout << result;
return 0; }
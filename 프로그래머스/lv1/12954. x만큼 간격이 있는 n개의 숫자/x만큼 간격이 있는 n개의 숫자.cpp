#include <string>
#include <vector>
using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer;
    for (long long sum = x; n--; sum += x) { answer.push_back(sum); }
return answer; }

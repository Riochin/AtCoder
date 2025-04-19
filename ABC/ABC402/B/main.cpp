#include <iostream>
#include <vector>
using namespace std;

int main(){
    int Q;
    cin >> Q;

    int query;
    int x;

    std::vector<int> people;
    for(int i=0;i<Q;i++){
        cin >>query;
        if(query == 1){
            cin >> x;
            people.push_back(x);
        } else {
            cout << *people.begin() << endl;
            people.erase(people.begin());
        }
    }

    return 0;

}
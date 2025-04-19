#include <iostream>
using namespace std;

int main(){
    string s;
    string r;
    cin >> s;
    for(const char& c :s){
        if(isupper(c)){
            r += c;
        }
    }

    cout << r << endl;
    return 0;
}

#include <iostream>
using namespace std;

int main() {

    int numeros[4] = {10, 20, 30, 40};

    cout << "Primer número: " << numeros[0] << endl;

    for (int i = 0; i < 4; i++) {
        cout << numeros[i] << endl;
    }

    return 0;
}

#include <iostream>
#include <vector>
using namespace std;

int main() {

    vector<int> numeros;

    numeros.push_back(10);
    numeros.push_back(20);
    numeros.push_back(30);

    cout << "Primer número: " << numeros[0] << endl;

    for (int num : numeros) {
        cout << num << endl;
    }

    return 0;
}

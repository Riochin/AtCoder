#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    vector<vector<int>> ingredientToDishes(N + 1); // 食材 -> 料理のリスト
    vector<vector<int>> dishes(M); // 料理ごとの食材リスト
    vector<bool> canEat(M, false); // 各料理が食べられるかどうか
    unordered_set<int> dislikedIngredients; // 苦手な食材

    // 苦手な食材を初期化
    for (int i = 1; i <= N; i++) {
        dislikedIngredients.insert(i);
    }

    // 料理の情報を読み込む
    for (int i = 0; i < M; i++) {
        int K;
        cin >> K;
        dishes[i].resize(K);
        for (int j = 0; j < K; j++) {
            cin >> dishes[i][j];
            ingredientToDishes[dishes[i][j]].push_back(i);
        }
    }

    // 克服する食材の順序を読み込む
    vector<int> overcomeOrder(N);
    for (int i = 0; i < N; i++) {
        cin >> overcomeOrder[i];
    }

    // 各日ごとの処理
    for (int day = 0; day < N; day++) {
        int ingredient = overcomeOrder[day];
        dislikedIngredients.erase(ingredient); // 苦手な食材から削除

        // この食材を含む料理をチェック
        for (int dish : ingredientToDishes[ingredient]) {
            if (canEat[dish]) continue; // すでに食べられるならスキップ

            bool canNowEat = true;
            for (int ing : dishes[dish]) {
                if (dislikedIngredients.count(ing)) {
                    canNowEat = false;
                    break;
                }
            }

            if (canNowEat) {
                canEat[dish] = true;
            }
        }

        // 食べられる料理の数をカウント
        int count = 0;
        for (bool eatable : canEat) {
            if (eatable) count++;
        }
        cout << count << endl;
    }

    return 0;
}
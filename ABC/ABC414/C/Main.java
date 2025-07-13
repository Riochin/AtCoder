package ABC.ABC414.C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long N = sc.nextLong();

        long ans = 0;

        List<Long> palindromes = generatePalindromes(N);
        
        for(long palindrome : palindromes) {
            if(palindrome <= N && isPalindrome(toAnumber(palindrome, A))) {
                ans += palindrome;
            }
        }

        sc.close();

        System.out.println(ans);
    }

    public static List<Long> generatePalindromes(long N){
        List<Long> palindromes = new ArrayList<>();
        
        // 1桁の回文数: 1, 2, 3, ..., 9
        for(long i = 1; i <= 9 && i <= N; i++){
            palindromes.add(i);
        }
        
        // 最大桁
        int maxDigits = Long.toString(N).length();
        
        for(int digits = 2; digits <= maxDigits; digits++){
            // 最大桁まで、回文数を作り続ける
            generatePalindromesWithDigits(palindromes, digits, N);
        }
        
        return palindromes;
    }
    
    private static void generatePalindromesWithDigits(List<Long> palindromes, int digits, long N){
        // 前半部分の桁数を計算
        int half = (digits + 1) / 2; // 奇数桁なら真ん中を含む
        
        // 前半部分の最小値と最大値
        long minHalf = (long)Math.pow(10, half -1); // 例: 3桁なら10 (前半2桁)
        long maxHalf = (long)Math.pow(10, half) -1;  // 例: 3桁なら99
        
        for(long h = minHalf; h <= maxHalf; h++){
            // 前半から回文数を構築
            long palindrome = buildPalindrome(h, digits);
            
            if(palindrome > N) break; // Nより大きくなったら終了 桁数でやっちゃってるので
            palindromes.add(palindrome);
        }
    }
    
    private static long buildPalindrome(long half, int totalDigits){
        String halfStr = Long.toString(half);
        StringBuilder sb = new StringBuilder(halfStr);
        
        // 奇数桁の場合は真ん中の文字を除いて反転
        if(totalDigits % 2 == 1){
            // 真ん中の文字を除いて反転して追加
            for(int i = halfStr.length() - 2; i >= 0; i--){
                sb.append(halfStr.charAt(i));
            }
        } else {
            // 偶数桁の場合は全て反転して追加
            for(int i = halfStr.length() - 1; i >= 0; i--){
                sb.append(halfStr.charAt(i));
            }
        }
        
        return Long.parseLong(sb.toString());
    }

    public static boolean isPalindrome(long n){
        String s = Long.toString(n);
        int l = 0, r = s.length()-1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static long toAnumber(long n, long a){
        String s = Long.toString(n, (int)a);
        long i = Long.parseLong(s);
        return i;
    }
}

bool isPalindrome(long long int x) {
    int t = x , mod , c = 0;
    long long int rev = 0;
    while(x != 0){
   mod = x % 10;
   rev = rev*10  + mod;
   x = x / 10;
    }
    if(t < 0) c++;
    if(t == rev && c == 0 ) return true;
    else return false;
}
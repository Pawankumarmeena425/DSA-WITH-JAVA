package com.company;

public class ch19_11_FriendsPairingProblem {
    public static int friendPairing(int n){
        if (n==1||n==2){
            return n;
        }
//        Sigle choice
        int fnm1 = friendPairing(n-1);

//        Pairing choice
        int fnm2 = friendPairing(n-2);
        int totalpairs = (n-1)*fnm2;
//        because a person make paire with one person , but it also make pair with other person its not decide
        return fnm1+totalpairs;

    }
    public static void main(String[] args) {
        System.out.println(friendPairing(15));

    }
}

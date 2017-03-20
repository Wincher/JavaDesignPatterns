package com.wincher.state.voteSateSystem;

/**
 * Created by Wincher on 2017/3/20.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}

package com.wincher.state.voteSateSystem;

/**
 * Created by Wincher on 2017/3/20.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }
}

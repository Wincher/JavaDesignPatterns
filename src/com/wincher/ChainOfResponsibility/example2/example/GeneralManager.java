package com.wincher.ChainOfResponsibility.example2.example;

/**
 * Created by Wincher on 2017/3/15.
 */
public class GeneralManager extends Handler {
    @Override
    String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000){
            if ("张三".equals(user)){
                str = getClass().getName() + "Agree:" + user + "'s fee: " + fee;
            } else {
                str = getClass().getName() + "Disagree:" + user +  "'s fee: " + fee;
            }
        }else{
            if(getSuccessor() != null)
            {
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}

package com.wincher.observer.test;

/**
 * @author Wincher
 * ����۲��߽�ɫ��
 */
public class ConcreteObserver implements Observer{
	 //�۲��ߵ�״̬
	private String observerState;
    
    @Override
    public void update(Subject subject) {
        /**
         * ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("״̬Ϊ��"+observerState);
    }


}

package com.wincher.observer.test;

import java.util.Observable;

/**
 * @author Wincher
 * �ͻ�����
 */
public class Client {
	public static void main(String[] args) {
		//�����������
        ConcreteSubject subject = new ConcreteSubject();
        //�����۲��߶���
        Observer observer = new ConcreteObserver();
        //���۲��߶���Ǽǵ����������
        subject.attach(observer);
        //�ı���������״̬
        subject.change("aaa");
	}
}

package com.wincher.observer.test;

/**
 * @author Wincher
 * ����۲��߽�ɫ��
 */
public interface Observer {
	/**
     * ���½ӿ�
     * @param state    ���µ�״̬
    */
    void update(Subject subject);
}

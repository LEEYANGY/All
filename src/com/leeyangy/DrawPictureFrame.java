package com.leeyangy;

import javax.swing.*;
    //DrawPictureFrame�̳���JFrame
public class DrawPictureFrame extends JFrame {
        /**
         * ���췽��
         */
        public DrawPictureFrame() {
            //ʹ���岻�ܸı��С
            setResizable(false);
            //���ô������
            setTitle("�� ��С����");
            //������Ͻǹر���ͬ����һ��ر�
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //���ô���λ�úͿ��
            setBounds(500,100,574,460);
        }

        public static void main(String[] args) {
            //ʵ��������
            DrawPictureFrame dpf=new DrawPictureFrame();
            //������ʾ����
            dpf.setVisible(true);
        }
}
package com.leeyangy;

//����
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//DrawPictureFrame�̳���JFrame
public class DrawPictureFrame extends JFrame {
    //����һ��8λRGB
        BufferedImage bfimg=new BufferedImage(570,390,BufferedImage.TYPE_INT_BGR);
        //���ͼ��Ļ�ͼ����
        Graphics graphics=bfimg.getGraphics();
        //����ͼ����ת��Ϊ2d��ʽ
        Graphics2D graphics2D=(Graphics2D) graphics;
        //������������
        DrawPictureCanvas drawPictureCanvas=new DrawPictureCanvas();
        //����ǰ��ɫ
        Color foreColor=Color.BLACK;
        Color backupColor=Color.WHITE;


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
            //�����ʼ��
            init();

        }

        private void init(){
            //�ñ���ɫ���û�ͼ�������ɫ
            graphics2D.setColor(backupColor);
            //�ñ���ɫ�����������
            graphics2D.fillRect(0,0,570,390);
            //��ǰ��ɫ���û�ͼ�������ɫ
            graphics2D.setColor(foreColor);
            //���û���ͼ��
            drawPictureCanvas.setImage(bfimg);
            //��������ӵ���������Ĭ�ϲ��ֵ��в�λ��
            getContentPane().add(drawPictureCanvas);
        }
        //���������
        public static void main(String[] args) {
            //ʵ��������
            DrawPictureFrame dpf=new DrawPictureFrame();
            //������ʾ����
            dpf.setVisible(true);
        }
}
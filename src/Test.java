import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {

        //stringname���ļ����·��д��Booleanֵ���true��ֱ���ڵ�ǰ�ļ���׷������false��ԭ�����ļ��滻
        FileOutputStream out = new FileOutputStream("MyJava.java", false);
        out.write(89);
        out.write(65);
        //�ֽ�������
        out.write("���".getBytes());
        out.close();

        //�����ļ�
        FileInputStream fis = new FileInputStream("MyJava.java");
        //��ʼд���ļ�
        /*
        whileѭ������ѭ����������ȡ��len=-1ʱ����
        */
        int len = 0;//��ʼ��,��¼��ȡ�����ֽ�
        while ((len = fis.read()) != -1) {//�жϱ���len�Ƿ����-1len=fis.read()�Ѷ�ȡ�����ֽڸ�ֵ������len
        //�����ֽ���
            System.out.println(len);
        //���char��������
            System.out.println((char) len);
        }
        //�ͷ���Դ
        fis.close();
        System.out.print("���Գɹ���");

        //������һ�ζ�ȡ����ֽڷ���
        FileInputStream fis1 = new FileInputStream("readme.md");
        //Ҫ�����һ���ļ�������Ҫ����һ��byte���͵��������鳤��Ϊ2
        byte[] bytes = new byte[1000];
        //ʹ��read�������������ֽ�����
        int len1 = fis1.read(bytes);
        System.out.println(len1);
        System.out.println(Arrays.toString(bytes));
        System.out.print(new String(bytes));
        fis1.close();

        //�ļ��ĸ���ʵ�֣����ַ���ԭ�������ͬ1.newһ����������ʹ���ֽ��������е�read����������е�write�����Ѷ�ȡ�����ļ�д�뵽Ŀ�ĵ�2.newһ����������ʹ�û��������߿��Կ��ٽ��ļ����Ƶ�ָ��Ŀ�ĵ�
        //
        FileInputStream fis2 = new FileInputStream("readme.md");
        FileOutputStream fos2 = new FileOutputStream("D:\\readme.md");
        //һ�ζ�ȡһ���ֽ�д��һ���ֽ�
        //ʹ�����ֽ������������е�read��ȡ�ļ�
        int len2 = 0;
        while ((len2 = fis2.read()) != -1) {
            fos2.write(len2);
        }
        System.out.print("isok?");

        //�ͷ���Դ(��д�ģ���رգ�ifд���˿϶���ȡ����)
        fos2.close();
        fis2.close();

        //ʹ�����黺���ȡ����ֽڣ�д�����ֽ�
        FileInputStream fis3 = new FileInputStream("readme.md");
        FileOutputStream fos3 = new FileOutputStream("D:\\readme.md");

        byte[] bytes2 = new byte[1024];
        int len3 = 0;
        while ((len3 = fis3.read()) != -1) {
            fos3.write(bytes2, 0, len3);
        }
        fos3.close();
        fis3.close();

        //System.out.print("�ܺ�ʱ:"+(e-s)+"����");
    }
}

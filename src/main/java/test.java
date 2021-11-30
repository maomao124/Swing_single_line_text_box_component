import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing单行文本框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： Swing JTextField：单行文本框组件
 * JTextField()：创建一个默认的文本框。
 * JTextField(String text)：创建一个指定初始化文本信息的文本框。
 * JTextField(int columns)：创建一个指定列数的文本框。
 * JTextField(String text,int columns)：创建一个既指定初始化文本信息，又指定列数的文本框。
 * JTextField类的常用方法
 * 方法名称	说明
 * Dimension getPreferredSize()	获得文本框的首选大小
 * void scrollRectToVisible(Rectangle r)	向左或向右滚动文本框中的内容
 * void setColumns(int columns)	设置文本框最多可显示内容的列数
 * void setFont(Font f)	设置文本框的字体
 * void setScrollOffset(int scrollOffset)	设置文本框的滚动偏移量（以像素为单位）
 * void setHorizontalAlignment(int alignment)	设置文本框内容的水平对齐方式
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("测试");    //创建Frame窗口
        JPanel jPanel = new JPanel();    //创建面板
        JTextField jTextField1 = new JTextField();
        jTextField1.setText("普通文本框");
        JTextField jTextField2 = new JTextField(28);
        jTextField2.setFont(new Font("楷体", Font.BOLD, 16));
        jTextField2.setText("指定长度和字体的文本框");
        JTextField jTextField3 = new JTextField(30);
        jTextField3.setScrollOffset(300);
        jTextField3.setText("居中对齐");
        jTextField3.setHorizontalAlignment(JTextField.CENTER);

        jPanel.add(jTextField1);
        jPanel.add(jTextField2);
        jPanel.add(jTextField3);
        frame.add(jPanel);
        frame.setBounds(300, 200, 600, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

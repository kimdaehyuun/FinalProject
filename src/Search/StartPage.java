package Search;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class StartPage extends JFrame {

	// JPanel ����
	public static JPanel contentPane;

	public StartPage() {
		List li = new List();

		setTitle("���� ���� �˻�");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		contentPane = new JPanel();// ��ư�̳� ���� �� ȭ���� ����
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// �˻� ��ư ����
		JButton btn1 = new JButton("�˻�");
		btn1.setFont(new Font("����", Font.BOLD, 36)); // ��ư �۲� ����
		btn1.setBounds(360, 481, 138, 60); // ��ư ��ġ ����
		contentPane.add(btn1);
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA); // ��ư ���� ����

		JButton btn2 = new JButton("���� ���� �˻�");
		btn2.setFont(new Font("����", Font.BOLD, 36));
		btn2.setBounds(190, 142, 491, 80);
		contentPane.add(btn2);
		btn2.setBackground(Color.gray);
		btn2.setForeground(Color.cyan);

		// ��� �̹��� ����
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\back.jpg"));
		background.setBounds(0, 0, 880, 720);
		contentPane.add(background);

		setVisible(true);

		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));// ��ư ���� ���콺 �����͸� �ø��� Ŀ�� ����� ������ �ٲ�
		btn1.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mousePressed(MouseEvent e) {
				contentPane.removeAll();
				contentPane.revalidate();
				contentPane.repaint();
				li.List_Seoul();
				li.List_Gyeonggido();
				li.List_Incheoncity();
			}
		});
	}
}
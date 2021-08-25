package Search;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class StartPage extends JFrame {

	// JPanel 생성
	public static JPanel contentPane;

	public StartPage() {
		List li = new List();

		setTitle("맛집 정보 검색");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		contentPane = new JPanel();// 버튼이나 라벨이 들어갈 화면을 만듬
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 검색 버튼 생성
		JButton btn1 = new JButton("검색");
		btn1.setFont(new Font("돋움", Font.BOLD, 36)); // 버튼 글꼴 설정
		btn1.setBounds(360, 481, 138, 60); // 버튼 위치 설정
		contentPane.add(btn1);
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA); // 버튼 색상 설정

		JButton btn2 = new JButton("맛집 정보 검색");
		btn2.setFont(new Font("돋움", Font.BOLD, 36));
		btn2.setBounds(190, 142, 491, 80);
		contentPane.add(btn2);
		btn2.setBackground(Color.gray);
		btn2.setForeground(Color.cyan);

		// 배경 이미지 설정
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\back.jpg"));
		background.setBounds(0, 0, 880, 720);
		contentPane.add(background);

		setVisible(true);

		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));// 버튼 위에 마우스 포인터를 올리면 커서 모양을 손으로 바꿈
		btn1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
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
package Search;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

abstract class function extends JFrame {
	public abstract void List_Seoul();

	public abstract void List_Gyeonggi();

	public abstract void List_Incheon();
}

class List extends function {

	@Override
	// 서울 맛집
	public void List_Seoul() {
		JLabel restaurant = new JLabel("서울특별시");
		restaurant.setFont(new Font("돋움", Font.BOLD, 50));
		restaurant.setBounds(80, 90, 400, 50);
		StartPage.contentPane.add(restaurant);
		StartPage.contentPane.setBackground(Color.WHITE);

		JButton box = new JButton();

		// 신촌 합정 맛집 검색창
		JButton SeoBt1 = new JButton("신촌/합정");
		SeoBt1.setBounds(500, 55, 100, 50); // 위치 설정
		SeoBt1.setBackground(Color.orange); // 버튼 색상 설정
		StartPage.contentPane.add(SeoBt1); // 버튼을 추가해줌

		// 버튼을 누르면 해당 창으로 이동
		SeoBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul1();
			}
		});

		// 강남 맛집 검색창
		JButton SeoBt2 = new JButton("강남");
		SeoBt2.setBounds(605, 55, 100, 50);
		SeoBt2.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt2);

		SeoBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul2();
			}
		});

		// 마포 맛집 검색창
		JButton SeoBt3 = new JButton("마포");
		SeoBt3.setBounds(710, 55, 100, 50);
		SeoBt3.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt3);

		SeoBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul3();
			}
		});

		// 영등포 맛집 검색창
		JButton SeoBt4 = new JButton("영등포");
		SeoBt4.setBounds(500, 120, 100, 50);
		SeoBt4.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt4);

		SeoBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul4();
			}
		});

		// 대학로 맛집 검색창
		JButton SeoBt5 = new JButton("대학로");
		SeoBt5.setBounds(605, 120, 100, 50);
		SeoBt5.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt5);

		SeoBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul5();
			}
		});

		// 반포 맛집 검색창
		JButton SeoBt6 = new JButton("반포");
		SeoBt6.setBounds(710, 120, 100, 50);
		SeoBt6.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt6);

		SeoBt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul6();
			}
		});

		// 서울 박스 상세 설정
		box.setForeground(Color.YELLOW);
		box.setEnabled(false);
		box.setBackground(Color.yellow);
		box.setBorderPainted(true);
		box.setBounds(14, 42, 820, 147);
		StartPage.contentPane.add(box);

	}

	// 경기도 맛집
	public void List_Gyeonggido() {
		JLabel restaurant = new JLabel("경기도");
		restaurant.setFont(new Font("돋움", Font.BOLD, 50));
		restaurant.setBounds(80, 275, 400, 50);
		StartPage.contentPane.add(restaurant);

		JButton box = new JButton();

		// 고양 맛집 검색창
		JButton GoBt1 = new JButton("고양");
		GoBt1.setBounds(500, 240, 100, 50);
		GoBt1.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt1);

		GoBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo1();
			}
		});

		// 수원 맛집 검색창
		JButton GoBt2 = new JButton("수원");
		GoBt2.setBounds(605, 240, 100, 50);
		GoBt2.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt2);

		GoBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo2();
			}
		});

		// 의정부 맛집 검색창
		JButton GoBt3 = new JButton("의정부");
		GoBt3.setBounds(710, 240, 100, 50);
		GoBt3.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt3);

		GoBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo3();
			}
		});

		// 안양 맛집 검색창
		JButton GoBt4 = new JButton("안양");
		GoBt4.setBounds(500, 310, 100, 50);
		GoBt4.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt4);

		GoBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo4();
			}
		});

		// 용인 맛집 검색창
		JButton GoBt5 = new JButton("용인");
		GoBt5.setBounds(605, 310, 100, 50);
		GoBt5.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt5);

		GoBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo5();
			}
		});

		// 안산 맛집 검색창
		JButton GoBt6 = new JButton("안산");
		GoBt6.setBounds(710, 310, 100, 50);
		GoBt6.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt6);

		GoBt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo6();
			}
		});

		box.setForeground(Color.YELLOW);
		box.setEnabled(false);
		box.setBackground(Color.LIGHT_GRAY);
		box.setBorderPainted(true);
		box.setBounds(14, 230, 820, 147);
		StartPage.contentPane.add(box);

	}

	public void List_Incheoncity() {
		JLabel restaurant = new JLabel("인천");
		restaurant.setFont(new Font("돋움", Font.BOLD, 50));
		restaurant.setBounds(80, 500, 400, 50);
		StartPage.contentPane.add(restaurant);

		JButton box = new JButton();

		// 부평 맛집 검색창
		JButton InBt1 = new JButton("부평");
		InBt1.setBounds(500, 460, 100, 50);
		InBt1.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt1);

		InBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn1();
			}
		});

		// 강화 맛집 검색창
		JButton InBt2 = new JButton("강화");
		InBt2.setBounds(605, 460, 100, 50);
		InBt2.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt2);

		InBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn2();
			}
		});

		// 송도 맛집 검색창
		JButton InBt3 = new JButton("송도");
		InBt3.setBounds(710, 460, 100, 50);
		InBt3.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt3);

		InBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn3();
			}
		});

		// 월미도 맛집 검색창
		JButton InBt4 = new JButton("월미도");
		InBt4.setBounds(500, 530, 100, 50);
		InBt4.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt4);

		InBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn4();
			}
		});

		// 계양 맛집 검색창
		JButton InBt5 = new JButton("계양");
		InBt5.setBounds(605, 530, 100, 50);
		InBt5.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt5);

		InBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn5();
			}
		});

		// 인천공항 맛집 검색창
		JButton InBt6 = new JButton("인천공항");
		InBt6.setBounds(710, 530, 100, 50);
		InBt6.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt6);

		InBt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn6();
			}
		});

		box.setForeground(Color.blue);
		box.setEnabled(false);
		box.setBackground(Color.CYAN);
		box.setBorderPainted(true);
		box.setBounds(14, 450, 820, 147);
		StartPage.contentPane.add(box);
	}

	@Override
	public void List_Incheon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void List_Gyeonggi() {
		// TODO Auto-generated method stub

	}

}

//신촌 맛집 정보 상세정보창
class newSeoul1 extends JFrame {
	JScrollPane scrollPane; // 배경 이미지 삽입을 위한 설정
	ImageIcon icon;

	newSeoul1() {
		icon = new ImageIcon("src/images/신촌.png");
		setTitle("신촌에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("신촌에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		NewSeoulContainer1.add(NewLabel);

		// 꼬숑 돈까스
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Shincheon = new JButton("꼬숑 돈까스");
		Shincheon.setBounds(600, 300, 100, 50);

		c.add(Shincheon);
		setSize(1000, 800);
		setVisible(true);

		Shincheon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Shin1();
			}
		});

		// 고래파스타
//제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		c.setLayout(null);
		JButton Shincheon2 = new JButton("고래파스타");
		Shincheon2.setBounds(400, 300, 100, 50);

		c.add(Shincheon2);
		setSize(1000, 800);
		setVisible(true);

		Shincheon2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Shin2();
			}
		});

		// 마라탕
//제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		c.setLayout(null);
		JButton Shincheon3 = new JButton("마라탕");
		Shincheon3.setBounds(450, 240, 100, 50);

		c.add(Shincheon3);
		setSize(1000, 800);
		setVisible(true);

		Shincheon2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Shin3();
			}
		});

	}
}

//강남 맛집 정보 상세정보창
class newSeoul2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul2() {
		icon = new ImageIcon("src/images/강남.png");
		setTitle("강남에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("강남에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		NewSeoulContainer1.add(NewLabel);

		// 고기
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Gangnam = new JButton("고기");
		Gangnam.setBounds(600, 300, 100, 50);

		c.add(Gangnam);
		setSize(1000, 800);
		setVisible(true);

		Gangnam.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Gang1();
			}
		});

		// 마라탕
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		c.setLayout(null);
		JButton Gangnam2 = new JButton("마라탕");
		Gangnam2.setBounds(500, 400, 100, 50);

		c.add(Gangnam2);
		setSize(1000, 800);
		setVisible(true);

		Gangnam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Gang2();
			}
		});
		// 쌀국수
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		c.setLayout(null);
		JButton Gangnam3 = new JButton("쌀국수");
		Gangnam3.setBounds(300, 400, 100, 50);

		c.add(Gangnam3);
		setSize(1000, 800);
		setVisible(true);

		Gangnam3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Gang3();
			}
		});
	}
}

//송파 맛집 정보 상세정보창
class newSeoul3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul3() {
		icon = new ImageIcon("src/images/송파.png");
		setTitle("송파에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("송파에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		// 고기
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Songpa1 = new JButton("고기");
		Songpa1.setBounds(600, 300, 100, 50);

		c.add(Songpa1);
		setSize(1000, 800);
		setVisible(true);

		Songpa1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Song1();
			}
		});
		// 파스타
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		c.setLayout(null);
		JButton Songpa2 = new JButton("파스타");
		Songpa2.setBounds(300, 400, 100, 50);

		c.add(Songpa2);
		setSize(1000, 800);
		setVisible(true);

		Songpa2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Song2();
			}
		});
	}
}

//서울숲 맛집 정보 상세정보창
class newSeoul4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul4() {
		icon = new ImageIcon("src/images/서울숲.png");
		setTitle("서울숲에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("서울숲에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		// 샐러드
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Seoulforest1 = new JButton("샐러드");
		Seoulforest1.setBounds(600, 300, 100, 50);

		c.add(Seoulforest1);
		setSize(1000, 800);
		setVisible(true);

		Seoulforest1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Sf1();
			}
		});

		// 경양식
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정

		c.setLayout(null);
		JButton Seoulforest2 = new JButton("경양식");
		Seoulforest2.setBounds(600, 300, 100, 50);

		c.add(Seoulforest2);
		setSize(1000, 800);
		setVisible(true);

		Seoulforest2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Sf2();
			}
		});
	}
}

//대학로 맛집 정보 상세정보창
class newSeoul5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul5() {
		icon = new ImageIcon("src/images/혜화.png");
		setTitle("혜화에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("혜화에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// 라멘
// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Hyehwa1 = new JButton("라멘");
		Hyehwa1.setBounds(200, 300, 100, 50);

		c.add(Hyehwa1);
		setSize(1000, 800);
		setVisible(true);

		Hyehwa1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Hyehwa1();
			}
		});
		// 초밥
// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// 맛집 버튼 설정

		c.setLayout(null);
		JButton Hyehwa2 = new JButton("초밥");
		Hyehwa2.setBounds(150, 200, 100, 50);

		c.add(Hyehwa2);
		setSize(1000, 800);
		setVisible(true);

		Hyehwa2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Hyehwa2();
			}
		});
	}
}

//신사 맛집 정보 상세정보창
class newSeoul6 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul6() {
		icon = new ImageIcon("src/images/신사.png");
		setTitle("신사에 대한 맛집 정보");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("신사에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// 딤섬
//제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Shinsa1 = new JButton("딤섬");
		Shinsa1.setBounds(400, 300, 100, 50);

		c.add(Shinsa1);
		setSize(1000, 800);
		setVisible(true);

		Shinsa1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Shinsa1();
			}
		});
		// 모밀
//제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// 맛집 버튼 설정

		c.setLayout(null);
		JButton Shinsa2 = new JButton("모밀");
		Shinsa2.setBounds(300, 200, 100, 50);

		c.add(Shinsa2);
		setSize(1000, 800);
		setVisible(true);

		Shinsa2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Shinsa2();
			}
		});
	}
}

//고양 맛집 정보 상세정보창
class newGo1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("고양에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		JLabel NewLabel = new JLabel("고양에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f)); // 글씨 크기 설정

		NewGoyangContainer1.add(NewLabel);
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 고양 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Goyang1 = new JButton("아비꼬");
		Goyang1.setBounds(200, 500, 100, 50);

		c.add(Goyang1); // 버튼을 추가해준다
		setSize(1000, 800);
		setVisible(true);

		Goyang1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoMat1();
			}
		});

		// 고양 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Goyang2 = new JButton("순두부집");
		Goyang2.setBounds(400, 300, 100, 50);

		c.add(Goyang2);
		setSize(1000, 800);
		setVisible(true);

		Goyang2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoMat2();
			}
		});

		// 고양 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Goyang3 = new JButton("백두산 갈비");
		Goyang3.setBounds(600, 500, 100, 50);

		c.add(Goyang3);
		setSize(1000, 800);
		setVisible(true);

		Goyang3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoMat3();
			}
		});

		// 고양 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Goyang4 = new JButton("쭈꾸미집");
		Goyang4.setBounds(700, 700, 100, 50);

		c.add(Goyang4);
		setSize(1000, 800);
		setVisible(true);

		Goyang4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoMat4();
			}
		});

	}
}

//수원 맛집 정보 상세정보창
class newGo2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");

		setTitle("수원에 대한 맛집 정보");

		JPanel NewGoyangContainer2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer2);

		JLabel NewLabel = new JLabel("수원에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer2.add(NewLabel);
		// 제목 부분 설정
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 수원 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Suwon1 = new JButton("통닭집");
		Suwon1.setBounds(200, 500, 100, 50);

		c.add(Suwon1);
		setSize(1000, 800);
		setVisible(true);

		Suwon1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SuMat1();
			}
		});

		// 수원 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Suwon2 = new JButton("짜장면집");
		Suwon2.setBounds(600, 600, 100, 50);

		c.add(Suwon2);
		setSize(1000, 800);
		setVisible(true);

		Suwon2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SuMat2();
			}
		});

		// 수원 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Suwon3 = new JButton("파스타집");
		Suwon3.setBounds(250, 130, 100, 50);

		c.add(Suwon3);
		setSize(1000, 800);
		setVisible(true);

		Suwon3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SuMat3();
			}
		});

		// 수원 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Suwon4 = new JButton("순대국집");
		Suwon4.setBounds(550, 250, 100, 50);

		c.add(Suwon4);
		setSize(1000, 800);
		setVisible(true);

		Suwon4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SuMat4();
			}
		});
	}
}

//의정부 맛집 정보 상세정보창
class newGo3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo3() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\jungbu.png");
		setTitle("의정부에 대한 맛집 정보");

		JPanel NewGoyangContainer3 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer3);

		JLabel NewLabel = new JLabel("의정부에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer3.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 의정부 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Jungbu1 = new JButton("부대찌개집");
		Jungbu1.setBounds(200, 500, 100, 50);

		c.add(Jungbu1);
		setSize(1000, 800);
		setVisible(true);

		Jungbu1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JungMat1();
			}
		});

		// 의정부 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Jungbu2 = new JButton("매운탕집");
		Jungbu2.setBounds(300, 400, 100, 50);

		c.add(Jungbu2);
		setSize(1000, 800);
		setVisible(true);

		Jungbu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JungMat2();
			}
		});

		// 의정부 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Jungbu3 = new JButton("생선구이집");
		Jungbu3.setBounds(600, 100, 100, 50);

		c.add(Jungbu3);
		setSize(1000, 800);
		setVisible(true);

		Jungbu3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JungMat3();
			}
		});

		// 의정부 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Jungbu4 = new JButton("내장탕집");
		Jungbu4.setBounds(700, 600, 100, 50);

		c.add(Jungbu4);
		setSize(1000, 800);
		setVisible(true);

		Jungbu4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JungMat4();
			}
		});
	}
}

//안양 맛집 정보 상세정보창
class newGo4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo4() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\anyang.png");
		setTitle("안양에 대한 맛집 정보");

		JPanel NewGoyangContainer4 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer4);

		JLabel NewLabel = new JLabel("안양에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer4.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 안양 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Anyang1 = new JButton("꼬리곰탕집");
		Anyang1.setBounds(200, 500, 100, 50);

		c.add(Anyang1);
		setSize(1000, 800);
		setVisible(true);

		Anyang1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnMat1();
			}
		});

		// 안양 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Anyang2 = new JButton("장어구이집");
		Anyang2.setBounds(400, 400, 100, 50);

		c.add(Anyang2);
		setSize(1000, 800);
		setVisible(true);

		Anyang2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnMat2();
			}
		});

		// 안양 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Anyang3 = new JButton("마라탕집");
		Anyang3.setBounds(300, 100, 100, 50);

		c.add(Anyang3);
		setSize(1000, 800);
		setVisible(true);

		Anyang3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnMat3();
			}
		});

		// 안양 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Anyang4 = new JButton("수제비집");
		Anyang4.setBounds(200, 700, 100, 50);

		c.add(Anyang4);
		setSize(1000, 800);
		setVisible(true);

		Anyang4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnMat4();
			}
		});
	}
}

//용인 맛집 정보 상세정보창
class newGo5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo5() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\yongin.png");
		setTitle("용인에 대한 맛집 정보");

		JPanel NewGoyangContainer5 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer5);

		JLabel NewLabel = new JLabel("용인에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer5.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 용인 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Yongin1 = new JButton("칼국수집");
		Yongin1.setBounds(200, 500, 100, 50);

		c.add(Yongin1);
		setSize(1000, 800);
		setVisible(true);

		Yongin1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new YongMat1();
			}
		});

		// 용인 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Yongin2 = new JButton("아구찜집");
		Yongin2.setBounds(400, 700, 100, 50);

		c.add(Yongin2);
		setSize(1000, 800);
		setVisible(true);

		Yongin2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new YongMat2();
			}
		});

		// 용인 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Yongin3 = new JButton("해물탕집");
		Yongin3.setBounds(500, 250, 100, 50);

		c.add(Yongin3);
		setSize(1000, 800);
		setVisible(true);

		Yongin3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new YongMat3();
			}
		});

		// 용인 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Yongin4 = new JButton("숯불구이집");
		Yongin4.setBounds(600, 150, 100, 50);

		c.add(Yongin4);
		setSize(1000, 800);
		setVisible(true);

		Yongin4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new YongMat4();
			}
		});
	}
}

//안산 맛집 정보 상세정보창
class newGo6 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo6() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\ansan.png");
		setTitle("안산에 대한 맛집 정보");

		JPanel NewGoyangContainer6 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer6);

		JLabel NewLabel = new JLabel("안산에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer6.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 안산 맛집 첫번째 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton Ansan1 = new JButton("비빔국수집");
		Ansan1.setBounds(200, 500, 100, 50);

		c.add(Ansan1);
		setSize(1000, 800);
		setVisible(true);

		Ansan1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnsMat1();
			}
		});

		// 안산 맛집 두번째 버튼 설정
		c.setLayout(null);
		JButton Ansan2 = new JButton("일본식덮밥집");
		Ansan2.setBounds(400, 700, 130, 50);

		c.add(Ansan2);
		setSize(1000, 800);
		setVisible(true);

		Ansan2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnsMat2();
			}
		});

		// 안산 맛집 세번째 버튼 설정
		c.setLayout(null);
		JButton Ansan3 = new JButton("라멘집");
		Ansan3.setBounds(500, 250, 100, 50);

		c.add(Ansan3);
		setSize(1000, 800);
		setVisible(true);

		Ansan3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnsMat3();
			}
		});

		// 안산 맛집 네번째 버튼 설정
		c.setLayout(null);
		JButton Ansan4 = new JButton("우동집");
		Ansan4.setBounds(600, 600, 100, 50);

		c.add(Ansan4);
		setSize(1000, 800);
		setVisible(true);

		Ansan4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AnsMat4();
			}
		});
	}
}

//부평 맛집 정보 상세정보창
class newIn1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn1() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\부평.jpg");
		setTitle("부평에 대한 맛집 정보");
		JPanel NewIn1Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn1Container1);

		JLabel NewLabel = new JLabel("부평에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("로니로티");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("아메리칸트레이");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("곱창이 좋다");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("파스타맛있다");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In1Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In1Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In1Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In1Mat4();
			}
		});
	}

}

//강화 맛집 정보 상세정보창
class newIn2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn2() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\강화.jpg");
		setTitle("강화에 대한 맛집 정보");
		JPanel NewIn2Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn2Container1);

		JLabel NewLabel = new JLabel("강화에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("아구아구");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("오늘은 닭");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("낙곱새");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("칼국수 맛집");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In2Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In2Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In2Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In2Mat4();
			}
		});
	}

}

//송도 맛집 정보 상세정보창
class newIn3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn3() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\송도.jpg");
		setTitle("송도에 대한 맛집 정보");
		JPanel NewIn3Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn3Container1);

		JLabel NewLabel = new JLabel("송도에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("해산물 맛집");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("찌개찌개");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("마라탕탕탕");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("초밥 맛집");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In3Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In3Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In3Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In3Mat4();
			}
		});
	}

}

//월미도 맛집 정보 상세정보창
class newIn4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn4() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\월미도.jpg");
		setTitle("월미도에 대한 맛집 정보");
		JPanel NewIn4Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn4Container1);

		JLabel NewLabel = new JLabel("월미도에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("해산물 맛집");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("물회 맛집");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("칼국수 맛집");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("초밥 맛집");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In4Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In4Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In4Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In4Mat4();
			}
		});
	}

}

//계양 맛집 정보 상세정보창
class newIn5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn5() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\계양.jpg");
		setTitle("계양에 대한 맛집 정보");
		JPanel NewIn5Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn5Container1);

		JLabel NewLabel = new JLabel("계양에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("닭볽음탕 맛집");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("인도 카레 맛집");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("부대찌개 맛집");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("양고기 맛집");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In5Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In5Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In5Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In5Mat4();
			}
		});
	}

}

//신촌 맛집 꼬숑돈까스 상세 소개
class Shin1 extends JFrame {
	Shin1() {
		setTitle("꼬숑 돈까스에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("꼬숑 돈까스에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신촌 맛집 고래파스타 상세 소개
class Shin2 extends JFrame {
	Shin2() {
		setTitle("고래파스타에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("고래파스타에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신촌 맛집 마라탕 상세 소개
class Shin3 extends JFrame {
	Shin3() {
		setTitle("마라탕에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("마라탕에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신촌 맛집 고기 상세 소개
class Gang1 extends JFrame {
	Gang1() {
		setTitle("고기집에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("고기집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신촌 맛집 마라탕 상세 소개
class Gang2 extends JFrame {
	Gang2() {
		setTitle("마라탕에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("마라탕에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신촌 맛집 쌀국수 상세 소개
class Gang3 extends JFrame {
	Gang3() {
		setTitle("쌀국수에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("쌀국수에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//송파 맛집 마라탕 상세 소개
class Song1 extends JFrame {
	Song1() {
		setTitle("고기집에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("고기집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//송파 맛집 파스타 상세 소개
class Song2 extends JFrame {
	Song2() {
		setTitle("파스타에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("파스타에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//서울숲 맛집 샐러드 상세 소개
class Sf1 extends JFrame {
	Sf1() {
		setTitle("샐러드에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("샐러드에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//서울숲 맛집 경양식 상세 소개
class Sf2 extends JFrame {
	Sf2() {
		setTitle("경양식 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("경양식에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//혜화 맛집 라멘 상세 소개
class Hyehwa1 extends JFrame {
	Hyehwa1() {
		setTitle("라멘에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("라멘에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//혜화 맛집 초밥 상세 소개
class Hyehwa2 extends JFrame {
	Hyehwa2() {
		setTitle("초밥에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("초밥에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//신사 맛집 딤섬 상세 소개
class Shinsa1 extends JFrame {
	Shinsa1() {
		setTitle("딤섬에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("딤섬에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//혜화 맛집 모밀 상세 소개
class Shinsa2 extends JFrame {
	Shinsa2() {
		setTitle("모밀에 대한 맛집 정보");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("모밀에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class newIn6 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn6() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\부천.jpg");
		setTitle("부천에 대한 맛집 정보");
		JPanel NewIn5Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn5Container1);

		JLabel NewLabel = new JLabel("부천에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// 맛집 버튼 설정
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("닭볽음탕 맛집");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("인도 카레 맛집");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("부대찌개 맛집");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("양고기 맛집");
		e.setBounds(550, 600, 100, 50);

		c.add(a);
		c.add(b);
		c.add(d);
		c.add(e);
		setSize(1000, 800);
		setVisible(true);

		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In6Mat1();
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In6Mat2();
			}
		});
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In6Mat3();
			}
		});
		e.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new In6Mat4();
			}
		});
	}

}

//고양 맛집 아비꼬 상세 소개
class GoMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat1() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\goyang.png");
		setTitle("아비꼬에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("아비꼬에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\curry.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 고양시 서정마을2로6</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>돈부리 / 일본 카레 / 벤토</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>카레라이스</th><td>기본 카레라이스<br>버섯 카레라이스</td></tr>\r\n"
						+ "<tr><th>카레 우동</th><td>기본 카레우동<br>버섯 카레우동</td></tr>\r\n"
						+ "<tr><th>크림 카레 파스타</th><td>기본크림카레파스타<br>버섯크림카레파스타</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//고양 맛집 순두부집 상세 소개
class GoMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("고양에 대한 맛집 정보");
		setTitle("순두부집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("순두부집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\dubu.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 고양시 일산서구 대화동</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>순두부찌개, 된장찌개</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>순두부찌개</th><td>순두부찌개<br>곱창 순두부찌개</td></tr>\r\n"
						+ "<tr><th>된장찌개</th><td>기본 된장찌개<br>차돌박이 된장찌개</td></tr>\r\n"
						+ "<tr><th>김치찌개</th><td>돼지고기 김치찌개<br>참치 김치찌개</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//고양 맛집 백두산 갈비집 상세 소개
class GoMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("백두산 갈비집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("백두산에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\galbi.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 고양시 일산동구 백석동</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>돼지갈비 / 소갈비 / 냉면</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>돼지</th><td>돼지갈비<br>삼겹살</td></tr>\r\n" + "<tr><th>소</th><td>소갈비살<br>꽃등심</td></tr>\r\n"
						+ "<tr><th>냉면</th><td>물냉면<br>비빔냉면</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//고양 맛집 쭈꾸미집 상세 소개
class GoMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("쭈꾸미집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("쭈꾸미집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ggumi.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 고양시 일산서구 주엽동</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>쭈꾸미 / 도토리묵 / 파전</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>볶음</th><td>쭈꾸미볶음<br>제육볶음</td></tr>\r\n" + "<tr><th>전</th><td>해물파전<br>김치전</td></tr>\r\n"
						+ "<tr><th>묵</th><td>도토리묵<br>밤묵</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//수원 맛집 통닭집 상세 소개
class SuMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("통닭집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("통닭집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\chicken.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 권선구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>후라이드 / 양념 통닭</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>통닭</th><td>후라이드 통닭<br>양념 통닭</td></tr>\r\n"
						+ "<tr><th>기타 메뉴</th><td>골뱅이무침<br>노가리구이</td></tr>\r\n"
						+ "<tr><th>주류</th><td>소주<br>맥주<br>막걸리</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//수원 맛집 짜장면집 상세 소개
class SuMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("짜장면집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("짜장면집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\zzazang.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 장안구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>짜장면 / 짬뽕 / 탕수육</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>면</th><td>짜장면<br>짬뽕</td></tr>\r\n" + "<tr><th>밥</th><td>볶음밥<br>잠채밥</td></tr>\r\n"
						+ "<tr><th>튀김</th><td>탕수육<br>유린기</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//수원 맛집 파스타집 상세 소개
class SuMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("파스타집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("파스타집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\pasta.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 영통구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>토마토/크림파스타/알리오올리오</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>토마토</th><td>해물 토마토 파스타<br>베이컨 토마토 파스타</td></tr>\r\n"
						+ "<tr><th>크림</th><td>베이컨 크림 파스타<br>해물 크림 파스타</td></tr>\r\n"
						+ "<tr><th>오일</th><td>알리오올리오<br>봉골레</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//수원 맛집 순대국집 상세 소개
class SuMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("순대국집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("순대국집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\soondae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 팔달구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>짜장면 / 짬뽕 / 탕수육</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>순대국</th><td>순대국밥<br>얼큰순대국</td></tr>\r\n"
						+ "<tr><th>해장국</th><td>뼈해장국<br>소머리곰탕</td></tr>\r\n"
						+ "<tr><th>전골</th><td>순대소곱창전골<br>순대볶음</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//의정부 맛집 부대찌개집 상세 소개
class JungMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("부대찌개집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("부대찌개집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\boodae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 의정부시 백석로</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>부대찌개/치즈부대찌개</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>부대찌개</th><td>부대찌개<br>치즈부대찌개</td></tr>\r\n"
						+ "<tr><th>전골</th><td>낙곱새<br>우곱새</td></tr>\r\n"
						+ "<tr><th>음료</th><td>콜라<br>사이다</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//의정부 맛집 매운탕집 상세 소개
class JungMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("매운탕집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("매운탕집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\maeun.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 의정부시 녹양역</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>매운탕/광어회/산낙지</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>싯가</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>회</th><td>광어회<br>우럭회</td></tr>\r\n" + "<tr><th>매운탕</th><td>우럭매운탕<br>광어매운탕</td></tr>\r\n"
						+ "<tr><th>산낙지</th><td>낙지탕탕이<br>낙지호롱구이</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//의정부 맛집 생선구이집 상세 소개
class JungMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("생선구이집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("생선구이집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\fish.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 의정부시 동일로</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>조기구이/굴비구이/삼치구이</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>생선구이</th><td>조기구이<br>굴비구이</td></tr>\r\n"
						+ "<tr><th>순대</th><td>오징어순대<br>아바이순대</td></tr>\r\n"
						+ "<tr><th>술</th><td>소주<br>막걸리</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//의정부 맛집 내장탕집 상세 소개
class JungMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("내장탕집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("내장탕집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\najang.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 의정부시 장곡로</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>내장탕/황태해장국/선지해장국</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>국밥</th><td>내장탕<br>황태해장국</td></tr>\r\n" + "<tr><th>수육</th><td>돼지수육<br>보쌈특</td></tr>\r\n"
						+ "<tr><th>술</th><td>소주<br>맥주</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안양 맛집 꼬리곰탕집 상세 소개
class AnMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("꼬리곰탕집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("꼬리곰탕집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ggori.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안양시 만안구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>꼬리곰탕/도가니탕/수육</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>탕</th><td>꼬리곰탕<br>도가니탕</td></tr>\r\n" + "<tr><th>수육</th><td>모듬수육<br>꼬리수육</td></tr>\r\n"
						+ "<tr><th>술</th><td>소주<br>막걸리</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안양 맛집 장어구이집 상세 소개
class AnMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("장어구이집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("장어구이집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\janga.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안양시 동안구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>장어구이/회</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>3만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>장어</th><td>장어구이<br>양념장어구이</td></tr>\r\n" + "<tr><th>회</th><td>아나고회<br>모듬회</td></tr>\r\n"
						+ "<tr><th>낙지</th><td>산낙지<br>낙지탕탕이</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안양 맛집 마라탕집 상세 소개
class AnMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("마라탕집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("마라탕집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\mara.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안양시 달안로</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>마라탕/마라샹궈/꿔바로우</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>마라탕</th><td>마라탕</td></tr>\r\n" + "<tr><th>마라샹궈</th><td>마라샹궈</td></tr>\r\n"
						+ "<tr><th>꿔바로우</th><td>꿔바로우<br>미니꿔바로우</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안양 맛집 수제비집 상세 소개
class AnMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("수제비집에 대한 맛집 정보");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("수제비집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\soojae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안양시 시민대로</td></tr>\r\n"
						+ "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>수제비/칼국수/왕만두</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>수제비</th><td>얼큰수제비<br>김치수제비</td></tr>\r\n"
						+ "<tr><th>칼국수</th><td>팥칼국수<br>바지락칼국수</td></tr>\r\n"
						+ "<tr><th>만두</th><td>왕만두<br>물만두</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//용인 맛집 칼국수집 상세 소개
class YongMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("칼국수집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("칼국수집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\kal.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 용인시 처인구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>칼국수/수제비/왕만두</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>칼국수</th><td>버섯칼국수<br>얼큰칼국수</td></tr>\r\n"
						+ "<tr><th>수제비</th><td>들깨수재비<br>팥수제비</td></tr>\r\n"
						+ "<tr><th>만두</th><td>왕만두<br>군만두</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//용인 맛집 아구찜집 상세 소개
class YongMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("아구찜집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("아구찜집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\agu.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 용인시 남사면</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>아구찜/쭈꾸미찜/볶음밥</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>찜</th><td>아구찜<br>쭈꾸미찜</td></tr>\r\n" + "<tr><th>볶음밥</th><td>볶음밥</tr>\r\n"
						+ "<tr><th>술</th><td>복분자<br>소주</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//용인 맛집 해물탕집 상세 소개
class YongMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("해물탕집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("해물탕집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\haemol.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 용인시 남동</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>해물탕/해물찜/볶음밥</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>3만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>해물</th><td>해물탕<br>해물찜</td></tr>\r\n" + "<tr><th>회</th><td>전복회<br>광어회</td></tr>\r\n"
						+ "<tr><th>볶음밥</th><td>볶음밥</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//용인 맛집 숯불구이집 상세 소개
class YongMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("숯불구이집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("숯불구이집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\sotbol.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 용인시 마장면</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>돼지고기/소고기/오리고기</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>돼지</th><td>돼지갈비<br>삼겹살</td></tr>\r\n" + "<tr><th>소</th><td>소갈비<br>소등심</td></tr>\r\n"
						+ "<tr><th>오리</th><td>오리로스<br>오리구이</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안산 맛집 비빔국수집 상세 소개
class AnsMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("비빔국수집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("비빔국수집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\bibim.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안산시 상록구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>비빔국수/잔치국수/왕만두</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>국수</th><td>비빔국수<br>잔치국수</td></tr>\r\n" + "<tr><th>만두</th><td>왕만두<br>물만두</td></tr>\r\n"
						+ "<tr><th>돈까스</th><td>어린이돈까스<br>왕돈까스</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안산 맛집 일본식덮밥집 상세 소개
class AnsMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("일본식덮밥집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("일본식덮밥집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\gyudong.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 안산시 월피동</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>규동/부타동/오나기동</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>2만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>덮밥</th><td>규동<br>오나기동</td></tr>\r\n"
						+ "<tr><th>파스타</th><td>명란오일파스타<br>우니파스타</td></tr>\r\n"
						+ "<tr><th>사케</th><td>간바레오토상<br>신사케</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안산 맛집 라멘집 상세 소개
class AnsMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("라멘집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("라멘집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ramen.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 장안구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>돈코츠,미소 라멘</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>라멘</th><td>돈코츠라멘<br>미소라멘</td></tr>\r\n" + "<tr><th>우동</th><td>어묵우동<br>튀김우동</td></tr>\r\n"
						+ "<tr><th>소바</th><td>판메밀<br>냉모밀</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//안산 맛집 우동집 상세 소개
class AnsMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("우동집에 대한 맛집 정보");
		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);

		JLabel NewLabel = new JLabel("우동집에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\udon.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>식당 상세 정보</caption><tbody><tr>"
						+ "<th>주소</th><td>경기도 수원시 장안구</td></tr>\r\n" + "<tr><th>전화번호</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>음식 종류</th><td><span>어묵우동/튀김우동</span></td></tr>\r\n"
						+ "<tr><th>가격대</th><td>만원 미만</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">영업시간</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>메뉴판</caption><tbody><tr>\r\n"
						+ "<th>우동</th><td>어묵우동<br>튀김우동</td></tr>\r\n"
						+ "<tr><th>라멘</th><td>소유라멘<br>블랙쇼우라멘</td></tr>\r\n"
						+ "<tr><th>소바</th><td>마제소바<br>메밀소바</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>찾아오는 길</caption><tbody><tr>\r\n"
						+ "<th>지하철</th><td>ㅇㅇ역에서 도보 6분</td></tr>\r\n"
						+ "<tr><th>버스</th><td>ㅇㅇ아파트에서 700번 탑승</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat1 extends JFrame {
	In1Mat1() {
		setTitle("로니로티에 대한 맛집 정보");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("로니로티에 대한 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//고양 맛집 아비꼬 상세 소개
class In1Mat2 extends JFrame {
	In1Mat2() {
		setTitle("아메리칸트레이에 대한 맛집 정보");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("아메리칸트레이 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat3 extends JFrame {
	In1Mat3() {
		setTitle("곱창이 좋다 맛집 정보");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("곱창이 좋다 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat4 extends JFrame {
	In1Mat4() {
		setTitle("파스타 맛있다에 대한 맛집 정보");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("파스타 맛있다 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat1 extends JFrame {
	In2Mat1() {
		setTitle("아구아구 맛집 정보");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("아구아구 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 고양 맛집 아비꼬 상세 소개
class In2Mat2 extends JFrame {
	In2Mat2() {
		setTitle("오늘은 닭 맛집 정보");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("오늘은 닭 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat3 extends JFrame {
	In2Mat3() {
		setTitle("낙곱새 맛집 정보");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("낙곱새 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat4 extends JFrame {
	In2Mat4() {
		setTitle("칼국수 맛집 정보");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("칼국수 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In3Mat1 extends JFrame {
	In3Mat1() {
		setTitle("해산물 맛집 정보");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("해산물 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 찌개 맛집 상세 소개
class In3Mat2 extends JFrame {
	In3Mat2() {
		setTitle("찌개 맛집 정보");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("찌개 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In3Mat3 extends JFrame {
	In3Mat3() {
		setTitle("마라탕탕탕 맛집 정보");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("마라탕탕탕 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 초밥 맛집 정보
class In3Mat4 extends JFrame {
	In3Mat4() {
		setTitle("초밥 맛집 정보");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("초밥 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In4Mat1 extends JFrame {
	In4Mat1() {
		setTitle("해산물 맛집 정보");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("해산물 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 물 상세 소개
class In4Mat2 extends JFrame {
	In4Mat2() {
		setTitle("물회 맛집 정보");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("물회 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 초밥 맛집 소개
class In4Mat3 extends JFrame {
	In4Mat3() {
		setTitle("초밥 맛집 정보");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("초밥 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 칼국수 맛집 소개
class In4Mat4 extends JFrame {
	In4Mat4() {
		setTitle("칼국수 맛집 정보");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("칼국수 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 닭볽음탕 맛집 소개
class In5Mat1 extends JFrame {
	In5Mat1() {
		setTitle("닭볽음탕 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("닭볽음탕 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 인도 카레 아비꼬 상세 소개
class In5Mat2 extends JFrame {
	In5Mat2() {
		setTitle("인도 카레 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("인도 카레 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 부대찌개 맛집 소개
class In5Mat3 extends JFrame {
	In5Mat3() {
		setTitle("부대찌개 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("부대찌개 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 양고기 맛집 소개
class In5Mat4 extends JFrame {
	In5Mat4() {
		setTitle("양고기 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("양고기 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 닭볽음탕 맛집 소개
class In6Mat1 extends JFrame {
	In6Mat1() {
		setTitle("닭볽음탕 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("닭볽음탕 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 인도 카레 아비꼬 상세 소개
class In6Mat2 extends JFrame {
	In6Mat2() {
		setTitle("인도 카레 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("인도 카레 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 부대찌개 맛집 소개
class In6Mat3 extends JFrame {
	In6Mat3() {
		setTitle("부대찌개 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("부대찌개 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// 양고기 맛집 소개
class In6Mat4 extends JFrame {
	In6Mat4() {
		setTitle("양고기 맛집 정보");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("양고기 맛집 정보");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}
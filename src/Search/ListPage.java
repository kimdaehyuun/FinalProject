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
	// ���� ����
	public void List_Seoul() {
		JLabel restaurant = new JLabel("����Ư����");
		restaurant.setFont(new Font("����", Font.BOLD, 50));
		restaurant.setBounds(80, 90, 400, 50);
		StartPage.contentPane.add(restaurant);
		StartPage.contentPane.setBackground(Color.WHITE);

		JButton box = new JButton();

		// ���� ���� ���� �˻�â
		JButton SeoBt1 = new JButton("����/����");
		SeoBt1.setBounds(500, 55, 100, 50); // ��ġ ����
		SeoBt1.setBackground(Color.orange); // ��ư ���� ����
		StartPage.contentPane.add(SeoBt1); // ��ư�� �߰�����

		// ��ư�� ������ �ش� â���� �̵�
		SeoBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul1();
			}
		});

		// ���� ���� �˻�â
		JButton SeoBt2 = new JButton("����");
		SeoBt2.setBounds(605, 55, 100, 50);
		SeoBt2.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt2);

		SeoBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul2();
			}
		});

		// ���� ���� �˻�â
		JButton SeoBt3 = new JButton("����");
		SeoBt3.setBounds(710, 55, 100, 50);
		SeoBt3.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt3);

		SeoBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul3();
			}
		});

		// ������ ���� �˻�â
		JButton SeoBt4 = new JButton("������");
		SeoBt4.setBounds(500, 120, 100, 50);
		SeoBt4.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt4);

		SeoBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul4();
			}
		});

		// ���з� ���� �˻�â
		JButton SeoBt5 = new JButton("���з�");
		SeoBt5.setBounds(605, 120, 100, 50);
		SeoBt5.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt5);

		SeoBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul5();
			}
		});

		// ���� ���� �˻�â
		JButton SeoBt6 = new JButton("����");
		SeoBt6.setBounds(710, 120, 100, 50);
		SeoBt6.setBackground(Color.orange);
		StartPage.contentPane.add(SeoBt6);

		SeoBt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newSeoul6();
			}
		});

		// ���� �ڽ� �� ����
		box.setForeground(Color.YELLOW);
		box.setEnabled(false);
		box.setBackground(Color.yellow);
		box.setBorderPainted(true);
		box.setBounds(14, 42, 820, 147);
		StartPage.contentPane.add(box);

	}

	// ��⵵ ����
	public void List_Gyeonggido() {
		JLabel restaurant = new JLabel("��⵵");
		restaurant.setFont(new Font("����", Font.BOLD, 50));
		restaurant.setBounds(80, 275, 400, 50);
		StartPage.contentPane.add(restaurant);

		JButton box = new JButton();

		// ��� ���� �˻�â
		JButton GoBt1 = new JButton("���");
		GoBt1.setBounds(500, 240, 100, 50);
		GoBt1.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt1);

		GoBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo1();
			}
		});

		// ���� ���� �˻�â
		JButton GoBt2 = new JButton("����");
		GoBt2.setBounds(605, 240, 100, 50);
		GoBt2.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt2);

		GoBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo2();
			}
		});

		// ������ ���� �˻�â
		JButton GoBt3 = new JButton("������");
		GoBt3.setBounds(710, 240, 100, 50);
		GoBt3.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt3);

		GoBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo3();
			}
		});

		// �Ⱦ� ���� �˻�â
		JButton GoBt4 = new JButton("�Ⱦ�");
		GoBt4.setBounds(500, 310, 100, 50);
		GoBt4.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt4);

		GoBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo4();
			}
		});

		// ���� ���� �˻�â
		JButton GoBt5 = new JButton("����");
		GoBt5.setBounds(605, 310, 100, 50);
		GoBt5.setBackground(Color.gray);
		StartPage.contentPane.add(GoBt5);

		GoBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newGo5();
			}
		});

		// �Ȼ� ���� �˻�â
		JButton GoBt6 = new JButton("�Ȼ�");
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
		JLabel restaurant = new JLabel("��õ");
		restaurant.setFont(new Font("����", Font.BOLD, 50));
		restaurant.setBounds(80, 500, 400, 50);
		StartPage.contentPane.add(restaurant);

		JButton box = new JButton();

		// ���� ���� �˻�â
		JButton InBt1 = new JButton("����");
		InBt1.setBounds(500, 460, 100, 50);
		InBt1.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt1);

		InBt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn1();
			}
		});

		// ��ȭ ���� �˻�â
		JButton InBt2 = new JButton("��ȭ");
		InBt2.setBounds(605, 460, 100, 50);
		InBt2.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt2);

		InBt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn2();
			}
		});

		// �۵� ���� �˻�â
		JButton InBt3 = new JButton("�۵�");
		InBt3.setBounds(710, 460, 100, 50);
		InBt3.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt3);

		InBt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn3();
			}
		});

		// ���̵� ���� �˻�â
		JButton InBt4 = new JButton("���̵�");
		InBt4.setBounds(500, 530, 100, 50);
		InBt4.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt4);

		InBt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn4();
			}
		});

		// ��� ���� �˻�â
		JButton InBt5 = new JButton("���");
		InBt5.setBounds(605, 530, 100, 50);
		InBt5.setBackground(Color.GREEN);
		StartPage.contentPane.add(InBt5);

		InBt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new newIn5();
			}
		});

		// ��õ���� ���� �˻�â
		JButton InBt6 = new JButton("��õ����");
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

//���� ���� ���� ������â
class newSeoul1 extends JFrame {
	JScrollPane scrollPane; // ��� �̹��� ������ ���� ����
	ImageIcon icon;

	newSeoul1() {
		icon = new ImageIcon("src/images/����.png");
		setTitle("���̿� ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���̿� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		NewSeoulContainer1.add(NewLabel);

		// ���� ���
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Shincheon = new JButton("���� ���");
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

		// ���Ľ�Ÿ
//���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		c.setLayout(null);
		JButton Shincheon2 = new JButton("���Ľ�Ÿ");
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

		// ������
//���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		c.setLayout(null);
		JButton Shincheon3 = new JButton("������");
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

//���� ���� ���� ������â
class newSeoul2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul2() {
		icon = new ImageIcon("src/images/����.png");
		setTitle("������ ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		NewSeoulContainer1.add(NewLabel);

		// ���
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Gangnam = new JButton("���");
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

		// ������
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		c.setLayout(null);
		JButton Gangnam2 = new JButton("������");
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
		// �ұ���
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		c.setLayout(null);
		JButton Gangnam3 = new JButton("�ұ���");
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

//���� ���� ���� ������â
class newSeoul3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul3() {
		icon = new ImageIcon("src/images/����.png");
		setTitle("���Ŀ� ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���Ŀ� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		// ���
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Songpa1 = new JButton("���");
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
		// �Ľ�Ÿ
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		c.setLayout(null);
		JButton Songpa2 = new JButton("�Ľ�Ÿ");
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

//���｣ ���� ���� ������â
class newSeoul4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul4() {
		icon = new ImageIcon("src/images/���｣.png");
		setTitle("���｣�� ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���｣�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		// ������
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Seoulforest1 = new JButton("������");
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

		// ����
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����

		c.setLayout(null);
		JButton Seoulforest2 = new JButton("����");
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

//���з� ���� ���� ������â
class newSeoul5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul5() {
		icon = new ImageIcon("src/images/��ȭ.png");
		setTitle("��ȭ�� ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("��ȭ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// ���
// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Hyehwa1 = new JButton("���");
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
		// �ʹ�
// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// ���� ��ư ����

		c.setLayout(null);
		JButton Hyehwa2 = new JButton("�ʹ�");
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

//�Ż� ���� ���� ������â
class newSeoul6 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newSeoul6() {
		icon = new ImageIcon("src/images/�Ż�.png");
		setTitle("�Ż翡 ���� ���� ����");
		JPanel NewSeoulContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�Ż翡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// ����
//���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Shinsa1 = new JButton("����");
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
		// ���
//���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
		// ���� ��ư ����

		c.setLayout(null);
		JButton Shinsa2 = new JButton("���");
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

//��� ���� ���� ������â
class newGo1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("��翡 ���� ���� ����");

		JPanel NewGoyangContainer1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer1);

		JLabel NewLabel = new JLabel("��翡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f)); // �۾� ũ�� ����

		NewGoyangContainer1.add(NewLabel);
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ��� ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Goyang1 = new JButton("�ƺ�");
		Goyang1.setBounds(200, 500, 100, 50);

		c.add(Goyang1); // ��ư�� �߰����ش�
		setSize(1000, 800);
		setVisible(true);

		Goyang1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoMat1();
			}
		});

		// ��� ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Goyang2 = new JButton("���κ���");
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

		// ��� ���� ����° ��ư ����
		c.setLayout(null);
		JButton Goyang3 = new JButton("��λ� ����");
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

		// ��� ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Goyang4 = new JButton("�޲ٹ���");
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

//���� ���� ���� ������â
class newGo2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");

		setTitle("������ ���� ���� ����");

		JPanel NewGoyangContainer2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewGoyangContainer2);

		JLabel NewLabel = new JLabel("������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer2.add(NewLabel);
		// ���� �κ� ����
		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Suwon1 = new JButton("�����");
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

		// ���� ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Suwon2 = new JButton("¥�����");
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

		// ���� ���� ����° ��ư ����
		c.setLayout(null);
		JButton Suwon3 = new JButton("�Ľ�Ÿ��");
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

		// ���� ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Suwon4 = new JButton("���뱹��");
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

//������ ���� ���� ������â
class newGo3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo3() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\jungbu.png");
		setTitle("�����ο� ���� ���� ����");

		JPanel NewGoyangContainer3 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer3);

		JLabel NewLabel = new JLabel("�����ο� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer3.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ������ ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Jungbu1 = new JButton("�δ����");
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

		// ������ ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Jungbu2 = new JButton("�ſ�����");
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

		// ������ ���� ����° ��ư ����
		c.setLayout(null);
		JButton Jungbu3 = new JButton("����������");
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

		// ������ ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Jungbu4 = new JButton("��������");
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

//�Ⱦ� ���� ���� ������â
class newGo4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo4() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\anyang.png");
		setTitle("�Ⱦ翡 ���� ���� ����");

		JPanel NewGoyangContainer4 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer4);

		JLabel NewLabel = new JLabel("�Ⱦ翡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer4.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// �Ⱦ� ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Anyang1 = new JButton("����������");
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

		// �Ⱦ� ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Anyang2 = new JButton("������");
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

		// �Ⱦ� ���� ����° ��ư ����
		c.setLayout(null);
		JButton Anyang3 = new JButton("��������");
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

		// �Ⱦ� ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Anyang4 = new JButton("��������");
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

//���� ���� ���� ������â
class newGo5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo5() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\yongin.png");
		setTitle("���ο� ���� ���� ����");

		JPanel NewGoyangContainer5 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer5);

		JLabel NewLabel = new JLabel("���ο� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer5.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Yongin1 = new JButton("Į������");
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

		// ���� ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Yongin2 = new JButton("�Ʊ�����");
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

		// ���� ���� ����° ��ư ����
		c.setLayout(null);
		JButton Yongin3 = new JButton("�ع�����");
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

		// ���� ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Yongin4 = new JButton("���ұ�����");
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

//�Ȼ� ���� ���� ������â
class newGo6 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newGo6() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\ansan.png");
		setTitle("�Ȼ꿡 ���� ���� ����");

		JPanel NewGoyangContainer6 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		setContentPane(NewGoyangContainer6);

		JLabel NewLabel = new JLabel("�Ȼ꿡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewGoyangContainer6.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// �Ȼ� ���� ù��° ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton Ansan1 = new JButton("���������");
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

		// �Ȼ� ���� �ι�° ��ư ����
		c.setLayout(null);
		JButton Ansan2 = new JButton("�Ϻ��ĵ�����");
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

		// �Ȼ� ���� ����° ��ư ����
		c.setLayout(null);
		JButton Ansan3 = new JButton("�����");
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

		// �Ȼ� ���� �׹�° ��ư ����
		c.setLayout(null);
		JButton Ansan4 = new JButton("�쵿��");
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

//���� ���� ���� ������â
class newIn1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn1() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\����.jpg");
		setTitle("���� ���� ���� ����");
		JPanel NewIn1Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn1Container1);

		JLabel NewLabel = new JLabel("���� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�δϷ�Ƽ");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("�Ƹ޸�ĭƮ����");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("��â�� ����");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("�Ľ�Ÿ���ִ�");
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

//��ȭ ���� ���� ������â
class newIn2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn2() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\��ȭ.jpg");
		setTitle("��ȭ�� ���� ���� ����");
		JPanel NewIn2Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn2Container1);

		JLabel NewLabel = new JLabel("��ȭ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�Ʊ��Ʊ�");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("������ ��");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("������");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("Į���� ����");
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

//�۵� ���� ���� ������â
class newIn3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn3() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\�۵�.jpg");
		setTitle("�۵��� ���� ���� ����");
		JPanel NewIn3Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn3Container1);

		JLabel NewLabel = new JLabel("�۵��� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�ػ깰 ����");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("��");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("����������");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("�ʹ� ����");
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

//���̵� ���� ���� ������â
class newIn4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn4() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\���̵�.jpg");
		setTitle("���̵��� ���� ���� ����");
		JPanel NewIn4Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn4Container1);

		JLabel NewLabel = new JLabel("���̵��� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�ػ깰 ����");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("��ȸ ����");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("Į���� ����");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("�ʹ� ����");
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

//��� ���� ���� ������â
class newIn5 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	newIn5() {
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\���.jpg");
		setTitle("��翡 ���� ���� ����");
		JPanel NewIn5Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn5Container1);

		JLabel NewLabel = new JLabel("��翡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�ߓ����� ����");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("�ε� ī�� ����");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("�δ�� ����");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("���� ����");
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

//���� ���� ������� �� �Ұ�
class Shin1 extends JFrame {
	Shin1() {
		setTitle("���� ����� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���� ����� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ���Ľ�Ÿ �� �Ұ�
class Shin2 extends JFrame {
	Shin2() {
		setTitle("���Ľ�Ÿ�� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���Ľ�Ÿ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ������ �� �Ұ�
class Shin3 extends JFrame {
	Shin3() {
		setTitle("�������� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ��� �� �Ұ�
class Gang1 extends JFrame {
	Gang1() {
		setTitle("������� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ������ �� �Ұ�
class Gang2 extends JFrame {
	Gang2() {
		setTitle("�������� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� �ұ��� �� �Ұ�
class Gang3 extends JFrame {
	Gang3() {
		setTitle("�ұ����� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�ұ����� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ������ �� �Ұ�
class Song1 extends JFrame {
	Song1() {
		setTitle("������� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� �Ľ�Ÿ �� �Ұ�
class Song2 extends JFrame {
	Song2() {
		setTitle("�Ľ�Ÿ�� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�Ľ�Ÿ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���｣ ���� ������ �� �Ұ�
class Sf1 extends JFrame {
	Sf1() {
		setTitle("�����忡 ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�����忡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//���｣ ���� ���� �� �Ұ�
class Sf2 extends JFrame {
	Sf2() {
		setTitle("���� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("���Ŀ� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//��ȭ ���� ��� �� �Ұ�
class Hyehwa1 extends JFrame {
	Hyehwa1() {
		setTitle("��࿡ ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("��࿡ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//��ȭ ���� �ʹ� �� �Ұ�
class Hyehwa2 extends JFrame {
	Hyehwa2() {
		setTitle("�ʹ信 ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("�ʹ信 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//�Ż� ���� ���� �� �Ұ�
class Shinsa1 extends JFrame {
	Shinsa1() {
		setTitle("������ ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewSeoulContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//��ȭ ���� ��� �� �Ұ�
class Shinsa2 extends JFrame {
	Shinsa2() {
		setTitle("��п� ���� ���� ����");

		JPanel NewSeoulContainer1 = new JPanel();
		setContentPane(NewSeoulContainer1);

		JLabel NewLabel = new JLabel("��п� ���� ���� ����");
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
		icon = new ImageIcon("C:\\Users\\96dyd\\Desktop\\��õ.jpg");
		setTitle("��õ�� ���� ���� ����");
		JPanel NewIn5Container1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}

		};
		setContentPane(NewIn5Container1);

		JLabel NewLabel = new JLabel("��õ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5Container1.add(NewLabel);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);

		// ���� ��ư ����
		Container c = getContentPane();
		c.setLayout(null);
		JButton a = new JButton("�ߓ����� ����");
		a.setBounds(500, 390, 100, 50);

		JButton b = new JButton("�ε� ī�� ����");
		b.setBounds(600, 250, 100, 50);

		JButton d = new JButton("�δ�� ����");
		d.setBounds(570, 400, 100, 50);

		JButton e = new JButton("���� ����");
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

//��� ���� �ƺ� �� �Ұ�
class GoMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat1() {
		icon = new ImageIcon("C:\\\\Users\\\\KDH\\\\Pictures\\\\Camera Roll\\\\goyang.png");
		setTitle("�ƺ񲿿� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�ƺ񲿿� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\curry.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���� ��������2��6</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>���θ� / �Ϻ� ī�� / ����</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>ī�����̽�</th><td>�⺻ ī�����̽�<br>���� ī�����̽�</td></tr>\r\n"
						+ "<tr><th>ī�� �쵿</th><td>�⺻ ī���쵿<br>���� ī���쵿</td></tr>\r\n"
						+ "<tr><th>ũ�� ī�� �Ľ�Ÿ</th><td>�⺻ũ��ī���Ľ�Ÿ<br>����ũ��ī���Ľ�Ÿ</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//��� ���� ���κ��� �� �Ұ�
class GoMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("��翡 ���� ���� ����");
		setTitle("���κ����� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("���κ����� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\dubu.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���� �ϻ꼭�� ��ȭ��</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>���κ��, �����</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>���κ��</th><td>���κ��<br>��â ���κ��</td></tr>\r\n"
						+ "<tr><th>�����</th><td>�⺻ �����<br>�������� �����</td></tr>\r\n"
						+ "<tr><th>��ġ�</th><td>������� ��ġ�<br>��ġ ��ġ�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//��� ���� ��λ� ������ �� �Ұ�
class GoMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("��λ� �������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("��λ꿡 ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\galbi.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���� �ϻ굿�� �鼮��</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�������� / �Ұ��� / �ø�</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>��������<br>����</td></tr>\r\n" + "<tr><th>��</th><td>�Ұ����<br>�ɵ��</td></tr>\r\n"
						+ "<tr><th>�ø�</th><td>���ø�<br>����ø�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//��� ���� �޲ٹ��� �� �Ұ�
class GoMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	GoMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\goyang.png");
		setTitle("�޲ٹ����� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�޲ٹ����� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ggumi.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���� �ϻ꼭�� �ֿ���</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�޲ٹ� / ���丮�� / ����</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>�޲ٹ̺���<br>��������</td></tr>\r\n" + "<tr><th>��</th><td>�ع�����<br>��ġ��</td></tr>\r\n"
						+ "<tr><th>��</th><td>���丮��<br>�㹬</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ����� �� �Ұ�
class SuMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\chicken.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ �Ǽ���</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�Ķ��̵� / ��� ���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>���</th><td>�Ķ��̵� ���<br>��� ���</td></tr>\r\n"
						+ "<tr><th>��Ÿ �޴�</th><td>����̹�ħ<br>�밡������</td></tr>\r\n"
						+ "<tr><th>�ַ�</th><td>����<br>����<br>���ɸ�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ¥����� �� �Ұ�
class SuMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("¥������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("¥������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\zzazang.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ ��ȱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>¥��� / «�� / ������</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>��</th><td>¥���<br>«��</td></tr>\r\n" + "<tr><th>��</th><td>������<br>��ä��</td></tr>\r\n"
						+ "<tr><th>Ƣ��</th><td>������<br>������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� �Ľ�Ÿ�� �� �Ұ�
class SuMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("�Ľ�Ÿ���� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�Ľ�Ÿ���� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\pasta.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ ���뱸</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�丶��/ũ���Ľ�Ÿ/�˸����ø���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>�丶��</th><td>�ع� �丶�� �Ľ�Ÿ<br>������ �丶�� �Ľ�Ÿ</td></tr>\r\n"
						+ "<tr><th>ũ��</th><td>������ ũ�� �Ľ�Ÿ<br>�ع� ũ�� �Ľ�Ÿ</td></tr>\r\n"
						+ "<tr><th>����</th><td>�˸����ø���<br>����</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ���뱹�� �� �Ұ�
class SuMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	SuMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\suwon.png");
		setTitle("���뱹���� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("���뱹���� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\soondae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ �ȴޱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>¥��� / «�� / ������</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>���뱹</th><td>���뱹��<br>��ū���뱹</td></tr>\r\n"
						+ "<tr><th>���屹</th><td>�����屹<br>�ҸӸ�����</td></tr>\r\n"
						+ "<tr><th>����</th><td>����Ұ�â����<br>���뺺��</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//������ ���� �δ���� �� �Ұ�
class JungMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("�δ������ ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�δ������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\boodae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �����ν� �鼮��</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�δ��/ġ��δ��</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>�δ��</th><td>�δ��<br>ġ��δ��</td></tr>\r\n"
						+ "<tr><th>����</th><td>������<br>�����</td></tr>\r\n"
						+ "<tr><th>����</th><td>�ݶ�<br>���̴�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//������ ���� �ſ����� �� �Ұ�
class JungMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("�ſ������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�ſ������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\maeun.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �����ν� ��翪</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�ſ���/����ȸ/�곫��</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>�˰�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>ȸ</th><td>����ȸ<br>�췰ȸ</td></tr>\r\n" + "<tr><th>�ſ���</th><td>�췰�ſ���<br>����ſ���</td></tr>\r\n"
						+ "<tr><th>�곫��</th><td>����������<br>����ȣ�ձ���</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//������ ���� ���������� �� �Ұ�
class JungMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("������������ ���� ���� ����");

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

		JLabel NewLabel = new JLabel("������������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\fish.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �����ν� ���Ϸ�</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>���ⱸ��/������/��ġ����</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>��������</th><td>���ⱸ��<br>������</td></tr>\r\n"
						+ "<tr><th>����</th><td>��¡�����<br>�ƹ��̼���</td></tr>\r\n"
						+ "<tr><th>��</th><td>����<br>���ɸ�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//������ ���� �������� �� �Ұ�
class JungMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	JungMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\jungbu.png");
		setTitle("���������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("���������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\najang.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �����ν� ����</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>������/Ȳ�����屹/�������屹</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>������<br>Ȳ�����屹</td></tr>\r\n" + "<tr><th>����</th><td>��������<br>����Ư</td></tr>\r\n"
						+ "<tr><th>��</th><td>����<br>����</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ⱦ� ���� ���������� �� �Ұ�
class AnMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("������������ ���� ���� ����");

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

		JLabel NewLabel = new JLabel("������������ ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ggori.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ⱦ�� ���ȱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>��������/��������/����</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>��</th><td>��������<br>��������</td></tr>\r\n" + "<tr><th>����</th><td>������<br>��������</td></tr>\r\n"
						+ "<tr><th>��</th><td>����<br>���ɸ�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ⱦ� ���� ������ �� �Ұ�
class AnMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("�������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("�������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\janga.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ⱦ�� ���ȱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>����/ȸ</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>3���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>���</th><td>����<br>�������</td></tr>\r\n" + "<tr><th>ȸ</th><td>�Ƴ���ȸ<br>���ȸ</td></tr>\r\n"
						+ "<tr><th>����</th><td>�곫��<br>����������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ⱦ� ���� �������� �� �Ұ�
class AnMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("���������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("���������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\mara.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ⱦ�� �޾ȷ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>������/���󼧱�/��ٷο�</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>������</th><td>������</td></tr>\r\n" + "<tr><th>���󼧱�</th><td>���󼧱�</td></tr>\r\n"
						+ "<tr><th>��ٷο�</th><td>��ٷο�<br>�̴ϲ�ٷο�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ⱦ� ���� �������� �� �Ұ�
class AnMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\anyang.png");
		setTitle("���������� ���� ���� ����");

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

		JLabel NewLabel = new JLabel("���������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\soojae.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ⱦ�� �ùδ��</td></tr>\r\n"
						+ "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>������/Į����/�ո���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>������</th><td>��ū������<br>��ġ������</td></tr>\r\n"
						+ "<tr><th>Į����</th><td>��Į����<br>������Į����</td></tr>\r\n"
						+ "<tr><th>����</th><td>�ո���<br>������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� Į������ �� �Ұ�
class YongMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("Į�������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("Į�������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\kal.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���ν� ó�α�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>Į����/������/�ո���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>Į����</th><td>����Į����<br>��ūĮ����</td></tr>\r\n"
						+ "<tr><th>������</th><td>��������<br>�ϼ�����</td></tr>\r\n"
						+ "<tr><th>����</th><td>�ո���<br>������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� �Ʊ����� �� �Ұ�
class YongMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("�Ʊ������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("�Ʊ������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\agu.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���ν� �����</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�Ʊ���/�޲ٹ���/������</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>��</th><td>�Ʊ���<br>�޲ٹ���</td></tr>\r\n" + "<tr><th>������</th><td>������</tr>\r\n"
						+ "<tr><th>��</th><td>������<br>����</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� �ع����� �� �Ұ�
class YongMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("�ع������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("�ع������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\haemol.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���ν� ����</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�ع���/�ع���/������</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>3���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>�ع�</th><td>�ع���<br>�ع���</td></tr>\r\n" + "<tr><th>ȸ</th><td>����ȸ<br>����ȸ</td></tr>\r\n"
						+ "<tr><th>������</th><td>������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//���� ���� ���ұ����� �� �Ұ�
class YongMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	YongMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\yongin.png");
		setTitle("���ұ������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("���ұ������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\sotbol.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ���ν� �����</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�������/�Ұ��/�������</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>��������<br>����</td></tr>\r\n" + "<tr><th>��</th><td>�Ұ���<br>�ҵ��</td></tr>\r\n"
						+ "<tr><th>����</th><td>�����ν�<br>��������</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ȼ� ���� ��������� �� �Ұ�
class AnsMat1 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat1() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("����������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("����������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(35.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\bibim.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ȼ�� ��ϱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�������/��ġ����/�ո���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>�������<br>��ġ����</td></tr>\r\n" + "<tr><th>����</th><td>�ո���<br>������</td></tr>\r\n"
						+ "<tr><th>���</th><td>��̵��<br>�յ��</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ȼ� ���� �Ϻ��ĵ����� �� �Ұ�
class AnsMat2 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat2() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("�Ϻ��ĵ������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("�Ϻ��ĵ������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(30.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\gyudong.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ �Ȼ�� ���ǵ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>�Ե�/��Ÿ��/�����⵿</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>2���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>����</th><td>�Ե�<br>�����⵿</td></tr>\r\n"
						+ "<tr><th>�Ľ�Ÿ</th><td>��������Ľ�Ÿ<br>����Ľ�Ÿ</td></tr>\r\n"
						+ "<tr><th>����</th><td>���ٷ������<br>�Ż���</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ȼ� ���� ����� �� �Ұ�
class AnsMat3 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat3() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("������� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("������� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ramen.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ ��ȱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>������,�̼� ���</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>���</th><td>���������<br>�̼Ҷ��</td></tr>\r\n" + "<tr><th>�쵿</th><td>��쵿<br>Ƣ��쵿</td></tr>\r\n"
						+ "<tr><th>�ҹ�</th><td>�Ǹ޹�<br>�ø��</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

//�Ȼ� ���� �쵿�� �� �Ұ�
class AnsMat4 extends JFrame {
	JScrollPane scrollPane;
	ImageIcon icon;

	AnsMat4() {
		icon = new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\ansan.png");
		setTitle("�쵿���� ���� ���� ����");
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

		JLabel NewLabel = new JLabel("�쵿���� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));
		c.add(NewLabel);

		JLabel NewLabel5 = new JLabel("");
		c.add(NewLabel5);

		JLabel NewLabel2 = new JLabel("");
		NewLabel2.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel2);
		NewLabel2.setIcon(new ImageIcon("C:\\Users\\KDH\\Pictures\\Camera Roll\\udon.png"));

		JLabel NewLabel3 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�Ĵ� �� ����</caption><tbody><tr>"
						+ "<th>�ּ�</th><td>��⵵ ������ ��ȱ�</td></tr>\r\n" + "<tr><th>��ȭ��ȣ</th><td>031-323-4349</td></tr>\r\n"
						+ "<tr><th>���� ����</th><td><span>��쵿/Ƣ��쵿</span></td></tr>\r\n"
						+ "<tr><th>���ݴ�</th><td>���� �̸�</td></tr>"
						+ "<tr><th style=\"vertical-align:top;\">�����ð�</th><td>10:30 - 22:00</td></tr></tbody></table></body></html>");
		NewLabel3.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel3);

		JLabel NewLabel4 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>�޴���</caption><tbody><tr>\r\n"
						+ "<th>�쵿</th><td>��쵿<br>Ƣ��쵿</td></tr>\r\n"
						+ "<tr><th>���</th><td>�������<br>�������</td></tr>\r\n"
						+ "<tr><th>�ҹ�</th><td>�����ҹ�<br>�޹мҹ�</td></tr></tbody></table></body></html>");
		NewLabel4.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel4);

		JLabel NewLabel6 = new JLabel(
				"<html><body><table border = '1' width = '400' bgcolor='white'><caption>ã�ƿ��� ��</caption><tbody><tr>\r\n"
						+ "<th>����ö</th><td>���������� ���� 6��</td></tr>\r\n"
						+ "<tr><th>����</th><td>��������Ʈ���� 700�� ž��</td></tbody></table></body></html>");
		NewLabel6.setFont(NewLabel.getFont().deriveFont(20.0f));
		c.add(NewLabel6);

		setSize(1000, 800);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat1 extends JFrame {
	In1Mat1() {
		setTitle("�δϷ�Ƽ�� ���� ���� ����");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("�δϷ�Ƽ�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

//��� ���� �ƺ� �� �Ұ�
class In1Mat2 extends JFrame {
	In1Mat2() {
		setTitle("�Ƹ޸�ĭƮ���̿� ���� ���� ����");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("�Ƹ޸�ĭƮ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat3 extends JFrame {
	In1Mat3() {
		setTitle("��â�� ���� ���� ����");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("��â�� ���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In1Mat4 extends JFrame {
	In1Mat4() {
		setTitle("�Ľ�Ÿ ���ִٿ� ���� ���� ����");

		JPanel NewIn1MatContainer1 = new JPanel();
		setContentPane(NewIn1MatContainer1);

		JLabel NewLabel = new JLabel("�Ľ�Ÿ ���ִ� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn1MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat1 extends JFrame {
	In2Mat1() {
		setTitle("�Ʊ��Ʊ� ���� ����");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("�Ʊ��Ʊ� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// ��� ���� �ƺ� �� �Ұ�
class In2Mat2 extends JFrame {
	In2Mat2() {
		setTitle("������ �� ���� ����");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("������ �� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat3 extends JFrame {
	In2Mat3() {
		setTitle("������ ���� ����");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("������ ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In2Mat4 extends JFrame {
	In2Mat4() {
		setTitle("Į���� ���� ����");

		JPanel NewIn2MatContainer1 = new JPanel();
		setContentPane(NewIn2MatContainer1);

		JLabel NewLabel = new JLabel("Į���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn2MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In3Mat1 extends JFrame {
	In3Mat1() {
		setTitle("�ػ깰 ���� ����");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("�ػ깰 ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// � ���� �� �Ұ�
class In3Mat2 extends JFrame {
	In3Mat2() {
		setTitle("� ���� ����");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In3Mat3 extends JFrame {
	In3Mat3() {
		setTitle("���������� ���� ����");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("���������� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ʹ� ���� ����
class In3Mat4 extends JFrame {
	In3Mat4() {
		setTitle("�ʹ� ���� ����");

		JPanel NewIn3MatContainer1 = new JPanel();
		setContentPane(NewIn3MatContainer1);

		JLabel NewLabel = new JLabel("�ʹ� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn3MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

class In4Mat1 extends JFrame {
	In4Mat1() {
		setTitle("�ػ깰 ���� ����");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("�ػ깰 ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �� �� �Ұ�
class In4Mat2 extends JFrame {
	In4Mat2() {
		setTitle("��ȸ ���� ����");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("��ȸ ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ʹ� ���� �Ұ�
class In4Mat3 extends JFrame {
	In4Mat3() {
		setTitle("�ʹ� ���� ����");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("�ʹ� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// Į���� ���� �Ұ�
class In4Mat4 extends JFrame {
	In4Mat4() {
		setTitle("Į���� ���� ����");

		JPanel NewIn4MatContainer1 = new JPanel();
		setContentPane(NewIn4MatContainer1);

		JLabel NewLabel = new JLabel("Į���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn4MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ߓ����� ���� �Ұ�
class In5Mat1 extends JFrame {
	In5Mat1() {
		setTitle("�ߓ����� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�ߓ����� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ε� ī�� �ƺ� �� �Ұ�
class In5Mat2 extends JFrame {
	In5Mat2() {
		setTitle("�ε� ī�� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�ε� ī�� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �δ�� ���� �Ұ�
class In5Mat3 extends JFrame {
	In5Mat3() {
		setTitle("�δ�� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�δ�� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// ���� ���� �Ұ�
class In5Mat4 extends JFrame {
	In5Mat4() {
		setTitle("���� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ߓ����� ���� �Ұ�
class In6Mat1 extends JFrame {
	In6Mat1() {
		setTitle("�ߓ����� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�ߓ����� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �ε� ī�� �ƺ� �� �Ұ�
class In6Mat2 extends JFrame {
	In6Mat2() {
		setTitle("�ε� ī�� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�ε� ī�� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// �δ�� ���� �Ұ�
class In6Mat3 extends JFrame {
	In6Mat3() {
		setTitle("�δ�� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("�δ�� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}

// ���� ���� �Ұ�
class In6Mat4 extends JFrame {
	In6Mat4() {
		setTitle("���� ���� ����");

		JPanel NewIn5MatContainer1 = new JPanel();
		setContentPane(NewIn5MatContainer1);

		JLabel NewLabel = new JLabel("���� ���� ����");
		NewLabel.setFont(NewLabel.getFont().deriveFont(40.0f));

		NewIn5MatContainer1.add(NewLabel);

		setSize(1000, 600);
		setResizable(false);
		setVisible(true);
	}
}
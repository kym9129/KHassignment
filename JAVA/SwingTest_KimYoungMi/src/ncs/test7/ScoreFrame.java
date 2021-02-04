package ncs.test7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {

	JTextField javaScore, sqlScore;
	JTextField total, average;
	JButton calcBtn;

	public ScoreFrame() {
		setTitle("문제 7");
		setBounds(0, 0, 500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setVisible(true);

		JPanel north = new JPanel();
		JPanel northTop = new JPanel(); // title
		JPanel northBottom = new JPanel(); // 자바, SQL textField
		JPanel center = new JPanel(); // 계산하기 BTN
		JPanel south = new JPanel(); // 총점, 평균 textField

		JLabel titleLabel = new JLabel("점수를 입력하세요");
		titleLabel.setFont(new Font("./font/NanumGothic.ttf", Font.PLAIN, 30));
		titleLabel.setBounds(0, 0, 500, 100);

		JLabel javaLabel = new JLabel("자바: ");
		javaScore = new JTextField(10);
		JLabel sqlLabel = new JLabel("SQL: ");
		sqlScore = new JTextField(10);
		calcBtn = new JButton("계산하기");
		JLabel totalLabel = new JLabel("총점: ");
		total = new JTextField(10);
		JLabel avrgLabel = new JLabel("평균: ");
		average = new JTextField(10);

		ActionHandler listener = new ActionHandler();
		calcBtn.addActionListener(listener);

		north.setLayout(new BorderLayout());
		north.add(northTop, BorderLayout.NORTH);
		north.add(northBottom);
		northTop.add(titleLabel);
		northBottom.add(javaLabel);
		northBottom.add(javaScore);
		northBottom.add(sqlLabel);
		northBottom.add(sqlScore);

		center.add(calcBtn);

		south.add(totalLabel);
		south.add(total);
		south.add(avrgLabel);
		south.add(average);

		add(north, BorderLayout.NORTH);
		add(center);
		add(south, BorderLayout.SOUTH);
		pack();

	}

	public class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("clicked!");
			String temp = javaScore.getText();
			int javaScore = Integer.parseInt(temp);
			String temp2 = sqlScore.getText();
			int sqlScore = Integer.parseInt(temp2);

			int totalValue = javaScore + sqlScore;
			total.setText(Integer.toString(totalValue));
			int avrgValue = totalValue / 2;
			average.setText(Integer.toString(avrgValue));

		}
	}
}

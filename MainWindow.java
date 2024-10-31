package todolist;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;

public class MainWindow {

    private JFrame frame;
    private JLabel lblNewLabel;
    private JTextField[] txtTasks = new JTextField[5];
    private JCheckBox[] chckbxTasks = new JCheckBox[5];
    private JLabel[] lblCompletedTasks = new JLabel[5];

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainWindow() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Start");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(btnNewButton);
                lblNewLabel.setVisible(false);

                for (int i = 0; i < 5; i++) {
                    chckbxTasks[i].setVisible(true);
                    txtTasks[i].setVisible(true);
                }

                frame.revalidate();
                frame.repaint();
            }
        });
        btnNewButton.setBounds(107, 95, 218, 76);
        frame.getContentPane().add(btnNewButton);

        lblNewLabel = new JLabel("Open To-Do List");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(139, 11, 158, 35);
        frame.getContentPane().add(lblNewLabel);

        for (int i = 0; i < 5; i++) {
            chckbxTasks[i] = new JCheckBox("Task " + (i + 1) + ": ");
            chckbxTasks[i].setBounds(30, 60 + i * 40, 80, 23);
            chckbxTasks[i].setVisible(false);
            frame.getContentPane().add(chckbxTasks[i]);

            txtTasks[i] = new JTextField();
            txtTasks[i].setBounds(170, 60 + i * 40, 130, 25); // Adjusted text field position accordingly
            txtTasks[i].setColumns(10);
            txtTasks[i].setVisible(false);
            frame.getContentPane().add(txtTasks[i]);
            
            
            lblCompletedTasks[i] = new JLabel("");
            lblCompletedTasks[i].setBounds(250, 60 + i * 40, 200, 25);
            lblCompletedTasks[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblCompletedTasks[i].setVisible(false);
            frame.getContentPane().add(lblCompletedTasks[i]);

            int index = i;
            chckbxTasks[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (chckbxTasks[index].isSelected()) {
                        String taskText = txtTasks[index].getText();
                        lblCompletedTasks[index].setText("Completed: " + taskText);
                        lblCompletedTasks[index].setVisible(true);
                    } else {
                        lblCompletedTasks[index].setVisible(false);
                    }
                }
            });
        }

        JButton btnClearAll = new JButton("Clear All");
        btnClearAll.setBounds(160, 300, 120, 30);
        frame.getContentPane().add(btnClearAll);

        btnClearAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 5; i++) {
                    txtTasks[i].setText("");
                    chckbxTasks[i].setSelected(false);
                    lblCompletedTasks[i].setVisible(false);
                    
                    
                }
                echo "# TestToDoList" >> README.md
                		git init
                		git add README.md
                		git commit -m "first commit"
                		git branch -M main
                		git remote add origin https://github.com/ryalu999/TestToDoList.git
                		git push -u origin main
            }
            
        });
    }
}

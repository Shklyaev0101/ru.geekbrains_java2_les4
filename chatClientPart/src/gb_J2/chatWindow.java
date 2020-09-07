package gb_J2;
/*  1.  Создать окно для клиентской части чата:
    1.1.большое текстовое поле для отображения переписки в центре окна;
    1.2.однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели;
    1.3.сообщение отсылаетсся по нажатию кнопки на форме, либо по нажатию кнопки Enter;
    1.4.при "отсылке" сообщение перекидывается из нижнего поля в центральное.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chatWindow extends JFrame {
        public chatWindow() {
            setTitle("itsChat");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(0, 0, 500, 500);

                // многострочное текстовое поле для отображения переписки
                JTextArea jta = new JTextArea();
                JScrollPane jsp = new JScrollPane(jta);
                add(jsp,BorderLayout.CENTER);

                JPanel bottomPanel = new JPanel(new BorderLayout());
                add(bottomPanel, BorderLayout.SOUTH);

                // однострочное текстовое поле для отображения переписки
                JTextField jtf = new JTextField();
                bottomPanel.add(jtf,BorderLayout.CENTER);

                JButton jbSendMessage = new JButton("Отправить");
                bottomPanel.add(jbSendMessage,BorderLayout.EAST);


                jtf.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jtf.setText(jta.getText());
                    }
                });

            setVisible(true);
        }
        
}
    

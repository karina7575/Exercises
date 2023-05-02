import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class SignIn
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Sign in" );
        frame.setSize( 300, 300 );
        Scanner in = new Scanner(System.in);
        String mes = in.nextLine();

        JButton button = new JButton("Enter");
        button.setBounds(140, 10, 10, 10);

        JTextField login = new JTextField("Login");
        JTextField password = new JTextField("Password");

        frame.add( new HelloComponent2( mes ) );
        frame.add(BorderLayout.SOUTH, button); // Adds Button to content pane of frame
        frame.add(login);
        frame.add(password);

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
}
class HelloComponent2 extends JComponent
        implements MouseMotionListener
{
    String theMessage;
    int messageX = 125, messageY = 95; // Координаты сообщения
    public HelloComponent2( String message ) {
        theMessage = message;
        addMouseMotionListener( this );
    }
    public void paintComponent( Graphics g ) {
        g.drawString( theMessage, messageX, messageY );
    }
    public void mouseDragged( MouseEvent e ) {
// Сохранить координаты мыши и перерисовать текст сообщения
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }
    public void mouseMoved( MouseEvent e ) { }
}

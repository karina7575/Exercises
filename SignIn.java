import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class SignIn
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Sign in" );
        Scanner in = new Scanner(System.in);
        String mes = in.nextLine();
        frame.add( new HelloComponent2( mes ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        JButton button = new JButton("Enter");
        //button.setSize(10, 10);
        frame.add(BorderLayout.PAGE_END, button); // Adds Button to content pane of frame
        button.setSize(10, 10);
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

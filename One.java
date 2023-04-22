import javax.swing.*;
public class One
{
        public static void main( String[] args ) {
            JFrame frame = new JFrame( "Hello, Java!" );
            JFrame window = new JFrame( "I'm rock!" );
            JLabel label = new JLabel( "Hello, Java!");
            JLabel label1 = new JLabel( "How are you?");
            label.setBounds(50, 50, 100, 30);
            frame.add( label );
            label1.setBounds(50, 100, 100, 30);
            window.add( label1 );
            frame.setSize( 300, 300 );
            window.setSize( 300, 300 );
            frame.setLayout(null);
            window.setLayout(null);
            frame.setVisible( true );
            window.setVisible( true );
        }

}

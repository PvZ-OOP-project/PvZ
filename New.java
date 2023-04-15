import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class New{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,10,10)); // 9 rows , 1 column , 10 , 10 khoảng cách giữa các components
        // nếu số lượng vượt quá số ô chia thì nó sẽ tự tạo thêm như có 10 button mà có 3 rows 3 columns thì nó tạo thêm 1 column
        JButton button1 = new JButton("1");
        frame.add(button1);
        // tương đương
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }
}   

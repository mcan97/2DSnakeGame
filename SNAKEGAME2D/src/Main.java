import javax.swing.JFrame;

public class Main {

    public Main() {

        JFrame frame = new JFrame();
        GameScreen gamescreen =new GameScreen();
        frame.add(gamescreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake Game");

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();


    }
}

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = 600;

        JFrame frame = new JFrame("Snake");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        frame.setVisible(true);
        snakeGame.requestFocus();
    }
}

package day6LabOOP.Lab03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRacingGame extends JFrame implements KeyListener {
    private int carX = 250; // Vị trí X của xe
    private int carY = 400; // Vị trí Y của xe
    private int score = 0; // Điểm số
    private List<Rectangle> obstacles; // Danh sách các chướng ngại vật
    private Random random; // Đối tượng ngẫu nhiên
    private boolean gameWon = false; // Cờ chiến thắng

    public CarRacingGame() {
        setTitle("Car Racing Game");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        addKeyListener(this);

        obstacles = new ArrayList<>();
        random = new Random();

        startGame();
    }

    private void startGame() {
        Thread gameLoop = new Thread(() -> {
            while (true) {
                if (!gameWon) {
                    moveCar();
                    moveObstacles();
                    checkCollision();
                    repaint();
                }

                try {
                    Thread.sleep(5); // Tốc độ cập nhật của trò chơi (milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        gameLoop.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight()); // Vẽ nền trắng

        g.setColor(Color.RED);
        g.fillRect(carX, carY, 50, 100); // Vẽ xe (hình chữ nhật đỏ)

        for (Rectangle obstacle : obstacles) {
            g.setColor(Color.BLUE);
            g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height); // Vẽ chướng ngại vật (hình chữ nhật xanh)
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 50, 50); // Hiển thị điểm số

        if (gameWon) {
            g.drawString("Chúc mừng, bạn đã chiến thắng!", 150, 300); // Hiển thị thông báo chiến thắng
            g.drawString("Nhấn phím R để chơi lại", 180, 350);
        }
    }

    private void checkCollision() {
        Rectangle carRect = new Rectangle(carX, carY, 50, 100); // Hình chữ nhật đại diện cho xe

        for (int i = 0; i < obstacles.size(); i++) {
            Rectangle obstacle = obstacles.get(i);
            if (carRect.intersects(obstacle)) {
                // Xử lý khi xe va chạm với chướng ngại vật
                obstacles.remove(i);
                score++; // Cập nhật điểm số khi vượt qua chướng ngại vật
                if (score >= 50) {
                    gameWon = true; // Đạt được 50 điểm, chiến thắng
                }
                break;
            }
        }
    }

    public void moveCar() {
        // Di chuyển xe sang trái nếu nhấn phím mũi tên trái
        if (carX > 0 && isKeyPressed(KeyEvent.VK_LEFT)) {
            carX -= 5;
        }
        // Di chuyển xe sang phải nếu nhấn phím mũi tên phải
        if (carX < getWidth() - 50 && isKeyPressed(KeyEvent.VK_RIGHT)) {
            carX += 5;
        }
    }

    private boolean[] keys = new boolean[256];

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < keys.length) {
            keys[keyCode] = true;

            if (gameWon && keyCode == KeyEvent.VK_R) {
                restartGame(); // Nhấn phím R để chơi lại
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < keys.length) {
            keys[keyCode] = false;
        }
    }

    private boolean isKeyPressed(int keyCode) {
        if (keyCode >= 0 && keyCode < keys.length) {
            return keys[keyCode];
        }
        return false;
    }

    private void moveObstacles() {
        for (int i = 0; i < obstacles.size(); i++) {
            Rectangle obstacle = obstacles.get(i);
            obstacle.y += 2; // Di chuyển chướng ngại vật xuống dưới

            if (obstacle.y >= getHeight()) {
                // Đặt lại vị trí Y của chướng ngại vật nếu nó đi qua đáy cửa sổ
                obstacles.remove(i);
                i--;
            }
        }

        if (obstacles.size() < 5) {
            // Thêm chướng ngại vật mới nếu danh sách chướng ngại vật chưa đủ
            Rectangle newObstacle = new Rectangle(random.nextInt(getWidth() - 50), random.nextInt(200) - 500, 50, 20);
            obstacles.add(newObstacle);
        }
    }

    private void restartGame() {
        carX = 250;
        carY = 400;
        obstacles.clear();
        score = 0;
        gameWon = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CarRacingGame::new);
    }
}






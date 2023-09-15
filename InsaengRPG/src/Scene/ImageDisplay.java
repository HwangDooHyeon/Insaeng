package Scene;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame {
    public ImageDisplay(String imagePath, int desiredWidth, int desiredHeight) {
        // 이미지 아이콘 생성
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // 이미지 크기 조정
        Image image = imageIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

        // 이미지를 담은 레이블 생성
        JLabel imageLabel = new JLabel(new ImageIcon(image));

        // 컨텐츠 팬에 레이블 추가
        getContentPane().add(imageLabel);

        // 창 닫기 동작 설정
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 컴포넌트 크기 자동 조정
        pack();

        // 화면 크기 가져오기
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = getWidth();
        int windowHeight = getHeight();

        int xPosition = screenWidth - windowWidth;  // 오른쪽으로 이동하기 위해 x 좌표 계산

        setLocation(xPosition, (screenHeight - windowHeight) / 2);  // 위치 설정

        // 항상 위에 표시되도록 설정
        setAlwaysOnTop(true);
    }


}


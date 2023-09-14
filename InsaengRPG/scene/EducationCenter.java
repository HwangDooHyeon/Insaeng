package scene;

import utility.ScanManager;

public class EducationCenter extends Scene{
    @Override
    public void initialize() {
        System.out.println("EducationCenter.initialize");
    }

    @Override
    public int update() {
        switch (ScanManager.scanInt("입력 : "))
        {
            case 0:
                break;

            case 1:
                break;

            case 2:
                break;
        }

        return 0;
    }

    @Override
    public void render() {
        System.out.println("1. 수학");
        System.out.println("2. 미술");
        System.out.println("3. 도덕");
    }
}











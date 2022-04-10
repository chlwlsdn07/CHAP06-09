// 다형성 예제 BirdManager 클래스
public class chap09_07 {
    // relocate 메소드 설정
    void reloacte(chap09_04[] birds){
        for(chap09_04 bird : birds){
            bird.move();
        }
    }

    public static void main(String[] args) {
        chap09_04[] birds = new chap09_04[3];

        birds[0] = new chap09_05();
        birds[1] = new chap09_06();
        birds[2] = new chap09_05();

        chap09_07 birdManager = new chap09_07();
        birdManager.reloacte(birds);
        }

    
    
}

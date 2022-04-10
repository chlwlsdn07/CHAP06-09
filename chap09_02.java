// 상속 Worker 클래스
public class chap09_02 extends chap09_01 {
    void work(){
        System.out.println("work at "+age);
    }

    public static void main(String[] args) {
        chap09_02 worker = new chap09_02();

        worker.age = 10; // 필드
        worker.play();  // 부모 메소드
        worker.work();  // 자식 메소드
    }
    
}

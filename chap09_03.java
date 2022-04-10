// 오버라이딩(메소드 재정의) 예제 
public class chap09_03 extends chap09_01 {
    @Override
    void play() {
        System.out.println("not play at " +age); // 부모 메소드의 재정의
    }
    
    void study(){
        System.out.println("study at "+age);
    }

    public static void main(String[] args) {
        chap09_03 student = new chap09_03();

        student.age = 10;
        student.play(); 
        student.study();
    }
    
}

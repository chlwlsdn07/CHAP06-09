// 생성자 예제
public class chap07_02 {
    // 생성자 선언
    chap07_02() {
        System.out.println("No Param");

    }
    chap07_02(int p){
        System.out.println("int : " +p);
    }
    chap07_02(String p){
        System.out.println("String :" +p);
    }
    public static void main(String[] args) {
        // 객체 생성
        chap07_02 obj1 = new chap07_02();

        chap07_02 obj2 = new chap07_02(1);

        chap07_02 obj3 = new chap07_02("exam");

    }
}

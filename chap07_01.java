// 입사연도, 사번, 이름 객체 생성 
public class chap07_01 {
    int joinYear;
    int employeeId;
    String name;
    public static void main(String[] args) {
        chap07_01 one = new chap07_01(); // 클래스 객체화
        one.joinYear = 1999;
        one.employeeId = 1;
        one.name = "Choi jin woo";
        chap07_01 two = new chap07_01();
        two.joinYear = 2000;
        two.employeeId = 2;
        two.name = "Gong da huen";

        int joinYear = one.joinYear;
        int employeeId = one.employeeId;
        String name = one.name;

        System.out.println(joinYear + " " + employeeId + " " +name);
        System.out.println(two.joinYear + " " + two.employeeId + " " +two.name);

        
    }
    
}

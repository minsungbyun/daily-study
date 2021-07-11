
import java.util.Scanner;

public class teststring {
  public static void main(String[] args) {
    String a = "방우주";
    String b = "방우주";

    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine(); // 같은 값을 입력해보자
    String name2 = sc.nextLine();//


    System.out.println(a == b); // true결과값이 나온다.
    System.out.println(name == name2); // false결과값이 나온다. 값이 같아도 Scanner에 저장된 주소가 다르기 때문

  };

}

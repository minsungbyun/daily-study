## 알고리즘 관련 질문 & 노하우 공유 방

### 1. 알고리즘 풀면서 부족했던 부분들 혹은 궁금한 점에 대한 질문을 남겨주세요

예시)

```java
public class Test001 {

  static int countEvenNumber(int value) {
    int result = 0;
    int n = value;
    while(n != 0) {
      if ((n % 2) == 0) {
        result++;
      }
      n %= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(countEvenNumber(1238694636));

  }

}
```

- 질문
  - 위의 코드에서 (n % 2) == 0 가 무슨말인지 아시는 분 있을까요?<br>
- 답변
  - n이 짝수인지 판별하는 문장입니다.<br>%는 나머지를 의미하며 2로 나눈 나머지가 0이면 짝수 1이면 홀수가 됩니다.

### 2. 자신만의 노하우가 있다면 공유해보아요

예시)

- (n % 2) == 0 / (n % 2) == 1 짝수 홀수 구별하는 문장은 자주 등장합니다.
- 저는 문제가 안풀릴때 답지를 봐서 외워버려요 등등

## RULE

- 항상 글을 게시해야하는것은 아닙니다.
- 항상 댓글을 달 필요는 없습니다.
- 하지만 자신이 궁금하거나 혹은 알고있는 내용이 있다면 질문하거나 답변해주세요.
- 변동사항이 생긴다면 카톡으로 남깁니다

```
$ git pull 하시고 답변을 달아주세요!
```

- 질문과 답변은 위의 양식을 따릅니다.

- 코드의 가독성을 위해서 코드를 첨부할 때는 markdown 문법을 사용해서 코드를 첨부합니다.

```
java 코드를 올릴 때
` <-- 보여드리기 위해 1번만 썼습니다. (키보드 1 왼쪽에 있는 키)


`  <-- 3개를 연속해서 씁니다.

public class Exam0510 {
  public static void main(String[] args) {
    System.out.println("Hello!");
  }
}

` <-- 3개를 연속해서 씁니다.

```

# 의미있는 이름 적는 방법

1. 의도를 분명하게 밝힌다, 예를들어

```C#
int d; // 시간
```

이런것 보다는

```C#
int thisPageElapsedDay;
int reservationDay;
```

이렇게 사용하는것이 이해하기 좋습니다.
<br/>

2. 그릇된 정보(잘못된정보)를 남겨서는 안됩니다.

예를들면 List 라고 쓰여져있는데, 실제 List 클래스를 사용하는게 아니면 accountlist라는 단어가 뜻이 비슷하게 느껴질 지라도 프로그래머 입장에서는 List는 다른 기능을 하는 기능이기 떄문에 이런식으로 사용해서는 안됩니다.
그리고 비슷하게 사용(abcLongFindController, abcLongfinController 가 있다고 쳤을때 너무 비슷하기 떄문에 사용하기 힘듭니다.)하는 글자가 있으면 안됩니다.
그리고 l과1, O와 0는 특수한 글꼴을 사용하거나 하지 않는다면 알아보기 힘들기 떄문에 주의해서 사용해야됩니다.

```C#
int ListAccount;
int a01;
int aO1;
```

이런것 보다는

```C#
int Account;
int a1;
```

이와같이 사용한다.
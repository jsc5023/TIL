# Java와 C#의 차이

1. SubString의 차이
   java의 String substring(3,6) 시작지점, endstring 마지막지점

```java
Scanner scan = new Scanner(System.in);
String a = "12345678";
System.out.println(a.substring(3,6)); // 이면 나오는 값은 456입니다.
```

Java 의 string Substring(3,6)의 예시는 (3번째 index부터, 6번째 index까지)
|0|1|2|3(시작)|4(포함)|5(포함)|6(끝)|7|
|--|--|--|--|--|--|--|--|
|1|2|3|4(시작)|5(포함)|6(포함)|7(끝)|8|

```cs
string a = "12345678";
Console.WriteLine(a.Substring(3, 3)); // 456
```

C# 의 string Substring(3,3)의 예시는 (3번째 index부터, 문자의 길이(Java와의 차이))
두번째 parameter가 Length와 index라는 차이가 존재합니다.
|0|1|2|3(시작)|4(포함)|5(포함)|6(길이(3))|7|
|--|--|--|--|--|--|--|--|
|1|2|3|4(시작)|5(포함)|6(포함)|7(길이(3))|8|

2. 기본적인 콘솔에서 쓰고 적는법(기억이 자주 안날때가 있어서 재작성합니다.)

```java
*import java.util.Scanner;
```

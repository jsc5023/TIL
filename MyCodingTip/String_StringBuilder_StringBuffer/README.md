# String vs StringBuilder , String Buffer

참조사이트(가장 많이 참조합니다.)
<br>
https://ifuwanna.tistory.com/221

문자열을 다루는 클래스 String, StringBuffer, StringBuilder의 차이점을 알아봅니다.

결론 부터 말하자면,

```
String은 불변(immutable)성   
StringBuffer 및 StringBuilder 가변(mutable)성을 가진다.
```

```C#
string str = "Github"
str += " TIL"
```

우선 이러면, string에 메모리가 할당된 str에 참조변수 Github에 문자열이 더해지는게 **아니라!**<br/>
Github TIL이라는 새로운 메모리 영역을 할당하고, 그후 메모리 영역이 사라지지 않고 가비지(Garbege) 영역에 존재하다가, 가비지 콜렉션(Garbege coollection)에 의해 사라지게 됩니다.
<br>
따라서 재 생성하기 때문에 메모리 효율이 좋지 않고, 재생성하기 때문에 동적으로 할당하면 메모리 저장공간이 비효율 적으로 사용됩니다.

> 따라서 문자열을 수정하는 경우가 드문 경우는 String, 수정하는 경우가 빈번한 경우 StringBuffer, StringBuilder를 사용하면 됩니다.

# StringBuilder vs StringBuffer

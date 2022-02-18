# PrimitiveAndWrapper

Java 의 형태로 기본형(원시타입이라고도 부릅니다.)(Primitive Type)과 참조형(Reference Type)이 존재합니다.
<br/>
기본형으로는 byte, short, int, long, ... 참조형으로는 Byte, Short, Integer, Long 등이 존재합니다
|기본형|참조형|
|------|-------|
|byte |Byte|
|short|Short|
|int|Integer|
|long|Long|

참조형은 기본형을 객체화 한것으로 객체형태로서 null을 넣거나, 메소드를 사용할 수 있도록 합니다.<br/>

또한 객체로 만들었므로, ToString() 메서드를 사용 가능하며, Generics(<>)에서 사용할 수 있습니다.
(예를들어 ArrayList<Integer> 처럼)
그리고 기본형을 참조형으로 변환 가능하고(boxing), 역으로 참조형을 기본형으로도 가능합니다.(UnBoxing)


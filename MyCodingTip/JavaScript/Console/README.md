#JavaScript Console Tip

기본적으로 JavaScript의 console.log('aa')를 하면 aa가 출력됩니다.
그런데 이 기능 뿐만아니라 여러종류가 있습니다.
console.warn() -> 경고창이 나옵니다.(노란색으로)
console.error() -> 빨간색 경고창이 나옵니다.(좀더 주의하기 좋습니다.)
그리고 Console 시리즈는 일반적으로 배포를 할때는 지워주는 것이 좋습니다. 왜냐하면 쓸때없이 메모리를 잡아먹을 수 있기 때문입니다.

console.Table() -> 테이블형식으로 콘솔이 나타납니다.
console.dir() -> 콘솔을 Json 형식으로 나타냅니다.(Console.log는 HTML형식으로 나타납니다.)
따라서 console.dir은 Json이 아닐시 JSON.stringify으로서 Json형식으로 변경하는게 좋습니다.

![image](https://user-images.githubusercontent.com/60413291/127771755-0d7ffa73-109c-40df-b1ec-9e9dcdc5093b.png)

# 자바 버전 여러개 사용시 주피터 노트북 커널 충돌 현상

자바 버전 여러개 사용시 충돌 현상이 나타날 때가 존재합니다.
그때 java -version, javac -version 체크시 원하는 버전으로 사용하기위해서는 환경설정의 Path에 들어가서 수정해야할 부분으로<br/>
C:\Program Files\Common Files\Oracle\Java\javapath (제 컴퓨터 기준으로 16.0.1 Version)(컴퓨터가 다르면 버전이 다를 수 있습니다.)<br/>
C:\ProgramData\Oracle\Java\javapath (1.8 Version)(컴퓨터가 다르면 버전이 다를 수 있습니다.)<br/>
의 순서를 변경하면 쉽게 버전을 변경가능합니다.(위로이동, 아래로 이동하며 cmd 창으로 버전체크를 하시면 쉽게 확인 가능합니다.)

![image](https://user-images.githubusercontent.com/60413291/154506879-6cae8211-8d18-48d9-9ca5-322d0444f7af.png)
<br>
위 사진의 위로이동, 아래로 이동으로 변경(JAVA_HOME은 개인 환경변수 추가 옵션, 이것또한 16.0.1 Version)

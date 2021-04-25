# Gitignore

GitIgnore는 Git을 올릴때 같이 올라가면 안되는 파일(예를들면 .vs파일(visual studio config파일)
debug, obj 파일 등을 올리지 않기 위해서 사용됩니다.
<br/>

그런데, 이미 그런 파일들이 올라가 있을때 그것을 수정하기 위한 방법은

```
git rm --cached `git ls-files -i --exclude-from=.gitignore`
git commit -m 'gitignore에 있는 모든 파일 제거'
git push origin master
```

이렇게 하면 gitignore에 있는 확장자, 혹은 폴더가 지워집니다.(스택오버플로우의 gitignore의 이미 커밋되있는 파일 제거(로컬에는 영향 없음))

<br/> 
[참조 링크](https://stackoverflow.com/questions/7927230/remove-directory-from-remote-repository-after-adding-them-to-gitignore "스택오버플로우의 gitignore의 이미 커밋되있는 파일 제거(로컬에는 영향 없음)")

- Github에 올릴때 주의사항

csproj파일은 c#project 파일이고, 이는 기본적으로 솔루션 - 프로젝트에있는 프로젝트를 실행 시켜주는 역할을 하기때문에 반드시 올려야한다.(2021.04.24에 알아낸 팁)
프로젝트 파일을 올리지 않으면 코드만 덩그러니 있기 때문에 실행할 수 없는 오류가 나타난다.

또한 프로젝트 파일을 올릴시 Sln 파일또한 올려야된다.
이파일은 솔루션 파일로서, Solution의 약자이며 이파일이 없으면 visual studio로 실행시키기 굉장히 불편해진다(프로젝트를 실행시키기 위한 솔루션 파일을 새로 생성해야됨).
그러므로 Sln 파일또한 .gitignore를 시키면 안됩니다.

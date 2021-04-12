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
(참조 링크)
<br/> 
[참조 링크](https://stackoverflow.com/questions/7927230/remove-directory-from-remote-repository-after-adding-them-to-gitignore "스택오버플로우의 gitignore의 이미 커밋되있는 파일 제거(로컬에는 영향 없음)"))
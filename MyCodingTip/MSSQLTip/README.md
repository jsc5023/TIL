# NULL 관련 C#과 MSSQL의 오류 정리

> 1. 데이터 테이블에서 
기본적으로 DataSet을 이용해서 테이블을 불러올때, fruit_warehouse라는 테이블이 존재하면서
  fruit_warehouse의 컬럼이 fruit, amount라고 가정하고 fruit에 amount 라는 데이터가 존재하고 그 ID의 존재가 NULL 일때
SELECT amount FROM fruit_warehouse WHERE fruit = 'apple' 이면 ID의값은 NULL이 반환됩니다.

![image](https://user-images.githubusercontent.com/60413291/155727703-cf055caa-8b97-4ece-999d-faa6ec3c87c7.png)

<br/>
하지만, 중요한것은 결국 테이블은 존재하기 때문에 DataSet db = (TEST 테이블 반환값) 을 작성했을때 db.Tables[0].Rows.Count 의 값이 결국 0 이 아니라 1이 나오게 됩니다.

```C#
DataSet ds = exec_sql("SELECT amount FROM fruit_warehouse WHERE fruit = 'apple'"); // exec_sql은 sql을 실행하는 함수라고 가정합니다.

int cnt = ds.Tables[0].Rows.Count; // cnt는 1이 반환됩니다.
```

# C#에서 DataSet으로 데이터를 연동할 경우 생기는 문제(DBNull과 C#에서 null은 다르다.)

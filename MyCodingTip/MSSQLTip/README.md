# NULL 관련 C#과 MSSQL의 오류 정리

> 1. 데이터 테이블에서 
기본적으로 DataSet을 이용해서 테이블을 불러올때, fruit_warehouse라는 테이블이 존재하면서
  fruit_warehouse의 컬럼이 fruit, amount라고 가정하고 fruit에 amount 라는 데이터가 존재하고 그 ID의 존재가 NULL 일때
SELECT amount FROM fruit_warehouse WHERE fruit = 'apple' 이면 ID의값은 NULL이 반환됩니다.

![image](https://user-images.githubusercontent.com/60413291/155728537-92c4266f-a35d-4838-a23b-e04eaa3f7d8a.png)

<br/>
하지만, 중요한것은 결국 테이블은 존재하기 때문에 DataSet db = (TEST 테이블 반환값) 을 작성했을때 db.Tables[0].Rows.Count 의 값이 결국 0 이 아니라 1이 나오게 됩니다.

```C#
DataSet ds = exec_sql("SELECT amount FROM fruit_warehouse WHERE fruit = 'apple'"); // exec_sql은 sql을 실행하는 함수라고 가정합니다.

int cnt = ds.Tables[0].Rows.Count; // cnt는 1이 반환됩니다.
```

# C#에서 DataSet으로 데이터를 연동할 경우 생기는 문제(DBNull과 C#에서 null은 다르다.)

C#에서 만약 데잉터 베이스를 저장한다고 가정했을경우 파라미터에 그냥 C#의 null값을 넣어서는 데이터베이스에서 null값을 처리하지 않는다.
<br/>
예를들어 저장 프로시저 usp_friut_warehouse_sel의 변수가 @friut nvarchar(20)이라고 가정했을 경우
C#의 값의 파라미터가 @friut null로 들어가면 프로시저의 변수는 null로 들어갈것 같지만 그렇지 않다.
<
> 만약 NULL값을 넣고싶다면, DBNull의 형태를 이용해야한다.

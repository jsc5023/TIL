# SQLTip

기본적으로 DataSet을 이용해서 테이블을 불러올때, TEST라는 테이블이 존재하면서
TEST의 컬럼이 NAME, ID라고 가정하고 NAME에 NOTEXISTS 라는 데이터가 존재하고 그 ID의 존재가 NULL 일때
SELECT ID FROM TEST WHERE NAME = 'NOTEXISTS' 이면 ID의값은 NULL이 반환됩니다.

<br/>
하지만, 중요한것은 결국 테이블은 존재하기 때문에 DataSet db = (TEST 테이블 반환값) 을 작성했을때 db.Tables[0].Rows.Count 의 값이 결국 0 이 아니라 1이 나오게 됩니다.
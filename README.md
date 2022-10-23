# Board project

안녕하세요 교육 최종 프로젝트로 제출했던 소스코드입니다. 아래와 같은 조건 상태에서 시작하였고, DB는 H2를 사용하였습니다.


-----

실행방법
1. Gradle을 빌드하고 SpringBoot BoardApplication 을 실행한다.
2. 크롬이나 사파리 브라우저에서 url (localhost:8080)으로 접속하면 게시판 화면이 나온다.

BoardController
화면과 요청, 응답을 주고 받는 controller 객체, crud 가 GET, POST를 이용해 구현 되어있음 

JSP
webapp/WEB-INF 에 JSP 파일 작성해두었고, application.properties에 prefix, suffix로 resolver 등록해두었습니다.

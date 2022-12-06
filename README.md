
# 프로젝트 절명
이 프로젝트는 Spring Boot Security를 이용한 이증을 구현한 예제 프로젝트 입니다
token이 잘 발행되는지, 발행된 token을 이용해 인증 시도 했을 때 유효한 token인지 확인하는 기능을 구현합니다.
# Endpoints
POST /api/v1/login 단순 토큰 발급
POST /api/v1/reviews 토큰 인증

#실행 방법
http://localhost:8080/reviews를 호출 할 때 아래 header의 authorization에 </login에서 받은 token>을 넣어서 요청


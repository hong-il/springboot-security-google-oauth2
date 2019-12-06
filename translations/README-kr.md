<details>
<summary>번역:</summary>
  
* [English](/README.md)  
* [日本語](/translations/README-jp.md)

</details>
  
# 스프링부트 OAuth2 튜토리얼
스프링 security와 oauth2를 사용하여 구글 로그인을 구현하겠습니다.  
구글 개발자 콘솔의 인증 아이디가 없으신 분은 [application.yml](../src/main/resources/application.yml)를 참조해주시길 바랍니다.  

##### [application.yml](../src/main/resources/application.yml)의 주석대로 따라 오시면 client id와 client security secrets를 확인하실 수 있습니다. 
![google-console-developer](https://user-images.githubusercontent.com/51474312/70328056-833bcd80-187b-11ea-9734-619c99cd9b3f.PNG)

## 개발 환경  
개발환경은 다음을 참고해주세요.  
* IDE : IntelliJ IDEA Ultimate
* OS : Windows 10
* SpringBoot 2.2.1
* Java8
* Gradle
* Spring security OAuth2
## 목표  
* 시큐리티의 기초 이해  
* 구글 로그인 기능 추가
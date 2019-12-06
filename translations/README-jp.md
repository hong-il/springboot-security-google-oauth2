<details>
<summary>翻訳:</summary>
  
* [English](/README.md)  
* [한국어](/translations/README-kr.md)

</details>
  
# スプリング・ブートのOAuth2チュートリアル
スプリングセキュリティとoauth2でグーグルのサインイン機能を実装します.  
グーグル開発者コンソールの認証idを持ってなかったら[application.yml](src/main/resources/application.yml)を参考してください。  

##### [application.yml](src/main/resources/application.yml)通りにやるとクライアントidとクライアントセキュリティsecretsが確認できます。 
![google-console-developer](https://user-images.githubusercontent.com/51474312/70328056-833bcd80-187b-11ea-9734-619c99cd9b3f.PNG)

## 開発環境  
開発環境は下記を参考してください。
* 統合開発環境 : インテリジェイ IDEA Ultimate
* OS : ウィンドウズ 10
* スプリング・ブート 2.2.1
* ジャヴァ8
* グレイドル
* スプリングセキュリティOAuth2
## 目標  
* スプリングセキュリティの基礎を固めよう  
* グーグルアカウントでアプリにアクセスしよう
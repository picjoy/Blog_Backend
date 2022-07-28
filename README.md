## 💡 **요구사항**  
  
### **1. 전체 게시글 목록 조회 API**  
    - 제목, 작성자명, 작성 날짜를 조회하기  
    - 작성 날짜 기준으로 내림차순 정렬하기   
### **2. 게시글 작성 API**  
    - 제목, 작성자명, 비밀번호, 작성 내용을 입력하기  
### **3. 게시글 조회 API**  
    - 제목, 작성자명, 작성 날짜, 작성 내용을 조회하기   
    _(검색 기능이 아닙니다. 간단한 게시글 조회만 구현)_  
### **4. 게시글 비밀번호 확인 API**  
    - 비밀번호를 입력 받아 해당 게시글의 비밀번호와 일치여부 판단하기  
### **5. 게시글 수정 API**  
    - 제목, 작성자명, 비밀번호, 작성 내용을 수정되게 하기  
### **6. 게시글 삭제 API**  
    - 글이 삭제되게 하기  
  
##  🍎 API 명세서  
  
| Fuction | Method | url |request | respond |
| ------ | -- | -- |----------- |---------- |
| 전체 게시글 목록 조회 | GET | /api/articles |  |[{ "createAt": "2022-07-28T18:29:07.850107", "modifiedAt": "2022-07-28T18:29:07.850107", "id": 7, "title": "third", "username": "Vincent", "password": "7777", "content": "third content"}, {"createAt": "2022-07-28T18:26:46.005421", "modifiedAt": "2022-07-28T18:26:46.005421", "id": 6, "title": "second", "username": "Mark", "password": "5678", "content": "second content"}, {"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:26:23.140679", "id": 5,"title": "first", "username": "Joy", "password": "1234", "content": "first content"}]|
| 게시글 작성 | POST | /api/articles | {  "title" : "second", "username" : "Mark","password" : "5678", "content" : "second content"} |{"title" : "second", "username" : "Mark", "password" : "5678", "content" : "second content" }|
| 게시글 조회 | GET | /api/articles{id} |  |{"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:26:23.140679", "id": 5, "title": "first", "username": "Joy", "password": "1234", "content": "first content"} |
| 게시글 비밀번호 확인 | POST | /api/articles{id} | password : 1234 password : 7777 | false |  
| 게시글 수정 | PUT | /api/articles{id} | {"title": "first", "username": "Joy", "password": "1234", "content": "update content"}  | 수정 완료! ( 비밀번호가 같아야 수정 가능 ){"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:41:26.689269", "id": 5, "title": "first", "username": "Joy", "password": "1234", "content": "update content"}|
| 게시글 삭제 | DELETE | /api/articles{id} |  | 삭제 완료! |


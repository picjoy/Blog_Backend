## ๐ก **์๊ตฌ์ฌํญ**  
  
### **1. ์ ์ฒด ๊ฒ์๊ธ ๋ชฉ๋ก ์กฐํ API**  
    - ์ ๋ชฉ, ์์ฑ์๋ช, ์์ฑ ๋ ์ง๋ฅผ ์กฐํํ๊ธฐ  
    - ์์ฑ ๋ ์ง ๊ธฐ์ค์ผ๋ก ๋ด๋ฆผ์ฐจ์ ์ ๋ ฌํ๊ธฐ   
### **2. ๊ฒ์๊ธ ์์ฑ API**  
    - ์ ๋ชฉ, ์์ฑ์๋ช, ๋น๋ฐ๋ฒํธ, ์์ฑ ๋ด์ฉ์ ์๋ ฅํ๊ธฐ  
### **3. ๊ฒ์๊ธ ์กฐํ API**  
    - ์ ๋ชฉ, ์์ฑ์๋ช, ์์ฑ ๋ ์ง, ์์ฑ ๋ด์ฉ์ ์กฐํํ๊ธฐ   
    _(๊ฒ์ ๊ธฐ๋ฅ์ด ์๋๋๋ค. ๊ฐ๋จํ ๊ฒ์๊ธ ์กฐํ๋ง ๊ตฌํ)_  
### **4. ๊ฒ์๊ธ ๋น๋ฐ๋ฒํธ ํ์ธ API**  
    - ๋น๋ฐ๋ฒํธ๋ฅผ ์๋ ฅ ๋ฐ์ ํด๋น ๊ฒ์๊ธ์ ๋น๋ฐ๋ฒํธ์ ์ผ์น์ฌ๋ถ ํ๋จํ๊ธฐ  
### **5. ๊ฒ์๊ธ ์์  API**  
    - ์ ๋ชฉ, ์์ฑ์๋ช, ๋น๋ฐ๋ฒํธ, ์์ฑ ๋ด์ฉ์ ์์ ๋๊ฒ ํ๊ธฐ  
### **6. ๊ฒ์๊ธ ์ญ์  API**  
    - ๊ธ์ด ์ญ์ ๋๊ฒ ํ๊ธฐ  
  
##  ๐ API ๋ช์ธ์  
  
| Fuction | Method | url |request | respond |
| ------ | -- | -- |----------- |---------- |
| ์ ์ฒด ๊ฒ์๊ธ ๋ชฉ๋ก ์กฐํ | GET | /api/articles |  |[{ "createAt": "2022-07-28T18:29:07.850107", "modifiedAt": "2022-07-28T18:29:07.850107", "id": 7, "title": "third", "username": "Vincent", "password": "7777", "content": "third content"}, {"createAt": "2022-07-28T18:26:46.005421", "modifiedAt": "2022-07-28T18:26:46.005421", "id": 6, "title": "second", "username": "Mark", "password": "5678", "content": "second content"}, {"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:26:23.140679", "id": 5,"title": "first", "username": "Joy", "password": "1234", "content": "first content"}]|
| ๊ฒ์๊ธ ์์ฑ | POST | /api/articles | {  "title" : "second", "username" : "Mark","password" : "5678", "content" : "second content"} |{"title" : "second", "username" : "Mark", "password" : "5678", "content" : "second content" }|
| ๊ฒ์๊ธ ์กฐํ | GET | /api/articles{id} |  |{"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:26:23.140679", "id": 5, "title": "first", "username": "Joy", "password": "1234", "content": "first content"} |
| ๊ฒ์๊ธ ๋น๋ฐ๋ฒํธ ํ์ธ | POST | /api/articles{id} | password : 1234 password : 7777 | false |  
| ๊ฒ์๊ธ ์์  | PUT | /api/articles{id} | {"title": "first", "username": "Joy", "password": "1234", "content": "update content"}  | ์์  ์๋ฃ! ( ๋น๋ฐ๋ฒํธ๊ฐ ๊ฐ์์ผ ์์  ๊ฐ๋ฅ ){"createAt": "2022-07-28T18:26:23.140679", "modifiedAt": "2022-07-28T18:41:26.689269", "id": 5, "title": "first", "username": "Joy", "password": "1234", "content": "update content"}|
| ๊ฒ์๊ธ ์ญ์  | DELETE | /api/articles{id} |  | ์ญ์  ์๋ฃ! |


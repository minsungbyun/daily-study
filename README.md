## Daily study
___
> 이곳은 데일리문제를 공유하는 곳 입니다.
### git 주소를 clone합니다. (처음에만)
```
// clone
git clone https://github.com/minsungbyun/daily-study.git
```
### 이후 수정되면 pull 합니다.
```
// pull
git pull
```
## 문제 올리는 방법
___
- 문제를 낸 후 `add` > `commit` > `push` 합니다.
- 아래의 양식에 맞게 해주세요 ~
```
// name   : origin 
// branch : main

// add
git add .

// commit 출제
git commit -m "21/07/06 (해당날짜) 문제 출제 완료 (이름)"

// commit 답변
git commit -m "21/07/06 (해당날짜) 문제 답변 완료 (이름)"

// push
git push
git push -u origin main
```

- 반드시 `push` 해주세요 ★★★★★

- 올리고 싶은 기능들은 `info` directory에 올려주시면 됩니다.

>README.md를 수정하고 싶으신 분들은 `markdown `directory에 들어가시면 명령어를 볼 수 있어요
[markdown 문법 바로가기](https://github.com/minsungbyun/daily-study/tree/main/markdown)



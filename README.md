# E-Wallet-With-MSA

`KB DataSystem` `Cloud` `MSA`

## 프로젝트 소개

2023.7.17에 투입될 『KB스타뱅킹 회원정책 개편』 프로젝트에 앞서 MSA 구조를 학습하기 위한 Side 프로젝트 입니다. 투입될 프로젝트의 간단한 기능구현을 통해 새로운 개발환경에 대한 적응을 목표로합니다.

<br>

## 구현 기능

- 회원가입
  - ID/PW 방식으로 회원을 가입한다.
  - ID는 영문만 가능 (5~20자리)
  - ID중복체크 기능을 제공한다.
- 로그인
  - ID/PW로 로그인을 제공한다.
  - 중복로그인을 방지한다.
- 홈화면 제공
  - 로그아웃버튼을 제공한다.
  - 최근접속시간, 지갑잔액, 최근이력(충전/송금) 5건을 제공한다.
- 전자지갑
  - 생성
    - 전자지갑은 1인당 1개만 생성
  - 조회
    - 지갑의 잔액을 조회한다.
    - 지갑의 이력을 조회한다.
  - 송금
    - 상대방 id지정, 금액 입력 후 송금
    - 송금취소 기능을 제공한다. (30분 이내에 취소가능)
  - 충전
    - 충전기능을 제공한다.
    - 충전은 Mystar 입금처럼 진행.
    - 로그인 후 충전금액 입력 후 입력하면 충전완료

<br>

## 🚀 기술 스택

### Programming Languages

<img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?&style=for-the-badge&logo=java&logoColor=white"/>
<img alt="JavaScript" src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">


### Framework

<img alt="SpringBoot" src="https://img.shields.io/badge/spring_boot%20-%236DB33F.svg?&style=for-the-badge&logo=springboot&logoColor=white"/>
<img alt="Maven" src="https://img.shields.io/badge/maven%20-%2335495e.svg?&style=for-the-badge&logo=maven&logoColor=%234FC08D"/>
<img alt="SpringSecurity" src="https://img.shields.io/badge/spring_security%20-%236DB33F.svg?&style=for-the-badge&logo=springsecurity&logoColor=white"/>
<img alt="JPA" src="https://img.shields.io/badge/jpa%20-%23009639.svg?&style=for-the-badge&logo=jpa&logoColor=white"/>
<img alt="Vue" src="https://img.shields.io/badge/vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white">

### Data

<img src="https://img.shields.io/badge/H2_database-232F3E?style=for-the-badge&logoColor=white">
<img src="https://img.shields.io/badge/apachekafka-231F20?style=for-the-badge&logo=apachekafka&logoColor=white">
<img src="https://img.shields.io/badge/mariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white">

### ETC

<img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jirasoftware&logoColor=white">
<img src="https://img.shields.io/badge/intellij-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
<img src="https://img.shields.io/badge/vscode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white">

<br>

## Help

<br>

### 프로젝트 가져오기

1. git 설치 https://git-scm.com/downloads
2. gitHub 회원가입
3. Repository의 `<>Code`를 클릭하여 remote 저장소의 URL을 복사합니다.
4. IntelliJ IDE를 실행 후 `File > New > Project from Version Controll... > URL붙여넣기 > Clone`
5. SDK 설정. `Ctrl + Alt + Shift + S > Project > SDK > 원하는 JDK를 선택`
6. Moduel 설정.
`Ctrl + Alt + Shift + S > Moduels > + 버튼 > Import Module > [프로젝트 Root 폴더 선택] > Ok > Import module from external model > Maven > Create`
7. 모듈설정이 완료되면 Maven프로젝트로 변경됩니다. 프로젝트의 main 소스를 Run 하여 Spring이 잘 동작하는지 확인합니다.

<br>

### 프로젝트 실행

1. Eureka Server 실행
2. Api GateWay 실행
3. Micro Service 실행

<br>

### How to Use Git?

1. 작업은 각자의 Branch를 따로 파서 합니다. Root Branch 는 main 입니다.  
터미널에 `git branch [브랜치 이름]`으로 Branch를 생성할 수 있습니다.
2. Branch를 생성해도 바로 이동되지 않습니다. 터미널에 `git checkout [브랜치 이름]`을 입력하여 이동합니다.
3. 작업이 끝나면 commit을 통해 로컬 저장소에 기록 해야합니다.  
`git commit -m "커밋 메시지"`를 통해 commit을 완료합니다.  
메시지는 상세하게 작성하는 것이 좋으며, 변경된 내용이나 커밋의 의도를 명확하게 전달하는 데 도움이 됩니다.
4. 커밋이 완료되면 다시 main 브랜치로 이동합니다. `git checkout main`
5. main 브랜치에서 작업이 끝난 브랜치를 병합합니다. `git merge [브랜치 이름]`  
이때 변경사항이 동시에 일어나서 충돌이 발생할 경우 자동으로 충돌되는 부분이 코드에 추가됩니다. 
6. 충돌을 해결하면, 변경사항을 커밋하여 로컬 main 브랜치에 반영합니다. `git commit -m "브랜치 병합 완료!!"`
7. 다른 개발자들이 변경사항을 확인할 수 있도록 원격 저장소(origin)에 push 합니다. `git push origin main`

<br>

### How to Use Jira?

1. https://laugh4mile.atlassian.net/jira/software/projects/EWWM/boards/2 에서 이슈를 생성합니다.
2. 이슈를 생성하면 고유의 코드가 나옵니다. ex) EWWM-1
3. 이제 소스코드 수정 후 commit 할 때 커밋 메시지에 이슈코드를 포함합니다. `git commit -m "EWWM-1 작업완료"`
4. Jira에서 해당 이슈에 대한 커밋 로그를 확인할 수 있습니다.

<br>

### Error Report

#### Terminal에선 push가 되는데 IntelliJ에서는 안돼요

- IntelliJ의 내장기능으로 push를 하면 `Log in to GitHub` 라는 창이 나올때가 있습니다.
- 이때 `Log in Via GitHub...`를 클릭해 web로그인을 해도 계속 push failed가 뜨면  
`Log in whit Token...`을 클릭해 토큰을 발급 받아 로그인 할 수 있습니다. 토큰값은 단 한번만 알려주므로 메모장에 꼭 저장해 놓아야 합니다.

#### .gitignore에 무시할 파일을 추가했는데 적용되지 않아요

- 이 경우는 이미 해당 파일들이 이전에 Git 저장소에 포함되었기 때문입니다.
- 따라서 해당 파일들을 Git에서 제외하려면 `git rm --cash [파일 or 폴더]` 명령을 사용하여 Git의 추적에서 제외시키면 됩니다.
- 캐시를 삭제한 후 commit 후 origin에 push까지 하면 원격 저장소까지 적용이 완료됩니다.

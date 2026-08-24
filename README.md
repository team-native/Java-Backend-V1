# Java Backend V1

Java와 Spring Boot 기반의 백엔드 시작 템플릿입니다.
인증, 보안 설정, 헬스 체크, 예외 응답, 테스트 기본 구조를 포함합니다.

## GitHub 템플릿으로 사용하기

1. GitHub 저장소의 `Settings > General > Template repository` 옵션을 켭니다.
2. 새 프로젝트를 만들 때 `Use this template` 버튼으로 저장소를 생성합니다.
3. 생성된 저장소에서 아래 항목을 프로젝트에 맞게 변경합니다.

| 파일 | 변경할 내용 |
| --- | --- |
| `settings.gradle` | `rootProject.name` |
| `build.gradle` | `group`, `version` |
| `src/main/resources/application.yml` | `spring.application.name`, `server.port` |
| `src/main/java/...` | 기본 패키지명 |
| `src/test/java/...` | 테스트 패키지명 |

## 기술 스택

- Java 21
- Spring Boot 4.1
- Spring Security
- Gradle Groovy DSL
- JUnit 5

## 프로젝트 구조

```text
src/main/java/com/teamnative/backend
├── Application.java
├── domain
│   ├── auth
│   │   ├── controller
│   │   └── dto
│   ├── health
│   └── sample
└── global
    ├── config
    └── exception
```

## 실행

macOS 또는 Linux:

```bash
./gradlew bootRun
```

Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

## 테스트

```bash
./gradlew test
```

Windows PowerShell:

```powershell
.\gradlew.bat test
```

## 확인용 API

- `GET /health`
- `GET /`
- `GET /api/v1/public/ping`
- `GET /api/v1/private/ping`
- `POST /api/v1/auth/login`

## 템플릿 유지보수

- `.github/workflows/ci.yml`: Pull request와 `main` 브랜치 push 시 테스트를 실행합니다.
- `.github/dependabot.yml`: Gradle과 GitHub Actions 의존성 업데이트 PR을 주기적으로 생성합니다.
- `.github/pull_request_template.md`: 새 프로젝트에서도 기본 PR 체크리스트를 제공합니다.

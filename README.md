# sitemesh는 tiles 와 같은 web UI layout 라이브러리 입니다.
### Spring MVC + sitemesh 예제를 통하여, 어떻게 사용할 수 있는지, 정리하겠습니다.

### 1. pom.xml에 sitemeth maven dependency 추가
##### grouptId - opensymphony // artifactId - sitemesh // version - 2.4.2

### 2. web.xml 에 sitemesh의 설정 파일 경로 지정 및 페이지 필터 설정
##### context-param
##### param-name - sitemesh.configfile
##### param-value - /WEB-INF/sitemeshConfig/sitemesh.xml

##### filter
##### filter-name - sitemesh
##### filter-class com.opensymphony.module.sitemesh.filter.PageFilter

##### filter-mapping
##### filter-name - sitemesh
##### url-pattern - /*

##### 찾아보니까 본인이 예전에 작성했던 sitemesh 튜토리얼이 있었다... 이렇게 기억력이 ㅠㅠ
##### >>  https://github.com/leesunku/sitemesh_spring

##### 그래서 이번엔, submenu 등록하는 방법에 대해 작성하겠다.
##### 인터넷에 찾아보니 다양한 방법이 있었지만, 너무 복잡하고 간단하게 하는 법을 생각하던중, 서브 메뉴가 있는 페이지만 따로 작성하는 법을 사용하기로 했다.

##### 본 예제는 메인 메뉴 4개(index 포함) 으로 구성되어 있다. 3번째 페이지 socialAnalysis란 페이지에는 서브 메뉴가 만들어진다.
##### 서브메뉴에 따라 content 영역이 바뀌어야 한다.

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

#The Spring IO Platform
스프링 IO 플랫폼
Spring IO brings together the core Spring APIs into a cohesive and versioned foundational platform for modern applications.
스프링 IO는 코어 스프링 API들을 결합시키고 최신 응용프로그램을 위한 플랫폼으로 버전화시킨다.


On top of this foundation it also provides domain-specific runtime environments (DSRs) optimized for selected application types.
스프링 IO 의 근본적인 것중에 최고는 스프링 IO 가  선택한 응용프로그램의 유형들을 위한 최적화된 DSRs 제공한다.

Spring IO is comprised of the Spring IO Foundation and Spring IO Execution layers.
스프링 IO은 Spring IO Foundation 과 Spring IO Execution layers로 구성된다.
Spring IO is 100% open source, lean, and modular.
스프링 IO 100프로 오픈 소스이고, lean 이고 modular이다.

![](https://spring.io/img/platform-stack.png)

##Spring IO Foundation
The Spring IO Foundation layer is a cohesive set of APIs and embeddable runtime components that enable you to build applications addressing a wide range of enterprise requirements.
Spring IO 기초 레이어는 결합된 API들의 묶음이고 넓은 범위에서 기업이 요구하는 요건을 다루도록 하는 응용프로그램들이 작동되게 하는 runtime components를 내장하고 있다.

For any given application you will of course only need to include those parts of the foundation that your application actually requires.
주어의 응용프로그램을 위해서 당신은 물론 오로지 실제적으로 당신이 응용프로그램이 필용한 부분의 IO foundation을 포함하는 것을 필요로 할지도 모른다.
The foundation makes it easy to identify components that work together; it does not force you to include components you wouldn't otherwise need.
foundation은 쉽게 함께 작동되는 컴포넌트를 쉽게 인식시켜준다. 이것은 당신이 이것을 필요로하지 않는 컴포넌트들을 쓰라고 강요하는 것 아니다.


##Spring-Powered Workloads
스프링의 이용한 업무량

All of the major workload types are represented: enterprise integration, batch processing, big data processing, web applications (including WebSocket support), and the creation of server-side APIs in support of single-page apps, mobile clients, and services.
많은 중요한 업무량의 유형들은 표현할수 있다:
기업의 통합패턴 , 일괄처리작업을하는것, 빅데이터 프로세싱,웹 어플리케이션(WAS) (웹 소캣지원을 포함하여), 그리고 싱글 페이져 앱을 지원하는 서버 사이드 API들의 생성, 모바일 클라인언트와 서비스


Spring's web stack has evolved to include comprehensive REST support for the creation of RESTful APIs – useful for supporting mobile and rich-client application architectures. Spring Framework 4 also adds support for the WebSocket programming model.
스프링의 웹스택은 전반적으로 RESTful한 API들의 생성과 모바일 지원에 유용하고 그리고 풍부한 클래이언트 응용프로그램 아키텍처에 대한 REST의 지원을 포함하는 것을 통해서 발전했습니다.

Integration workloads are another major use case for Spring. For these, Spring IO provides a rich programming model based on Enterprise Integration Patterns and its notions of channels, adapters, filters, and transformers.
통합 업무들은 또라른 스프링에 대한 사용 사례다. 그러한 경우에는, 스프링 IO 는 풍부한  기업 통합 패턴에 기반으로 한 프로그래밍 모델 제공하고 ,기리고 기업 통합 패턴의 채널, 아탑터 ,필터 , 트랜잭선들을 제공한다.


// 해석 다시 해야함 용어를 정확이 모름
Spring IO also defines a domain language for batch processing – batch jobs are divided into processing steps with readers and writers used to read the data in and write it back out again. Spring IO's comprehensive batch framework enables you to build robust batch applications that process large volumes of records.
Spring IO는 또한 배치 프로세싱 위한 도메인 언어을 정의한다. - 배치 작업들은 리더들과 라이터들이 사용되는 데이터를 읽어 들어가는 것과 다시 이것을 읽어서 내보내는 두가지 단계의 프로세싱으로 나눈다.
Spring IO들의 전체적인 배치 프레임워크는 당신이 활발하게 거대한 기록의 볼륨들의 처리하는 활발한 배치 응용프로그램을 구축할수 있도록한다.

Of course any given application in the enterprise rarely falls neatly into just one of these buckets, and often contains elements of web, batch, and integration processing all in one.
물론 기업의 어떤 주어진 응용프로그램은 드물게 배치프레임워크들의 묶음과 그리고 웹, 배치, 올인원 통합 프로세싱을 나누지는 않는다.
Spring's embedded runtime model makes this easy and natural to do. The emerging category of big data workloads is an example of this. 
스프링은 이것을 쉽게 만들고 자연스럽게 만들도록 runtime model 을 내장하고 있다. 빅데이터 처리는 최근 카테코리의 이것의 예이다.
It's one thing to lay down a Hadoop cluster but it's quite another to figure out how you're going to ingest data from all over your enterprise into that cluster, how you're going to orchestrate the batch workloads that process that data, and how you're going to get the results of that processing back into a form that can drive the rest of your business. 
이것은 하둡 클러스터로 저장하게 하고 하지만 이것은 아주 다르다. 전체적으로 당신의 기업에 

A fundamental insight here is that these "big data problems" have a lot in common with traditional enterprise integration and batch processing. Spring IO supplements Spring's traditional strengths in these areas to provide all the support you need to build robust and maintainable big data applications.
기본적인 관점은 빅데이터 문제들은 전통적인 기업 통합과 배치 프로세싱의 같은 공통점을 가지고 있다. Spring IO는 활발하고 안정적인 빅데이터 응용프로그램들을 구축하는데 필요로 하는 모든 지원을 공급해서 스프링의 전통적인 강점을 추가했다.


##Data

The data landscape is evolving rapidly. When Spring got started, 'data' pretty much meant a traditional relational database, and maybe a cache in front of it if you were lucky. Today we have a wide variety of data stores covering structured and unstructured data, in-memory and on-disk, standard-size and big. The industry has come to recognize that one size does not fit all, and it's a matter of choosing the most appropriate store for the task in hand. Spring IO addresses this modern data landscape—including full support for Apache Hadoop—whether it be document, graph, key-value, relational, or simply unstructured files.


##Core

At the center of the Spring IO Foundation layer, and common across all workload types, we find the core framework itself. Via Spring Framework 4.0, Spring IO enables you to take full advantage of Java SE 8 and the latest updates from EE 7. Spring IO has full support for addressing security concerns, and Spring IO's Reactor provides a foundation for building reactive, asynchronous, event- and data-driven applications.

he popular Groovy dynamic language is supported as an integral part of the Spring IO platform. Groovy integrates seamlessly with your existing classes and libraries and works especially well with IO Execution DSRs such as Boot and Grails.



##Spring IO Execution
The Spring IO Execution layer provides domain-specific runtimes (DSRs) for applications built on the IO Foundation modules. A DSR may run standalone without requiring deployment to an external container. The first release of Spring IO will include three DSRs: Spring XD, Spring Boot, and Grails.

[Spring FrameWork Reference](http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/overview-getting-started-with-spring.html)














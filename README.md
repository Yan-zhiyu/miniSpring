# miniSpring

> 此工程旨在于从无到有构建一个迷你版本的Spring工程，用于帮助理解Spring项目。

#### 第一部分：IoC 容器

刚开始，我将会从一个极简的 IoC 容器开始，逐步扩展增强，最终实现一个完整的 IoC 容器，包含 Spring 框架对应的核心功能，实现 Bean 的管理。基于这个核心，逐步扩展到 MiniSpring 的其他特性。

#### 第二部分：MVC

MVC 是 Spring 支持 Web 模式的程序结构，这个部分会先实现一个原始的 MVC 结构，然后会把 MVC 与第一部分的 IoC 容器结合起来，构成一个更大、更完整的框架。在一步步的构造过程中，逐步拆解这个 Servlet 的功能，把专业的事情交给专门的部件去做，最后构建成一个完整的体系。

#### 第三部分：JDBC Tempalte

JDBC Tempalte 是 Spring 对数据访问的一个实现。将了解到整个 JDBC Template 的实现都是运用了前面 IoC 管理 Bean 的方式，将数据的访问抽象成一个个 Bean，注入到系统中。可以更深刻地体会到 IoC 容器的功用。

#### 第四部分：AOP

AOP 是 Spring 框架中实践面向切面编程的探索。面向对象和面向切面，两者一纵一横，编织成完整的程序结构。在这一部分，将会了解到 Spring AOP 所采用的一个实现方式：JDK 动态代理。了解其中的原理，还有用这个技术动态插入业务逻辑的方法。

最后将再一次看到 AOP 与 IoC 的结合，使用 BeanPostProcessor，通过自动化机制生成动态代理。这时你就会体会到 “IoC 是 Spring 框架核心中的核心”这句话的深层含义

**注：该课程源自于郭屹老师的《手把手带你写一个 MiniSpring》**
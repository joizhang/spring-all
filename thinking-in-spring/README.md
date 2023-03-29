# thinking-in-spring

## 第三章 Spring IoC容器概述（22-30）：

### [ioc-container-overview](ioc-container-overview)

- `com.joizhang.thinkinginspring.iocoverview.DependencyLookupDemo` 依赖查找示例。
- `com.joizhang.thinkinginspring.iocoverview.DependencyInjectionDemo` 依赖注入以及依赖来源示例。
- `com.joizhang.thinkinginspring.iocoverview.BeanFactoryAsIoCContainerDemo` BeanFactory作为IoC容器示例。
- `com.joizhang.thinkinginspring.iocoverview.AnnotationApplicationContextAsIoCContainerDemo` ApplicationContext作为IoC容器。

### Spring 应用上下文

ApplicationContext 除了 IoC 容器角色，还有提供：

- 面向切面（AOP）
- 配置元信息（Configuration Metadata）
- 资源管理（Resources）
- 事件（Events）
- 国际化（i18n）
- 注解（Annotations）
- Environment 抽象（Environment Abstraction）

## 第四章 Spring Bean基础（31-41）：

### [bean-definition](bean-definition)

- `com.joizhang.thinkinginspring.beandefinition.BeanDefinitionCreationDemo` BeanDefinition构建。通过`org.springframework.beans.factory.support.BeanDefinitionBuilder` 或者通过`org.springframework.beans.factory.support.AbstractBeanDefinition`以及派生类。
- `com.joizhang.thinkinginspring.beandefinition.AnnotationBeanDefinitionDemo` BeanDefinition注册。包括Java 注解配置元信息（@Bean、@Component以及@Import）和Java API配置元信息
- `com.joizhang.thinkinginspring.beandefinition.BeanInstantiationDemo` Bean实例化。包括构造器、静态工厂方法、Bean工厂方法以及FactoryBean。
- `com.joizhang.thinkinginspring.beandefinition.BeanInitializationDemo` Bean 初始化示例。
- `com.joizhang.thinkinginspring.beandefinition.SpecialBeanInstantiationDemo` 特殊 Bean 实例化。

## 第六章：Spring IoC依赖注入（Dependency Injection）（51-70）：

### [dependency-injection](dependency-injection)

### 依赖注入的模式和类型

| 依赖注入类型    | 配置元数据举例                                          |
|-----------|--------------------------------------------------|
| Setter 方法 | <proeprty name=”user” ref=”userBean” />          |
| 构造器       | <constructor-arg name="user" ref="userBean" />   |
| 字段        | @Autowired User user;                            |
| 方法        | @Autowired public void user(User user) { ... }   |
| 接口回调      | class MyBean implements BeanFactoryAware { ... } |

### Setter 方法注入

- `com.joizhang.thinkinginspring.di.setter.XmlDependencySetterInjectionDemo` 基于 XML 资源的依赖 Setter 方法注入示例。
- `com.joizhang.thinkinginspring.di.setter.AnnotationDependencySetterInjectionDemo` 基于 Java 注解的依赖 Setter 方法注入示例。
- `com.joizhang.thinkinginspring.di.setter.ApiDependencySetterInjectionDemo` 基于 API 实现依赖 Setter 方法注入示例。
- `com.joizhang.thinkinginspring.di.setter.AutoWiringByNameDependencySetterInjectionDemo` "byName" Autowiring 依赖 Setter 方法注入示例。

### 构造器注入

- `com.joizhang.thinkinginspring.di.constructor.XmlDependencyConstructorInjectionDemo` 基于 XML 资源的依赖 Constructor 注入示例。
- `com.joizhang.thinkinginspring.di.constructor.AnnotationDependencyConstructorInjectionDemo` 基于 Java 注解的依赖 Constructor 方法注入示例。
- `com.joizhang.thinkinginspring.di.constructor.ApiDependencyConstructorInjectionDemo` 基于 API 实现依赖 Constructor 方法注入示例。
- `com.joizhang.thinkinginspring.di.constructor.AutoWiringConstructorDependencyConstructorInjectionDemo` "byName" Autowiring 依赖 Constructor 方法注入示例。

### 字段注入

- `com.joizhang.thinkinginspring.di.field.AnnotationDependencyFieldInjectionDemo` 基于 Java 注解的依赖字段注入示例。

### 方法注入

- `com.joizhang.thinkinginspring.di.method.AnnotationDependencyMethodInjectionDemo` 基于 Java 注解的依赖方法注入示例。

### 限定注入

- `com.joizhang.thinkinginspring.di.QualifierAnnotationDependencyInjectionDemo` 限定注入示例。

## 第九章：Spring Bean 生命周期（88-105）：

### [bean-lifecycle](bean-lifecycle)

- `com.joizhang.thinkinspring.beanlifecycle.BeanMetadataConfigurationDemo` Bean 元信息配置示例。通过`org.springframework.beans.factory.support.PropertiesBeanDefinitionReader`加载bean。
- `com.joizhang.thinkinspring.beanlifecycle.AnnotatedBeanDefinitionParsingDemo` 注解 BeanDefinition 解析示例。通过`org.springframework.context.annotation.AnnotatedBeanDefinitionReader`注册bean。
- `com.joizhang.thinkinspring.beanlifecycle.MergedBeanDefinitionDemo` BeanDefinition 合并示例。通过`org.springframework.context.annotation.AnnotatedBeanDefinitionReader`注册bean。

## 第十八章：Spring注解（Annotations）（202-213）：

### [bean-lifecycle](bean-lifecycle)

- 待更新

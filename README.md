Курсовая работа учеников профессии Java-разработка

# Back-end  для платформы по продаже вещей и услуг

### Задача: *написать серверную часть сайта на Java для готовой интерфейсной части*

## Команда проекта "Evolution":
- Еникеева Эльвира
- Корнилова Елизавета
- Хайбуллин Ирек

## Реализованы следующие функции:
  Для не авторизованных пользователей:
- просмотр объявлений;
- поиск по объявлениям.

  Для авторизованных пользователей:
- поиск по объявлениям;
- регистрация пользователя;
- вход/выход в учетную запись;
- изменение данных профиля (своих данных, пороля, аватарки);
- просмотр своих объявлений;
- добавление, редактирование, удаление объявления;
- добавление, редактирование, удаление своих комментариев к объявлению;
- загрузка, изменение изображений объявления;

  Для администраторов:
- поиск по объявлениям;
- регистрация;
- вход/выход в учетную запись;
- изменение данных профиля (своих данных, пороля, аватарки);
- добавление, редактирование, удаление всех объявлений;
- редактирование, удаление комментариев ко всем объявлениям;
- загрузка, изменение изображений объявления и аватарок зарегистрированных;

## ЗАПУСК ПРИЛОЖЕНИЯ:
- клонировать проект в среду разработки;
- настроить подключение к базе данных в файле application.properties;
- установить приложение Docker и запустить его;
- скачать Docker образ с помощью команды docker: docker run -p 3000:3000 --rm ghcr.io/bizinmitya/front-react-avito:v1.19
- запустить Docker образ в командной строке с помощью команды docker run -p 3000:3000 ghcr.io/bizinmitya/front-react-avito:latest
- Запустить метод main в файле HomeworkApplication.java
- После этого вам будет доступен сайт http://localhost:3000 и Swagger UI http://localhost:8080/swagger-ui/index.html#.

### Используемые технологии:
- Java 11
- Maven
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Swagger
- Lombok
- GIT
- REST
- Stream API

* DB operation:
- PostgreSQL
- Liqubase

## dockerfile

**Базовый образ с JDK**
FROM openjdk:11

**Устанавливаем рабочую директорию**
WORKDIR /app

**Копируем проект в контейнер**
COPY src /app/src

**Команда для создания директории для документации**
RUN mkdir -p /app/docs

**Генерация документации с помощью Javadoc**
RUN javadoc -d /app/docs -sourcepath /app/src -subpackages ru

**Устанавливаем начальную команду для контейнера**
CMD ["sh", "-c", "echo 'Документация создана в /app/docs'; ls /app/docs"]


## Запуск контейнера

1. docker build -t java-doc-generator .
2. docker run --rm -v "$(pwd)/docs:/app/docs" java-doc-generator

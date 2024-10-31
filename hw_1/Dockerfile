FROM openjdk:17-slim

WORKDIR /app

COPY . .

CMD ["javadoc", "-d", "docs", "-sourcepath", "app/src", "-subpackages", "ru"]

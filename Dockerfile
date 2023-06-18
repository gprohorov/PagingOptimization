FROM docker.io/library/mariadb:10.3.13
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=user
ENV MYSQL_DATABASE=db_news
COPY *.sql /docker-entrypoint-initdb.d/

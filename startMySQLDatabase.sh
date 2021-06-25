docker run -p 3306:3306 --name some-spring-mariadb \
    -e MARIADB_RANDOM_ROOT_PASSWORD=yes \
    -e MARIADB_DATABASE=coronastats \
    -e MARIADB_USER=springuser \
    -e MARIADB_PASSWORD=ThePassword \
    -d mariadb
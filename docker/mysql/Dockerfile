FROM mysql

EXPOSE 3306

# Copy the setup script to the container
COPY ./my.cnf /etc/mysql/my.cnf

# Copy the DDL script to the container
COPY ./sql_init /docker-entrypoint-initdb.d

# Change the atuhority of the setup script
RUN chmod 644 /etc/mysql/my.cnf
RUN chown -R mysql:mysql /var/lib/mysql
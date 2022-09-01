FROM debian:sid
RUN apt update -y
RUN apt install nano -y
CMD ["/bin/nano", "/tmp/notes"]

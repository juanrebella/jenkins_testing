FROM debian:sid
RUN apt install -y update
RUN apt install nano
CMD ["/bin/nano", "/tmp/notes"]

FROM ubuntu:14.04.3

ENV GIT_REPO https://github.com/despick/git-maven-run.git

RUN apt-get install -y git && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

RUN git clone $GIT_REPO /root/gitapp

CMD git
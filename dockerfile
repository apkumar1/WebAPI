FROM golang:1.8-alpine
ADD . /src/java
RUN go install java

FROM alpine:latest
COPY --from=0 /bin/java
ENV PORT 8080
CMD ["./java"]

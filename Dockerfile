FROM openjdk:8-alpine

COPY target/uberjar/jim-emacs-fun-mxnet.jar /jim-emacs-fun-mxnet/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/jim-emacs-fun-mxnet/app.jar"]

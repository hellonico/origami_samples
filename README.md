This is a generated origami project


# generated using

```
lein new clj-opencv opencv4
```

# Using leiningen 

```
lein run -m opencv4.ok
lein run -m opencv4.simple
lein run -m opencv4.tutorial
lein run -m opencv4.webcam
```

# Using clj

```
clj -m opencv4.ok
clj -m opencv4.simple
clj -m opencv4.tutorial
clj -m opencv4.webcam
```

# docker 

This also allows to run directly on a docker container and a Dockerfile is included here.

```
# build first
docker build -t my-origami-app .

# run via lein
docker run -it my-origami-app

# or another one of the samples:
docker run -it my-origami-app lein run -m opencv4.simple

# or with clj
docker run -it my-origami-app clojure -m opencv4.ok
```

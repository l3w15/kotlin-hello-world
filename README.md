# hello_world

Auto generated gradle project

# Requirements

- Java 8
- Docker

Note: most of the code is written in Kotlin, which is perfectly compatible with JDK 8.

# Building

```bash
bin/build.sh
```

# Creating a docker image

For now it's only created locally
```bash
bin/docker-build.sh
```

And then run:
```bash
docker run hello_world
```

You can see the image with
```bash
docker ps
```

This is just to test if the Dockerfile and project setup are correct. 
Running for dev purposes can be done in a simpler way. See below.

# Running

You can either run the generated jar after a build.
```bash
bin/run-jar.sh
```

Or you can build and run through gradle:
```bash
 ./gradlew bootRun
```

Best thing to do for local development is actually debugging via the IDE.


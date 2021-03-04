# Java seed project

This is a seed project that can be used to kickstart the development of a new java project using gradle.

## Building and running

Use the gradle task `build` to generate the jar and run the unit tests:

```shell
./gradlew build
```

The built jar can be found in `build/libs`.

This will also build a distribution in the form of a zip file containing all of the dependencies needed to run this project.
It can be found under `build/distributions`.

Alternatively, you can build run the unit tests, build the jar or distribution separately by using the tasks `test`, `jar` and `assemble`.

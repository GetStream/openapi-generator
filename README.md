# OpenAPI Generator

This is just a fork of the official OpenAPI Generator, we do not even try to keep things in sync and we will likely going to ditch everything and rewrite in Golang in the future.

## How to make changes to generated code

First of all you need to clone this repo, hava Java 8 and maven installed. After that you need to compile the whole bang into a `jar` 

```bash
mvn clean package -DskipTests
```

Once you have this you can run the jar to generate code

```bash
java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
   -i ~/src/protocol/openapi/video-openapi.yaml --additional-properties=library=jvm-retrofit2,useCoroutines --skip-validate-spec \
   -g kotlin \
   -o kt
```

The whole code generation relies mostly on Java parsing the YAML file from the OpenAPI spec and then loop-render mustache templates.

Each language has its own path with its own mustache files, the way this files are structured is pretty different but in general you probably want to look at the `model.mustache` file and see what other sub-templates it imports.

Templates are all stored under `modules/openapi-generator/src/main/resources`, when modifying templates you definetely do not want to rebuild the whole jar, to do this make sure to pass the cli jar the path where templates are (the path must by absolute so YMMV here).

### Change Kotlin codegen template

This will build the `~/src/protocol/openapi/video-openapi.yaml` spec file using the templates in `~/src/openapi-generator/modules/openapi-generator/src/main/resources/kotlin-client/`. Generated code is placed in the `kt` path.

```bash
java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
   -i ~/src/protocol/openapi/video-openapi.yaml --additional-properties=library=jvm-retrofit2,useCoroutines --skip-validate-spec \
   -t ~/src/openapi-generator/modules/openapi-generator/src/main/resources/kotlin-client/ \
   -g kotlin \
   -o kt
```

You can find more info on how templating works as well as debugging stuff [here](https://github.com/GetStream/openapi-generator/blob/master/docs/templating.md)

## How to publish my changes

Once you are happy with your changes, just push them to the master branch and wait 20 minutes. Github will generate a new docker image automatically.

# Time's up back-end
This project aims at implementing the backend mechanisms for a time's up game

## Table des matières
- [Time's up back-end](#times-up-back-end)
  - [Table des matières](#table-des-matières)
  - [Bien démarrer](#bien-démarrer)
    - [Prérequis](#prérequis)
    - [Comment lancer un build](#comment-lancer-un-build)
    - [Comment lancer l'application](#comment-lancer-lapplication)
  - [TODO](#todo)

## Bien démarrer

### Prérequis
Ce projet a été construit avec:
- [Gradle 6.0.1](https://docs.gradle.org/6.0.1/userguide/getting_started.html) : package management
- [Java 13](https://jdk.java.net/13/) : JVM
- [Kotlin 1.3.61](https://blog.jetbrains.com/kotlin/2019/11/kotlin-1-3-60-released/) : langage principal

### Comment lancer un build
```bash
gradlew clean build
```

### Comment lancer l'application
:warning: TODO

Une fois l'application lancée, un swagger est disponible à l'adresse :
`http://localhost/api/v1/swagger-ui.html#`

## TODO
- log + correlation_id
- Gestion Exceptions
- swagger : :warning: A relire
- TUs à init
- File

# générer image docker

construire le jar avec la tâche grade bootJar

créer le contrneur :
sudo docker build --rm -t timesup_back .

push sur le repo :
sudo docker tag timesup_back julienferezou/timesup_back:latest
sudo docker push julienferezou/timesup_back:latest
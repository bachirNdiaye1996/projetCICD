node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

    stage("Compilation") {
      sh "mvn clean install"
    }

    stage("Compilation") {
      sh "mvn spring-boot:run"
    }
}
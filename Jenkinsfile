node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

    stage("Compilation") {
      sh "mvn clean install"
    }

    stage("Running") {
      sh "mvn spring-boot:run"
    }
}
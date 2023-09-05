node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

  stage("Compilation") {
    sh "mvn clean install"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "mvn test -Punit"
    }
    stage("Deployment") {
      sh 'nohup mvn spring-boot:run -Dserver.port=8001 &'
    }
  }
}
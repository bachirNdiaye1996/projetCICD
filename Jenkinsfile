node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

  stage("Compilation") {
      withMaven(maven: "maven3.9.1", jdk: 'jdk8') {
        sh 'mvn -Dmaven.test.skip clean package '
      }
  }
}
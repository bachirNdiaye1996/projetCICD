node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

    stage("Build") {
      sh 'mvn -Dmaven.test.skip clean package '
    }

    stage("Deploy") {
        sh "echo Deploy UM"
        deployJar("target/demo.war", "/opt/tomcat/webapps")
    }
}


def deployJar(jarPath, destDir) {
    sh "sudo cp ${jarPath} ${destDir}"
}

node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/bachirNdiaye1996/projetCICD.git'
  }

    stage("Build") {
      sh 'mvn -Dmaven.test.skip clean package '
    }

    stage("Deploy") {
        sh "echo Deploy UM"
        deployJar("target/demo-0.0.1-SNAPSHOT.jar", "/var/lib/tomcat9/webapps")
    }
}


def deployJar(jarPath, destDir) {
    sh "sudo -s cp ${jarPath} ${destDir}"
}

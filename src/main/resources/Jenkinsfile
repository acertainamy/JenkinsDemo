// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 echo 'build start'
//                 sh 'mvn --version'
//                 echo 'build end'
//             }
//         }
//         stage('Test') {
//             steps {
//                 //
//                 echo 'Test start'
//                 echo 'Test end'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 //
//                 echo 'Deploy start'
//                 echo 'Deploy end'
//             }
//         }
//     }
// }

pipeline {
    stage('package') {
      agent {
        docker {
          image 'maven:3.6-alpine'
          args '-v /opt/data/aliyun-jenkins-maven:/root/.m2'
        }
      }
      steps {
        sh 'mvn package -Dmaven.test.skip=false'
        junit 'target/surefire-reports/*.xml'
        stash(name: 'copy jar', includes: 'target/*.jar')
      }
    }
}

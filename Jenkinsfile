pipeline {
    agent any

    environment {
        MAVEN_HOME = tool name: 'maven-container', type: 'maven'
//         JAVA_HOME = tool name: 'JDK 17', type: 'jdk'
//         DOCKER_CREDENTIALS_ID = 'docker-credentials'
//         DOCKER_IMAGE = 'seu-usuario/seu-repositorio'
//         SONARQUBE_ENVIRONMENT = 'sonarqube'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/marcusvbrangel/spring-jenkins.git', branch: 'developer'
                echo "MAVEN_HOME: ${MAVEN_HOME}"
                echo "maven-container: ${env.maven-container}"
            }
        }

//         stage('Build') {
//             steps {
//                 sh "${MAVEN_HOME}/bin/mvn clean install"
//             }
//         }

//         stage('Test') {
//             steps {
//                 sh "${MAVEN_HOME}/bin/mvn test"
//             }
//         }

//         stage('SonarQube Analysis') {
//             environment {
//                 scannerHome = tool 'SonarQube Scanner'
//             }
//             steps {
//                 withSonarQubeEnv('SonarQube Server') {
//                     sh "${scannerHome}/bin/sonar-scanner"
//                 }
//             }
//         }

//         stage('Build Docker Image') {
//             steps {
//                 script {
//                     docker.build(DOCKER_IMAGE)
//                 }
//             }
//         }

//         stage('Push Docker Image') {
//             steps {
//                 script {
//                     docker.withRegistry('', DOCKER_CREDENTIALS_ID) {
//                         docker.image(DOCKER_IMAGE).push()
//                     }
//                 }
//             }
//         }

//         stage('Deploy') {
//             when {
//                 branch 'main'
//             }
//             steps {
//                 echo 'Deploying to production...'
//                 // Adicione aqui os comandos ou scripts necessários para o deploy
//             }
//         }
    }

//     post {
//         always {
//             junit '**/target/surefire-reports/*.xml'
//             cleanWs()
//         }
//     }
}

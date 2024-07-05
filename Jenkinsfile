pipeline {
    agent any

    environment {
        MAVEN_HOME = tool name: 'maven-387-container', type: 'maven'
        JAVA_HOME = tool name: 'java-openjdk-17011-container', type: 'jdk'
        GIT_HOME = tool name: 'git-2392-container', type: 'git'
//         GIT_HOME = tool name: 'Default', type: 'git'
//         DOCKER_CREDENTIALS_ID = 'docker-credentials'
//         DOCKER_IMAGE = 'seu-usuario/seu-repositorio'
//         SONARQUBE_ENVIRONMENT = 'sonarqube'
//         SONARQUBE_ENVIRONMENT = 'SonarQube Scanner'
    }

    stages {
        stage('Checkout') {
            steps {
//                 echo "-----------------------------------------------------------------------"
//                 echo "MAVEN_HOME: ${MAVEN_HOME}"
//                 echo "JAVA_HOME: ${JAVA_HOME}"
//                 echo "GIT_HOME: ${GIT_HOME}"
//                 echo "SONARQUBE_ENVIRONMENT: ${SONARQUBE_ENVIRONMENT}"
//                 echo "-----------------------------------------------------------------------"
                git url: 'https://github.com/marcusvbrangel/spring-jenkins.git', branch: 'developer'
            }
        }

        stage('Build') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn clean install -DskipTests"
            }
        }

        stage('Test') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('SonarQube Analysis') {
            environment {
                scannerHome = tool 'SonarQube Scanner'
//                 scannerHome = tool 'sonarscanner-46-container'
            }
            steps {
                withSonarQubeEnv('SonarQube Server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }

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

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            cleanWs()
        }
    }
}

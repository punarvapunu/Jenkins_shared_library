def call(Map config) {
    echo "URL: ${config.url}"
    echo "BRANCH: ${config.branch}"
        checkout([$class: 'GitSCM',
                    branches: [[name: config.branch]],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [],
                    userRemoteConfigs: [[url: config.url,
                    credentialsId: config.credentialsId]]])
}
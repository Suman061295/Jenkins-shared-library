def call(Map config) {
    echo "URL: ${config.url}"
    echo "Branch: ${config.branch}"
    checkout([
        $class: 'GitSCM',
        branches: [[name: config.branch ]],
        userRemoteConfigs: [[ url: config.url,
        credentialsId: config.credentialsId ]],
    ])
}
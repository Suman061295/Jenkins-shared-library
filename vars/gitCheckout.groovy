def call(Map config) {
    echo "URL: ${config.url}"
    echo "Branch: ${config.branch}"
    if (config.branch == "main" ) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: config.branch ]],
        userRemoteConfigs: [[ url: config.url,
        credentialsId: config.credentialsId ]]])
} else {
    echo "Branch ${config.branch} is not allowed."
}
}
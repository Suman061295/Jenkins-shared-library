def call(map confg) {
    echo "URL: ${confg.url}"
    echo "Branch: ${confg.branch}"
    checkout([
        $class: 'GitSCM',
        branches: [[name: confg.branch ]],
        userRemoteConfigs: [[ url: confg.url,
        credentialsId: confug.credentialsId ]],
    ])
}
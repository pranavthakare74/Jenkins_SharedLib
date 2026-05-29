// Define function
def call("wanderlust-backend-beta", "${params.BACKEND_DOCKER_TAG}", "pranavthakare74"){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

def call()
{
  sh 'echo hello aslam is this your first lib'
  sh 'date'
  sh 'sudo netstat -ap | grep 8080'
}

def call()
{
  sh 'echo hello aslam is this your first lib'
  sh 'date'
  sh 'netstat -ap | grep 8080'
}

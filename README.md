# quarkus hello world

* `HelloService` returns a parametrized greeting message
* `HelloWorldController` exposes endpoints
* `smallrye` health check extension installed, view endpoints:
  * /q/health
  * /q/health/live - The application is up and running. 
  * /q/health/ready - The application is ready to serve requests. 
  * /q/health/started - The application is started. 
  * /q/health - Accumulating all health check procedures in the application.
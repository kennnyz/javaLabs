package lab2.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("github.com/golang/go");
        project.run();
    }
}

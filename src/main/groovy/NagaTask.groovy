import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class NagaTask extends DefaultTask {

    @TaskAction
    void print() {
        println "Hello"
    }
}

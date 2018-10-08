/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification

class MainTest extends Specification {
    def "Greeting uses the word 'Hello' and greets #name"() {
        when:
        def result = Main.getGreeting(name)

        then:
        result =~ /Hello/
        result =~ /$name/

        where:
        name << ["world", "Anna", "Tobi", "Jeff"]
    }
}
package examples.spock.datadriven;
import spock.lang.*

class HelloSpockTest extends spock.lang.Specification {
	//	def "length of Spock's and his friends' names"() {
	@Unroll
	def "length of #name name is #length"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 4
		"Scotty" | 6
	}

	//@Ignore(value="Work in progress")
	def "some other spec"() {
		expect:
		name.size() == length

		where:
		name | length
		"Spock"| 5
		"Kirk"   | 4
		"Scotty" | 6
	}
}

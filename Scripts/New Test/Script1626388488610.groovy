import groovy.time.TimeCategory


def acceptedFormat = "MM/dd/yyyy"
def today = new Date()
def currentdate = today.format(acceptedFormat)
println(currentdate)
def repeatUntil = ''
use(TimeCategory) {
	def sevenDays = today + 5.weeks
	repeatUntil = sevenDays.format(acceptedFormat)
	println(repeatUntil)
}


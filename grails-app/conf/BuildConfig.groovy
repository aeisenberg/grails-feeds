grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

forkConfig = [maxMemory: 1024, minMemory: 64, debug: false, maxPerm: 256]
grails.project.fork = [
   test: forkConfig, // configure settings for the test-app JVM
   run: forkConfig, // configure settings for the run-app JVM
   war: forkConfig, // configure settings for the run-war JVM
   console: forkConfig // configure settings for the Swing console JVM
]

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    inherits("global") { }
    log "error"
    checksums true
    legacyResolve false

    repositories {
	    grailsPlugins()
	    grailsHome()
	    grailsCentral()
        mavenLocal()
        mavenCentral()
    }

	dependencies {
		compile 'rome:rome:0.9'
		compile 'rome:modules:0.3.2'
	}

    plugins { 
		build ":release:3.0.0"
		build ":rest-client-builder:1.0.3"
	}
}
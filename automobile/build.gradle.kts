plugins {
    id("java")
    id("application")
}

group = "dev.penchev.automobile"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
  mainClass = "dev.penchev.automobile.Main"
}

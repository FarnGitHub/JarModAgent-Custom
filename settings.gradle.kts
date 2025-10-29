dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.quiltmc.org/repository/release")
    }
}

rootProject.name = "jarmod-agent"

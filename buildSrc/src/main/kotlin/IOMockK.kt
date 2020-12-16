object IOMockK : DependencyGroup("io.mockk", "1.10.2") {

    object MockK : Dependency(IOMockK.group, "mockk", IOMockK.version)

}
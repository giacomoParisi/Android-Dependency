package dependencies.karumi

import dependencies.Dependency
import dependencies.DependencyGroup

object Karumi : DependencyGroup("com.karumi", "6.2.1") {

    object Dexter : Dependency(Karumi.group, "dexter", Karumi.version)

}
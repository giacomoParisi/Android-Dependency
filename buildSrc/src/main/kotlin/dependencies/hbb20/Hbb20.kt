package dependencies.hbb20

import dependencies.Dependency
import dependencies.DependencyGroup

object Hbb20 : DependencyGroup("com.hbb20", "2.4.1") {

    object Ccp : Dependency(Hbb20.group, "ccp", Hbb20.version)

}
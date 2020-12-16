package dependencies.genderg

import dependencies.Dependency
import dependencies.DependencyGroup

object GrenderG : DependencyGroup("com.github.GrenderG", "1.5.0") {

    object Toasty : Dependency(GrenderG.group, "Toasty", GrenderG.version)

}
package dependencies.philjay

import dependencies.Dependency
import dependencies.DependencyGroup

object PhilJay : DependencyGroup("com.github.PhilJay", "3.1.0") {

    object MpAndroidChart : Dependency(PhilJay.group, "MPAndroidChart", PhilJay.version)

}
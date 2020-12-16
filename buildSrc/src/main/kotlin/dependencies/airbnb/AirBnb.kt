package dependencies.airbnb

import dependencies.Dependency
import dependencies.DependencyGroup

object AirBnb : DependencyGroup("com.airbnb.android", "3.5.0") {

    object Lottie : Dependency(AirBnb.group, "lottie", AirBnb.version)

}
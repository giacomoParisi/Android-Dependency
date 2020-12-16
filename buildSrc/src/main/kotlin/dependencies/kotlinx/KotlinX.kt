package dependencies.kotlinx

import dependencies.Dependency
import dependencies.DependencyGroup

object KotlinX : DependencyGroup("org.jetbrains.kotlinx", "1.4.1") {

    object Coroutines {

        object Core : Dependency(
            KotlinX.group,
            "kotlinx-coroutines-core",
            KotlinX.version
        )

        object Android : Dependency(
            KotlinX.group,
            "kotlinx-coroutines-android",
            KotlinX.version
        )

    }

}
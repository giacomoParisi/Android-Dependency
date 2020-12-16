package dependencies.gcacace

import dependencies.Dependency
import dependencies.DependencyGroup

object GCacace : DependencyGroup("com.github.gcacace", "1.3.1") {

    object SignaturePad : Dependency(GCacace.group, "signature-pad", GCacace.version)

}
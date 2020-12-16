package dependencies.mp4parser

import dependencies.Dependency
import dependencies.DependencyGroup

object Mp4Parser : DependencyGroup("com.googlecode.mp4parser", "1.1.22") {

    object IsoParser : Dependency(Mp4Parser.group, "isoparser", Mp4Parser.version)

}
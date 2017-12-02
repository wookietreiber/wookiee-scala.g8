package $name$

object Hello extends App {
  println(s"""hello world, this is \${BuildInfo.name} \${BuildInfo.version}""")
}

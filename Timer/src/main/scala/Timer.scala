object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def timeFlies() {
    println(this.toString())
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }

  override def toString() =
    "herro"
}
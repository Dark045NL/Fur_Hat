// Normal state defined as immutable variable (val)
val MyState = state {
    onEntry {
        furhat.say("hello world")
    }
    // Other handlers
}  

// State with parameters defined as function (fun)
fun MyDynamicState(text: String) = state {
  onEntry {
    furhat.say("hello $text") // Kotlin string interpolation
  }
}
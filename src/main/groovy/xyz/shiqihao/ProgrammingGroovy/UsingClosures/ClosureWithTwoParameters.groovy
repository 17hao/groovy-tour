def tellFortune(closure) {
    closure new Date("2020/7/6"), "Your day is filled with ceremony."
}

tellFortune { date, fortune ->
    println("Fortune for ${date} is '$fortune'")
}
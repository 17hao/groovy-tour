def pickEven(n, block) {
    for (int i = 2; i < n; i += 2) {
        block(i)
    }
}

pickEven(10) {print it}

res = 0
pickEven(10) {res += it}
println("res: $res")
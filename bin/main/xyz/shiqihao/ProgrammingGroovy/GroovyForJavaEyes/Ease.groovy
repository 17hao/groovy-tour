package xyz.shiqihao.ProgrammingGroovy.GroovyForJavaEyes

class Ease {
    static def foo(str) {
        // if (str != null) {str.reverse() }
        str?.reverse()
    }

    public static void main(String[] args) {
        println foo("evil")
        println foo(null)
    }
}

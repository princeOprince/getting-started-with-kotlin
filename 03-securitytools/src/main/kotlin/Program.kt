import com.princeoprince.Providers

//region01
//fun main(args: Array<String>) {
//    val providers = getProviders()
//
//    val it = providers.iterator()
//
//    while (it.hasNext()) {
//        println(it.next().name)
//    }
//}
//endregion

//region02
//fun listProviders() {
//    val providers = getProviders()
//
//    val it = providers.iterator()
//
//    while (it.hasNext()) {
//        val provider = it.next()
//        println(provider.name)
//
//        provider.forEach { key, value -> println("\t$key: $value") }
//    }
//}
//endregion

//region03
//fun listProvidersInstance() {
//
//    val allProviders = Providers.getProviders()
//
//    val it = allProviders.iterator()
//
//    while (it.hasNext()) {
//        val provider = it.next()
//        println(provider.name)
//
//        provider.forEach { key, value -> println("\t$key: $value") }
//    }
//}
//endregion

// region04
//fun main(args: Array<String>) {
//
//    val allProviders = Providers.getProviders()
//
//    val it = allProviders.iterator()
//
//    while (it.hasNext()) {
//        val provider = it.next()
//        println(provider.name)
//
//        provider.forEach { key, value -> println("\t$key: $value") }
//    }
//}
// endregion

// region05
//fun main(args: Array<String>) {
//
//    getAllProviders{
//        key, value -> println("\t ---- $key: $value")
//    }
//
//}
// endregion


fun main(args: Array<String>) {

    val providers = Providers()
    val details = providers.getAllProvidersEx("Random")

//    val details = providers.getAllProviders("Random")

//    details.forEach{
////        detail -> println("${detail.providerName}, ${detail.name}")
////        println("${it.providerName}, ${it.name}")
////        println(it)
//    }

//    val details = providers.getAllProvidersEx("Random")

    details.forEach(::println)

}



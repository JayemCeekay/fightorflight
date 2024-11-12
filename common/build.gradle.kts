architectury {
    common("neoforge", "fabric")
    platformSetupLoomIde()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    modCompileOnly("com.cobblemon:mod:${project.properties["cobblemon_version"]}")

    modApi("me.shedaniel.cloth:cloth-config:${project.properties["cloth_config_version"]}")
    modApi("dev.architectury:architectury:${project.properties["architectury_version"]}")
}
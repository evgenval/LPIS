package config;

public interface Config {
    String COMPILE_PACKAGE_PREFIX = "./compiled";
    String COMPILE_PACKAGE_NAME = "result";
    String compiledFileName = COMPILE_PACKAGE_PREFIX + "/src/" + COMPILE_PACKAGE_NAME + "/Main.java";
    String compiledJar = COMPILE_PACKAGE_PREFIX + "/target/compiled.jar";
}

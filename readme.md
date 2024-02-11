# AUTOMATIZACIÓN WEB - [DEMOBLAZE](https://www.demoblaze.com/)

Este proyecto de automatización para la aplicación web demoblaze esta hecho con las herramientas Selenium Web Driver y
desarrollado con Java 1.8.

# Herramientas y/o tecnologías a usar

* **Intellij IDEA:** Este IDE permitirá crear proyectos.
* **JDK Java verisón 1.8:** Configurar como variable de entorno.
* **Depedencias Selenium:** Estas dependencias se debe ingresar en el POM.XML
* **apache-maven-3.8.6:** Descargar package y configurar como variable de entorno.

# Configurar proyecto

1. Crear proyecto de tipo MAVEN
2. Ingresar las dependencias de selenium en el pom.xml
3. Ejecutar comando `mvn install` a través de la terminal

**Nota**: Si ya tienes definido test de prueba, puedes ejecutar el comando `mvn install -DskipTests` para omitir dichos
tests.

# Dependencias

1. **Cucumber Java**: Esta dependencia te permite utilizar Cucumber en tu proyecto Java.
   **`Repositorio`**: https://mvnrepository.com/artifact/io.cucumber/cucumber-java

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.11.1</version>
            <scope>compile</scope>
        </dependency>

2. **Cucumber JUnit**: Esta dependencia te permite ejecutar pruebas de Cucumber con JUnit.

**`Repositorio`**: https://mvnrepository.com/artifact/io.cucumber/cucumber-junit

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.11.1</version>
            <scope>compile</scope>
        </dependency>

3. **Selenium Java**: Esta dependencia te permite utilizar Selenium WebDriver en tu proyecto Java.

**`Repositorio`**: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.8.0</version>
            <scope>compile</scope>
        </dependency>

4. **Extentreports**: Esta dependencia permite mostrar reporte de las escenarios/casos de prueba ejecutados.

**`Repositorio`**: https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter

      <dependency>
            <groupId>tech.grasshopper</groupId>
            <artifactId>extentreports-cucumber7-adapter</artifactId>
            <version>1.10.1</version>
      </dependency>

# Tags para ejecución de feature

##### Para ejecutar los features de web, de manera independiente, utilizar lo siguiente:

| web Feature                              | TAG             |
|------------------------------------------|-----------------|
| Ejecución de todos los casos de pruebas. | @test-execution |
| Ejecutar casos de pruebas agrupados      | @test-group     |
| Ejecutar casos de pruebas independientes | @test-**        | 

# Referencias

* `Selenium:` https://www.selenium.dev/documentation/webdriver/
* `Java Documentation - Selenium Web Driver:` https://www.javatpoint.com/selenium-webdriver
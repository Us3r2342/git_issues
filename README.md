# Tienda Issues

Pequeña aplicación de tienda en Java para practicar el flujo de trabajo con **issues** en GitHub.

El proyecto **compila**, pero tiene errores que aparecen **al ejecutarlo**. Cada alumno tiene asignada una issue con uno de esos errores.

## Requisitos

- JDK 17 o superior
- IntelliJ IDEA (trae Maven integrado)

## Abrir el proyecto

1. En IntelliJ: `File > Open...` y selecciona la carpeta del proyecto (la que contiene `pom.xml`).
2. Espera a que IntelliJ descargue las dependencias de Maven.

## Ver los errores

- **Ejecutar la demo:** abre `src/main/java/es/clase/tienda/Main.java` y pulsa ▶. Cada línea muestra el resultado esperado y el obtenido.
- **Ejecutar los tests:** botón derecho sobre `src/test/java` > `Run 'All Tests'`.
  Cada test se llama `issueNN_...`, con el número de su issue. Tu issue estará resuelta cuando **tu test** salga en verde.

Desde terminal: `mvn test`

## Cómo trabajar tu issue

1. Asígnate la issue en GitHub.
2. Crea una rama: `git checkout -b issue-NN`
3. Localiza el error, corrígelo y comprueba que tu test pasa.
4. Haz commit indicando la issue: `git commit -m "Corrige ... (fixes #NN)"`
5. Sube la rama y abre un Pull Request. Al fusionarlo, la issue se cerrará sola.

> Cambia solo el código necesario para tu issue. No modifiques los tests.

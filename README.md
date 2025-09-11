# 🔢 Calculadora en Java con Consola

Esta es una calculadora simple desarrollada en **Java** que permite realizar operaciones matemáticas básicas y algunas funciones adicionales como el cálculo de porcentajes y operaciones encapsuladas con paréntesis.

## 🚀 Características

* Operaciones básicas: suma, resta, multiplicación, división
* Cálculo de porcentajes
* Manejo de operaciones dentro de paréntesis
* Validación básica de operadores
* Resultados en formato entero o decimal según corresponda

## 🧱 Tecnologías utilizadas

* **Java SE**
* **Expresiones regulares** (`java.util.regex`) para la detección de operaciones
* **Scanner** para entrada de datos en consola

## 📦 Instalación y ejecución

1. Asegúrate de tener instalado **Java JDK 8** o superior.

2. Descarga o clona el repositorio:

```bash
git clone https://github.com/RamCodeZ3/Calculadora-Java.git
cd Calculadora-Java
```

3. Compila el código:

```bash
javac Calculator.java OperationsDetector.java Main.java
```

4. Ejecuta el programa:

```bash
java Main
```

## 📂 Estructura del proyecto

```
Calculadora-Java/
│
├── Calculator.java        # Clase principal con las operaciones matemáticas
├── OperationsDetector.java # Detección de operadores en cadenas
└── Main.java              # Punto de entrada, manejo de interacción con el usuario
```

## 💻 Ejemplo de uso

Entrada:

```
2(8+2)
```

Salida:

```
20
```

Entrada:

```
2*6
```

Salida:

```
12
```

## 📜 Licencia

Este proyecto se distribuye bajo la licencia MIT. Puedes usarlo, modificarlo y compartirlo libremente.

# Graphviz-with-java
> A continuación se presenta la serie de pasos que conlleva a hacer uso del software Graphviz en Windows, de tal forma que permita hacer un fácil uso en la implementación con Java 8, de esta forma nos evitamos de hacer una importación de librerías externas en gran cantidad.

## Pre-requisitos
_Primero descargamos el software necesario de la siguiente dirección_

```
Graphviz - Graph Visualization Software.
```
[Descargar](http://www.graphviz.org/download/)

## Instalación

Windows x64:
Añadimos a las variables de entorno la siguiente dirección, para poder trabajar con "dot.exe" para la versión de 64 bits.
_C:\Program Files (x86)\Graphviz2.38\bin_

Forma de compilación, cargando el archivo.dot
```sh
$ javac .\GraphvizJava.java
$ java GraphvizJava .\auto.dot .\auto.png
```

![1](./automata.png?raw=true "Autómata Generado")

## Licencia
Este proyecto está bajo la Licencia - mira el archivo [LICENSE](LICENSE) para detalles

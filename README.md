# Teoria de la Complejidad

## ¿Que es la teoria de la complejidad?

La teoría de la complejidad busca medir la dificultad de resolver un problema utilizando algoritmos. Es decir, busca descifrar los recursos necesarios para poder resolver un problema,  especialmente el tiempo y la memoria. La teoría de la complejidad estudia cómo crece la dificultad del problema cuando la cantidad de datos aumenta.

## Eficiencia de algoritmos

Se puede decir que un algoritmo es eficiente cuando puede resolver un problema utilizando la cantidad mínima de recursos posibles. Los cuales se pueden dividir en coste temporal y en coste espacial

El coste temporal es el tiempo que se demora un algoritmo en ejecutarse. El coste temporal no se mide en segundos debido a que este puede variar según el procesador. Por esta razón la medida que se utiliza es el número de operaciones básicas en función de  los datos de entrada. Generalmente se expresa con notación Big O.

El coste espacial se refiere a la cantidad de memoria que un algoritmo necesita requiere durante la ejecución. El coste espacial se divide en espacio de entrada y espacio auxiliar. El espacio de entrada es la memoria necesaria para almacenar los datos que recibe el algoritmo. Dentro del coste espacial se incluyen variables simples, estructura de datos y el uso de memoria en funciones. 

## Factores de tiempo de ejecución

Se refiere a las cosas que hacen que un algoritmo o programa tarde más o menos en ejecutarse.

### Factores Propios

Son los que dependen del algoritmo en sí. Su lógica, la cantidad de operaciones que hace, su estructura, y cómo crece su costo cuando aumenta el tamaño de la entrada. En análisis de algoritmos, esto se estudia con funciones como y con notación asintótica.

### Factores Circunstanciales

Son factores externos al algoritmo, como la computadora usada, el compilador, el lenguaje, el sistema, la implementación concreta o incluso ciertos datos de entrada. Estos factores afectan el tiempo real medido, pero no describen la eficiencia “pura” del algoritmo.

### Analisis Teorico

Consiste en estudiar el algoritmo sin ejecutarlo necesariamente, normalmente usando pseudocódigo y contando operaciones para expresar su tiempo como una función del tamaño de entrada. Sirve para comparar algoritmos de forma más general.

### Analisis Experimental

Consiste en implementar y medir el algoritmo en la práctica, probándolo con distintos tamaños de entrada y observando tiempos reales. Es útil porque da resultados concretos, aunque depende del entorno de prueba.

## Notacion Big O

Es el estándar matemático utilizado en computación para analizar la eficiencia de un algoritmo. Define cómo crece el tiempo de ejecución o el uso de memoria a medida que aumentamos la cantidad de datos (n)

### Mejor caso (𝛀 - Omega)

Es el escenario ideal donde el algoritmo realiza la menor cantidad de pasos posibles. Por ejemplo, al buscar un elemento en una lista, es encontrarlo en la primera posición.

### Peor caso (〇- Big O)

El escenario donde el algoritmo realiza la mayor cantidad de pasos. Es el caso más crítico para los programadores, ya que garantiza que el sistema funcionará correctamente incluso bajo máxima carga.

### Caso promedio (Θ - Theta)

Es el rendimiento esperado del algoritmo en condiciones normales, promediando todos los posibles escenarios de entrada.

# Continuara...

# Programación Funcional y Reactiva
## Higher Order Funtions

**Trabajo de Consulta**

**Objetivos**:

- Aplicar los conocimientos sobre funciones de orden superior.
- Enviar una función como parámetro.

### Descripción:


**Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese
método estable lo siguiente:**
```latex
\[ \int_{a}^{b} f(x) \, dx \approx \frac{b - a}{6} \left[ f(a) + 4f\left(\frac{a+b}{2}\right) + f(b) \right] \]

```
Un ejemplo de aproximación es el siguiente:
 ```latex
   1. \[ \int_{3}^{5} (-x^2 + 8x - 12) \, dx \approx 7.33 \]
 ``` 
Utilizando los conceptos expuestos anteriormente debe:
1. Crear una función con nombre (integracion) que use el método de Simpson para
   calcular el valor aproximado de cualquier función . Se recomienda analizar lo
   siguiente:
   - **El tipo de dato que devolverá la función integracion**
     Devolverá un Double.
   - **¿Cuáles son los parámetros que recibe la función?**
   La función integración recibe tres parámetros: dos enteros y una función como parámetro.
   ```scala
   def func_integracion(a:Int, b:Int, f:(Double) => Double):Double = {(b-a)*(f(a)+ (4*f((a+b)/2.0))+ f(b))/6}
   ```
2. Aproxima el valor de las siguientes integrales definidas usando la función integracion creada en el primer paso.

   ```latex
   1. \[ \int_{3}^{5} (-x^2 + 8x - 12) \, dx \approx 7.33 \]
   2.\[ \int_{0}^{2} (3x^2) \, dx \approx 8 \]
   3.\[ \int_{-1}^{1} (x + 2x^2 - x^3 + 5x^4) \, dx \approx 3.333 \]
   4.\[ \int_{1}^{2} \frac{2x + 1}{x^2 + x} \, dx \approx 1.09861 \]
   5.\[ \int_{0}^{1} e^x \, dx \approx 1.71828 \]
   6.\[ \int_{2}^{3} \frac{1}{\sqrt{x-1}} \, dx \approx 0.828427 \]
   7.\[ \int_{0}^{1} \frac{1}{1 + x^2} \, dx \approx 0.785398 \]
   ```
   ```scala
   val funcion1: (Double)=> Double =(x:Double) => -math.pow(x,2)+(8*x)-12
   val funcion2: (Double)=> Double=(x:Double) => 3*math.pow(x,2)
   val funcion3: (Double)=> Double=(x:Double) => x + (2*math.pow(x,2))-math.pow(x,3)+ (5*math.pow(x,4))
   val funcion4: (Double)=> Double=(x:Double) => ((2*x)+1)/(math.pow(x,2)+x)
   val funcion5: (Double)=> Double=(x:Double) => math.exp(x)
   val funcion6: (Double)=> Double=(x:Double) => 1 / math.sqrt(x-1)
   val funcion7: (Double)=> Double=(x:Double) => 1/ (1+math.pow(x,2))
   // Uso de la funcion integracion como parametro
   val x1= func_integracion(3,5,funcion1)
   val x2=func_integracion(0,2,funcion2)
   val x3= func_integracion(-1,1,funcion3)
   val x4= func_integracion(1,2,funcion4)
   val x5=func_integracion(0,1,funcion5)
   val x6=func_integracion(2,3,funcion6)
   val x7=func_integracion(0,1,funcion7)
   ```
   
3. Calcula el error que se presenta en cada aproximación. El error es igual al valor
absoluto de la resta entre el valor esperado y el valor obtenido, así:
   ```math
   |valorEsperado -valorObtenido|
   ```
   Para calcular el error, debes elaborar una función que haga el cálculo respectivo.
    ```scala
   def error (ve:Double,x: Double)= math.abs(ve -x)
   error(7.33,x1)
   error(8.0,x2)
   error(3.333,x3)
   error(1.09861,x4)
   error(1.71828,x5)
   error(0.828427,x6)
   error(0.785398,x7)
    ```
// Funciones F(x):
val funcion1: (Double)=> Double =(x:Double) => -math.pow(x,2)+(8*x)-12
val funcion2: (Double)=> Double=(x:Double) => 3*math.pow(x,2)
val funcion3: (Double)=> Double=(x:Double) => x + (2*math.pow(x,2))-math.pow(x,3)+ (5*math.pow(x,4))
val funcion4: (Double)=> Double=(x:Double) => ((2*x)+1)/(math.pow(x,2)+x)
val funcion5: (Double)=> Double=(x:Double) => math.exp(x)
val funcion6: (Double)=> Double=(x:Double) => 1 / math.sqrt(x-1)
val funcion7: (Double)=> Double=(x:Double) => 1/ (1+math.pow(x,2))
// Creación de la función con nombre (integracion) que use el método de Simpson para calcular el valor aproximado de cualquier función.
def func_integracion(a:Int, b:Int, f:(Double) => Double):Double =
{(b-a)*(f(a)+ (4*f((a+b)/2.0))+ f(b))/6}
//Aproxima el valor de las siguientes integrales definidas usando la función integracion
val x1= func_integracion(3,5,funcion1)
val x2=func_integracion(0,2,funcion2)
val x3= func_integracion(-1,1,funcion3)
val x4= func_integracion(1,2,funcion4)
val x5=func_integracion(0,1,funcion5)
val x6=func_integracion(2,3,funcion6)
val x7=func_integracion(0,1,funcion7)
//Calcula el error que se presenta en cada aproximación
def error(ve:Double,x: Double)= math.abs(ve -x)

error(7.33,x1)
error(8.0,x2)
error(3.333,x3)
error(1.09861,x4)
error(1.71828,x5)
error(0.828427,x6)
error(0.785398,x7)





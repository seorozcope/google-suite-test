# google-suite-test

En las automatizaciones de aplicativos moviles es necesario una capa adicional para la aplicación

Para realizar paralelismo en la ejecución podemos utilizar 

tasks.withType(Test) {
    systemProperties = System.properties
    maxParallelForks = Runtime.runtime.availableProcessors()
}

Donde se indica en la automatización la capacidad de los procesadores para atender las solicitudes.

La cantidad de runners que tiene una automatización indica la cantidad de paralelismo que podremos ejecutar

El paralelismo por lotes es la ejecución en diferentes dispositivos un número X de pruebas (no la misma prueba) 

Varios runner en la misma automatización para el mismo dispositivo no tiene sentido debido a la capacidad de respuesta.

¿Qué es un runner?
Se considera el punto de partida donde indicamos el punto de partida de la historia (Feature) y su interpretación en la capa lógica (Stepdefinition)


¿para qué funcionan las fachadas en facade?
Es un patrn que permite abstraerse de la implementación de otros sistemas y permite interactuar con métodos que no conocemos al enviarle la información que nos solicitan.


Screenplay

Actor : Representación de una persona
la prueba funcional es aquella que un actor / persona está ejecutando sobre una aplicación

The journey pattern es un patrón de diseño centrado en el actor.
El actor siempre es un objeto transversal en toda la aplicación.

PageObject

Solamente debe contener el mapeo de los elementos.

Documentación viva : especificación detallada de la prueba y los resultados, se llama viva porque se crea cada vez que se ejecutan las pruebas

Step definition
Se tiene un método con la etiqueta before y debe ejecutarse de forma obligatoria debido a que nos permite realizar una preparación del escenario de prueba (intancia el page, realiza el levantamiento de los driver, el ingreso a los aplicativos, preparación de datos)

Tareas
Acciones que realiza el actor 
una tarea puede estar compuesta de tareas y de interacciones

la interacción es una acción de bajo nivel que hace un usuario mientras que una tarea hace parte del negocio
___________________________

Si queremos identificar en una interacción o tarea si podemos interactuar con algún elemento.
Check.whether(SEARCH.resolveFor(actor).isVisible()).andIfSo(Click.on(SEARCH)).otherwise(do_something)


# Proyecto golf-proximo-tiro

Proximo tiro consiste en detectar que dada la distancia en metros y el viento
en metros por segundo nos indique que palo sería ideal utilizar.

Aunque también se podría calcular usando yardas y miles per hour.

## Instalacion

### Bajarse el Leiningen
[https://github.com/technomancy/leiningen]
 Es como un maven pero para Clojure.
 Estar seguros de tener version mayor a 1.x (los tests no funcionan en esta version)

### Dentro del proyecto hacer
```
$ lein deps
```
 Esto nos va a bajar las dependencias que necesitamos para correr el proyecto.
 
 Si queremos ejecutar bajo la misma session y probar code
 ```
$ lein repl
```
 De acá salir con Ctrl-D


## Uso

```
$ lein run
```

Me funciona con éste por el soporte en stdin (con version lein2 no es necesario, funca el de arriba)
```
$ lein trampoline run
```

Correr los test con
```
$ lein test
```

# Faltantes

- [x] que calcule los datos de un organizmo oficial
   Los datos fueron extraidos de [http://www.golfwrx.com/62549/how-far-should-you-hit-your-golf-clubs/]
- [x] Calcule en yardas y mph
- [ ] Calcule en sistema MKS
- [x] Hacer el programa interactivo
- [ ] Tests
 - [x] Hacer funcar los tests
 - [ ] Cobertura

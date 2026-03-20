package tarea4;

/**
 * Clase que contiene las funciones matematicas.
 * @author Ivan Cayon
 * @version 1.0
 * @since 2026
 */
public class Utilidades {

    /**
     * Convierte kilómetros por hora a metros por segundo.
     * @param kmh Velocidad en kilometros por hora.
     * @return Velocidad equivalente en m/s.
     */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Convierte grados decimales a radianes.
     * @param grados Valor en grados decimales.
     * @return El valor convertido a radianes.
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    /**
     * Convierte grados, minutos y segundos a radianes.
     * @param grados Grados enteros.
     * @param minutos Minutos de arco.
     * @param segundos Segundos de arco.
     * @return El valor se convierte a radianes.
     */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius Grados Celsius a convertir.
     * @return Grados Fahrenheit resultantes.
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit Grados Fahrenheit a convertir.
     * @return Grados Celsius resultantes.
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Calcula el área de un círculo dado su radio.
     * @param radio Radio del circulo.
     * @return Área del círculo.
     */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }

    /**
     * Calcula la longitud de una circunferencia.
     * @param radio Radio de la circunferencia.
     * @return Longitud de la circunferencia.
     */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Eleva un número al cuadrado.
     * @param num Numero base.
     * @return El resultado de elevar al cuadrado.
     */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }

    /**
     * Calcula la hipotenusa de un triángulo rectángulo.
     * @param cateto1 Longitud del primer cateto.
     * @param cateto2 Longitud del segundo cateto.
     * @return Longitud de la hipotenusa calculada.
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }

    /**
     * Calcula la longitud de un cateto conocido el otro y la hipotenusa.
     * @param hipotenusa Longitud de la hipotenusa.
     * @param cateto Longitud del cateto conocido.
     * @return Longitud del cateto buscado.
     */
    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }

    /**
     * Convierte millas por hora a kilómetros por hora.
     * @param mph Velocidad en millas por hora.
     * @return Velocidad en km/h.
     */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }

    /**
     * Convierte kilómetros por hora a millas por hora.
     * @param kmh Velocidad en kilometros por hora.
     * @return Velocidad en mph.
     */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }
}
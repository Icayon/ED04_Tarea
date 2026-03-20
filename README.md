# 🚀 Tarea ED04 - Entornos de Desarrollo

¡Bienvenido a mi repositorio de la Unidad de Trabajo 04! Este proyecto se centra en la aplicación de buenas prácticas de desarrollo, centrándose en el control de versiones, la optimización de código y la documentación profesional.

**Autor:** [Ivan Cayon]
**Módulo:** Entornos de Desarrollo
**Curso:** 2025 - 2026

---

## 🎯 Objetivos del Proyecto

Este repositorio recoge el trabajo realizado para cumplir con los tres pilares del desarrollo profesional exigidos en la tarea:

1.  **Control de Versiones:** Gestión integral mediante Git y despliegue en GitHub.
2.  **Refactorización:** Mejora de la legibilidad y estructura del código original utilizando las herramientas automáticas de IntelliJ IDEA.
3.  **Documentación:** Implementación de estándar JavaDoc para generar manuales técnicos automáticos.

---

## 🛠️ Refactorizaciones Realizadas

Siguiendo el principio de mejora continua, se han aplicado los siguientes cambios estructurales:

* **Organización:** Traslado de clases al paquete `tarea4`.
* **Renombrado de Métodos:** * `hip` ➔ `hipotenusa`
    * `cat` ➔ `catetoA`
* **Claridad de Parámetros:** Sustitución de variables genéricas (`c1`, `catetoB (hip)`, `catetoB (cat)`) por nombres descriptivos (`cateto1`, `cateto2`,`cateto`).
* **Identidad de Clases:** * `Pruebas` ➔ `Utilidades`
    * `JavaApplication9` ➔ `Tarea4`
* **Limpieza de Código:** Borrado seguro del método obsoleto `diasEnMesArray`.

---

## 📚 Documentación (JavaDoc)

El código fuente cuenta con comentarios estructurados que incluyen:
* **Nivel de Clase:** Etiquetas `@author`, `@version` y `@since`.
* **Nivel de Método:** Documentación técnica de parámetros con `@param` y valores de retorno con `@return`.

> [!TIP]
> Puedes encontrar el manual completo generado en formato HTML dentro de la carpeta `/javadoc`.

---

## 📂 Estructura del Proyecto

```text
.
├── src/
│   └── tarea4/
│       ├── Tarea4.java       # Clase principal (Main)
│       └── Utilidades.java   # Clase de métodos matemáticos
├── javadoc/                  # Documentación técnica generada
└── README.md                 # Presentación del proyecto

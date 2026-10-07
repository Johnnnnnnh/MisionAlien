# 👽 Misión Marciana: Control de Intents en Android

**Misión Marciana** es una aplicación móvil nativa desarrollada para Android en **Java** y **XML**. El proyecto demuestra la implementación práctica de **Intents Explícitos e Implícitos**, gestión de permisos en tiempo de ejecución y acceso al hardware del dispositivo (GPS y Cámara/Linterna).

---

## 🚀 Características Principales

* **Navegación e Intents Explícitos:** Transición entre actividades (`BienvenidaActivity`, `MainActivity`, `SegundaActivity`, `TerceraActivity`) y envío de datos mediante `putExtra()`.
* **Hardware e Intents Implícitos:**
  * Geolocalización en tiempo real (`LocationManager`) y apertura de mapas (`geo:`).
  * Control de linterna con `CameraManager` y apertura de cámara nativa.
  * Marcado de llamadas (`tel:`), navegador web (`https:`) y envío de correos (`mailto:`).
  * Acceso directo a la configuración de ubicación del sistema.

---

## 🛠️ Arquitectura y Buenas Prácticas

* **Recursos Centralizados:** Parámetros organizados en `colors.xml`, `strings.xml` y `dimens.xml`.
* **Manejo de Excepciones:** Control de llamadas a Intents Implícitos mediante bloques `try-catch` para garantizar compatibilidad con Android 11+ (API 30+).

---

## 👨‍💻 Autor y Desarrollador: John Tapia

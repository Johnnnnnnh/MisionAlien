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
## Captura de la APP
<img width="484" height="923" alt="image" src="https://github.com/user-attachments/assets/fffe1b50-6f1b-4730-be45-6172dab34726" />
<img width="442" height="929" alt="image" src="https://github.com/user-attachments/assets/aedaa457-3fa7-4b4e-bd33-c48b6939b726" />
<img width="443" height="937" alt="image" src="https://github.com/user-attachments/assets/fec0e83e-46ad-451c-8d23-a1fb7d648324" />
<img width="448" height="932" alt="image" src="https://github.com/user-attachments/assets/3094acd7-2b38-4722-af75-91e0a23f9b85" />




---

## 🛠️ Arquitectura y Buenas Prácticas

* **Recursos Centralizados:** Parámetros organizados en `colors.xml`, `strings.xml` y `dimens.xml`.
* **Manejo de Excepciones:** Control de llamadas a Intents Implícitos mediante bloques `try-catch` para garantizar compatibilidad con Android 11+ (API 30+).

---

## 👨‍💻 Autor y Desarrollador: John Tapia


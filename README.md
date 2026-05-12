# 🧪 Productos Service - Análisis de Calidad con SonarQube

## 📌 Información del proyecto
- Proyecto: productos-service  
- Tecnología: Spring Boot + Maven + Java 21  
- Herramienta de calidad: SonarQube (Local - Docker)  
- Autor: Estudiante Ingeniería de Sistemas  

---

## 🎯 Objetivo de la actividad

Configurar un Quality Gate personalizado en SonarQube, corregir Code Smells y Bugs detectados, mejorar métricas de calidad del código y automatizar el análisis con GitHub Actions.

---

## ⚙️ Configuración realizada

### 🔹 SonarQube
- Servidor local en Docker: http://localhost:9000  
- Proyecto analizado: `com.universidad:productos-service`

### 🔹 Quality Gate personalizado
Nombre: **Estándar Universidad**

Condiciones:
- Bugs > 0 ❌
- Vulnerabilities > 0 ❌
- Code Smells > 5 ❌
- Coverage < 60% ❌
- Duplicated Lines > 5% ❌

---

## 🛠️ Correcciones realizadas

### ✔ Bug corregido
Se eliminó el retorno de `null` en el método de búsqueda y se reemplazó por excepción controlada:

```java
.orElseThrow(() -> new NoSuchElementException("Producto no encontrado"));

## 📸 Evidencias del proyecto

### POST Crear tarea (201 Created)
![POST Tarea](./docs/post_tarea.PNG)

---

### GET Obtener tarea (200 OK)
![GET Tarea](./docs/get_tarea.PNG)

---

### PATCH Completar tarea (200 OK)
![PATCH Tarea](./docs/patch.PNG)

---

### GET Verificar tarea completada (200 OK)
![Verificar completada](./docs/GET_verificar_completada.PNG)

---

### GET Tarea inexistente (404 Not Found)
![404 Tarea](./docs/get_Tarea_inexistente.PNG)

---

### Ejecución Postman Runner (0 failures)
![Runner Postman](./docs/run_collections.PNG)

---

### Pruebas Postman (validaciones)
![Tests Postman](./docs/test_postman.PNG)

---

### Evidencia Selenium (tests en verde)
![Selenium Tests](./docs/test.PNG)

---

### GitHub Actions (Newman passing)
![GitHub Actions](./docs/evidencia3_github_actions_newman_green.PNG)


Autor
Diego Armando

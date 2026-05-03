## Capas

Bean (JSF)
↓
Service
↓
Repository
↓
JPA
↓
PostgreSQL

## Principios

- El Bean no tiene lógica de negocio
- El Service contiene reglas
- El Repository solo accede a datos
- La BD es controlada por Flyway

## Ramas

feat: nueva funcionalidad
fix: corrección de error
refactor: mejora interna
docs: documentación
test: pruebas
chore: tareas técnicas
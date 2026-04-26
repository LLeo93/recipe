# 🌍 Ricette dal Mondo - Backend

Server RESTful per l'applicazione mobile **Ricette dal Mondo**.  
Fornisce le API per l'esplorazione della cultura culinaria globale, gestendo il catalogo delle ricette e la persistenza dei dati tramite un'architettura robusta in **Java** e **Spring Boot**.

## ✨ Core Backend Features

* **RESTful API**: Endpoints ottimizzati per il recupero di ricette basate sulla selezione geografica (Mappa 3D).
* **Gestione Dati NoSQL**: Integrazione con **MongoDB** per una gestione flessibile del ricettario e dei metadati (difficoltà, costi, tempi).
* **CORS Configuration**: Già configurato con `@CrossOrigin(origins = "*")` per comunicare nativamente con l'app mobile Expo/React Native.
* **Auto-Deployment**: Pipeline di Continuous Deployment configurata su **Render**.
* **Health Check & Debug**: Endpoint dedicati e log al boot per verificare la connessione al database e la configurazione delle variabili d'ambiente.

## 🛠️ Stack Tecnologico

| Tecnologia | Descrizione |
| :--- | :--- |
| **Java 17+** | Linguaggio core per la logica di business |
| **Spring Boot 3.x** | Framework per la creazione di microservizi e REST API |
| **Spring Data MongoDB** | Astrazione per l'accesso ai dati su database NoSQL |
| **Lombok** | Riduzione del boilerplate code (@Data, @Builder, ecc.) |
| **Maven** | Gestione delle dipendenze e build automation |
| **MongoDB Atlas** | Database cloud-native per lo storage delle ricette |
| **Render** | Hosting cloud per il deployment dell'istanza backend |

## 🚀 Architettura e API

Il backend segue il pattern **Controller-Service-Repository** per garantire manutenibilità e separazione delle responsabilità.

### Endpoint Principali

| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| `GET` | `/api/recipes/country/{country}` | Filtra le ricette per paese (case-insensitive) |
| `GET` | `/api/recipes/{id}` | Recupera il dettaglio completo di una ricetta tramite ID |
| `GET` | `/api/recipes/test-db` | Recupera l'intera lista delle ricette (test connessione) |
| `GET` | `/check-config` | Verifica il caricamento corretto dell'URI del database |

## 📦 Installazione Locale

1.  **Clona il repository**
    ```bash
    git clone [https://github.com/LLeo93/recipe.git](https://github.com/LLeo93/recipe.git)
    cd recipe
    ```

2.  **Configura le variabili d'ambiente**
    Il progetto utilizza variabili dinamiche. Assicurati di impostare nel tuo ambiente o nel file `src/main/resources/application.properties`:
    ```properties
    MONGO_URI=mongodb+srv://<username>:<password>@cluster.mongodb.net/
    PORT=8080
    ```

3.  **Build ed Esecuzione**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## 🌐 Deployment

Il progetto è live su **Render**.  
> [!IMPORTANT]
> **Nota sul Cold Start**: Essendo ospitato su un'istanza gratuita, il primo avvio dopo un periodo di inattività potrebbe richiedere circa 30-50 secondi per il risveglio del server.

## 📅 Timeline Progetto

* **Pianificazione**: Definizione del modello `Recipe` e degli Enum `Difficolta` e `CostoPerPersona`.
* **Sviluppo**: Implementazione della logica di ricerca tramite `RecipeRepository`.
* **Integrazione**: Test di comunicazione e configurazione CORS per il frontend mobile.
* **Deploy**: Configurazione variabili d'ambiente e database cloud su MongoDB Atlas.

## 👥 Dev Team

* Gabriele
* Libanio
* Mihajlo
* Nicola

---
*Progetto realizzato come parte del modulo backend per l'app "Ricette dal Mondo".*
> https://github.com/kihotto/RicetteDalMondo

# 🚀 Code Enhancer AI

> Outil Java basé sur l'intelligence artificielle (OpenAI GPT-4) pour aider les entreprises à améliorer automatiquement la qualité de leur code source.

---

## 🎯 Objectif

Code Enhancer AI automatise :
- la lecture d’un projet Java depuis GitHub,
- l’analyse de ses fichiers `.java`,
- l’envoi à l’IA pour refactoring (réduction de la dette technique, amélioration lisibilité, commentaires…),
- la génération d’un package propre localement prêt à être utilisé ou versionné.

---

## ✅ Fonctionnalités de la version actuelle (v1.0.1)

- Entrée simulée via URL GitHub
- Traitement mocké avec amélioration IA fictive
- Génération locale d’un package Java dans un dossier `output/`
- Historique des prompts & réponses sauvegardés dans des fichiers `.txt`
- Intégration de logs SLF4J + Logback

---

## 🛣️ Feuille de route (Roadmap)

| Version | Fonctionnalité prévue |
|---------|------------------------|
| V1.0    | ✅ Entrée GitHub, sortie dossier local |
| V2.0    | 🛠️ Création automatique d’un nouveau dépôt GitHub |
| V3.0    | 🌐 UI web (Spring Boot + Thymeleaf ou React) |
| V4.0    | 🔐 Gestion utilisateur (authentification + API Key) |
| V5.0    | 🗃️ Suivi projet dans une base de données (PostgreSQL ou MongoDB) |
| V6.0    | ⚙️ CI/CD : Intégration GitHub Actions automatisée pour chaque refactoring |

---

## 📦 Structure du projet

code-enhancer-ai/
├── core/ # Orchestrateur principal
├── github/ # Clonage de dépôt GitHub
├── parser/ # Lecture et parsing des fichiers Java
├── ai/ # Interaction avec l'API OpenAI
├── writer/ # Écriture du package amélioré
├── persistence/ # Logs, prompts, métadonnées
├── docs/ # Documentation technique
├── pom.xml # Maven parent
└── .gitignore

---

## 🔧 Prérequis

- Java 21
- Maven
- Compte OpenAI (clé API via variable d’environnement `OPENAI_API_KEY`)
- Git installé

---

## ▶️ Utilisation


# Compilation Maven (multi-modules)
mvn clean install

# Lancement
java -cp core/target/core-0.1.0-SNAPSHOT.jar com.yourorg.core.CoreService \\
  https://github.com/mon-org/mon-projet-java mon-projet-refactored

---

## 🧪 Exemples de tests à implémenter (JUnit)

✅ Test du JavaParserService sur un fichier .java fictif

✅ Test du PromptBuilder avec un exemple de classe

✅ Test du OpenAIService avec mock de l’API OpenAI

✅ Test d’intégration de bout en bout (en local)

---

## 📚 Documentation

Consulte le dossier /docs pour :

overview.md : Vue d’ensemble du projet

roadmap.md : Évolutions futures

api.md : Spécifications internes (modules)

---

## 🧠 Technologies utilisées

Java 21

Maven multi-modules

OpenAI API (GPT-4)

Git CLI

JSON (log et stockage)

SLF4J (à venir)

---

## 🔐 Auteurs & Licence

**Auteur principal :** [fekihtomy](https://github.com/fekihtomy)

Ce projet est un logiciel privé et propriétaire.  
Tous droits réservés.

La distribution, modification, reproduction ou utilisation du code est strictement interdite sans autorisation explicite de l’auteur.

---

Ce projet est actuellement hébergé en privé sur GitHub.  
Pour toute demande d’accès ou collaboration, merci de contacter directement l’auteur.
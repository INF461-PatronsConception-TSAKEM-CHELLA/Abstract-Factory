<<<<<<< HEAD
# Patron de Conception : Abstract Factory (INF461 / INF4067)

Ce dépôt présente l'implémentation en Java du design pattern **Abstract Factory** (Fabrique Abstraite) dans le cadre du cours de Principes et Processus du Logiciel (Université de Yaoundé I — Enseignante : Pr. Kimbi Xaveria).

## 🎯 Objectif du Patron

Le patron **Abstract Factory** permet de fournir une interface unique pour créer des familles d'objets apparentés ou dépendants sans avoir à spécifier leurs classes concrètes. Le client manipule uniquement les interfaces abstraites des produits et des fabriques, garantissant ainsi un couplage faible.

---

## 📁 Structure du Projet

Le code source est organisé dans le dossier `src/` en deux packages distincts afin de séparer l'exemple de base du cours et la variante modifiée :

```text
src/
├── cours/                  # Implémentation de l'exemple du cours (2 familles de produits)
│   ├── ProduitA.java
│   ├── ProduitA1.java
│   ├── ProduitA2.java
│   ├── ProduitB.java
│   ├── ProduitB1.java
│   ├── ProduitB2.java
│   ├── IProduitFactory.java
│   ├── ProduitFactory1.java
│   └── ProduitFactory2.java
│
├── modifie/                # Exemple modifié (Ajout d'une 3e famille de produits : ProduitA3, ProduitB3, ProduitFactory3)
│   ├── ProduitA.java
│   ├── ProduitA1.java
│   ├── ProduitA2.java
│   ├── ProduitA3.java
│   ├── ProduitB.java
│   ├── ProduitB1.java
│   ├── ProduitB2.java
│   ├── ProduitB3.java
│   ├── IProduitFactory.java
│   ├── ProduitFactory1.java
│   ├── ProduitFactory2.java
│   └── ProduitFactory3.java
│
└── App.java                # Point d'entrée principal exécutant les tests des deux versions
=======
# Abstract-Factory
Pour l'implementation du patron de conception Abstract-Factory
>>>>>>> 7cf746a7aa5d4773e886443c4b600fc8c775ea91

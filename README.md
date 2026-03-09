# Gestion des Produits avec Spring Boot

## 1- Objectif du projet
Ce projet consiste à développer une application Web basée sur **Spring Boot** permettant de gérer des produits.

L'application permet de :
- afficher la liste des produits
- ajouter un produit
- supprimer un produit
- modifier un produit
- rechercher un produit
- sécuriser l'application avec Spring Security


### Technologies utilisées

- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Thymeleaf
- Spring Security
- H2 Database
- MySQL
- Lombok
- Bootstrap
- Spring Validation

  
## 2- Création du projet

Le projet est créé avec **Spring Initializr** avec les dépendances suivantes :
- Spring Web
- Spring Data JPA
- H2 Database
- MySQL Driver
- Thymeleaf
- Lombok
- Spring Security
- Spring Validation
  
Ces dépendances permettent de :
- créer une application Web

- gérer la base de données

- créer les vues HTML

- sécuriser l'application

## 3- Création de l'entité Product

Une entité Product est créée pour représenter les produits dans la base de données.

<img width="948" height="511" alt="image" src="https://github.com/user-attachments/assets/88db59be-be5d-4807-822a-7fcd538f03b9" />

## 4- Création du Repository

Une interface ProductRepository est créée.

<img width="1095" height="150" alt="image" src="https://github.com/user-attachments/assets/1706396e-a9e3-43e5-92d5-449e481283a3" />

## 5- Test de la couche DAO

<img width="1059" height="760" alt="image" src="https://github.com/user-attachments/assets/26795401-304e-4185-b155-df899edaffe4" />

<img width="1777" height="400" alt="image" src="https://github.com/user-attachments/assets/c5f0df19-4ba0-46f1-a4fa-36fe24b9885d" />

## 6- Désactivation de la sécurité par défaut

<img width="976" height="50" alt="image" src="https://github.com/user-attachments/assets/b3afe495-d653-4043-b293-e7000e25ff1c" />

## 7- Création du contrôleur Spring MVC

Un ProductController est créé pour gérer les requêtes HTTP.

Les fonctionnalités implémentées sont :

- Affichier la liste des produits
- Supprimer un produit
- Page template basée sur Thymeleaf layout et bootstrap
- Saisir et ajouter un produit avec la validation du formulaire
- Recherche des produits
- Edition et mise à jour d'un produit

<img width="1086" height="877" alt="image" src="https://github.com/user-attachments/assets/34c0d934-fa0c-4071-8fc7-831daa1045d4" />

<img width="1183" height="888" alt="image" src="https://github.com/user-attachments/assets/ddda85d6-c1b2-4f33-957d-704818611612" />

<img width="1856" height="812" alt="image" src="https://github.com/user-attachments/assets/825356b6-e7af-43a7-8171-c35f02a8a8f5" />

## 8- Sécuriser l'application avec Spring Security

<img width="1335" height="786" alt="image" src="https://github.com/user-attachments/assets/b3bae9e1-c506-4c77-97da-3c74d51bd10c" />

<img width="654" height="105" alt="image" src="https://github.com/user-attachments/assets/59ffacca-7460-4f64-b4fc-8b519d30a19d" />












































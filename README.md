# controle
L'objectif de ce projet est de développer un service Web à l'aide de Spring Boot afin de prendre en charge la gestion des articles et de leurs catégories.

Table "Article":

La table "Article" stocke les détails des articles présents dans le système. Chaque article est distingué de manière unique par un identifiant (ID) et comprend deux autres attributs essentiels : le nom de l'article et la date de production.

Table "Catégorie":

La table "Catégorie" répertorie les différentes catégories disponibles pour classer les articles. Chaque catégorie est identifiée de manière unique par un ID. Le champ "nom" spécifie le libellé ou le nom de la catégorie. Cette table sert de référence pour lier des catégories aux articles dans la table principale "Article", permettant ainsi d'organiser les articles en fonction de leurs sujets ou thèmes principaux.

# Base de données:

![controle](https://github.com/sana7867/controle/assets/147515885/e122f6af-51f6-48ce-9339-b2541b095483)

# Test avec Swagger:

# Article:

![ctrl2](https://github.com/sana7867/controle/assets/147515885/15a52da7-432f-458d-ac53-ef69365d851d)

#getAll:

![ctrl get ell ar](https://github.com/sana7867/controle/assets/147515885/dc0cbcb8-fbc7-4a35-b057-34ec02bec9fc)

#update:

![ctrl put ar](https://github.com/sana7867/controle/assets/147515885/74d8c63b-0d92-4d4b-9d4e-97fe1f083fd0)

#create:

![ctrl save art](https://github.com/sana7867/controle/assets/147515885/2fca52fa-d369-4f74-b67a-23853b312f54)

#delete:

![ctrl delete ar](https://github.com/sana7867/controle/assets/147515885/8c3cbe33-8c7a-4907-8a72-541983383b7c)

#getById:

![ctrl get ar id](https://github.com/sana7867/controle/assets/147515885/4e4f9baf-e47e-4703-b2a8-93378425a90f)

# Categorie:

![sw](https://github.com/sana7867/controle/assets/147515885/1983612b-b906-4ade-8810-6133ee30d099)

#create:

![ctrl3](https://github.com/sana7867/controle/assets/147515885/b2a56a74-c7b1-4962-ad10-47da2f541b37)

#update:

![ctrl put](https://github.com/sana7867/controle/assets/147515885/e707cbbf-24dd-41db-83d8-1bfe25e0b564)

#getAll:

![ctrl zll](https://github.com/sana7867/controle/assets/147515885/7fbf208f-36cd-4da0-907d-83c0f3daaa25)

#getById: 

![clrl get id](https://github.com/sana7867/controle/assets/147515885/da73d73f-2606-4670-ae82-c3e5a526cce5)

#delete:

![ctrl delete](https://github.com/sana7867/controle/assets/147515885/e184f620-d125-4b00-a12c-f0276f8b6b93)

# Technologie utilisée:
Java : Langage de programmation polyvalent et orienté objet largement adopté pour le développement d'une variété d'applications, allant des solutions de bureau aux applications Web et mobiles. Sa popularité repose sur des caractéristiques telles que la portabilité, la robustesse, la sécurité et la facilité d'utilisation.

MySQL : Système de gestion de base de données relationnelle open source très répandu, MySQL est utilisé pour stocker, organiser et gérer efficacement de vastes ensembles de données. Il se distingue par sa stabilité, ses performances élevées et son large éventail de fonctionnalités, en faisant un choix privilégié pour divers types d'applications.

Hibernate : Framework de mapping objet-relationnel (ORM) en Java, Hibernate simplifie la communication entre les applications Java et les bases de données relationnelles. Il permet aux développeurs de travailler avec des objets Java plutôt qu'avec des requêtes SQL directes, simplifiant ainsi le processus de persistance des données de manière flexible.

Spring Boot : Projet du framework Spring, Spring Boot vise à simplifier la configuration et le déploiement des applications basées sur Spring. Il offre des outils et des conventions permettant de démarrer rapidement des applications avec peu de configuration manuelle. Spring Boot facilite également le développement grâce à des fonctionnalités telles que l'auto-configuration, qui configure automatiquement les composants en fonction des dépendances ajoutées.

JPA : Java Persistence API (JPA) est une spécification Java décrivant une interface de programmation pour la gestion de la persistance des données dans les applications Java. Elle offre une approche standardisée permettant aux développeurs de créer des applications Java capables de gérer de manière persistante des données relationnelles, simplifiant ainsi les interactions avec les bases de données.

Swagger : Ensemble d'outils open source facilitant la conception, la création, la documentation et la consommation de services web RESTful. Swagger automatise la génération de la documentation de l'API, améliorant la compréhension et l'utilisation des services web par d'autres développeurs. Il permet de décrire de manière claire et concise la structure et les fonctionnalités des API REST.


	************************************
*****      	   ProxiBanqueV2_CyNa  	       *****
	************************************

Concepteurs/développeurs:

	Bouaouli Nabil
	Rabineau Cyril

Date : 27 juillet 2017

Version : version 1.0


	************************************ 
*****      	     Livrables  	        *****
	************************************

Les documents livrés sont :


1) Le dossier "sources" contenant le dossier éclipse du projet.

2) Le dossier "javadoc".

3) Le fichier ProxibanqueV2_CyNa.war

4) Le fichier readMe.txt

5) La base de données proxibanquev2


	************************************
*****  	    Description de l'application:   	*****
	************************************

ProxibanqueV2 est une application bancaire.
Cette application permet a un conseiller de:
* se connecter à l'application.
* Regarder une liste de ses clients.(En developpement)
* Ajouter, modifier ou supprimer les informations relatives à un client. (Modifier et supprimer, en developpement)
* Regarder une liste des comptes de ses clients.(En developpement)
* Effectuer des virements entre comptes. (En developpement)


	************************************
*****  	          Documentation:	        *****
	************************************

Pour avoir accès à la documentation veuillez suivre les indications suivantes :

1) Ouvrez le dossier 'javadoc'.

2) Ouvrez le dossier 'ProxiBanqueV2_CyNa'

3) Double cliquez sur 'index.html'.

	
	************************************
***** 	     Execution de l'application:    	*****
	************************************

Veuillez suivre les indications suivantes:
	
1) A l'aide de votre interpretteur de commande (cmd.exe),
   placer vous dans le dossier où vous avez téléchargé
   le fichier compressé "ProxiBanqueV2_CyNa.war"
   ('cd [chemin]/[dossier cible]').

2) Entrer la commande 'java -jar ProxibanqueV2_CyNa.jar'.

3) Faire "Entrée" et vous voilà sur la page d'accueil.

4) l'Id à renseigner est '1'
   le login et le mot de passe sont 'toto'

5) un fichier proxibanquev2.sql a été livré et sert a chargé une base de données test
avec une table Client et une table Conseiller

	
	************************************
***** 	     Remarques                     	*****
	************************************

Il y a une classe Test dans le DAO qui a servi à s'assurer que les informations vers et de 
la base de données circulent bien. 

la dernière action encore non mise en commentaires, est celle qui sert à vérifier que les informations d'identification du Conseiller
remontent bien de la base de données vers la couche présentation.

Certaines actions web fontionnent comme les redirections dans la ServletConnectConseiller 
sauf que le fichier jsp correspondant n'affiche pas la liste clients.

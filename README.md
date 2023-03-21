# world-of-java
Jeu java type WOW

TP : Jeu de rôles - S1 Enoncé :
Vous avez la charge de développer le nouveau Jeu de rôle successeur de World Of Warcraft. Dans ce Jeu, 2 équipes vont s’affronter.
Ces équipes seront composées de personnages.

Chaque personnage pourra posséder une arme et une seule.
Les personnages seront de 2 types et comprendront les particularités suivantes

Un monstre
Point de vie (ex: 25) Un nom (ex: Grum) Une arme
Attaquer un adversaire Recevoir des dégâts

Un héros
Points de vie (ex: 30)
Un nom (ex: Arthur)
Une arme
Attaquer un adversaire
Recevoir des dégâts

Pour le moment, il n'existe que deux types d’arme : l’épée et le gourdin :

Epée
Nom de l'arme (ex: Excalibur)
Points de dégâts par attaque
Une longueur en cm
Un poids en gr
Déroulement du jeu, première partie :
Dans un premier temps :

Gourdin
Nom de l'arme (ex: L'abattoir) Points de dégâts par attaque Une longueur en cm
Un poids en gr

 les deux équipes sont fabriquées dans une méthode principale (un main).
 On fera une équipe de héros et une équipe de monstres.
 Les deux équipes ont une taille (vous pouvez commencer avec des équipes de taille un)
 Il faut fournir à chaque personnage une arme

A chaque démarrage de tour de jeu :

 Vous devez choisir aléatoirement qui va attaquer le premier.
 Une attaque par tour et par personnage (tant qu'il a des PVs).
 Quand un personnage est attaqué, si il est toujours en vie, il a la possibilité de contre attaquer.
 Une foi le combat terminé, si l'un des personnages a un nombre de PV inférieur ou égal à zéro il rejoint le
cimetière (ne fait plus partie de l'équipe).

L’équipe qui perd est la première qui n’a plus de personnage.
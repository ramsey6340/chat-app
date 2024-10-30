
## Application de chat en temps réel utilisant Spring Boot

### Introduction
Ce projet est une application de chat en temps réel développée à l'aide de Spring Boot et WebSocket. L'application permet aux utilisateurs de rejoindre, de discuter et de quitter des salles de chat en temps réel. Spring Boot fournit une architecture robuste et évolutive pour l'application, tandis que WebSocket permet une communication en temps réel entre le serveur et les clients. L'application dispose de fonctionnalités telles que rejoindre des salles de chat, envoyer des messages et quitter des salles de chat, offrant ainsi une expérience de chat fluide et interactive à ses utilisateurs.

### WebSocket
WebSocket est un protocole de communication informatique qui fournit des canaux de communication en duplex intégral via une seule connexion TCP. WebSocket est différent de HTTP.

Le protocole permet l'interaction entre un navigateur Web (ou une autre application cliente) et un serveur Web avec une charge inférieure à celle des alternatives en semi-duplex telles que l'interrogation HTTP, facilitant ainsi le transfert de données en temps réel depuis et vers le serveur.

Une fois qu'une connexion WebSocket est établie entre un client et un serveur, les deux peuvent échanger des informations jusqu'à ce que la connexion soit fermée par l'une des parties.

C'est la principale raison pour laquelle WebSocket est préféré au protocole HTTP lors de la création d'un service de communication de type chat qui fonctionne à des fréquences élevées avec une faible latence.

### Stomp JS
Le protocole STOMP (Simple (ou Streaming) Text Oriented Message Protocol), anciennement connu sous le nom de TTMP, est un protocole simple basé sur du texte, conçu pour fonctionner avec un middleware orienté message (MOM). Il fournit un format de fil interopérable qui permet aux clients STOMP de communiquer avec n'importe quel courtier de messages prenant en charge le protocole.

Étant donné que WebSocket n'est qu'un protocole de communication, il ne sait pas comment envoyer un message à un utilisateur particulier. STOMP est fondamentalement un protocole de messagerie qui est utile pour ces fonctionnalités.

### Sock JS
SockJS est utilisé pour activer les options de secours pour les navigateurs qui ne prennent pas en charge WebSocket. L'objectif de SockJS est de permettre aux applications d'utiliser une API WebSocket mais de recourir à des alternatives non WebSocket lorsque cela est nécessaire au moment de l'exécution, c'est-à-dire sans avoir à modifier le code de l'application.

Sous le capot, SockJS essaie d'abord d'utiliser les WebSockets natifs. Si cela échoue, il peut utiliser divers protocoles de transport spécifiques au navigateur et les présenter via des abstractions de type WebSocket.

#### Remarques:
Le mot de passe par defaut est ``hello``
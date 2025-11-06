**Titre du projet:**

\#  Selenium TestNG - Todos Project

**Description:**

Projet d’automatisation de tests pour une application Todos, utilisant Selenium WebDriver, TestNG et Maven.

Ce projet démontre comment créer et exécuter des tests basés sur le modèle Page Object Model (POM).

**##  Structure du projet**



sélénium-TestNG/

│

├── src/main/java/com/todo/

│ ├── configs/

│ │ └── env-config.properties

│ ├── page/

│ │ └── TodosPage.java

│ └── utils/

│ ├── BasePage.java

│ └── Setup.java

│

├── src/test/java/com/todo/tests/

│ └── AddTodosTest.java

│

├── pom.xml

├── testng.xml

└── README.md



**## ⚙️ Technologies utilisées**



\- \*\*Langage :\*\* Java 8

\- \*\*Framework de test :\*\* TestNG

\- \*\*Automatisation UI :\*\* Selenium WebDriver

\- \*\*Gestion des dépendances :\*\* Maven

\- \*\*Modèle :\*\* Page Object Model (POM)



**##  Installation et exécution**



1.  \*\*Cloner le projet\*\*

   ```bash

   git clone https://github.com/votre-utilisateur/selenium-TestNG.git

   cd selenium-TestNG



2\. Installer les dépendances Maven

   mvn clean install


3\. Installer les dépendances Maven

   mvn test



🧩 **Exemple d'utilisation**



 	@Test

 	public void iaddTodo () throws IOException {

 

 		todosPage = new TodosPage();

 

 		boolean fieldTodo = todosPage.isElementDisplayed(TodosPage.inputField);
 		Assert.assertTrue(fieldTodo);
 		todosPage.submitTodo(prop.getProperty("test1"));


\##  **Rapports de test**

Deux types de rapports générés par TestNG sont disponibles dans :

-test-output/index.html

-emailable-report.html


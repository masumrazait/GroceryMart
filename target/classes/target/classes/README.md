# GroceryMart Automation Project

This repository contains the automated testing framework for the **GroceryMart** web application, developed using **Selenium**, **Java**, and **Cucumber** for behavior-driven development (BDD). This framework enables end-to-end testing to validate core functionalities and ensure a smooth user experience.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running the Tests](#running-the-tests)
- [Test Reporting](#test-reporting)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used
- **Java** - Programming language for building test scripts
- **Selenium WebDriver** - Browser automation tool
- **Cucumber** - BDD framework to define test scenarios in plain English
- **JUnit** - Test runner for executing the tests
- **Maven** - Dependency management and build tool

## Project Structure
```plaintext
GroceryMart-Automation
├── src
│   ├── main
│   │   └── java
│   │       └── utilities          # Helper classes (e.g., WebDriver setup, configuration)
│   └── test
│       ├── java
│       │   ├── stepDefinitions     # Step definition classes for Cucumber
│       │   ├── runners             # Cucumber test runners
│       │   ├── pageObjects         # Page Object Model (POM) classes
│       │   └── features            # Cucumber feature files
│       └── resources               # Additional resources (e.g., data files, config)
├── pom.xml                         # Maven configuration file
└── README.md                       # Project documentation
```

## Getting Started

### Prerequisites
- **Java** (version 8 or higher)
- **Maven** (latest version)
- **ChromeDriver** or **GeckoDriver** depending on your browser of choice

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/masumrazait/GroceryMart.git
   ```
2. Navigate to the project directory:
   ```bash
   cd GroceryMart
   ```
3. Install the dependencies:
   ```bash
   mvn clean install
   ```

## Running the Tests

### Run All Tests
To execute all tests, use the command:
```bash
mvn test
```

### Run Tests by Tag
To run specific test scenarios using Cucumber tags, use:
```bash
mvn test -Dcucumber.options="--tags @tagName"
```
Replace `@tagName` with the desired tag from the feature files.

## Test Reporting
Upon completion, test reports are generated in `target/cucumber-reports`. Open the `index.html` in a browser to view detailed reports of test execution.

## Contributing
If you'd like to contribute to this project:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Make your changes and commit them.
4. Open a pull request, and describe the changes you've made.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


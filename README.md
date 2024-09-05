Fetch Kotlin Android App
Description
This Android app fetches data from a remote API, processes and groups the items by listId, and displays them using Jetpack Compose. The app filters out empty or null names and sorts items by the number in their name. It follows the MVVM architecture pattern, uses Koin for dependency injection, and implements Jetpack Compose for modern UI development.

Features
Fetches and displays items from a remote API
Filters out items with empty or null names
Groups items by listId and sorts by item name
Uses Jetpack Compose for a modern UI
Supports navigation between different screens showing grouped items
Utilizes Koin for dependency injection
Follows MVVM (Model-View-ViewModel) architecture
Architecture
This project follows a layered architecture with MVVM pattern:

Data Layer: Handles data fetching via Retrofit.
Domain Layer: Contains business logic, such as filtering and grouping items.
Presentation Layer: Responsible for UI and interactions, built with Jetpack Compose.
Dependency Injection: Koin is used for managing dependencies between the layers.
Technologies Used
Kotlin: The primary programming language for the app
Jetpack Compose: Modern toolkit for building native UIs
Retrofit: HTTP client for networking (used to fetch data from API)
Koin: Dependency injection framework
Navigation Component: Manages in-app navigation between screens
ViewModel: For managing UI-related data lifecycle consciously

Installation
Prerequisites
Android Studio (latest version)
Java Development Kit (JDK) 11 or higher
Clone the Repository
To get a copy of the project locally:


git clone https://github.com/yourusername/fetch-kotlin-android-app.git
Open in Android Studio
Open Android Studio.
Select "Open an Existing Project".
Navigate to the cloned repository and open the project.
Build and Run
Once the project is open in Android Studio, you can build and run the app on a connected device or emulator by clicking the "Run" button, or using the following Gradle command in the terminal:


./gradlew installDebug

Usage
Once the app is running:

The main screen will display a list of grouped listId items.
Clicking on any list will navigate to a detailed screen that displays items in that group.
The data is fetched from the following API endpoint:
bash
Copy code
https://fetch-hiring.s3.amazonaws.com/hiring.json
The app filters out items with null or empty names and sorts the remaining items by the number in their name.

API Example:
json
[
{"id": 101, "listId": 1, "name": "Item 101"},
{"id": 102, "listId": 2, "name": null},
{"id": 103, "listId": 2, "name": ""},
{"id": 104, "listId": 1, "name": "Item 104"}
]
The app will only display valid items such as "Item 101" and "Item 104", and group them by listId.
Screenshots

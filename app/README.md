# CityFlow

CityFlow is an Android application developed for the course **Mobile Software Development** as part of the MSc in Advanced Informatics and Computing Systems.

The main idea of the application is to allow citizens to report issues related to urban mobility and accessibility, while authorized employees can review and manage those reports.

## Main Features

The application is planned to support:

- User registration and login
- Different user roles
- Submission of urban mobility and accessibility reports
- Automatic location and timestamp collection
- Remote storage of reports
- Report status management by employees
- Priority calculation for submitted reports
- Notifications for nearby validated incidents
- Report history and statistics
- Greek and English language support
- Light and dark theme

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- MVVM
- Kotlin Coroutines / StateFlow
- Firebase Authentication
- Cloud Firestore
- Gradle Kotlin DSL
- Git / GitHub

## Architecture

The project follows an MVVM-based structure with separation between the UI and data layers.

The basic flow is:

```text
UI
↓
ViewModel
↓
Repository
↓
Remote Data Source
↓
Firebase
```

The goal is to keep UI-related code separate from business logic and data access.

## Project Structure

```text
gr.unipi.cityflow
├── data
│   ├── model
│   ├── remote
│   └── repository
├── domain
├── ui
│   ├── auth
│   ├── employee
│   ├── home
│   ├── navigation
│   ├── report
│   ├── settings
│   ├── statistics
│   └── theme
├── notification
└── util
```

## Firebase

The project currently uses:

- Firebase Authentication
- Cloud Firestore

Firebase Storage is not enabled at the moment. Image upload may be added later as an optional feature.

## Current Progress

Completed so far:

- Initial Kotlin / Jetpack Compose project setup
- Material 3 setup
- Navigation Compose dependency and base navigation flow
- Firebase project connection
- Firebase Authentication setup
- Cloud Firestore setup
- Git and GitHub repository setup

Next step:

- Authentication and role management

## Running the Project

1. Clone the repository.
2. Open the project in Android Studio.
3. Make sure the required Android SDK is installed.
4. Add the Firebase `google-services.json` file inside the `app/` folder.
5. Sync the Gradle files.
6. Run the application on an Android emulator or compatible Android device.

## Testing

The application will be tested on both smartphone and tablet emulators.

## Notes

The project is still under development. Some features listed above have not yet been implemented and will be added during the next development sprints.

# 🏥 Hospital Management System (HMS)

> CPS2231 Final Project by Yiduo Yu  
> Supervisor: Prof. Wu

## 📌 Introduction

This is a Java-based Hospital Management System (HMS) designed to simulate basic hospital functions from the doctor's perspective. The system supports consultation recording, user account management, and data persistence using binary file I/O.

## 🚀 Features

- **Doctor Registration** – Doctors can register their accounts.
- **Login System** – Doctors log in with ID and password.
- **Consultation** – Doctors can record patient symptoms and diagnostic information.
- **Billing** – Patients can be billed after consultations.
- **History Tracking** – Each doctor's consultation history is saved and retrievable.

## 🧱 System Design (Construction Idea)

The system uses binary serialization for data persistence:
- `./tmp/admin` – Stores admin information.
- `./tmp/doctors` – Stores doctor data.
- `./tmp/patient` – Stores patient medical records.
- `./desktop/records/patients.txt` – Used for viewing patient record summaries.
- `./tmp/system.txt` – Additional system configuration.

## 🧩 UML Diagram

> See `HMS.mdj` or `HMS-UML.jpg` for the full class diagram and system flow.

Key entities:
- `Doctor` (Admin role)
- `Patient`
- `Hospital Management System (HMS)`
- `MedicalRecord` (stored as serialized objects)

## 🧪 Test

Basic functionality has been tested, including:
- User registration & login
- Record creation
- Billing flow
- File read/write verification

## 📂 Files

| File Name                     | Description                            |
|------------------------------|----------------------------------------|
| `HMS`                        | Main executable (likely .jar or .class)|
| `HMS.mdj` / `HMS-UML.jpg`    | UML design diagram                     |
| `Hospital Management System.pptx` | Project presentation slides       |
| `.idea/`                     | IntelliJ project settings (ignored)    |

## ✅ How to Run

1. Compile the Java files using `javac` or run in IntelliJ IDEA.
2. Use terminal or GUI to interact with the system.
3. Check output files in `/tmp/` and `/desktop/records/` for results.

---

**Note:** All file I/O is done using Java object streams. Ensure the expected directories exist, or the program may throw exceptions.

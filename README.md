
# Tech Store Web Application

Tech Store is a Java-based web application developed to manage products for a technology store. It allows users to create, update, delete, and view products with details such as name, brand, category, price, description, and an image. This application demonstrates a full-stack approach using Spring Boot for backend operations, Thymeleaf for templating, and Bootstrap for UI styling.

## Features

- **CRUD Operations**: Create, read, update, and delete products.
- **Image Uploading**: Upload and store images for each product.
- **Form Validation**: Client-side and server-side validation for product creation and editing.
- **Sorting**: Displays products sorted by ID in descending order.
- **Responsive UI**: Built with Bootstrap for a mobile-friendly interface.

## Technologies Used

- **Java**: Backend language.
- **Spring Boot**: Framework for backend development and dependency management.
  - **Spring MVC**: For handling HTTP requests and managing views.
  - **Spring Data JPA**: For database operations using JPA repository.
- **Thymeleaf**: Templating engine for HTML views.
- **MySQL**: Database to store product information.
- **Bootstrap**: CSS framework for responsive and user-friendly UI design.

## Project Structure

### Controllers
- **ProductsController**: Manages requests for displaying, creating, editing, and deleting products. Handles form validation, image upload, and data processing for product entries.

### Models
- **Product**: Entity class for product details, mapping to the `products` table in the database.
- **ProductDto**: Data Transfer Object used for form handling, including validation constraints.

### Repository
- **ProductsRepository**: Extends JpaRepository to perform CRUD operations on `Product` entities.

## Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/MohammedAshrafulIslam/TechStore.git
   cd TechStore
   ```

2. **Configure MySQL Database**:
   - Create a database named `tech_store`.
   - Update `src/main/resources/application.properties` with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/tech_store
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Run the Application**:
   - Execute the following command:
     ```bash
     ./mvnw spring-boot:run
     ```
   - The application should be accessible at `http://localhost:8080`.

4. **Access the Product Management Interface**:
   - Navigate to `/products` to view and manage products in the Tech Store.

## Directory Structure

- `src/main/java/com/ashraf/TechStore/controllers/ProductsController.java`: Controller for handling product operations.
- `src/main/java/com/ashraf/TechStore/models/Product.java`: Entity representing a product.
- `src/main/java/com/ashraf/TechStore/models/ProductDto.java`: DTO with validation for handling product forms.
- `src/main/resources/templates/`: Thymeleaf templates for the UI.
- `src/main/resources/static/`: Directory for static resources, including Bootstrap files.

## Key Functionalities

- **Product List View** (`/products`): Displays all products with details.
- **Add New Product** (`/products/create`): Form for adding a new product, with validation and image upload.
- **Edit Product** (`/products/edit`): Form to update product details and image.
- **Delete Product**: Deletes a product from the database and removes its associated image from storage.

## Screenshots

**Homepage**
(Will be updated soon!)

## Future Improvements

- Add user authentication and role-based access for admins.
- Implement search and filter options for products.
- Optimize image storage and implement cloud-based storage options.

## License

This project is licensed under the MIT License. See `LICENSE` for more details.

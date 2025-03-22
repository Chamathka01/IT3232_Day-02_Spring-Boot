# IT3232_Day-02_Spring-Boot
---

# Spring Boot REST Controller Example

This project demonstrates a simple Spring Boot REST controller with two endpoints that return text messages.

## Code Structure

```java
package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @GetMapping("/msg")
    public String myMessage() {
        return "Hello SpringBoot";
    }

    @GetMapping("/name")
    public String myName() {
        return "My name is SpringBoot";
    }
}
```

### Code Explanation
1. **`@RestController`**: Marks the `AppController` class as a REST controller that handles HTTP requests.
2. **`@RequestMapping("/app")`**: Specifies the base URL for the controller.
3. **Endpoints**:
   - **`@GetMapping("/msg")`**: Returns the message `"Hello SpringBoot"` when accessed at `/app/msg`.
   - **`@GetMapping("/name")`**: Returns the message `"My name is SpringBoot"` when accessed at `/app/name`.

## How to Run
1. Set up a Spring Boot project in your IDE.
2. Add the above code in a package called `lk.ac.vau.fas.ict.controller`.
3. Start the Spring Boot application.
4. Access the endpoints in your browser:
   - Navigate to `http://localhost:8080/app/msg` to see the message **"Hello SpringBoot"**.
   - Navigate to `http://localhost:8080/app/name` to see the message **"My name is SpringBoot"**.

## Output Screenshots
### 1. `/app/msg` Endpoint Output:
![Hello SpringBoot](./Screenshots/one.png)

### 2. `/app/name` Endpoint Output:
![My name is SpringBoot](./Screenshots/two.png)

## Summary
This project showcases how to create and run a simple Spring Boot REST API with basic text responses. It demonstrates the use of annotations like `@RestController`, `@RequestMapping`, and `@GetMapping`.

---



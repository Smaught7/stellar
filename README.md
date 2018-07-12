# stellar

implement application backend serving Rest data for existing interface.
User Interface implemented in Angular, communicating with server using URIs:
* GET http://localhost:8080/stellar/spring/webapi/constellations?query=a
- expected server answer (example):
```
[{"abbreviation":"aur","name":"Auriga"},{"abbreviation":"cnc","name":"Cancer"}]
```

* GET http://localhost:8080/stellar/spring/webapi/constellations/{id}/stars
- expected server answer (example):
```
[{"id":"4","name":"Sadalmelik"},{"id":"5","name":"Sadalsuud"}]
```

Scoring:
- Maven multi - 1
- Model       - 1
- DAO         - 1
- JDBC        - 1
- JPA         - 2
- Service     - 1
- REST read   - 1
- search phrase - 1
- REST write  - 2
- Git         - 1
- JUnit       - 1
- JUnit 50%cover - 2
- Sonar       - 1

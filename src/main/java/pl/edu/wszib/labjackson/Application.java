package pl.edu.wszib.labjackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // serializacja
        Person person = new Person("Jan", "Kowalski", new Address(
                "Kraków", "33-333", "Testowa", "14/1"
        ));
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(json);

        // deserializacja
        String exampleJson = """
                        {
                          "firstName" : "Jan",
                          "lastName" : "Kowalski",
                          "address" : {
                            "town" : "Kraków",
                            "postCode" : "33-333",
                            "street" : "Testowa",
                            "buildingNumber" : "14/1"
                          }
                        }
                """;
        Person deserializedPerson = objectMapper.readValue(exampleJson, Person.class);
        System.out.println("DeserializedPerson: " + deserializedPerson);

        // Zad: utwórz rekord Address, zawierający dane:
        // miasto
        // kod pocztowy
        // ulica
        // numer (String)
        // rozszerz klasę Person o adres i dostosuj powyższy przykład
    }
}

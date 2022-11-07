# rule-based-buying-service

This service enables to make buying decison for an organization based on the given conditions/constraints and ensures that buying from salesman/vendors is done in an optimized manner.

## Architecture Diagram :

![image](https://user-images.githubusercontent.com/30754286/200436208-b16f2c8f-da42-4159-a573-90437ca6b3a1.png)



### Execution :

1. Clone the repository.
2. Install JDK, and if already installed, run the main class which is ```com.contextlabs.Driver.java```
3. The project can also be executed from the command line, by navigating to ```\out\production\rule-based-buying-service``` and then executing the command ```java com.contextlabs.Driver```


### Assumptions :

1. Every product has numeric attribute as *"price"* and list of attributes associated with it.
2. Given inputs are legitimate, attributes and string values are case sensitive.
3. Currently, the system uses AND (&&) for filtering the products for buying as per the conditions given.

### Future Scope :

We can add advanced search and filter capabilities by incorporating OR (||) operations and also include mechansims to validate attributes of products. Exception handling and validation can also be refined to a deeper level and also adding unit test cases. 


### Screenshots :

![image](https://user-images.githubusercontent.com/30754286/200438237-91354f72-5dbf-4c1c-a4cd-b287ef4124b2.png)




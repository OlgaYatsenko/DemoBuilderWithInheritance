# Fluent Builder Inheritance with Recursive Generics
## Project description and Diagram
There are two classes Child class and ShcoolChild (it inherits from Child),and two classes for building these classes respectively: ChildBuilder and SchoolChildBuilder (it inherits from child builder). 
Recursive generics (upper bounded wildcards) in ChildBuilder class allows to chain methods from both ChildBuilder and SchoolChildBuilder while creating the respective objects  
![alt text](https://github.com/OlgaYatsenko/DemoBuilderWithInheritance/blob/master/project_diagram.png)

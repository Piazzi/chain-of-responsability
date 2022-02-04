<div align="center">
  <h1> Chain of Responsability  </h1>
</div>

# Code

Simple project representing the Chain of Responsability design pattern. I've made a representation of a postal system.

# Definition

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

![image](https://user-images.githubusercontent.com/40416044/152540342-c239a58b-781b-44fb-a0ab-1d2af983e3a0.png)

The chain-of-responsibility pattern is structurally nearly identical to the decorator pattern, the difference being that for the decorator, all classes handle the request, while for the chain of responsibility, exactly one of the classes in the chain handles the request. This is a strict definition of the Responsibility concept in the GoF book. However, many implementations (such as loggers below, or UI event handling, or servlet filters in Java, etc) allow several elements in the chain to take responsibility.


# Real-World Analogy

![image](https://user-images.githubusercontent.com/40416044/152540622-66d327b4-5a01-4220-816c-2816be4e6b68.png)



Source: <a href="https://pt.wikipedia.org/wiki/Chain_of_Responsibility"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/chain-of-responsibility"> Refactoring Guru </a>

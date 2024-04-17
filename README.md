# Sistema de Entidades 🕹️

Este projeto é um simples sistema de entidades desenvolvido em Java, projetado para demonstrar o conceito de polimorfismo e classes abstratas, além de obter nota na disciplina Paradigmas de Linguagem de Computação.

## Visão Geral 📋

O sistema consiste em duas classes concretas (`Character` e `Monster`) que estendem uma classe abstrata (`Entity`). Cada classe concreta implementa o método abstrato `fazerSom()`, que imprime uma mensagem específica para o tipo de entidade.

## Linguagem Java e Componentes Utilizados 🖥️

O projeto foi desenvolvido em Java, utilizando os seguintes componentes:

- **Classes Abstratas**: A classe `Entity` é uma classe abstrata que define um método abstrato `fazerSom()`, que deve ser implementado por suas subclasses.

- **Polimorfismo**: As subclasses `Character` e `Monster` implementam o método `fazerSom()` de maneiras diferentes, demonstrando o conceito de polimorfismo.

- **ArrayList**: A classe `ArrayList` do pacote `java.util` é usada para armazenar as entidades em uma lista dinâmica.

## Como Usar 📝

1. Compile o código-fonte em um ambiente de desenvolvimento Java.

2. Execute o programa resultante para ver o sistema de entidades em ação.

3. O programa instanciará dois personagens e dois monstros, adicionará à lista e executará o método `fazerSom()` para cada entidade na lista.

4. Você verá a saída do console exibindo mensagens específicas de som para personagens e monstros.

## Observação 📌

Este projeto é uma implementação básica do conceito de polimorfismo em Java e pode ser expandido com recursos adicionais, como mais tipos de entidades, métodos adicionais e interações entre as entidades.


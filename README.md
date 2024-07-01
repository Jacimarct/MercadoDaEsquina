# Mercado da Esquina

## Diagrama de Classes

``` mermaid
classDiagram
    class Cliente {
        String nome
        String endereco
        String cidade
    }

    class Produto {
        <<abstract>>
        String nome
        double preco
        String medida
    }

    Produto <|-- Verdura
    Produto <|-- Fruta

    class Verdura {
        +String nome
        +double preco
        +String medida
    }

    class Fruta {
        +String nome
        +double preco
        +String medida
    }

```

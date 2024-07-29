# Arquitetura Limpa

Seguindo a proposta de fazer uma segunda apresentação na agenda Café com Fullstack, separei aqui nesse repositório um template de um padrão de design de código chamado "Arquitetura Hexagonal" ou "Ports and Adapters".

A Arquitetura Hexagonal tem por padrão o dever de isolar o "core" da aplicação, ou seja, isolar aonde implementamos as regras de negócio, que será a parte mais estável da aplicação, dos "detalhes".

## Detalhes de uma aplicação.
Segundo o livro "Arquitetura Limpa", do autor Robert C. Martin, em uma aplicação existe a parte mais importante, que seriam as regras de negócio e o restante seriam apenas detalhes.  

Segue alguns exemplos do que venha a ser considerado detalhe de acordo com as boas práticas de arquitetura descritas no livro.
- Banco de dados
- Framework
- Sistema operacional
- GUI (Graphical User Interface)
- Protocolo de comunicação

# 🏰 Projeto Mercado Medieval

**Sistema de Gerenciamento de Personagens e Itens Mágicos**  
Projeto desenvolvido para a disciplina de **Java Advanced**.

---

## 🚀 Tecnologias Usadas
- Java 17  
- Spring Boot 3.4.4  
- Maven  
- API REST (com validações e filtros)  
- H2 Database (memória)  
- Postman (para testar as requisições)  

---

## 🛠️ Como Rodar o Projeto

### 1. Pré-requisitos
- Java JDK 17 ou superior instalado  
- Maven instalado (ou usar Maven Wrapper `mvnw.cmd`)  
- IDE (Visual Studio Code, IntelliJ, Eclipse)  

### 2. Clonar o repositório
```bash
git clone https://github.com/BeatrizFerreira01/Projeto-Mercado.git
```

### 3. Navegar até o projeto
```bash
cd mercado
```

### 4. Rodar o projeto
```bash
./mvnw spring-boot:run
```
Ou, no Windows:
```bash
mvnw.cmd spring-boot:run
```
Ou ainda:
```bash
mvn spring-boot:run
```

---

## 🌐 Endpoints da API

### Personagens
| Método | URL | Função |
|--------|-----|--------|
| GET | /personagens | Listar todos os personagens |
| GET | /personagens/{id} | Buscar personagem por ID |
| GET | /personagens/nome/{nome} | Buscar personagem por nome |
| GET | /personagens/classe/{classe} | Buscar personagem por classe |
| POST | /personagens | Criar novo personagem |
| PUT | /personagens/{id} | Atualizar personagem |
| DELETE | /personagens/{id} | Remover personagem |

### Itens
| Método | URL | Função |
|--------|-----|--------|
| GET | /itens | Listar todos os itens |
| GET | /itens/{id} | Buscar item por ID |
| GET | /itens/nome/{nome} | Buscar itens por nome parcial |
| GET | /itens/tipo/{tipo} | Buscar itens por tipo |
| GET | /itens/preco?min=0&max=1000 | Buscar itens por faixa de preço |
| GET | /itens/raridade/{raridade} | Buscar itens por raridade |
| POST | /itens | Criar novo item |
| PUT | /itens/{id} | Atualizar item |
| DELETE | /itens/{id} | Remover item |

---

## 📋 Regras de Negócio

### Personagem
- Campos obrigatórios: nome, classe (guerreiro, mago, arqueiro), nível (1 a 99), moedas
- Validações:
  - Nível não pode ser menor que 1 ou maior que 99
  - Nome e classe são obrigatórios
  - Moedas deve ser um número positivo

### Item
- Campos obrigatórios: nome, tipo, raridade, preço, dono
- Validações:
  - Preço deve ser positivo
  - Nome e tipo obrigatórios
  - Item deve pertencer a um personagem (dono)

---

## ✅ Testando a API

Você pode usar o **Postman** ou outra ferramenta de testes REST.

Exemplo de JSON para criar um personagem:
```json
{
  "nome": "Artemis",
  "classe": "arqueiro",
  "nivel": 45,
  "moedas": 1200
}
```

Exemplo de JSON para criar um item:
```json
{
  "nome": "Espada do Caos",
  "tipo": "arma",
  "raridade": "lendário",
  "preco": 850,
  "personagemId": 1
}
```

---

## 👩‍💻 Desenvolvedoras
- Beatriz Ferreira Cruz
- Gabrielly Campos Macedo

---

## 📝 Observações

Este projeto foi desenvolvido como parte da disciplina de **Java Advanced**, com foco em:

- Programação orientada a objetos (POO)
- Criação de APIs RESTful com Spring Boot
- Implementação de filtros dinâmicos com Spring Data JPA
- Relacionamentos entre entidades
- Validação de dados e regras de negócio

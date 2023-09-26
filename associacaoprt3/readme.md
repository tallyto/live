# Sistema de Gerenciamento de Seminários

Este é um sistema de gerenciamento de seminários que permite o cadastro de seminários, estudantes, professores e locais onde os seminários serão realizados.

## Funcionalidades

### Cadastro de Seminários

- O sistema permite o cadastro de seminários com as seguintes informações:
  - Título do Seminário

### Cadastro de Alunos

- O sistema permite o cadastro de alunos com as seguintes informações:
  - Nome do Aluno
  - Idade do Aluno

- Cada aluno pode estar associado a apenas um seminário.

### Cadastro de Professores

- O sistema permite o cadastro de professores com as seguintes informações:
  - Nome do Professor
  - Especialidade do Professor

- Um professor pode ministrar vários seminários.

### Cadastro de Locais

- O sistema permite o cadastro de locais onde os seminários serão realizados com as seguintes informações:
  - Endereço do Local

- Cada seminário deve estar associado a um local.

## Relacionamentos

- Um seminário pode ter nenhum ou vários alunos.
- Um seminário deve ter um professor responsável.
- Um seminário deve ser realizado em um local específico.

## Campos Básicos (Excluindo Relacionamentos)

- **Seminário**:
  - Título

- **Aluno**:
  - Nome
  - Idade

- **Professor**:
  - Nome
  - Especialidade

- **Local**:
  - Endereço

Este sistema oferece um conjunto simples de funcionalidades para gerenciar seminários, alunos, professores e locais, permitindo que você crie e mantenha registros relevantes para organizar eventos educacionais de maneira eficiente.
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

# Desafios do Projeto - Gerenciamento de Seminários

Este repositório contém um sistema de gerenciamento de seminários e os desafios relacionados à sua implementação. O projeto é dividido em quatro níveis, cada um baseado em um item do jogo Super Mario, que representam o grau de complexidade e experiência necessária para a implementação.

## Cogumelo

### Desafio 1 - Cadastro Básico
Implemente a estrutura de classes para Seminário, Aluno, Professor e Local. Crie métodos simples para cadastrar e exibir informações básicas.

## 1-Up

### Desafio 2 - Relacionamentos
Implemente a lógica para associar alunos a seminários, professores a seminários e seminários a locais. Certifique-se de que os relacionamentos estejam funcionando corretamente.

### Desafio 3 - Validação de Dados
Adicione validações básicas para garantir que os dados inseridos sejam válidos. Por exemplo, verifique se a idade dos alunos está dentro de um intervalo aceitável.

## Pena

### Desafio 4 - Leitura e Escrita de Arquivos
Implemente a capacidade de salvar e carregar os dados do sistema em arquivos simples de texto ou CSV. Isso permitirá a persistência dos dados entre as execuções do programa.

### Desafio 5 - Edição e Remoção
Adicione a funcionalidade de editar e remover registros de seminários, alunos, professores e locais.

## Estrela

### Desafio 6 - Busca e Filtragem
Implemente recursos de busca e filtragem para permitir que os usuários encontrem informações específicas, como todos os alunos em um seminário ou todos os seminários ministrados por um professor específico.

### Desafio 7 - Validações Aprimoradas
Melhore as validações de dados para garantir que os usuários não possam inserir informações inválidas. Por exemplo, verifique se a idade dos alunos é um número inteiro positivo e se os campos obrigatórios estão preenchidos.
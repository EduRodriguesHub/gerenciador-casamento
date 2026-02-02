Gerenciador de Convidados de Casamento
Este é um sistema desenvolvido em Java para organizar e gerenciar a lista de convidados de um casamento, garantindo que nenhum detalhe (ou convidado importante) seja esquecido.

O que o projeto faz?
O sistema funciona via terminal e permite o controle total dos convidados (CRUD), com algumas regras de negócio específicas para o evento:

Cadastro Inicial: Define o nome da noiva e do noivo antes de iniciar a lista.

Adicionar Convidados: Permite inserir nomes, com validação para não aceitar campos vazios e evitar nomes duplicados.

Listagem Organizada: Exibe todos os convidados cadastrados com numeração.

Edição de Nomes: Permite corrigir o nome de qualquer convidado da lista através do índice.

Remoção com Segurança: É possível remover convidados, porém o sistema possui uma trava de segurança: os noivos nunca podem ser removidos da lista.

Tecnologias Utilizadas
Linguagem: Java (JDK 17).

Como executar
Como o projeto foi desenvolvido de forma modular, você pode executá-lo em qualquer IDE (IntelliJ, VS Code) ou via terminal:

Clone o repositório.

Compile o projeto.

Execute a classe ListaConvidadosCasamento.java.

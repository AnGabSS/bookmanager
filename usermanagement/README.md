A User Management for a Book Manager service

ER Diagram:

+-----------------+          +-----------------+          +-----------------+
|    Livro        |          |   Empréstimo     |          |    Usuário       |
+-----------------+          +-----------------+          +-----------------+
| id (PK)         |<-------->| id (PK)         |<-------->| id (PK)         |
| titulo          |          | livro_id (FK)   |          | nome            |
| autor           |          | usuario_id (FK) |          | email           |
| genero          |          | data_emprestimo |          | senha           |
| isbn            |          | data_devolucao  |          | tipo_usuario    |
| disponivel      |          | status          |          +-----------------+
+-----------------+          +-----------------+
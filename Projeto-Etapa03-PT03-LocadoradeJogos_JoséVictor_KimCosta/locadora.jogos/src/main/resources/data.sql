INSERT INTO plataforma (id, nome) VALUES (1, 'Xbox');
INSERT INTO plataforma (id, nome) VALUES (2, 'PS4');
INSERT INTO plataforma (id, nome) VALUES (3, 'PC');

INSERT INTO jogo (id, titulo) VALUES (1, 'Halo');
INSERT INTO jogo (id, titulo) VALUES (2, 'FIFA 21');

INSERT INTO cliente (id, nome, email, telefone, senha) VALUES (1, 'João Silva', 'joao@gmail.com', '123456789', 'senha123');
INSERT INTO cliente (id, nome, email, telefone, senha) VALUES (2, 'Maria Souza', 'maria@gmail.com', '987654321', 'senha456');

INSERT INTO jogo_plataforma (id,jogo_fk,plataforma_fk,preco_diario) VALUES (1,1,1,50.0);
INSERT INTO jogo_plataforma (id,jogo_fk,plataforma_fk,preco_diario) VALUES (2,2,2,53.0);
INSERT INTO jogo_plataforma (id,jogo_fk,plataforma_fk,preco_diario) VALUES (3,1,2,13.0);
INSERT INTO jogo_plataforma (id,jogo_fk,plataforma_fk,preco_diario) VALUES (4,2,1,54.0);
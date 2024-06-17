use agrocultivasolucoes;

DELIMITER //

CREATE TRIGGER tr_insere_estoque_fertilizante AFTER INSERT ON tbFertilizante
FOR EACH ROW
BEGIN
    INSERT INTO tbEstoque (idFertilizante, nome, quantidade, preco, data_entrada, descricao)
    VALUES (NEW.idFertilizante, NEW.nomeFertilizante, 0, 0.00, NOW(), NEW.descricao);
END //

DELIMITER ;

DELIMITER //

CREATE TRIGGER tr_insere_estoque_pesticida AFTER INSERT ON tbPesticida
FOR EACH ROW
BEGIN
    INSERT INTO tbEstoque (idPesticida, nome, quantidade, preco, data_entrada, descricao)
    VALUES (NEW.idPesticida, NEW.nomePesticida, 0, 0.00, NOW(), NEW.descricao);
END //

DELIMITER ;	

DELIMITER //

CREATE TRIGGER tr_insere_estoque_safra AFTER INSERT ON tbSafra
FOR EACH ROW
BEGIN
    INSERT INTO tbEstoque (idSafra, nome, quantidade, preco, data_entrada, descricao)
    VALUES (NEW.idSafra, NEW.nomeSafra, 0, 0.00, NOW(), NEW.descricao);
END //

DELIMITER ;

insert into tbusuario(nome, usuario, email, cpf, senha, administrador)
values 
("Administrador", "adm", "admin@agrocultiva.com", "00000000000","adm", true);

insert into tbSafra(nomeSafra, tipoSafra)
values
("Trigo", "SLA"),
("Soja", "SLA"),
("Arroz", "SLA");

select * from tbusuario;
select * from tbestoque;
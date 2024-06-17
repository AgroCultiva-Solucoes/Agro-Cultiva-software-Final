use agrocultivasolucoes;
drop database agrocultivasolucoes;
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
DELIMITER //

CREATE TRIGGER after_insert_colheita
AFTER INSERT ON tbAtividades
FOR EACH ROW
BEGIN
    DECLARE safra_id INT;
    DECLARE colheita_qtdd DOUBLE;

    IF NEW.tipo = 'colheita' THEN
        -- Obtém o id da safra da atividade inserida
        SET safra_id = NEW.idSafra;
        
        -- Obtém a quantidade colhida da atividade inserida
        SET colheita_qtdd = NEW.qtdd;

        -- Atualiza a quantidade na tabela de estoque para a safra correspondente
        UPDATE tbEstoque
        SET quantidade = quantidade + colheita_qtdd
        WHERE idSafra = safra_id;
    END IF;
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
select * from tbatividades;
select * from tbsafra;
select * from tbpesticida;
SELECT * FROM tbEstoque;

SELECT 
    s.nomeSafra,
    SUM(CASE WHEN a.tipo = 'plantio' THEN a.qtdd ELSE 0 END) AS Plantado,
    SUM(CASE WHEN a.tipo = 'colheita' THEN a.qtdd ELSE 0 END) AS Colhido,
    SUM(CASE WHEN a.tipo = 'fertilizante' THEN a.qtdd ELSE 0 END) AS `Uso de Fertilizante`,
    SUM(CASE WHEN a.tipo = 'pesticida' THEN a.qtdd ELSE 0 END) AS `Uso de Pesticida`
FROM tbAtividades a
INNER JOIN tbSafra s ON a.idSafra = s.idSafra
WHERE a.tipo IN ('plantio', 'colheita', 'fertilizante', 'pesticida')
GROUP BY s.nomeSafra;
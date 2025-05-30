-- Criação da tabela de medições
CREATE TABLE MEDICAO (
    ID NUMBER PRIMARY KEY,
    LOCALIZACAO VARCHAR2(100),
    CONSUMO_LITROS NUMBER(10,2),
    DATA_MEDICAO DATE,
    ALERTA VARCHAR2(100)
);

-- Sequência para geração automática de IDs
CREATE SEQUENCE MEDICAO_SEQ START WITH 1 INCREMENT BY 1;

-- Trigger para auto incremento do ID
CREATE OR REPLACE TRIGGER MEDICAO_BI
BEFORE INSERT ON MEDICAO
FOR EACH ROW
BEGIN
  SELECT MEDICAO_SEQ.NEXTVAL INTO :NEW.ID FROM dual;
END;
/

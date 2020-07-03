--------------------------------------------------------
--  File created - Sexta-feira-Julho-03-2020   
--------------------------------------------------------
DROP SEQUENCE "K1BOSS"."ID_CARRINHO";
DROP SEQUENCE "K1BOSS"."ID_CLIENTE";
DROP SEQUENCE "K1BOSS"."ID_ESTABELECIMENTO";
DROP SEQUENCE "K1BOSS"."ID_MESA";
DROP SEQUENCE "K1BOSS"."ID_PAGAMENTO";
DROP SEQUENCE "K1BOSS"."ID_PROD_CARRINHO";
DROP SEQUENCE "K1BOSS"."ID_PRODUTO";
DROP SEQUENCE "K1BOSS"."ID_PROMOCAO";
DROP SEQUENCE "K1BOSS"."ID_TIPOUTLIZADOR_SEQUENCE";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73484";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73487";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73490";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73493";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73496";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73499";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73502";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73674";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73677";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73680";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73683";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73686";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73689";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73692";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73695";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73702";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73705";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73708";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73711";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73714";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73717";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73720";
DROP SEQUENCE "K1BOSS"."ISEQ$$_73723";
DROP TABLE "K1BOSS"."CARRINHO";
DROP TABLE "K1BOSS"."CLIENTE";
DROP TABLE "K1BOSS"."ESTABELECIMENTO";
DROP TABLE "K1BOSS"."MESAS";
DROP TABLE "K1BOSS"."PAGAMENTO";
DROP TABLE "K1BOSS"."PRODUTO";
DROP TABLE "K1BOSS"."PRODUTOS_CARRINHO";
DROP TABLE "K1BOSS"."PROMOCAO";
DROP VIEW "K1BOSS"."ESTADO_MESAS";
DROP VIEW "K1BOSS"."RECEBIMENTOS";
DROP PROCEDURE "K1BOSS"."CRIARCARRINHO";
DROP PROCEDURE "K1BOSS"."INSCLIENTE";
DROP PROCEDURE "K1BOSS"."INSESTABELECIMENTO";
DROP PROCEDURE "K1BOSS"."INSMESA";
DROP PROCEDURE "K1BOSS"."INSPAGAMENTO";
DROP PROCEDURE "K1BOSS"."INSPRODCARRINHO";
DROP PROCEDURE "K1BOSS"."INSPRODUTO";
DROP SYNONYM "PUBLIC"."DUAL";
--------------------------------------------------------
--  DDL for Sequence ID_CARRINHO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_CARRINHO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_CLIENTE
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_CLIENTE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 801 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_ESTABELECIMENTO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_ESTABELECIMENTO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 201 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_MESA
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_MESA"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 201 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_PAGAMENTO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_PAGAMENTO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_PROD_CARRINHO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_PROD_CARRINHO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_PRODUTO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_PRODUTO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 101 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_PROMOCAO
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_PROMOCAO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 100 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence ID_TIPOUTLIZADOR_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "K1BOSS"."ID_TIPOUTLIZADOR_SEQUENCE"  MINVALUE 1 MAXVALUE 10 INCREMENT BY 1 START WITH 11 CACHE 10 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73484 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73484 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73487 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73487 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73490 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73490 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73493 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73493 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73496 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73496 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73499 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73499 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73502 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73502 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73674 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73674 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73677 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73677 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73680 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73680 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73683 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73683 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73686 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73686 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73689 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73689 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73692 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73692 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73695 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73695 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73702 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73702 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73705 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73705 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73708 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73708 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73711 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73711 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73714 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73714 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73717 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73717 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73720 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73720 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
-- Unable to render SEQUENCE DDL for object K1BOSS.ISEQ$$_73723 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_73723 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 20
--------------------------------------------------------
--  DDL for Table CARRINHO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."CARRINHO" 
   (	"ID_CARRINHO" NUMBER(*,0), 
	"ID_MESA" NUMBER(*,0), 
	"ID_CLIENTE" NUMBER(*,0), 
	"VALOR_TOTAL" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CLIENTE
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."CLIENTE" 
   (	"ID_CLIENTE" NUMBER(*,0), 
	"NOME" VARCHAR2(100 BYTE), 
	"NIF" NUMBER(*,0), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"PASSWD" VARCHAR2(50 BYTE), 
	"USERNAME" VARCHAR2(50 BYTE), 
	"IS_ADMIN" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ESTABELECIMENTO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."ESTABELECIMENTO" 
   (	"ID_ESTABELECIMENTO" NUMBER(*,0), 
	"NOME" VARCHAR2(100 BYTE), 
	"RUA" VARCHAR2(100 BYTE), 
	"NUM_PORTA" VARCHAR2(50 BYTE), 
	"COD_POSTAL" VARCHAR2(50 BYTE), 
	"DESC_COD_POSTAL" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MESAS
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."MESAS" 
   (	"ID_MESA" NUMBER(*,0), 
	"NUM_MESA" NUMBER(*,0), 
	"ID_ESTABELECIMENTO" NUMBER(*,0), 
	"ESTADO" NUMBER(*,0) DEFAULT '0'
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PAGAMENTO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."PAGAMENTO" 
   (	"ID_PAGAMENTO" NUMBER(*,0), 
	"ID_CLIENTE" NUMBER(*,0), 
	"VALOR" FLOAT(126), 
	"DATA" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUTO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."PRODUTO" 
   (	"ID_PRODUTO" NUMBER(*,0), 
	"ID_ESTABELECIMENTO" NUMBER(*,0), 
	"PRECO" FLOAT(126), 
	"DESCRICAO" VARCHAR2(100 BYTE), 
	"NOME" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUTOS_CARRINHO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."PRODUTOS_CARRINHO" 
   (	"ID_PROD_CARR" NUMBER(*,0), 
	"ID_CARRINHO" NUMBER(*,0), 
	"ID_PRODUTO" NUMBER(*,0), 
	"QUANTIDADE" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PROMOCAO
--------------------------------------------------------

  CREATE TABLE "K1BOSS"."PROMOCAO" 
   (	"ID_PROMOCAO" NUMBER(*,0), 
	"ID_PRODUTO" NUMBER(*,0), 
	"VALOR" FLOAT(126), 
	"DATA_INICIO" DATE, 
	"DATA_FIM" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for View ESTADO_MESAS
--------------------------------------------------------

  CREATE OR REPLACE FORCE NONEDITIONABLE VIEW "K1BOSS"."ESTADO_MESAS" ("ESTADO", "MESA") AS 
  SELECT 
CASE
WHEN Mesas.Estado = '0' THEN 'Livre'    
WHEN Mesas.Estado = '1' THEN 'Ocupada'
END AS Estado, Mesas.num_mesa AS Mesa FROM Mesas
;
--------------------------------------------------------
--  DDL for View RECEBIMENTOS
--------------------------------------------------------

  CREATE OR REPLACE FORCE NONEDITIONABLE VIEW "K1BOSS"."RECEBIMENTOS" ("CLIENTE", "VALOR", "DATA") AS 
  SELECT c.nome AS Cliente,p.valor AS Valor, p.data AS Data
FROM Cliente c, Pagamento p
WHERE c.ID_Cliente = p.ID_Cliente
;
REM INSERTING into K1BOSS.CARRINHO
SET DEFINE OFF;
REM INSERTING into K1BOSS.CLIENTE
SET DEFINE OFF;
Insert into K1BOSS.CLIENTE (ID_CLIENTE,NOME,NIF,EMAIL,PASSWD,USERNAME,IS_ADMIN) values ('701','Carlos','123456789','k1boss@gmail.com','Carlos12','k1boss','1');
Insert into K1BOSS.CLIENTE (ID_CLIENTE,NOME,NIF,EMAIL,PASSWD,USERNAME,IS_ADMIN) values ('702','Filipe','122456789','fifi@gmail.com','fifitheflowerpot','fifi','0');
REM INSERTING into K1BOSS.ESTABELECIMENTO
SET DEFINE OFF;
Insert into K1BOSS.ESTABELECIMENTO (ID_ESTABELECIMENTO,NOME,RUA,NUM_PORTA,COD_POSTAL,DESC_COD_POSTAL) values ('1','Tasca','Rua generica','25','4900-000','Res do Chao');
Insert into K1BOSS.ESTABELECIMENTO (ID_ESTABELECIMENTO,NOME,RUA,NUM_PORTA,COD_POSTAL,DESC_COD_POSTAL) values ('101','restaurante1','rua generica 2','25','4900-954','1� andar');
REM INSERTING into K1BOSS.MESAS
SET DEFINE OFF;
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('101','1','101','0');
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('102','2','101','0');
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('1','1','1','0');
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('2','2','1','0');
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('3','3','1','0');
Insert into K1BOSS.MESAS (ID_MESA,NUM_MESA,ID_ESTABELECIMENTO,ESTADO) values ('4','4','1','0');
REM INSERTING into K1BOSS.PAGAMENTO
SET DEFINE OFF;
REM INSERTING into K1BOSS.PRODUTO
SET DEFINE OFF;
Insert into K1BOSS.PRODUTO (ID_PRODUTO,ID_ESTABELECIMENTO,PRECO,DESCRICAO,NOME) values ('1','1','1','Cafe','Cafe');
Insert into K1BOSS.PRODUTO (ID_PRODUTO,ID_ESTABELECIMENTO,PRECO,DESCRICAO,NOME) values ('2','1','2','Croissant Misto','Croissant Misto');
Insert into K1BOSS.PRODUTO (ID_PRODUTO,ID_ESTABELECIMENTO,PRECO,DESCRICAO,NOME) values ('3','1','1,5','Bolo de Chocolate','Bolo');
REM INSERTING into K1BOSS.PRODUTOS_CARRINHO
SET DEFINE OFF;
REM INSERTING into K1BOSS.PROMOCAO
SET DEFINE OFF;
REM INSERTING into K1BOSS.ESTADO_MESAS
SET DEFINE OFF;
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','1');
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','2');
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','1');
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','2');
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','3');
Insert into K1BOSS.ESTADO_MESAS (ESTADO,MESA) values ('Livre','4');
REM INSERTING into K1BOSS.RECEBIMENTOS
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SYS_C007621
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007621" ON "K1BOSS"."ESTABELECIMENTO" ("ID_ESTABELECIMENTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007627
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007627" ON "K1BOSS"."PRODUTO" ("ID_PRODUTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007634
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007634" ON "K1BOSS"."MESAS" ("ID_MESA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007640
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007640" ON "K1BOSS"."CLIENTE" ("ID_CLIENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007643
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007643" ON "K1BOSS"."CARRINHO" ("ID_CARRINHO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007650
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007650" ON "K1BOSS"."PRODUTOS_CARRINHO" ("ID_PROD_CARR") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007656
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007656" ON "K1BOSS"."PAGAMENTO" ("ID_PAGAMENTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C007663
--------------------------------------------------------

  CREATE UNIQUE INDEX "K1BOSS"."SYS_C007663" ON "K1BOSS"."PROMOCAO" ("ID_PROMOCAO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger CARRINHO_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."CARRINHO_ON_INSERT" 
    before insert on Carrinho
    for each row
begin
    select ID_Carrinho.nextval
    into :new.ID_Carrinho
    from dual;
end;
/
ALTER TRIGGER "K1BOSS"."CARRINHO_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger CLIENTE_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."CLIENTE_ON_INSERT" 
    before insert on Cliente
    for each row
begin
    select ID_CLIENTE.nextval
    into :new.ID_Cliente
    from dual;
end;
/
ALTER TRIGGER "K1BOSS"."CLIENTE_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger ESTABELECIMENTO_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."ESTABELECIMENTO_ON_INSERT" 
    before insert on Estabelecimento
    for each row
begin
    select ID_ESTABELECIMENTO.nextval
    into :new.ID_Estabelecimento
    from dual;
end;

/
ALTER TRIGGER "K1BOSS"."ESTABELECIMENTO_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger MESAS_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."MESAS_ON_INSERT" 
    before insert on Mesas
    for each row
begin
    select ID_MESA.nextval
    into :new.ID_Mesa
    from dual;
end;
/
ALTER TRIGGER "K1BOSS"."MESAS_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PAGAMENTO_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."PAGAMENTO_ON_INSERT" 
    before insert on Pagamento
    for each row
begin
    select ID_PAGAMENTO.nextval
    into :new.ID_Pagamento
    from dual;
end;


/
ALTER TRIGGER "K1BOSS"."PAGAMENTO_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PROD_CARR_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."PROD_CARR_ON_INSERT" 
    before insert on Produtos_Carrinho
    for each row
begin
    select ID_PROD_CARRINHO.nextval
    into :new.ID_Prod_Carr
    from dual;
end;

/
ALTER TRIGGER "K1BOSS"."PROD_CARR_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PRODUTO_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."PRODUTO_ON_INSERT" 
    before insert on Produto
    for each row
begin
    select ID_PRODUTO.nextval
    into :new.ID_Produto
    from dual;
end;
/
ALTER TRIGGER "K1BOSS"."PRODUTO_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger PROMOCAO_ON_INSERT
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "K1BOSS"."PROMOCAO_ON_INSERT" 
    before insert on Promocao
    for each row
begin
    select ID_PROMOCAO.nextval
    into :new.ID_Promocao
    from dual;
end;
/
ALTER TRIGGER "K1BOSS"."PROMOCAO_ON_INSERT" ENABLE;
--------------------------------------------------------
--  DDL for Procedure CRIARCARRINHO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."CRIARCARRINHO" (id_mesa NUMBER,id_cliente NUMBER) IS
BEGIN
    INSERT INTO Carrinho(ID_Mesa,ID_Cliente, valor_total)
    VALUES(id_mesa,id_cliente,0);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSCLIENTE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSCLIENTE" (nome VARCHAR,nif NUMBER,email VARCHAR, username VARCHAR, passwd VARCHAR) IS
BEGIN
    INSERT INTO Cliente(nome,NIF,email, username, passwd)
    VALUES(nome,nif,email, username, passwd);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSESTABELECIMENTO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSESTABELECIMENTO" 
(nome VARCHAR, rua VARCHAR,num_porta VARCHAR,cod_postal VARCHAR,desc_cod_postal VARCHAR) IS
BEGIN
    INSERT INTO Estabelecimento(nome,rua,num_porta,cod_postal,desc_cod_postal) 
    VALUES(nome,rua,num_porta,cod_postal,desc_cod_postal);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSMESA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSMESA" (num_mesa NUMBER,id_estabelecimento NUMBER,estado NUMBER) IS
BEGIN
    INSERT INTO Mesas(num_mesa,ID_Estabelecimento,Estado)
    VALUES(num_mesa,id_estabelecimento,estado);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSPAGAMENTO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSPAGAMENTO" (id_cliente NUMBER) IS
BEGIN
    INSERT INTO Pagamento(ID_Cliente,Valor,Data)
    VALUES(id_cliente,(SELECT valor_total FROM Carrinho WHERE ID_Cliente = id_cliente),SYSDATE);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSPRODCARRINHO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSPRODCARRINHO" (id_carrinho NUMBER,id_produto NUMBER, qtd NUMBER) IS
BEGIN
    INSERT INTO Produtos_Carrinho(ID_Carrinho,ID_Produto,quantidade)
    VALUES(id_carrinho,id_produto,qtd);
END;

/
--------------------------------------------------------
--  DDL for Procedure INSPRODUTO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE NONEDITIONABLE PROCEDURE "K1BOSS"."INSPRODUTO" 
(id_estabelecimento  NUMBER,preco FLOAT, descricao VARCHAR,nome VARCHAR) IS
BEGIN
    INSERT INTO Produto(ID_Estabelecimento,preco,descricao,nome)
    VALUES(id_estabelecimento,preco,descricao,nome);
END;

/
--------------------------------------------------------
--  DDL for Synonymn DUAL
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE PUBLIC SYNONYM "DUAL" FOR "SYS"."DUAL";
--------------------------------------------------------
--  Constraints for Table CARRINHO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."CARRINHO" MODIFY ("ID_CARRINHO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CARRINHO" MODIFY ("ID_CLIENTE" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CARRINHO" ADD PRIMARY KEY ("ID_CARRINHO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CLIENTE
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("ID_CLIENTE" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("NOME" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("NIF" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CLIENTE" ADD CHECK (NIF BETWEEN 111111111 AND 999999999) ENABLE;
  ALTER TABLE "K1BOSS"."CLIENTE" ADD PRIMARY KEY ("ID_CLIENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("PASSWD" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."CLIENTE" ADD CHECK (is_admin BETWEEN 0 AND 1) ENABLE;
  ALTER TABLE "K1BOSS"."CLIENTE" MODIFY ("IS_ADMIN" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ESTABELECIMENTO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("ID_ESTABELECIMENTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("NOME" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("RUA" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("NUM_PORTA" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("COD_POSTAL" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" MODIFY ("DESC_COD_POSTAL" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."ESTABELECIMENTO" ADD PRIMARY KEY ("ID_ESTABELECIMENTO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table MESAS
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."MESAS" MODIFY ("ID_MESA" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."MESAS" MODIFY ("NUM_MESA" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."MESAS" MODIFY ("ID_ESTABELECIMENTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."MESAS" MODIFY ("ESTADO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."MESAS" ADD CHECK (Estado BETWEEN 0 AND 1) ENABLE;
  ALTER TABLE "K1BOSS"."MESAS" ADD PRIMARY KEY ("ID_MESA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PAGAMENTO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PAGAMENTO" MODIFY ("ID_PAGAMENTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PAGAMENTO" MODIFY ("ID_CLIENTE" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PAGAMENTO" MODIFY ("DATA" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PAGAMENTO" ADD PRIMARY KEY ("ID_PAGAMENTO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUTO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PRODUTO" MODIFY ("ID_PRODUTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTO" MODIFY ("ID_ESTABELECIMENTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTO" MODIFY ("PRECO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTO" MODIFY ("DESCRICAO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTO" MODIFY ("NOME" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTO" ADD PRIMARY KEY ("ID_PRODUTO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUTOS_CARRINHO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" MODIFY ("ID_PROD_CARR" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" MODIFY ("ID_CARRINHO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" MODIFY ("ID_PRODUTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" MODIFY ("QUANTIDADE" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" ADD PRIMARY KEY ("ID_PROD_CARR")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PROMOCAO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PROMOCAO" MODIFY ("ID_PROMOCAO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PROMOCAO" MODIFY ("ID_PRODUTO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PROMOCAO" MODIFY ("VALOR" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PROMOCAO" MODIFY ("DATA_INICIO" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PROMOCAO" MODIFY ("DATA_FIM" NOT NULL ENABLE);
  ALTER TABLE "K1BOSS"."PROMOCAO" ADD PRIMARY KEY ("ID_PROMOCAO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CARRINHO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."CARRINHO" ADD FOREIGN KEY ("ID_MESA")
	  REFERENCES "K1BOSS"."MESAS" ("ID_MESA") ENABLE;
  ALTER TABLE "K1BOSS"."CARRINHO" ADD FOREIGN KEY ("ID_CLIENTE")
	  REFERENCES "K1BOSS"."CLIENTE" ("ID_CLIENTE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table MESAS
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."MESAS" ADD FOREIGN KEY ("ID_ESTABELECIMENTO")
	  REFERENCES "K1BOSS"."ESTABELECIMENTO" ("ID_ESTABELECIMENTO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PAGAMENTO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PAGAMENTO" ADD FOREIGN KEY ("ID_CLIENTE")
	  REFERENCES "K1BOSS"."CLIENTE" ("ID_CLIENTE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUTO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PRODUTO" ADD FOREIGN KEY ("ID_ESTABELECIMENTO")
	  REFERENCES "K1BOSS"."ESTABELECIMENTO" ("ID_ESTABELECIMENTO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUTOS_CARRINHO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" ADD FOREIGN KEY ("ID_CARRINHO")
	  REFERENCES "K1BOSS"."CARRINHO" ("ID_CARRINHO") ENABLE;
  ALTER TABLE "K1BOSS"."PRODUTOS_CARRINHO" ADD FOREIGN KEY ("ID_PRODUTO")
	  REFERENCES "K1BOSS"."PRODUTO" ("ID_PRODUTO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PROMOCAO
--------------------------------------------------------

  ALTER TABLE "K1BOSS"."PROMOCAO" ADD FOREIGN KEY ("ID_PRODUTO")
	  REFERENCES "K1BOSS"."PRODUTO" ("ID_PRODUTO") ENABLE;

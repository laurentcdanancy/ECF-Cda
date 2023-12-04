/*==============================================================*/
/* Nom de SGBD :  SAP SQL Anywhere 16                           */
/* Date de création :  30/11/2023 09:32:36                      */
/*==============================================================*/
/*auteur stagiaire : laurent*/

/*drop database sparadrap;*/
create database sparadrap;
use sparadrap;


/*==============================================================*/
/* Table : ACHETER                                              */
/*==============================================================*/
create table ACHETER
(
   ID_PERSONNE integer not null,
   ID_CLIENT integer not null,
   ID_ORDONNANCE numeric not null,
   ID_MEDICAMENT integer not null,
   constraint PK_ACHETER primary key clustered (ID_PERSONNE, ID_CLIENT, ID_ORDONNANCE, ID_MEDICAMENT)
);

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT
(
   ID_PERSONNE integer not null,
   ID_CLIENT integer not null,
   NOM_PERSONNE varchar(30) not null,
   PRENOM_PERSONNE varchar(30) not null,
   NUMERO_DE_SECURITE_SOCIAL_CLIENT BIGINT not null,
   DATE_NAISSANCE_CLIENT date not null,
   MUTUELLE_CLIENT varchar(30) not null,
   MEDECIN_TRAINTANT_CLIENT varchar(30) not null,
   MEDECIN_SPECIALIST_CLIENT varchar(30) null,
   constraint PK_CLIENT primary key clustered (ID_PERSONNE, ID_CLIENT)
);

/*==============================================================*/
/* Table : CONSULTE_PAR                                         */
/*==============================================================*/
create table CONSULTE_PAR
(
   CLI_ID_PERSONNE integer not null,
   ID_CLIENT integer not null,
   MED_ID_PERSONNE integer not null,
   ID_MEDECIN char(10) not null,
   ID_PERSONNE integer not null,
   ID_SPECIALISTE integer not null,
   constraint PK_CONSULTE_PAR primary key clustered (CLI_ID_PERSONNE, ID_CLIENT, MED_ID_PERSONNE, ID_MEDECIN, ID_PERSONNE, ID_SPECIALISTE)
);

/*==============================================================*/
/* Table : COORDONNEE                                           */
/*==============================================================*/
create table COORDONNEE
(
   ID_COORDONNE integer not null,
   ADRESSE varchar(255) not null,
   VILLE integer not null,
   TELEPHONE BIGINT not null,
   EMAIL varchar(255) not null,
   constraint PK_COORDONNEE primary key clustered (ID_COORDONNE)
);

/*==============================================================*/
/* Table : COORDONNEES_MUTUELLE                                 */
/*==============================================================*/
create table COORDONNEES_MUTUELLE
(
   ID_ADRESSE_MUTUELLE char(10) not null,
   ADRESSE_MUTUELLE_ varchar(255) not null,
   CODE_POSTAL integer not null,
   VILLE integer not null,
   TELEPHONE BIGINT not null,
   EMAIL varchar(255) null,
   DEPARTEMENT integer null,
   constraint PK_COORDONNEES_MUTUELLE primary key clustered (ID_ADRESSE_MUTUELLE)
);

/*==============================================================*/
/* Table : ETRE_JOIGNABLE                                       */
/*==============================================================*/
create table ETRE_JOIGNABLE
(
   CLI_ID_PERSONNE integer not null,
   ID_CLIENT integer not null,
   MED_ID_PERSONNE integer not null,
   ID_MEDECIN char(10) not null,
   ID_PERSONNE integer not null,
   ID_SPECIALISTE integer not null,
   ID_COORDONNE integer not null,
   constraint PK_ETRE_JOIGNABLE primary key clustered (CLI_ID_PERSONNE, ID_CLIENT, MED_ID_PERSONNE, ID_MEDECIN, ID_PERSONNE, ID_SPECIALISTE, ID_COORDONNE)
);

/*==============================================================*/
/* Table : MEDECIN                                              */
/*==============================================================*/
create table MEDECIN
(
   ID_PERSONNE integer not null,
   ID_MEDECIN char(10) not null,
   NOM_PERSONNE varchar(30) not null,
   PRENOM_PERSONNE varchar(30) not null,
   NUMERO_DE_AGREEMENT_MEDECIN BIGINT not null,
   constraint PK_MEDECIN primary key clustered (ID_PERSONNE, ID_MEDECIN)
);

/*==============================================================*/
/* Table : MEDICAMENT                                           */
/*==============================================================*/
create table MEDICAMENT
(
   ID_MEDICAMENT integer not null,
   NOM_MEDICAMENT2 varchar(50) not null,
   CATEGORIE_MEDICAMENT varchar(50) not null,
   PRIX_MEDICAMENT decimal(3,2) not null,
   DATE_DE_MISE_EN_SERVICE_MEDICAMENT date not null,
   QUANTITE_MEDICAMENT integer not null,
   constraint PK_MEDICAMENT primary key clustered (ID_MEDICAMENT)
);

/*==============================================================*/
/* Table : MUTUELLE                                             */
/*==============================================================*/
create table MUTUELLE
(
   ID_MUTUELLE integer not null,
   NOM_MUTUELLE_MUTUELLE varchar(50) not null,
   TAUX_DE_PRISE_EN_CHARGE_MUTUELLE decimal(3,2) not null
);

/*==============================================================*/
/* Table : ORDONNACE                                            */
/*==============================================================*/
create table ORDONNACE
(
   ID_ORDONNANCE numeric not null,
   DATE date not null,
   constraint PK_ORDONNACE primary key clustered (ID_ORDONNANCE)
);

/*==============================================================*/
/* Table : PERSONNE                                             */
/*==============================================================*/
create table PERSONNE
(
   ID_PERSONNE integer not null,
   NOM_PERSONNE varchar(30) not null,
   PRENOM_PERSONNE varchar(30) not null,
   constraint PK_PERSONNE primary key clustered (ID_PERSONNE)
);

/*==============================================================*/
/* Table : PRESCRIT_MEDICAMENT                                  */
/*==============================================================*/
create table PRESCRIT_MEDICAMENT
(
   ID_ORDONNANCE numeric not null,
   MED_ID_PERSONNE integer not null,
   ID_MEDECIN char(10) not null,
   ID_PERSONNE integer not null,
   ID_SPECIALISTE integer not null,
   constraint PK_PRESCRIT_MEDICAMENT primary key clustered (ID_ORDONNANCE, MED_ID_PERSONNE, ID_MEDECIN, ID_PERSONNE, ID_SPECIALISTE)
);

/*==============================================================*/
/* Table : SPECIALISTE                                          */
/*==============================================================*/
create table SPECIALISTE
(
   ID_PERSONNE integer not null,
   ID_SPECIALISTE integer not null,
   NOM_PERSONNE varchar(30) not null,
   PRENOM_PERSONNE varchar(30) not null,
   SPECIALITE_SPECIALISTE varchar(50) not null,
   constraint PK_SPECIALISTE primary key clustered (ID_PERSONNE, ID_SPECIALISTE)
);


-- Contraintes de clé étrangère

alter table ACHETER
add constraint FK_ACHETER_ACHETER_CLIENT foreign key (ID_PERSONNE, ID_CLIENT)
references CLIENT (ID_PERSONNE, ID_CLIENT)
on update restrict
on
delete restrict;

alter table PRESCRIT_MEDICAMENT
add constraint FK_PRESCRIT_PRESCRIT__ORDONNAC foreign key (ID_ORDONNANCE)
references ORDONNACE (ID_ORDONNANCE)
on update restrict
on
delete restrict;

-- Autres contraintes

alter table CLIENT
add constraint FK_CLIENT_HERITAGE__PERSONNE foreign key (ID_PERSONNE)
references PERSONNE (ID_PERSONNE)
on update restrict
on
delete restrict;

alter table MEDECIN
add constraint FK_MEDECIN_HERITAGE__PERSONNE foreign key (ID_PERSONNE)
references PERSONNE (ID_PERSONNE)
on update restrict
on
delete restrict;

alter table SPECIALISTE
add constraint FK_SPECIALI_HERITAGE__PERSONNE foreign key (ID_PERSONNE)
references PERSONNE (ID_PERSONNE)
on update restrict
on
delete restrict;


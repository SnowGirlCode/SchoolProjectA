-- phpMyAdmin SQL Dump
-- version 4.4.15.8
-- https://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 04 Avril 2018 à 17:42
-- Version du serveur :  5.6.31
-- Version de PHP :  5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `maternite_patient`
--

-- --------------------------------------------------------

--
-- Structure de la table `accouchement`
--

CREATE TABLE IF NOT EXISTS `accouchement` (
  `id` int(25) NOT NULL,
  `Nom_Patiente` varchar(250) NOT NULL,
  `Prenom_Patiente` varchar(250) NOT NULL,
  `id_Visite` int(25) NOT NULL,
  `Nom_Docteur` varchar(250) NOT NULL,
  `Nom_Sagefemme` varchar(250) NOT NULL,
  `due_date` date NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `patientDetails`
--

CREATE TABLE IF NOT EXISTS `patientDetails` (
  `Nom` varchar(250) NOT NULL,
  `Prenom` varchar(250) NOT NULL,
  `Date_naissance` date NOT NULL,
  `Lieu_naissance` varchar(250) NOT NULL,
  `Adresse` text NOT NULL,
  `tel` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `groupe_sanguin` varchar(10) NOT NULL,
  `Médecin_du_cas` varchar(250) NOT NULL,
  `Code` int(10) NOT NULL,
  `Contact_Urgence` varchar(250) NOT NULL,
  `Tel_Urgence` varchar(16) NOT NULL,
  `Historique_Médical` text NOT NULL,
  `SF_du_cas` varchar(250) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `patientDetails`
--

INSERT INTO `patientDetails` (`Nom`, `Prenom`, `Date_naissance`, `Lieu_naissance`, `Adresse`, `tel`, `email`, `groupe_sanguin`, `Médecin_du_cas`, `Code`, `Contact_Urgence`, `Tel_Urgence`, `Historique_Médical`, `SF_du_cas`) VALUES
('Boudali', 'Oumelkheir', '1996-08-10', 'SBA', 'Gambeta', '0678986858', 'oumelkheir@hotmail.fr', 'A+', 'abou bakr', 1, 'Boudali Houari', '0698784587', 'Fibrome', '');

-- --------------------------------------------------------

--
-- Structure de la table `RDV`
--

CREATE TABLE IF NOT EXISTS `RDV` (
  `Nom_Patiente` varchar(250) NOT NULL,
  `Prenom_Patiente` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `Nom_Docteur` varchar(250) NOT NULL,
  `id` int(250) NOT NULL,
  `date_naissance` date NOT NULL,
  `tel` varchar(25) NOT NULL,
  `sujet` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `RDV`
--

INSERT INTO `RDV` (`Nom_Patiente`, `Prenom_Patiente`, `date`, `Nom_Docteur`, `id`, `date_naissance`, `tel`, `sujet`) VALUES
('saadallah', 'Mouna', '2018-03-12', 'Chergui', 1, '1997-12-24', '0555329258', 'exam'),
('Djaroud', 'Sara', '2018-03-24', 'Chiali', 4, '1997-12-24', '0555329258', 'Exam '),
('Kourat', 'Imene', '2018-03-29', 'Abou Bakr', 5, '1996-10-15', '0698789625', 'Vaccination');

-- --------------------------------------------------------

--
-- Structure de la table `Visite`
--

CREATE TABLE IF NOT EXISTS `Visite` (
  `id` int(11) NOT NULL,
  `id_Patiente` int(11) NOT NULL,
  `Nom_Patiente` varchar(250) NOT NULL,
  `id_RDV` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `accouchement`
--
ALTER TABLE `accouchement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_Visite` (`id_Visite`);

--
-- Index pour la table `patientDetails`
--
ALTER TABLE `patientDetails`
  ADD PRIMARY KEY (`Code`),
  ADD KEY `Médecin_du_cas` (`Médecin_du_cas`),
  ADD KEY `Nom` (`Nom`),
  ADD KEY `Prenom` (`Prenom`),
  ADD KEY `Médecin_du_cas_2` (`Médecin_du_cas`),
  ADD KEY `SF_du_cas` (`SF_du_cas`);

--
-- Index pour la table `RDV`
--
ALTER TABLE `RDV`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Nom_Docteur` (`Nom_Docteur`),
  ADD KEY `Nom_Patiente` (`Nom_Patiente`),
  ADD KEY `Prenom_Patiente` (`Prenom_Patiente`);

--
-- Index pour la table `Visite`
--
ALTER TABLE `Visite`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_RDV` (`id_RDV`),
  ADD KEY `id_Patiente` (`id_Patiente`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `accouchement`
--
ALTER TABLE `accouchement`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `patientDetails`
--
ALTER TABLE `patientDetails`
  MODIFY `Code` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `RDV`
--
ALTER TABLE `RDV`
  MODIFY `id` int(250) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Visite`
--
ALTER TABLE `Visite`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `patientDetails`
--
ALTER TABLE `patientDetails`
  ADD CONSTRAINT `patientdetails_ibfk_1` FOREIGN KEY (`Médecin_du_cas`) REFERENCES `maternite_profile`.`doctor` (`Nom`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patientdetails_ibfk_2` FOREIGN KEY (`SF_du_cas`) REFERENCES `maternite_profile`.`nurse` (`Nom`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `Visite`
--
ALTER TABLE `Visite`
  ADD CONSTRAINT `visite_ibfk_1` FOREIGN KEY (`id_Patiente`) REFERENCES `patientDetails` (`Code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `visite_ibfk_2` FOREIGN KEY (`id_RDV`) REFERENCES `RDV` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

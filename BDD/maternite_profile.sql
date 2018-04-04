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
-- Base de données :  `maternite_profile`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `pseudo` varchar(12) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`pseudo`, `password`, `Nom`, `Prenom`) VALUES
('admin', 'adminlog', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `chef_service`
--

CREATE TABLE IF NOT EXISTS `chef_service` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL,
  `Tel` varchar(17) NOT NULL,
  `email` varchar(250) NOT NULL,
  `diplome` text NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` varchar(250) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `chef_service`
--

INSERT INTO `chef_service` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`, `Tel`, `email`, `diplome`, `dateNaissance`, `LieuNaissance`, `id`) VALUES
('chef', 'cheflog', '', '', '', '', '', '', '0000-00-00', '', 1);

-- --------------------------------------------------------

--
-- Structure de la table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL,
  `Tel` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `diplome` text NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` text NOT NULL,
  `id` int(10) NOT NULL,
  `type` varchar(250) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `doctor`
--

INSERT INTO `doctor` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`, `Tel`, `email`, `diplome`, `dateNaissance`, `LieuNaissance`, `id`, `type`) VALUES
('doc', 'doclog', 'mouna', 'Sara', 'jcp', '0782864274', 'djaroud@hotmail.fr', 'licence', '1997-12-24', 'sba', 1, 'Résident'),
('doctor', 'doci', 'Abou Bakr', 'Islam', 'labrimaire', '0468259563', 'snowygirl@ho.fr', 'master', '2018-03-21', 'jcp', 2, 'Professeur'),
('chiali', 'chialilog', 'Chiali', 'Fatima', 'Labrimaire', '0765892586', 'chaili@gmail.com', 'doctorat', '1980-03-21', 'le lieu de naissance', 3, 'Professeur'),
('bencanoun', 'benlog', 'Bencanoun', 'omar', 'Cité Police', '0698120458', 'omar@hotmail.com', 'Master', '1970-08-14', 'Oran', 4, 'Interne'),
('Bendella', 'login', 'Bendella', 'Souhila', 'Sidi Djilali', '0578963258', 'souh@hotmail.fr', 'Master\nDoctorat', '1960-04-27', 'Alger', 5, 'Résident');

-- --------------------------------------------------------

--
-- Structure de la table `infermiere`
--

CREATE TABLE IF NOT EXISTS `infermiere` (
  `Nom` varchar(250) NOT NULL,
  `pseudo` varchar(250) NOT NULL,
  `Prenom` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `Adresse` varchar(250) NOT NULL,
  `Tel` varchar(16) NOT NULL,
  `email` varchar(250) NOT NULL,
  `diplome` text NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` text NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `infermiere`
--

INSERT INTO `infermiere` (`Nom`, `pseudo`, `Prenom`, `password`, `Adresse`, `Tel`, `email`, `diplome`, `dateNaissance`, `LieuNaissance`, `id`) VALUES
('', 'infermier', 'infermierlog', '', '', '', '', '', '0000-00-00', '', 1);

-- --------------------------------------------------------

--
-- Structure de la table `nurse`
--

CREATE TABLE IF NOT EXISTS `nurse` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL,
  `email` varchar(250) NOT NULL,
  `diplome` text NOT NULL,
  `Tel` varchar(16) NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` text NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `nurse`
--

INSERT INTO `nurse` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`, `email`, `diplome`, `Tel`, `dateNaissance`, `LieuNaissance`, `id`) VALUES
('sagefemme', 'sflog', '', '', '', '', '', '', '0000-00-00', '', 1),
('snowgirl', '14515', 'mouna', 'saadallah', 'sba', 'snowygirl@hotmail.fr', 'licence', '04565897', '2017-02-17', 'bouira', 2);

-- --------------------------------------------------------

--
-- Structure de la table `pharmacien`
--

CREATE TABLE IF NOT EXISTS `pharmacien` (
  `Adresse` varchar(250) NOT NULL,
  `Nom` varchar(250) NOT NULL,
  `Prenom` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `pseudo` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `Tel` varchar(16) NOT NULL,
  `diplome` text NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` text NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `pharmacien`
--

INSERT INTO `pharmacien` (`Adresse`, `Nom`, `Prenom`, `password`, `pseudo`, `email`, `Tel`, `diplome`, `dateNaissance`, `LieuNaissance`, `id`) VALUES
('', '', '', 'pharmalog', 'pharma', '', '', '', '0000-00-00', '', 1);

-- --------------------------------------------------------

--
-- Structure de la table `receptionniste`
--

CREATE TABLE IF NOT EXISTS `receptionniste` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL,
  `email` varchar(250) NOT NULL,
  `Tel` varchar(16) NOT NULL,
  `dateNaissance` date NOT NULL,
  `LieuNaissance` text NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `receptionniste`
--

INSERT INTO `receptionniste` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`, `email`, `Tel`, `dateNaissance`, `LieuNaissance`, `id`) VALUES
('reception', 'receptionlog', '', '', '', '', '', '0000-00-00', '', 1);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `chef_service`
--
ALTER TABLE `chef_service`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Nom` (`Nom`);

--
-- Index pour la table `infermiere`
--
ALTER TABLE `infermiere`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Nom` (`Nom`);

--
-- Index pour la table `pharmacien`
--
ALTER TABLE `pharmacien`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `receptionniste`
--
ALTER TABLE `receptionniste`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `chef_service`
--
ALTER TABLE `chef_service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `infermiere`
--
ALTER TABLE `infermiere`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `pharmacien`
--
ALTER TABLE `pharmacien`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `receptionniste`
--
ALTER TABLE `receptionniste`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

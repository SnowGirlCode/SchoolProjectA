-- phpMyAdmin SQL Dump
-- version 4.4.15.8
-- https://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 09 Mars 2018 à 17:19
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
  `Adresse` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `chef_service`
--

INSERT INTO `chef_service` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`) VALUES
('chefService', 'chefserviceLogin', '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `doctor`
--

INSERT INTO `doctor` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`) VALUES
('Chergui', 'docteurchergui', 'Chergui', 'Mohamed', 'Labrimaire');

-- --------------------------------------------------------

--
-- Structure de la table `nurse`
--

CREATE TABLE IF NOT EXISTS `nurse` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `nurse`
--

INSERT INTO `nurse` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`) VALUES
('sageFemme', 'nurseLogin', '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `receptionniste`
--

CREATE TABLE IF NOT EXISTS `receptionniste` (
  `pseudo` varchar(12) NOT NULL,
  `password` text NOT NULL,
  `Nom` varchar(240) NOT NULL,
  `Prenom` varchar(240) NOT NULL,
  `Adresse` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `receptionniste`
--

INSERT INTO `receptionniste` (`pseudo`, `password`, `Nom`, `Prenom`, `Adresse`) VALUES
('reception', 'receptionLogin', '', '', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

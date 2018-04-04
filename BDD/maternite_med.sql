-- phpMyAdmin SQL Dump
-- version 4.4.15.8
-- https://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 04 Avril 2018 à 17:41
-- Version du serveur :  5.6.31
-- Version de PHP :  5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `maternite_med`
--

-- --------------------------------------------------------

--
-- Structure de la table `med`
--

CREATE TABLE IF NOT EXISTS `med` (
  `id` int(20) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `quantité` int(100) NOT NULL,
  `prix` int(250) NOT NULL,
  `dosage` int(50) NOT NULL,
  `date_peremp` date NOT NULL,
  `quantite_min` int(250) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `med`
--

INSERT INTO `med` (`id`, `nom`, `quantité`, `prix`, `dosage`, `date_peremp`, `quantite_min`) VALUES
(2, 'Rovamycine', 100, 410, 3, '2020-02-20', 81),
(3, 'Amoclan', 13, 593, 200, '2019-05-14', 20),
(5, 'Fumacur', 250, 130, 200, '2020-02-22', 28),
(7, 'Paracetamol', 100, 80, 2, '2025-03-17', 51),
(8, 'Augmentin', 300, 200, 3, '2016-02-12', 100),
(10, 'Amlor', 100, 300, 200, '2015-06-09', 0);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `med`
--
ALTER TABLE `med`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `med`
--
ALTER TABLE `med`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

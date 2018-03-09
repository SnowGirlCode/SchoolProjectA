-- phpMyAdmin SQL Dump
-- version 4.4.15.8
-- https://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 09 Mars 2018 à 17:20
-- Version du serveur :  5.6.31
-- Version de PHP :  5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `maternite_site`
--

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

CREATE TABLE IF NOT EXISTS `message` (
  `id` int(20) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `tel` int(30) NOT NULL,
  `msg` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `message`
--

INSERT INTO `message` (`id`, `nom`, `email`, `tel`, `msg`) VALUES
(1, 'Mouna', 'snowygirl@hotmail.fr', 555329258, 'You are awesome!');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `message`
--
ALTER TABLE `message`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

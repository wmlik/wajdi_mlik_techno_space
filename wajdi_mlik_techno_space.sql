-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 18 mai 2022 à 14:44
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `wajdi_mlik_techno_space`
--
CREATE DATABASE IF NOT EXISTS `wajdi_mlik_techno_space` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `wajdi_mlik_techno_space`;

-- --------------------------------------------------------

--
-- Structure de la table `cpu`
--

DROP TABLE IF EXISTS `cpu`;
CREATE TABLE `cpu` (
  `id_cpu` int(20) NOT NULL,
  `processor_number` varchar(20) DEFAULT NULL,
  `generationCpu` varchar(20) DEFAULT NULL,
  `speed` varchar(20) DEFAULT NULL,
  `nombre_de_coeur` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `cpu`
--

INSERT INTO `cpu` (`id_cpu`, `processor_number`, `generationCpu`, `speed`, `nombre_de_coeur`) VALUES
(1, 'i5', '12 eme gen', '1.6 gh', '8'),
(2, 'i5', '9 eme gen', '2.5gh', '8'),
(3, 'i5', '9 eme gen', '1.6 gh', '2'),
(4, 'i7', '12 eme gen', '4.1 gh', '2'),
(5, 'i3', '10 eme gen', '2.5gh', '4'),
(6, 'i9', '12 eme gen', '1.6 gh', '8'),
(7, 'i5', '10 eme gen', '2.5gh', '8'),
(8, 'intel inside', '10 eme gen', '2 gh', '2'),
(9, 'i3', '8 eme gen', '2 gh', '2'),
(10, 'i3', '12 eme gen', '2 gh', '8'),
(11, 'i3', '11 eme gen', '2.5gh', '4'),
(12, 'i3', '12 eme gen', '4.1 gh', '4'),
(13, 'intel inside', '9 eme gen', '2 gh', '2'),
(14, 'i9', '9 eme gen', '3.1 gh', '4'),
(15, 'i7', '12 eme gen', '2 gh', '8'),
(16, 'intel inside', '12 eme gen', '4.1 gh', '8'),
(17, 'i3', '10 eme gen', '3.1 gh', '4'),
(18, 'intel inside', '9 eme gen', '3.1 gh', '8'),
(19, 'i5', '12 eme gen', '3.5 gh', '4'),
(20, 'i9', '8 eme gen', '2.5gh', '2'),
(21, 'i9', '8 eme gen', '2.5gh', '8'),
(22, 'intel inside', '8 eme gen', '3.1 gh', '8'),
(23, 'intel inside', '8 eme gen', '3.1 gh', '2'),
(24, 'intel inside', '8 eme gen', '2.5gh', '4'),
(25, 'i3', '12 eme gen', '3.1 gh', '2'),
(26, 'i5', '8 eme gen', '3.5 gh', '8'),
(27, 'i3', '9 eme gen', '2.5gh', '8'),
(28, 'i9', '9 eme gen', '2.5gh', '4'),
(29, 'i9', '12 eme gen', '2.5gh', '4'),
(30, 'intel inside', '8 eme gen', '3.1 gh', '4'),
(31, 'i9', '11 eme gen', '1.6 gh', '8'),
(32, 'intel inside', '8 eme gen', '2.5gh', '8'),
(33, 'intel inside', '10 eme gen', '2 gh', '8'),
(34, 'intel inside', '9 eme gen', '2.5gh', '4'),
(35, 'i7', '9 eme gen', '2.5gh', '8'),
(36, 'i3', '10 eme gen', '1.6 gh', '2'),
(37, 'i7', '12 eme gen', '2 gh', '2'),
(38, 'i9', '11 eme gen', '4.1 gh', '2'),
(39, 'i5', '9 eme gen', '2 gh', '4'),
(40, 'i5', '10 eme gen', '1.6 gh', '4'),
(41, 'i9', '11 eme gen', '1.6 gh', '4'),
(42, 'i3', '11 eme gen', '4.1 gh', '2'),
(43, 'i5', '9 eme gen', '3.1 gh', '8'),
(44, 'i3', '11 eme gen', '1.6 gh', '4'),
(45, 'i9', '10 eme gen', '2 gh', '8'),
(46, 'i3', '11 eme gen', '4.1 gh', '8'),
(47, 'intel inside', '10 eme gen', '1.6 gh', '4'),
(48, 'i5', '10 eme gen', '1.6 gh', '8'),
(49, 'i9', '9 eme gen', '1.6 gh', '2'),
(50, 'intel inside', '8 eme gen', '3.5 gh', '8'),
(51, 'i5', '11 eme gen', '4.1 gh', '2'),
(52, 'i5', '11 eme gen', '1.6 gh', '2'),
(53, 'i3', '12 eme gen', '2.5gh', '8'),
(54, 'i5', '10 eme gen', '4.1 gh', '4'),
(55, 'intel inside', '10 eme gen', '1.6 gh', '8'),
(56, 'i9', '11 eme gen', '2.5gh', '4'),
(57, 'i5', '9 eme gen', '3.5 gh', '2'),
(58, 'i5', '11 eme gen', '1.6 gh', '2'),
(59, 'intel inside', '8 eme gen', '3.5 gh', '2'),
(60, 'i9', '12 eme gen', '1.6 gh', '4'),
(61, 'i9', '12 eme gen', '3.5 gh', '8'),
(62, 'i9', '11 eme gen', '3.1 gh', '8'),
(63, 'i3', '8 eme gen', '1.6 gh', '8'),
(64, 'i5', '8 eme gen', '2 gh', '2'),
(65, 'i9', '12 eme gen', '2.5gh', '2'),
(66, 'i3', '8 eme gen', '3.5 gh', '4'),
(67, 'i9', '9 eme gen', '4.1 gh', '8'),
(68, 'intel inside', '8 eme gen', '2 gh', '4'),
(69, 'i5', '11 eme gen', '1.6 gh', '8'),
(70, 'i3', '12 eme gen', '2 gh', '4'),
(71, 'intel inside', '11 eme gen', '2 gh', '4'),
(72, 'intel inside', '10 eme gen', '3.5 gh', '2'),
(73, 'i9', '8 eme gen', '1.6 gh', '8'),
(74, 'i3', '8 eme gen', '3.5 gh', '4'),
(75, 'i3', '8 eme gen', '2.5gh', '2'),
(76, 'intel inside', '11 eme gen', '3.5 gh', '8'),
(77, 'i3', '8 eme gen', '4.1 gh', '4'),
(78, 'i5', '10 eme gen', '3.1 gh', '4'),
(79, 'intel inside', '10 eme gen', '2.5gh', '8'),
(80, 'i5', '11 eme gen', '2.5gh', '4'),
(81, 'i5', '10 eme gen', '1.6 gh', '2'),
(82, 'i5', '10 eme gen', '4.1 gh', '8'),
(83, 'i5', '10 eme gen', '3.5 gh', '2'),
(84, 'i5', '12 eme gen', '2 gh', '2'),
(85, 'i9', '11 eme gen', '4.1 gh', '4'),
(86, 'i9', '8 eme gen', '2 gh', '4'),
(87, 'i7', '11 eme gen', '3.5 gh', '4'),
(88, 'i5', '9 eme gen', '4.1 gh', '4'),
(89, 'i3', '12 eme gen', '4.1 gh', '4'),
(90, 'i3', '12 eme gen', '3.5 gh', '2'),
(91, 'i9', '9 eme gen', '1.6 gh', '4'),
(92, 'i5', '9 eme gen', '4.1 gh', '4'),
(93, 'i5', '8 eme gen', '3.5 gh', '2'),
(94, 'i9', '9 eme gen', '4.1 gh', '2'),
(95, 'intel inside', '8 eme gen', '3.5 gh', '8'),
(96, 'i9', '10 eme gen', '4.1 gh', '4'),
(97, 'i7', '8 eme gen', '3.1 gh', '2'),
(98, 'i5', '10 eme gen', '4.1 gh', '2'),
(99, 'intel inside', '8 eme gen', '2.5gh', '4'),
(100, 'i9', '10 eme gen', '1.6 gh', '4');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE `fournisseur` (
  `id_fournisseur` int(11) NOT NULL,
  `nom_fournisseur` varchar(10) DEFAULT NULL,
  `addresse` varchar(50) DEFAULT NULL,
  `tlf` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`id_fournisseur`, `nom_fournisseur`, `addresse`, `tlf`, `email`) VALUES
(1, 'mytek', '1275 Pleasure Road', '+86 (871) 590-4434', 'mhows0@reference.com'),
(2, 'wiki', '94 Rutledge Terrace', '+86 (233) 131-1893', 'mbradberry1@zimbio.com'),
(3, 'technoplus', '6 Atwood Point', '+86 (765) 561-2909', 'cpires2@twitter.com'),
(4, 'jumia', '57600 Glacier Hill Road', '+976 (187) 452-3167', 'dpeckitt3@mac.com'),
(5, 'tunisianet', '34253 Buhler Court', '+7 (303) 712-3004', 'mgraveston4@wsj.com'),
(6, 'zoom', '41 Schmedeman Circle', '+351 (583) 827-4242', 'squainton5@stanford.edu'),
(7, 'mytek', '71490 West Drive', '+98 (999) 929-8269', 'dmalcolmson6@bbb.org');

-- --------------------------------------------------------

--
-- Structure de la table `gpu`
--

DROP TABLE IF EXISTS `gpu`;
CREATE TABLE `gpu` (
  `id_gpu` int(20) NOT NULL,
  `marqueGpu` varchar(20) DEFAULT NULL,
  `capaciteGpu` varchar(20) DEFAULT NULL,
  `vitesse` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `gpu`
--

INSERT INTO `gpu` (`id_gpu`, `marqueGpu`, `capaciteGpu`, `vitesse`) VALUES
(1, 'intel', '8 Go', '900 Mhz'),
(2, 'intel', '8 Go', '900 Mhz'),
(3, 'intel', '4 Go', '650 Mhz'),
(4, 'amd', '2 Go', '850 Mhz'),
(5, 'amd', '2 Go', '850 Mhz'),
(6, 'intel', '2 Go', '850 Mhz'),
(7, 'nvidea', '2 Go', '700 Mhz'),
(8, 'amd', '8 Go', '650 Mhz'),
(9, 'amd', '8 Go', '900 Mhz'),
(10, 'intel', '2 Go', '650 Mhz'),
(11, 'intel', '2 Go', '700 Mhz'),
(12, 'nvidea', '8 Go', '650 Mhz'),
(13, 'nvidea', '4 Go', '850 Mhz'),
(14, 'amd', '2 Go', '700 Mhz'),
(15, 'nvidea', '4 Go', '900 Mhz'),
(16, 'nvidea', '8 Go', '700 Mhz'),
(17, 'nvidea', '2 Go', '900 Mhz'),
(18, 'nvidea', '2 Go', '650 Mhz'),
(19, 'intel', '8 Go', '850 Mhz'),
(20, 'amd', '8 Go', '850 Mhz'),
(21, 'intel', '4 Go', '700 Mhz'),
(22, 'nvidea', '2 Go', '900 Mhz'),
(23, 'intel', '4 Go', '850 Mhz'),
(24, 'amd', '8 Go', '700 Mhz'),
(25, 'nvidea', '4 Go', '700 Mhz'),
(26, 'amd', '4 Go', '900 Mhz'),
(27, 'intel', '4 Go', '850 Mhz'),
(28, 'nvidea', '2 Go', '900 Mhz'),
(29, 'amd', '4 Go', '900 Mhz'),
(30, 'amd', '2 Go', '650 Mhz');

-- --------------------------------------------------------

--
-- Structure de la table `hdd`
--

DROP TABLE IF EXISTS `hdd`;
CREATE TABLE `hdd` (
  `id_hdd` int(20) NOT NULL,
  `marqueHdd` varchar(20) DEFAULT NULL,
  `capaciteHdd` varchar(20) DEFAULT NULL,
  `bande_passante` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hdd`
--

INSERT INTO `hdd` (`id_hdd`, `marqueHdd`, `capaciteHdd`, `bande_passante`, `type`) VALUES
(1, 'Sandisk', '500', 'SATA I', 'HDD'),
(2, 'Synology', '750', 'SATA II', 'SSD'),
(3, 'Western Digital', '1000', 'SATA I', 'SSD'),
(4, 'Western Digital', '1000', 'SATA II', 'SSD'),
(5, 'Kingston', '500', 'SATA III', 'HDD'),
(6, 'Synology', '1000', 'SATA I', 'SSD'),
(7, 'Western Digital', '2000', 'SATA II', 'SSD'),
(8, 'Synology', '750', 'SATA II', 'HDD'),
(9, 'Kingston', '2000', 'SATA III', 'HDD'),
(10, 'Toshiba', '2000', 'SATA II', 'SSD'),
(11, 'Toshiba', '1000', 'SATA I', 'HDD'),
(12, 'Kingston', '2000', 'SATA III', 'HDD'),
(13, 'Kingston', '500', 'SATA III', 'HDD'),
(14, 'Synology', '750', 'SATA I', 'HDD'),
(15, 'Synology', '500', 'SATA I', 'SSD'),
(16, 'Toshiba', '500', 'SATA I', 'HDD'),
(17, 'Western Digital', '750', 'SATA II', 'SSD'),
(18, 'Synology', '750', 'SATA I', 'SSD'),
(19, 'Western Digital', '750', 'SATA II', 'SSD'),
(20, 'Synology', '750', 'SATA I', 'SSD'),
(21, 'Sandisk', '500', 'SATA III', 'SSD'),
(22, 'Synology', '750', 'SATA II', 'HDD'),
(23, 'Western Digital', '500', 'SATA I', 'SSD'),
(24, 'Sandisk', '1000', 'SATA II', 'HDD'),
(25, 'Toshiba', '1000', 'SATA III', 'SSD'),
(26, 'Kingston', '500', 'SATA III', 'HDD'),
(27, 'Western Digital', '1000', 'SATA III', 'HDD'),
(28, 'Kingston', '500', 'SATA III', 'SSD'),
(29, 'Samsung', '2000', 'SATA III', 'SSD'),
(30, 'Synology', '2000', 'SATA I', 'SSD'),
(31, 'Kingston', '750', 'SATA II', 'HDD'),
(32, 'Samsung', '500', 'SATA I', 'HDD'),
(33, 'Samsung', '2000', 'SATA II', 'SSD'),
(34, 'Samsung', '500', 'SATA I', 'SSD'),
(35, 'Sandisk', '1000', 'SATA II', 'HDD'),
(36, 'Synology', '2000', 'SATA I', 'HDD'),
(37, 'Synology', '1000', 'SATA I', 'HDD'),
(38, 'Samsung', '750', 'SATA II', 'HDD'),
(39, 'Sandisk', '750', 'SATA II', 'HDD'),
(40, 'Sandisk', '750', 'SATA II', 'SSD'),
(41, 'Western Digital', '1000', 'SATA III', 'SSD'),
(42, 'Synology', '1000', 'SATA I', 'SSD'),
(43, 'Western Digital', '2000', 'SATA I', 'SSD'),
(44, 'Sandisk', '2000', 'SATA I', 'SSD'),
(45, 'Samsung', '2000', 'SATA II', 'HDD'),
(46, 'Samsung', '1000', 'SATA III', 'SSD'),
(47, 'Western Digital', '1000', 'SATA II', 'SSD'),
(48, 'Toshiba', '750', 'SATA III', 'SSD'),
(49, 'Toshiba', '750', 'SATA I', 'SSD'),
(50, 'Western Digital', '500', 'SATA I', 'HDD'),
(51, 'Samsung', '2000', 'SATA II', 'HDD'),
(52, 'Synology', '2000', 'SATA I', 'HDD'),
(53, 'Western Digital', '1000', 'SATA III', 'SSD'),
(54, 'Western Digital', '750', 'SATA III', 'HDD'),
(55, 'Kingston', '750', 'SATA III', 'HDD'),
(56, 'Toshiba', '500', 'SATA I', 'SSD'),
(57, 'Western Digital', '500', 'SATA II', 'SSD'),
(58, 'Kingston', '500', 'SATA III', 'SSD'),
(59, 'Toshiba', '750', 'SATA III', 'HDD'),
(60, 'Synology', '1000', 'SATA II', 'SSD'),
(61, 'Kingston', '1000', 'SATA II', 'SSD'),
(62, 'Western Digital', '500', 'SATA I', 'HDD'),
(63, 'Toshiba', '1000', 'SATA III', 'HDD'),
(64, 'Kingston', '1000', 'SATA III', 'HDD'),
(65, 'Western Digital', '1000', 'SATA III', 'SSD'),
(66, 'Synology', '1000', 'SATA III', 'SSD'),
(67, 'Western Digital', '750', 'SATA I', 'SSD'),
(68, 'Kingston', '750', 'SATA I', 'HDD'),
(69, 'Sandisk', '2000', 'SATA III', 'SSD'),
(70, 'Sandisk', '750', 'SATA II', 'HDD'),
(71, 'Synology', '1000', 'SATA III', 'HDD'),
(72, 'Sandisk', '750', 'SATA I', 'SSD'),
(73, 'Kingston', '1000', 'SATA III', 'HDD'),
(74, 'Sandisk', '1000', 'SATA III', 'SSD'),
(75, 'Sandisk', '750', 'SATA I', 'SSD'),
(76, 'Toshiba', '500', 'SATA I', 'SSD'),
(77, 'Samsung', '500', 'SATA II', 'SSD'),
(78, 'Sandisk', '750', 'SATA I', 'SSD'),
(79, 'Sandisk', '2000', 'SATA I', 'HDD'),
(80, 'Samsung', '500', 'SATA II', 'SSD'),
(81, 'Sandisk', '1000', 'SATA II', 'HDD'),
(82, 'Sandisk', '750', 'SATA III', 'SSD'),
(83, 'Kingston', '2000', 'SATA I', 'HDD'),
(84, 'Kingston', '2000', 'SATA II', 'HDD'),
(85, 'Western Digital', '500', 'SATA III', 'SSD'),
(86, 'Western Digital', '750', 'SATA III', 'HDD'),
(87, 'Samsung', '750', 'SATA I', 'SSD'),
(88, 'Western Digital', '2000', 'SATA III', 'SSD'),
(89, 'Samsung', '2000', 'SATA II', 'HDD'),
(90, 'Western Digital', '2000', 'SATA I', 'HDD'),
(91, 'Synology', '750', 'SATA III', 'HDD'),
(92, 'Samsung', '2000', 'SATA III', 'HDD'),
(93, 'Western Digital', '1000', 'SATA I', 'HDD'),
(94, 'Western Digital', '1000', 'SATA I', 'SSD'),
(95, 'Synology', '750', 'SATA III', 'HDD'),
(96, 'Synology', '750', 'SATA I', 'SSD'),
(97, 'Samsung', '2000', 'SATA III', 'HDD'),
(98, 'Sandisk', '2000', 'SATA I', 'HDD'),
(99, 'Synology', '500', 'SATA II', 'SSD'),
(100, 'Toshiba', '750', 'SATA I', 'HDD');

-- --------------------------------------------------------

--
-- Structure de la table `nouveauxpcinfo`
--

DROP TABLE IF EXISTS `nouveauxpcinfo`;
CREATE TABLE `nouveauxpcinfo` (
  `id_pc` int(11) NOT NULL,
  `marquePC` varchar(7) DEFAULT NULL,
  `gamme` varchar(8) DEFAULT NULL,
  `couleur` varchar(5) DEFAULT NULL,
  `date_entree` date DEFAULT NULL,
  `date_sortie` date DEFAULT NULL,
  `prix_achat` decimal(5,2) DEFAULT NULL,
  `prix_vente` decimal(6,2) DEFAULT NULL,
  `qte_stock` int(11) DEFAULT NULL,
  `qte_vendu` int(11) DEFAULT NULL,
  `id_fournisseur` int(11) DEFAULT NULL,
  `id_cpu` int(11) DEFAULT NULL,
  `id_gpu` int(11) DEFAULT NULL,
  `id_hdd` int(11) DEFAULT NULL,
  `id_ram` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `nouveauxpcinfo`
--

INSERT INTO `nouveauxpcinfo` (`id_pc`, `marquePC`, `gamme`, `couleur`, `date_entree`, `date_sortie`, `prix_achat`, `prix_vente`, `qte_stock`, `qte_vendu`, `id_fournisseur`, `id_cpu`, `id_gpu`, `id_hdd`, `id_ram`) VALUES
(1, 'lenovo', 'pro', 'bleu', '2021-04-08', '2022-03-17', '671.90', '1460.90', 71, 41, 2, 66, 23, 77, 29),
(2, 'hp', 'gamer', 'rouge', '2021-04-27', '2022-01-06', '770.71', '935.82', 65, 27, 7, 13, 16, 30, 42),
(3, 'lenovo', 'pro', 'gris', '2021-07-12', '2021-11-16', '747.60', '1276.75', 89, 15, 7, 22, 19, 62, 21),
(4, 'lenovo', 'gamer', 'gris', '2021-03-20', '2022-03-04', '802.01', '1129.35', 62, 13, 6, 67, 25, 60, 31),
(5, 'asus', 'gamer', 'bleu', '2021-04-07', '2021-10-21', '672.68', '1207.59', 70, 45, 3, 10, 27, 79, 37),
(6, 'asus', 'gamer', 'gris', '2021-05-06', '2022-02-06', '600.57', '1790.96', 95, 46, 4, 30, 24, 39, 10),
(7, 'toshiba', 'standard', 'gris', '2021-03-20', '2021-11-15', '530.06', '1466.83', 99, 27, 7, 77, 9, 97, 11),
(8, 'versus', 'standard', 'gris', '2021-05-22', '2022-04-05', '834.31', '1403.65', 72, 20, 7, 63, 1, 76, 12),
(9, 'asus', 'gamer', 'bleu', '2021-03-18', '2022-02-03', '849.45', '919.36', 62, 29, 5, 75, 3, 81, 18),
(10, 'dell', 'standard', 'rouge', '2021-01-22', '2021-12-17', '740.94', '1587.00', 100, 28, 4, 83, 5, 100, 32),
(11, 'asus', 'pro', 'gris', '2021-03-01', '2022-01-12', '763.96', '1559.99', 60, 16, 2, 44, 9, 88, 11),
(12, 'acer', 'pro', 'noire', '2021-07-15', '2021-10-20', '605.46', '1654.65', 90, 14, 3, 90, 28, 30, 19),
(13, 'toshiba', 'pro', 'rouge', '2021-04-04', '2022-02-25', '621.92', '1496.73', 63, 16, 1, 67, 28, 20, 19),
(14, 'acer', 'pro', 'rouge', '2021-05-13', '2022-03-27', '750.00', '1412.30', 99, 50, 2, 98, 22, 36, 5),
(15, 'hp', 'standard', 'gris', '2021-06-16', '2022-03-03', '508.15', '1213.06', 84, 27, 7, 16, 9, 53, 21),
(16, 'asus', 'pro', 'rouge', '2021-06-10', '2021-12-03', '836.05', '1087.81', 82, 21, 5, 62, 11, 13, 16),
(17, 'acer', 'standard', 'rouge', '2021-04-25', '2021-10-06', '538.90', '1749.32', 93, 41, 4, 12, 19, 32, 42),
(18, 'dell', 'gamer', 'rouge', '2021-06-22', '2022-02-09', '539.53', '1756.48', 86, 10, 2, 52, 29, 62, 36),
(19, 'asus', 'pro', 'gris', '2021-08-01', '2021-10-09', '808.66', '955.56', 63, 15, 2, 82, 14, 77, 23),
(20, 'toshiba', 'gamer', 'rouge', '2021-01-14', '2021-12-17', '781.47', '1141.00', 78, 46, 3, 2, 25, 57, 3),
(21, 'acer', 'pro', 'noire', '2021-04-04', '2021-11-03', '793.67', '1093.84', 76, 15, 1, 76, 3, 39, 48),
(22, 'dell', 'standard', 'gris', '2021-03-20', '2021-12-24', '663.87', '1507.15', 68, 27, 6, 34, 24, 54, 3),
(23, 'versus', 'pro', 'noire', '2021-07-31', '2021-10-06', '574.92', '1363.46', 87, 22, 2, 38, 12, 55, 40),
(24, 'acer', 'standard', 'bleu', '2021-03-28', '2022-03-09', '706.61', '1072.74', 62, 24, 2, 61, 4, 20, 30),
(25, 'toshiba', 'gamer', 'bleu', '2021-04-03', '2022-03-06', '734.78', '1456.63', 73, 45, 2, 30, 28, 26, 28),
(26, 'dell', 'gamer', 'noire', '2021-03-31', '2022-03-09', '731.76', '956.22', 72, 48, 4, 14, 19, 54, 31),
(27, 'asus', 'gamer', 'gris', '2021-06-20', '2022-02-22', '807.47', '1097.54', 75, 49, 7, 21, 1, 66, 30),
(28, 'lenovo', 'gamer', 'noire', '2021-01-21', '2021-11-02', '796.18', '1515.18', 100, 16, 7, 63, 4, 23, 45),
(29, 'lenovo', 'standard', 'gris', '2021-01-05', '2021-09-16', '573.31', '1586.15', 96, 8, 3, 74, 19, 31, 46),
(30, 'versus', 'standard', 'bleu', '2021-07-21', '2022-02-10', '573.61', '1137.89', 92, 43, 6, 51, 30, 32, 25),
(31, 'acer', 'pro', 'bleu', '2021-01-04', '2022-04-07', '564.60', '1743.79', 94, 28, 5, 54, 11, 55, 12),
(32, 'asus', 'standard', 'rouge', '2021-07-29', '2021-12-12', '757.06', '1320.41', 63, 29, 2, 43, 7, 65, 50),
(33, 'versus', 'gamer', 'rouge', '2021-01-25', '2022-02-10', '621.70', '976.70', 62, 25, 5, 44, 1, 24, 35),
(34, 'toshiba', 'standard', 'rouge', '2021-07-24', '2021-10-01', '684.04', '993.64', 72, 21, 3, 27, 14, 18, 7),
(35, 'hp', 'gamer', 'rouge', '2021-02-12', '2021-12-04', '597.58', '1329.71', 86, 7, 1, 61, 22, 34, 39),
(36, 'acer', 'pro', 'rouge', '2021-04-21', '2021-12-19', '722.56', '1629.30', 86, 7, 3, 53, 24, 56, 30),
(37, 'hp', 'standard', 'gris', '2021-05-11', '2021-10-19', '518.73', '1139.95', 60, 33, 2, 92, 2, 48, 20),
(38, 'asus', 'gamer', 'gris', '2021-07-22', '2022-04-13', '552.95', '1442.19', 73, 15, 1, 45, 27, 55, 15),
(39, 'hp', 'standard', 'rouge', '2021-04-15', '2022-04-14', '737.43', '949.47', 76, 9, 3, 20, 30, 46, 36),
(40, 'hp', 'gamer', 'noire', '2021-07-31', '2021-11-23', '677.90', '1552.33', 64, 36, 5, 44, 4, 68, 38),
(41, 'acer', 'gamer', 'gris', '2021-02-02', '2022-03-16', '539.00', '1684.06', 67, 11, 6, 37, 4, 53, 50),
(42, 'hp', 'standard', 'noire', '2021-03-22', '2022-04-22', '814.60', '1011.99', 69, 27, 2, 2, 23, 14, 32),
(43, 'acer', 'gamer', 'gris', '2021-02-17', '2022-04-16', '809.83', '1237.93', 91, 8, 7, 40, 10, 73, 8),
(44, 'dell', 'standard', 'bleu', '2021-03-03', '2021-11-20', '615.48', '1317.68', 76, 31, 6, 8, 1, 82, 20),
(45, 'lenovo', 'standard', 'gris', '2021-04-22', '2022-04-19', '804.52', '1362.25', 92, 8, 2, 91, 18, 24, 45),
(46, 'hp', 'gamer', 'rouge', '2021-02-08', '2021-11-16', '582.90', '971.47', 69, 26, 4, 71, 27, 53, 12),
(47, 'versus', 'gamer', 'bleu', '2021-06-15', '2022-04-21', '559.72', '1037.52', 71, 15, 3, 42, 18, 1, 14),
(48, 'lenovo', 'pro', 'gris', '2021-02-18', '2022-02-14', '834.47', '1797.02', 96, 38, 5, 33, 9, 80, 36),
(49, 'acer', 'gamer', 'rouge', '2021-05-04', '2021-10-11', '652.58', '1402.92', 69, 17, 5, 32, 28, 95, 38),
(50, 'dell', 'gamer', 'bleu', '2021-05-06', '2022-03-08', '700.41', '1527.00', 87, 26, 4, 39, 17, 5, 31),
(51, 'asus', 'pro', 'noire', '2021-05-01', '2022-01-08', '730.08', '1756.63', 95, 18, 6, 82, 21, 55, 13),
(52, 'versus', 'pro', 'noire', '2021-05-05', '2022-01-04', '745.11', '1279.17', 87, 45, 6, 71, 27, 98, 28),
(53, 'versus', 'gamer', 'noire', '2021-01-15', '2021-09-18', '717.00', '1215.77', 65, 34, 7, 17, 19, 46, 45),
(54, 'asus', 'pro', 'gris', '2021-03-26', '2022-01-09', '729.84', '1554.17', 81, 17, 6, 22, 4, 20, 23),
(55, 'dell', 'pro', 'rouge', '2021-06-01', '2021-10-19', '638.80', '1390.53', 85, 46, 2, 19, 20, 31, 5),
(56, 'versus', 'pro', 'bleu', '2021-01-24', '2021-11-13', '698.87', '1591.29', 70, 34, 2, 76, 14, 10, 42),
(57, 'dell', 'pro', 'rouge', '2021-07-31', '2021-11-16', '513.41', '1189.99', 78, 28, 3, 39, 13, 90, 41),
(58, 'hp', 'gamer', 'rouge', '2021-01-31', '2022-04-10', '641.75', '966.75', 90, 45, 7, 72, 25, 1, 42),
(59, 'toshiba', 'gamer', 'noire', '2021-04-13', '2022-03-05', '615.68', '1256.65', 72, 36, 4, 9, 28, 65, 8),
(60, 'acer', 'gamer', 'bleu', '2021-05-15', '2022-03-10', '680.19', '1121.33', 76, 20, 2, 41, 13, 54, 5),
(61, 'versus', 'standard', 'rouge', '2021-02-18', '2022-03-26', '761.41', '1613.90', 90, 6, 6, 68, 10, 56, 21),
(62, 'dell', 'standard', 'gris', '2021-03-25', '2021-09-23', '635.24', '1433.81', 79, 31, 4, 71, 8, 62, 7),
(63, 'acer', 'standard', 'rouge', '2021-04-11', '2022-03-04', '519.91', '1442.03', 91, 42, 4, 43, 10, 35, 27),
(64, 'toshiba', 'gamer', 'rouge', '2021-05-29', '2022-03-12', '806.79', '1050.57', 73, 27, 1, 47, 25, 15, 14),
(65, 'hp', 'gamer', 'rouge', '2021-01-22', '2022-01-27', '725.49', '1196.29', 73, 6, 1, 11, 22, 92, 32),
(66, 'asus', 'standard', 'bleu', '2021-03-16', '2022-02-02', '698.53', '1340.26', 100, 24, 6, 55, 7, 48, 2),
(67, 'asus', 'pro', 'gris', '2021-05-07', '2022-04-09', '628.33', '1298.79', 86, 37, 2, 81, 6, 90, 36),
(68, 'toshiba', 'pro', 'bleu', '2021-03-17', '2022-04-06', '738.11', '1690.75', 96, 38, 1, 68, 9, 47, 8),
(69, 'toshiba', 'standard', 'gris', '2021-04-05', '2021-11-11', '535.38', '954.95', 72, 24, 1, 25, 23, 44, 22),
(70, 'dell', 'gamer', 'gris', '2021-07-20', '2021-11-01', '697.54', '1447.35', 85, 8, 2, 2, 26, 64, 39),
(71, 'acer', 'gamer', 'noire', '2021-03-25', '2022-04-04', '564.55', '1365.80', 61, 40, 7, 23, 18, 20, 35),
(72, 'versus', 'pro', 'rouge', '2021-02-10', '2021-11-02', '550.22', '1112.25', 67, 30, 1, 91, 20, 11, 35),
(73, 'hp', 'standard', 'noire', '2021-07-10', '2021-10-12', '694.73', '1564.44', 62, 7, 3, 34, 5, 62, 34),
(74, 'versus', 'pro', 'rouge', '2021-02-25', '2021-12-18', '715.39', '1035.06', 60, 17, 2, 89, 4, 41, 11),
(75, 'asus', 'gamer', 'rouge', '2021-05-22', '2022-03-19', '607.52', '1312.01', 90, 10, 3, 6, 27, 7, 6),
(76, 'versus', 'gamer', 'gris', '2021-05-15', '2022-02-04', '656.69', '1451.53', 80, 7, 4, 95, 15, 85, 30),
(77, 'acer', 'standard', 'bleu', '2021-03-09', '2021-12-23', '758.34', '1337.02', 80, 50, 2, 69, 9, 86, 22),
(78, 'dell', 'gamer', 'rouge', '2021-03-31', '2021-10-16', '548.45', '1206.44', 78, 17, 6, 20, 18, 36, 31),
(79, 'hp', 'standard', 'bleu', '2021-04-24', '2022-01-24', '629.56', '1741.46', 85, 36, 3, 51, 8, 26, 33),
(80, 'asus', 'pro', 'bleu', '2021-06-24', '2022-01-01', '680.13', '1602.49', 74, 31, 3, 33, 16, 98, 19),
(81, 'toshiba', 'pro', 'bleu', '2021-01-14', '2022-03-06', '690.86', '1330.30', 89, 8, 6, 64, 1, 7, 4),
(82, 'hp', 'pro', 'rouge', '2021-03-18', '2022-01-03', '563.19', '1616.17', 60, 35, 6, 36, 29, 97, 11),
(83, 'dell', 'pro', 'rouge', '2021-06-20', '2022-03-01', '779.71', '1288.90', 79, 23, 7, 70, 30, 58, 30),
(84, 'asus', 'gamer', 'rouge', '2021-07-04', '2022-03-03', '564.76', '1293.81', 69, 18, 4, 9, 10, 72, 7),
(85, 'lenovo', 'standard', 'noire', '2021-03-31', '2021-11-28', '614.00', '1610.70', 65, 14, 1, 78, 22, 79, 24),
(86, 'acer', 'pro', 'rouge', '2021-04-20', '2022-04-01', '840.29', '1031.63', 90, 50, 1, 29, 16, 98, 24),
(87, 'asus', 'pro', 'noire', '2021-07-15', '2022-01-23', '742.06', '950.63', 100, 28, 3, 16, 5, 36, 46),
(88, 'acer', 'gamer', 'gris', '2021-01-05', '2022-04-08', '798.09', '1423.73', 74, 42, 4, 3, 16, 76, 34),
(89, 'acer', 'gamer', 'noire', '2021-01-25', '2021-09-22', '772.27', '1170.44', 75, 18, 2, 20, 14, 35, 27),
(90, 'asus', 'pro', 'bleu', '2021-07-07', '2021-11-21', '599.14', '1277.84', 84, 19, 7, 23, 9, 64, 32),
(91, 'acer', 'standard', 'gris', '2021-05-07', '2022-02-25', '741.66', '1734.94', 82, 31, 4, 4, 16, 85, 25),
(92, 'versus', 'standard', 'bleu', '2021-04-25', '2021-12-05', '568.05', '930.05', 75, 38, 7, 43, 12, 98, 15),
(93, 'hp', 'pro', 'rouge', '2021-03-05', '2021-12-17', '621.61', '1260.47', 92, 44, 5, 16, 15, 98, 13),
(94, 'toshiba', 'standard', 'bleu', '2021-05-24', '2022-03-09', '624.22', '1360.65', 86, 35, 3, 100, 10, 37, 30),
(95, 'asus', 'gamer', 'bleu', '2021-03-22', '2021-09-27', '563.33', '1297.70', 87, 29, 6, 64, 11, 59, 20),
(96, 'toshiba', 'gamer', 'bleu', '2021-02-23', '2021-11-13', '513.76', '1393.28', 84, 36, 5, 99, 21, 5, 23),
(97, 'dell', 'gamer', 'bleu', '2021-07-10', '2022-04-02', '774.18', '1135.58', 73, 49, 5, 9, 2, 1, 14),
(98, 'acer', 'gamer', 'rouge', '2021-05-28', '2022-01-15', '831.87', '1514.66', 69, 14, 2, 26, 14, 3, 30),
(99, 'asus', 'gamer', 'gris', '2021-03-16', '2021-11-14', '791.65', '1636.96', 83, 42, 6, 37, 2, 46, 11),
(100, 'hp', 'pro', 'noire', '2021-07-09', '2022-03-17', '787.98', '1481.73', 69, 18, 5, 97, 25, 5, 49);

-- --------------------------------------------------------

--
-- Structure de la table `ram`
--

DROP TABLE IF EXISTS `ram`;
CREATE TABLE `ram` (
  `id_ram` int(20) NOT NULL,
  `capaciteRam` varchar(20) DEFAULT NULL,
  `marqueRam` varchar(20) DEFAULT NULL,
  `generationRam` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ram`
--

INSERT INTO `ram` (`id_ram`, `capaciteRam`, `marqueRam`, `generationRam`) VALUES
(1, '2 Go', 'Crucial', 'ddr3'),
(2, '4 Go', 'samsung', 'ddr4'),
(3, '2 Go', 'PNY', 'ddr3'),
(4, '4 Go', 'samsung', 'ddr3'),
(5, '16 Go', 'Kingston', 'ddr4'),
(6, '8 Go', 'Corsair', 'ddr4'),
(7, '16 Go', 'Kingston', 'ddr4'),
(8, '4 Go', 'Crucial', 'ddr2'),
(9, '16 Go', 'Crucial', 'ddr3'),
(10, '4 Go', 'Corsair', 'ddr4'),
(11, '8 Go', 'Crucial', 'ddr3'),
(12, '2 Go', 'PNY', 'ddr4'),
(13, '16 Go', 'samsung', 'ddr3'),
(14, '16 Go', 'Kingston', 'ddr2'),
(15, '4 Go', 'PNY', 'ddr3'),
(16, '8 Go', 'Kingston', 'ddr3'),
(17, '4 Go', 'Crucial', 'ddr4'),
(18, '4 Go', 'Crucial', 'ddr3'),
(19, '4 Go', 'PNY', 'ddr4'),
(20, '2 Go', 'PNY', 'ddr4'),
(21, '8 Go', 'samsung', 'ddr2'),
(22, '8 Go', 'samsung', 'ddr3'),
(23, '16 Go', 'samsung', 'ddr3'),
(24, '2 Go', 'samsung', 'ddr4'),
(25, '8 Go', 'Kingston', 'ddr3'),
(26, '16 Go', 'samsung', 'ddr4'),
(27, '2 Go', 'PNY', 'ddr4'),
(28, '2 Go', 'Kingston', 'ddr3'),
(29, '16 Go', 'Corsair', 'ddr2'),
(30, '4 Go', 'Kingston', 'ddr2'),
(31, '2 Go', 'PNY', 'ddr4'),
(32, '16 Go', 'Corsair', 'ddr3'),
(33, '16 Go', 'Crucial', 'ddr4'),
(34, '2 Go', 'Crucial', 'ddr4'),
(35, '16 Go', 'Crucial', 'ddr4'),
(36, '4 Go', 'Corsair', 'ddr4'),
(37, '8 Go', 'samsung', 'ddr4'),
(38, '4 Go', 'Kingston', 'ddr2'),
(39, '4 Go', 'Corsair', 'ddr3'),
(40, '16 Go', 'Kingston', 'ddr2'),
(41, '16 Go', 'Crucial', 'ddr2'),
(42, '2 Go', 'Corsair', 'ddr3'),
(43, '8 Go', 'samsung', 'ddr2'),
(44, '2 Go', 'Crucial', 'ddr3'),
(45, '8 Go', 'Crucial', 'ddr2'),
(46, '4 Go', 'Kingston', 'ddr4'),
(47, '4 Go', 'PNY', 'ddr2'),
(48, '4 Go', 'PNY', 'ddr2'),
(49, '16 Go', 'Kingston', 'ddr4'),
(50, '16 Go', 'Corsair', 'ddr3');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(22) NOT NULL,
  `nom` varchar(22) NOT NULL,
  `prenom` varchar(22) NOT NULL,
  `login` varchar(22) NOT NULL,
  `password` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `login`, `password`) VALUES
(1, 'Mlik', 'wajdi', 'aa', 'bb'),
(2, 'mlik', 'wajdi', 'ww', 'zz');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `cpu`
--
ALTER TABLE `cpu`
  ADD PRIMARY KEY (`id_cpu`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`id_fournisseur`);

--
-- Index pour la table `gpu`
--
ALTER TABLE `gpu`
  ADD PRIMARY KEY (`id_gpu`);

--
-- Index pour la table `hdd`
--
ALTER TABLE `hdd`
  ADD PRIMARY KEY (`id_hdd`);

--
-- Index pour la table `nouveauxpcinfo`
--
ALTER TABLE `nouveauxpcinfo`
  ADD PRIMARY KEY (`id_pc`),
  ADD KEY `fk_cpu` (`id_cpu`),
  ADD KEY `fk_gpu` (`id_gpu`),
  ADD KEY `fk_hdd` (`id_hdd`),
  ADD KEY `fk_fournisseur` (`id_fournisseur`),
  ADD KEY `fk_ram` (`id_ram`);

--
-- Index pour la table `ram`
--
ALTER TABLE `ram`
  ADD PRIMARY KEY (`id_ram`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `cpu`
--
ALTER TABLE `cpu`
  MODIFY `id_cpu` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  MODIFY `id_fournisseur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `gpu`
--
ALTER TABLE `gpu`
  MODIFY `id_gpu` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT pour la table `hdd`
--
ALTER TABLE `hdd`
  MODIFY `id_hdd` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT pour la table `nouveauxpcinfo`
--
ALTER TABLE `nouveauxpcinfo`
  MODIFY `id_pc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;

--
-- AUTO_INCREMENT pour la table `ram`
--
ALTER TABLE `ram`
  MODIFY `id_ram` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `nouveauxpcinfo`
--
ALTER TABLE `nouveauxpcinfo`
  ADD CONSTRAINT `fk_cpu` FOREIGN KEY (`id_cpu`) REFERENCES `cpu` (`id_cpu`),
  ADD CONSTRAINT `fk_fournisseur` FOREIGN KEY (`id_fournisseur`) REFERENCES `fournisseur` (`id_fournisseur`),
  ADD CONSTRAINT `fk_gpu` FOREIGN KEY (`id_gpu`) REFERENCES `gpu` (`id_gpu`),
  ADD CONSTRAINT `fk_hdd` FOREIGN KEY (`id_hdd`) REFERENCES `hdd` (`id_hdd`),
  ADD CONSTRAINT `fk_ram` FOREIGN KEY (`id_ram`) REFERENCES `ram` (`id_ram`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

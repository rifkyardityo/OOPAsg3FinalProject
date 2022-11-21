-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Apr 2022 pada 04.32
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maskz`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `organicmask`
--

CREATE TABLE `organicmask` (
  `MaskID` int(5) NOT NULL,
  `MaskName` varchar(255) NOT NULL,
  `MaskType` varchar(255) NOT NULL,
  `MaskPrice` int(11) NOT NULL,
  `VariantName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `organicmask`
--

INSERT INTO `organicmask` (`MaskID`, `MaskName`, `MaskType`, `MaskPrice`, `VariantName`) VALUES
(1, 'Green Tea Clay masKZ ', 'Organic Mask', 8000, 'Matcha'),
(2, 'Charcoal Exclusive masKZ ', 'Organic Mask', 9000, 'Charcoal'),
(3, 'Vanilla Milk masKZ ', 'Organic Mask', 7000, 'Oat Milk'),
(4, 'Creamy Oat Milk masKZ ', 'Organic Mask', 8000, 'Oat Milk'),
(5, 'Golden Charcoal masKZ ', 'Organic Mask', 6000, 'Charcoal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sheetmask`
--

CREATE TABLE `sheetmask` (
  `MaskID` int(11) NOT NULL,
  `MaskName` varchar(255) NOT NULL,
  `MaskType` varchar(255) NOT NULL,
  `MaskPrice` int(11) NOT NULL,
  `EssenceName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `sheetmask`
--

INSERT INTO `sheetmask` (`MaskID`, `MaskName`, `MaskType`, `MaskPrice`, `EssenceName`) VALUES
(6, 'Teatree Healing Solution masKZ ', 'Sheet Mask', 15000, 'Tea Tree'),
(7, 'Mugwort Calming Sheet masKZ', 'Sheet Mask', 12000, 'Mugwort'),
(8, 'Tea Tree Shine Control masKZ', 'Sheet Mask', 17000, 'Tea Tree'),
(9, '7Days Lemon Smoothing masKZ', 'Sheet Mask', 13000, 'Lemon'),
(10, 'Nature Blemish Clear masKZ', 'Sheet Mask', 11000, 'Rose');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaction`
--

CREATE TABLE `transaction` (
  `TransactionID` char(5) NOT NULL,
  `UserName` varchar(100) NOT NULL,
  `UserAge` int(11) NOT NULL,
  `UserGender` varchar(50) NOT NULL,
  `MaskID` int(5) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `organicmask`
--
ALTER TABLE `organicmask`
  ADD PRIMARY KEY (`MaskID`);

--
-- Indeks untuk tabel `sheetmask`
--
ALTER TABLE `sheetmask`
  ADD PRIMARY KEY (`MaskID`);

--
-- Indeks untuk tabel `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`TransactionID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `organicmask`
--
ALTER TABLE `organicmask`
  MODIFY `MaskID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `sheetmask`
--
ALTER TABLE `sheetmask`
  MODIFY `MaskID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

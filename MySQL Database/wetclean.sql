-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 Tem 2022, 15:32:17
-- Sunucu sürümü: 10.4.20-MariaDB
-- PHP Sürümü: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `wetclean`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `aylikkazanc`
--

CREATE TABLE `aylikkazanc` (
  `No` int(11) NOT NULL,
  `Tarih` varchar(15) NOT NULL,
  `AylıkKazanç` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `aylikkazanc`
--

INSERT INTO `aylikkazanc` (`No`, `Tarih`, `AylıkKazanç`) VALUES
(19, '08.2021', 88),
(20, '09.2021', 30),
(21, '08.2021', 90),
(22, '01.2022', 60);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bakiye`
--

CREATE TABLE `bakiye` (
  `idbakiye` int(11) NOT NULL,
  `ad` varchar(45) DEFAULT NULL,
  `soyad` varchar(45) DEFAULT NULL,
  `borcumuz` double DEFAULT NULL,
  `alacagimiz` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `bakiye`
--

INSERT INTO `bakiye` (`idbakiye`, `ad`, `soyad`, `borcumuz`, `alacagimiz`) VALUES
(1, 'Abdullah', 'Cavlak', 0, 0),
(2, 'Ahmet', 'Özgentürk', 0, 0),
(3, 'Ahu', 'Gökçe', 0, 0),
(4, 'Ahu', 'Güverte', 0, 0),
(5, 'Ali', 'Sağmen', 0, 0),
(6, 'Aslı', 'Özdağ', 0, 0),
(7, 'Alper', 'Akdamar', 0, 0),
(8, 'Tuğçe', 'Aytutuldu', 0, 0),
(9, 'Amira Şiar', 'Erdem', 0, 0),
(10, 'Aslı', 'İçingül Güler', 0, 0),
(11, 'Aslı', 'İşgen', 0, 0),
(12, 'Aslı', 'Şah', 0, 0),
(13, 'Asuman', 'Türkdalı', 0, 0),
(14, 'Atilla', 'Laçin', 0, 0),
(15, 'Abdullah', 'Sharm', 0, 0),
(16, 'Aycan', 'Durak', 0, 0),
(17, 'Ayça', 'Güçlü', 0, 0),
(18, 'Ayfer', 'Kıral', 0, 0),
(19, 'Ayfer', 'Manav', 0, 0),
(20, 'Aysel', 'Küçük', 0, 0),
(21, 'Aysel', 'Özdemir', 0, 0),
(22, 'Ayşe', 'Arslan', 0, 0),
(23, 'Ayşe', 'Arslantürk', 0, 0),
(24, 'Ayşe ', 'Avcı', 0, 0),
(25, 'Ayşe', 'Bilgetağ', 0, 0),
(26, 'Ayşe', 'Ceylan', 0, 0),
(27, 'Ayşe', 'Kaymaz', 0, 0),
(28, 'Ayşe', 'Nisanoğlu', 0, 0),
(29, 'Ayşe', 'Sabuncu', 0, 0),
(30, 'Ayşe', 'Turhan', 0, 0),
(31, 'Ayşe', 'Yılmaz', 0, 0),
(32, 'Ayşegül', 'Donma', 0, 0),
(33, 'Ayşegül', 'Üstüngel', 0, 0),
(34, 'Ayşen', 'Öner', 0, 0),
(35, 'Aytül', 'Akgül', 0, 0),
(36, 'Banu', 'Kadıoğlu', 0, 0),
(37, 'Banu', 'Sorar', 0, 0),
(38, 'Başak', 'Alboğa', 0, 0),
(39, 'Bedriye ', 'İncedal', 0, 0),
(40, 'Berrin', 'Özdemir', 0, 0),
(41, 'Bilge', 'Göllü', 0, 0),
(42, 'Bilge', 'Gümüş', 0, 0),
(43, 'Bilin', 'Çetinkaya', 0, 0),
(44, 'Birgül', 'Okuyan', 0, 0),
(45, 'Birgül', 'Tuhanioğlu', 0, 0),
(46, 'Birsel', 'Ünsal', 0, 0),
(47, 'Buket', 'Bozcalar', 0, 0),
(48, 'Buket', 'Büyüknacar', 0, 0),
(49, 'Burcu', 'Oluğ', 0, 0),
(50, 'Burcu', 'Özkendir', 0, 0),
(51, 'Burcu', 'Uzun', 0, 0),
(52, 'Burçin', 'Özdemir', 0, 0),
(53, 'Büşra', 'Keçeli', 0, 0),
(54, 'Büşra', 'Pütün', 0, 0),
(55, 'Canan', 'hanım', 0, 0),
(56, 'Canan', 'Yıldızgil', 0, 0),
(57, 'Cansu', 'Nisanoğlu', 0, 0),
(58, 'Cemile', 'Erdoğan', 0, 0),
(59, 'Cemile', 'Potuk', 0, 0),
(60, 'Cennet', 'Narcıoğlu', 0, 0),
(61, 'Cevahir', 'Güneş', 0, 0),
(62, 'Ceyhun', 'Armadamyhome', 0, 0),
(63, 'Ceylan', 'Avcı', 0, 0),
(64, 'Cihan', 'Döner', 0, 0),
(65, 'biran can', 'türe', 0, 0),
(66, 'Burak', 'Duman', 0, 0),
(67, 'deneme', 'deneme', 0, 0),
(68, 'asd', 'asd', 0, 0),
(69, 'burak', 'duman', 0, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `gunlukkazanc`
--

CREATE TABLE `gunlukkazanc` (
  `No` int(11) NOT NULL,
  `Tarih` varchar(15) NOT NULL,
  `Kazanç` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `gunlukkazanc`
--

INSERT INTO `gunlukkazanc` (`No`, `Tarih`, `Kazanç`) VALUES
(22, '01.08.2021', 88),
(23, '01.09.2021', 30),
(24, '03.08.2021', 90),
(25, '18.01.2022', 60);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `mustericari`
--

CREATE TABLE `mustericari` (
  `idmustericari` int(11) NOT NULL,
  `ad` varchar(45) DEFAULT NULL,
  `soyad` varchar(45) DEFAULT NULL,
  `siparis_sayisi` int(11) DEFAULT 0,
  `gelir` double DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `mustericari`
--

INSERT INTO `mustericari` (`idmustericari`, `ad`, `soyad`, `siparis_sayisi`, `gelir`) VALUES
(1, 'Abdullah', 'Cavlak', 0, 0),
(2, 'Ahmet', 'Özgentürk', 0, 0),
(3, 'Ahu', 'Gökçe', 0, 0),
(4, 'Ahu', 'Güverte', 0, 0),
(5, 'Ali', 'Sağmen', 3, 118),
(6, 'Aslı', 'Özdağ', 0, 0),
(7, 'Alper', 'Akdamar', 0, 0),
(8, 'Tuğçe', 'Aytutuldu', 0, 0),
(9, 'Amira Şiar', 'Erdem', 0, 0),
(10, 'Aslı', 'İçingül Güler', 0, 0),
(11, 'Aslı', 'İşgen', 0, 0),
(12, 'Aslı', 'Şah', 0, 0),
(13, 'Asuman', 'Türkdalı', 0, 0),
(14, 'Atilla', 'Laçin', 0, 0),
(15, 'Abdullah', 'Sharm', 0, 0),
(16, 'Aycan', 'Durak', 0, 0),
(17, 'Ayça', 'Güçlü', 0, 0),
(18, 'Ayfer', 'Kıral', 0, 0),
(19, 'Ayfer', 'Manav', 0, 0),
(20, 'Aysel', 'Küçük', 0, 0),
(21, 'Aysel', 'Özdemir', 0, 0),
(22, 'Ayşe', 'Arslan', 0, 0),
(23, 'Ayşe', 'Arslantürk', 0, 0),
(24, 'Ayşe ', 'Avcı', 0, 0),
(25, 'Ayşe', 'Bilgetağ', 0, 0),
(26, 'Ayşe', 'Ceylan', 0, 0),
(27, 'Ayşe', 'Kaymaz', 0, 0),
(28, 'Ayşe', 'Nisanoğlu', 0, 0),
(29, 'Ayşe', 'Sabuncu', 0, 0),
(30, 'Ayşe', 'Turhan', 0, 0),
(31, 'Ayşe', 'Yılmaz', 0, 0),
(32, 'Ayşegül', 'Donma', 0, 0),
(33, 'Ayşegül', 'Üstüngel', 0, 0),
(34, 'Ayşen', 'Öner', 0, 0),
(35, 'Aytül', 'Akgül', 0, 0),
(36, 'Banu', 'Kadıoğlu', 0, 0),
(37, 'Banu', 'Sorar', 0, 0),
(38, 'Başak', 'Alboğa', 0, 0),
(39, 'Bedriye ', 'İncedal', 0, 0),
(40, 'Berrin', 'Özdemir', 0, 0),
(41, 'Bilge', 'Göllü', 0, 0),
(42, 'Bilge', 'Gümüş', 0, 0),
(43, 'Bilin', 'Çetinkaya', 0, 0),
(44, 'Birgül', 'Okuyan', 0, 0),
(45, 'Birgül', 'Tuhanioğlu', 0, 0),
(46, 'Birsel', 'Ünsal', 0, 0),
(47, 'Buket', 'Bozcalar', 0, 0),
(48, 'Buket', 'Büyüknacar', 0, 0),
(49, 'Burcu', 'Oluğ', 0, 0),
(50, 'Burcu', 'Özkendir', 0, 0),
(51, 'Burcu', 'Uzun', 0, 0),
(52, 'Burçin', 'Özdemir', 0, 0),
(53, 'Büşra', 'Keçeli', 0, 0),
(54, 'Büşra', 'Pütün', 0, 0),
(55, 'Canan', 'hanım', 0, 0),
(56, 'Canan', 'Yıldızgil', 0, 0),
(57, 'Cansu', 'Nisanoğlu', 0, 0),
(58, 'Cemile', 'Erdoğan', 0, 0),
(59, 'Cemile', 'Potuk', 0, 0),
(60, 'Cennet', 'Narcıoğlu', 0, 0),
(61, 'Cevahir', 'Güneş', 0, 0),
(62, 'Ceyhun', 'Armadamyhome', 0, 0),
(63, 'Ceylan', 'Avcı', 0, 0),
(64, 'Cihan', 'Döner', 0, 0),
(65, 'biran can', 'türe', 0, 0),
(66, 'Burak', 'Duman', 1, 15),
(67, 'deneme', 'deneme', 1, 90),
(68, 'asd', 'asd', 0, 0),
(69, 'burak', 'duman', 1, 60);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriler`
--

CREATE TABLE `musteriler` (
  `ad` varchar(25) NOT NULL,
  `soyad` varchar(15) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `adres` varchar(200) NOT NULL,
  `tarih` varchar(15) NOT NULL,
  `no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `musteriler`
--

INSERT INTO `musteriler` (`ad`, `soyad`, `telefon`, `adres`, `tarih`, `no`) VALUES
('Abdullah', 'Cavlak', '(553) 391 17 07', 'M.İnan Apt.K7 N14 Çukurova/Adana', '25.10.2020', 1),
('Ahmet', 'Özgentürk', '(535) 392 66 03', 'Koru Flora A 12-26  Seyhan/Adana', '25.10.2020', 2),
('Ahu', 'Gökçe', '(532) 208 47 76', 'Roseland B 1-2 Seyhan/Adana', '25.10.2020', 3),
('Ahu', 'Güverte', '(533) 711 08 11', 'BlueCity Damla 10-19', '25.10.2020', 4),
('Ali', 'Sağmen', '(532) 285 77 13', '', '25.10.2020', 5),
('Aslı', 'Özdağ', '(532) 302 95 08', 'Üstemel C 2-4 Seyhan/Adana', '25.10.2020', 6),
('Alper', 'Akdamar', '(530) 495 17 09', 'Trend C 1-1 Seyhan/Adana', '25.10.2020', 7),
('Tuğçe', 'Aytutuldu', '(537) 274 89 89', 'İdeal Yaşam A Z - 1 Seyhan/Adana', '25.10.2020', 8),
('Amira Şiar', 'Erdem', '(530) 122 44 47', 'Armada3 A 4-8  Seyhan/Adana', '25.10.2020', 9),
('Aslı', 'İçingül Güler', '(533) 552 73 69', '', '25.10.2020', 10),
('Aslı', 'İşgen', '(533) 815 13 19', '', '25.10.2020', 11),
('Aslı', 'Şah', '(546) 724 27 54', 'Via C Z-1 Seyhan/Adana', '25.10.2020', 12),
('Asuman', 'Türkdalı', '(532) 242 11 12', 'Roseland A 4-7 Seyhan/Adana', '25.10.2020', 13),
('Atilla', 'Laçin', '(533) 166 01 65', 'Üstemel apt. Seyhan/Adana', '25.10.2020', 14),
('Abdullah', 'Sharm', '(555) 172 00 00', 'Sharm Avize Seyhan/Adana', '25.10.2020', 15),
('Aycan', 'Durak', '(555) 380 39 27', '', '25.10.2020', 16),
('Ayça', 'Güçlü', '(542) 824 16 82', 'Doğakent B 2-3', '25.10.2020', 17),
('Ayfer', 'Kıral', '(532) 783 51 43', 'Akçura Konutları Seyhan/Adana', '25.10.2020', 18),
('Ayfer', 'Manav', '(545) 531 51 90', 'Üstemel 4-7 Seyhan/Adana', '25.10.2020', 19),
('Aysel', 'Küçük', '(543) 322 83 33', '', '25.10.2020', 20),
('Aysel', 'Özdemir', '(507) 385 21 80', 'Üstemel G 6-12 Seyhan/Adana', '25.10.2020', 21),
('Ayşe', 'Arslan', '(553) 942 65 30', 'Üstemel B 6-11 Seyhan/Adana', '25.10.2020', 22),
('Ayşe', 'Arslantürk', '(532) 783 38 20', 'Dream A2 7-51 Seyhan/Adana', '25.10.2020', 23),
('Ayşe ', 'Avcı', '(542) 230 80 31', 'Yonca Seyhan/Adana', '25.10.2020', 24),
('Ayşe', 'Bilgetağ', '(552) 526 37 78', '', '25.10.2020', 25),
('Ayşe', 'Ceylan', '(532) 713 72 44', 'Via A 1-3 Seyhan/Adana', '25.10.2020', 26),
('Ayşe', 'Kaymaz', '(506) 065 90 96', 'Furkan Premier C 4-4 Seyhan/Adana', '25.10.2020', 27),
('Ayşe', 'Nisanoğlu', '(546) 429 01 06', '', '25.10.2020', 28),
('Ayşe', 'Sabuncu', '(532) 361 73 55', 'Koruflora C1 11-22 Seyhan/Adana', '25.10.2020', 29),
('Ayşe', 'Turhan', '(555) 157 13 10', 'Ferda Sit.Opet ark. B 5-10 Seyhan/Adana', '25.10.2020', 30),
('Ayşe', 'Yılmaz', '(507) 708 84 87', 'Dreamtown3 C ', '25.10.2020', 31),
('Ayşegül', 'Donma', '(541) 244 92 97', 'Damla B 4-7 Seyhan/Adana', '25.10.2020', 32),
('Ayşegül', 'Üstüngel', '(544) 655 27 80', 'Üstemel A 7-14 Seyhan/Adana', '25.10.2020', 33),
('Ayşen', 'Öner', '(538) 568 14 58', 'Roseland A 8-15 Seyhan/Adana', '25.10.2020', 34),
('Aytül', 'Akgül', '(535) 406 46 47', '', '25.10.2020', 35),
('Banu', 'Kadıoğlu', '(542) 480 80 47', 'Koruflora B1 10-22 Seyhan/Adana', '25.10.2020', 36),
('Banu', 'Sorar', '(532) 454 29 57', 'Koruflora', '25.10.2020', 37),
('Başak', 'Alboğa', '(534) 838 28 24', '', '25.10.2020', 38),
('Bedriye ', 'İncedal', '(537) 473 94 12', 'Final Kids', '25.10.2020', 39),
('Berrin', 'Özdemir', '(530) 459 12 87', '', '25.10.2020', 40),
('Bilge', 'Göllü', '(551) 253 96 00', 'Armada Lavida A 6-11 Seyhan/Adana', '25.10.2020', 41),
('Bilge', 'Gümüş', '(505) 259 65 10', 'Florya B 4-8 Seyhan/Adana', '25.10.2020', 42),
('Bilin', 'Çetinkaya', '(532) 426 61 22', 'Akgül 5', '25.10.2020', 43),
('Birgül', 'Okuyan', '(507) 291 88 86', 'Koruflora', '25.10.2020', 44),
('Birgül', 'Tuhanioğlu', '(543) 484 23 29', 'Armada myhome C 3-5 Seyhan/Adana', '25.10.2020', 45),
('Birsel', 'Ünsal', '(532) 766 24 93', 'Seferbey apt. B 6/11 Seyhan/Adana', '25.10.2020', 46),
('Buket', 'Bozcalar', '(535) 029 54 12', 'Atagün A 3-5 Seyhan/Adana', '25.10.2020', 47),
('Buket', 'Büyüknacar', '(553) 640 64 31', 'Koruflora A 11/24 Seyhan/Adana', '25.10.2020', 48),
('Burcu', 'Oluğ', '(533) 810 45 51', 'Serapark2 Kızılay ark C 11/21 Seyhan/Adana', '25.10.2020', 49),
('Burcu', 'Özkendir', '(532) 334 31 43', 'Sarıkent3 A 10/30', '25.10.2020', 50),
('Burcu', 'Uzun', '(533) 642 35 36', '', '25.10.2020', 51),
('Burçin', 'Özdemir', '(506) 990 63 32', 'Dreamgarden A2 2-4 Seyhan/Adana', '25.10.2020', 52),
('Büşra', 'Keçeli', '(505) 952 44 28', 'Atagün B 7-13 Seyhan/Adana', '25.10.2020', 53),
('Büşra', 'Pütün', '(533) 478 68 84', 'Özgürpark B 3-6 Seyhan/Adana', '25.10.2020', 54),
('Canan', 'hanım', '(507) 695 59 44', 'Atagün A 13-26 Seyhan/Adana', '25.10.2020', 55),
('Canan', 'Yıldızgil', '(534) 596 01 22', 'Bellapark A 2-4 Seyhan/Adana', '25.10.2020', 56),
('Cansu', 'Nisanoğlu', '(542) 525 01 02', 'Koruflora', '25.10.2020', 57),
('Cemile', 'Erdoğan', '(506) 577 91 01', 'Parklife B 8-15 Seyhan/Adana', '25.10.2020', 58),
('Cemile', 'Potuk', '(537) 661 23 80', 'Venus B 5-10 Seyhan/Adana', '25.10.2020', 59),
('Cennet', 'Narcıoğlu', '(537) 678 74 06', '8-15 Seyhan/Adana', '25.10.2020', 60),
('Cevahir', 'Güneş', '(531) 828 68 23', 'H.Özdeş apt. 13-26 Seyhan/Adana', '25.10.2020', 61),
('Ceyhun', 'Armadamyhome', '(507) 091 29 46', 'Myhome A 10-19 Seyhan/Adana', '25.10.2020', 62),
('Ceylan', 'Avcı', '(530) 871 96 88', 'Dreamtown A2 4/12', '01.11.2020', 63),
('Cihan', 'Döner', '(530) 871 96 88', 'Emira Viva A 3/6', '01.11.2020', 64),
('biran can', 'türe', '(532) 312 32 34', 'huzurevleri', '22.07.2021', 65),
('Burak', 'Duman', '(537) 454 22 14', 'adana koop', '30.07.2021', 66),
('deneme', 'deneme', '(545) 632 52 25', 'asdf', '03.08.2021', 67),
('asd', 'asd', '(223) 213 23 12', 'asd', '17.08.2021', 68),
('burak', 'duman', '(537) 544 52 21', 'safasdf', '18.01.2022', 69);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `siparisdurumu`
--

CREATE TABLE `siparisdurumu` (
  `makbuzno` int(11) DEFAULT 0,
  `idmusteri` int(11) NOT NULL,
  `ad` varchar(25) DEFAULT NULL,
  `soyad` varchar(25) DEFAULT NULL,
  `siparisno` int(11) DEFAULT NULL,
  `siparistarihi` varchar(15) DEFAULT NULL,
  `teslimtarihi` varchar(15) DEFAULT NULL,
  `teslimdurumu` tinyint(4) DEFAULT NULL,
  `siparistutari` double DEFAULT 0,
  `BayanTakım` int(11) DEFAULT 0,
  `BayanTakımÜtü` int(11) DEFAULT 0,
  `Bluz` int(11) DEFAULT 0,
  `BluzÜtü` int(11) DEFAULT 0,
  `Ceket` int(11) DEFAULT 0,
  `CeketÜtü` int(11) DEFAULT 0,
  `Damatlık` int(11) DEFAULT 0,
  `DamatlıkÜtü` int(11) DEFAULT 0,
  `DeriMont` int(11) DEFAULT 0,
  `Döpiyes` int(11) DEFAULT 0,
  `DöpiyesÜtü` int(11) DEFAULT 0,
  `Elbise` int(11) DEFAULT 0,
  `ElbiseÜtü` int(11) DEFAULT 0,
  `Etek` int(11) DEFAULT 0,
  `EtekÜtü` int(11) DEFAULT 0,
  `GeceElbisesi` int(11) DEFAULT 0,
  `GeceElbisesiÜtü` int(11) DEFAULT 0,
  `Gömlek` int(11) DEFAULT 0,
  `GömlekÜtü` int(11) DEFAULT 0,
  `İpekEşarp` int(11) DEFAULT 0,
  `İpekEşarpÜtü` int(11) DEFAULT 0,
  `İpekŞal` int(11) DEFAULT 0,
  `İpekŞalÜtü` int(11) DEFAULT 0,
  `Kaban` int(11) DEFAULT 0,
  `KabanÜtü` int(11) DEFAULT 0,
  `Kazak` int(11) DEFAULT 0,
  `KazakÜtü` int(11) DEFAULT 0,
  `İpekBluz` int(11) DEFAULT 0,
  `İpekBluzÜtü` int(11) DEFAULT 0,
  `Mont` int(11) DEFAULT 0,
  `MontÜtü` int(11) DEFAULT 0,
  `Palto` int(11) DEFAULT 0,
  `PaltoÜtü` int(11) DEFAULT 0,
  `Pantolon` int(11) DEFAULT 0,
  `PantolonÜtü` int(11) DEFAULT 0,
  `Pardesü` int(11) DEFAULT 0,
  `PardesüÜtü` int(11) DEFAULT 0,
  `Şort` int(11) DEFAULT 0,
  `ŞortÜtü` int(11) DEFAULT 0,
  `TakımElbise` int(11) DEFAULT 0,
  `TakımElbiseÜtü` int(11) DEFAULT 0,
  `Trençkot` int(11) DEFAULT 0,
  `TrençkotÜtü` int(11) DEFAULT 0,
  `Tişört` int(11) DEFAULT 0,
  `TişörtÜtü` int(11) DEFAULT 0,
  `Yelek` int(11) DEFAULT 0,
  `YelekÜtü` int(11) DEFAULT 0,
  `DörtKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `SekizKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `OnikiKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `YastıkÜtü` int(11) DEFAULT 0,
  `YatakÖrtüsüÜtü` int(11) DEFAULT 0,
  `Alez` int(11) DEFAULT 0,
  `Battaniye` int(11) DEFAULT 0,
  `ElyafYorgan` int(11) DEFAULT 0,
  `KazTüyüYorgan` int(11) DEFAULT 0,
  `DörtKMasaÖrtüsü` int(11) DEFAULT 0,
  `SekizKMasaÖrtüsü` int(11) DEFAULT 0,
  `OnikiKMasaÖrtüsü` int(11) DEFAULT 0,
  `Nevresim` int(11) DEFAULT 0,
  `PamukYorgan` int(11) DEFAULT 0,
  `Yastık` int(11) DEFAULT 0,
  `YatakÖrtüsü` int(11) DEFAULT 0,
  `Çarşaf` int(11) DEFAULT 0,
  `CamBalkon` int(11) DEFAULT 0,
  `Gelinlik` int(11) DEFAULT 0,
  `TülPerde` int(11) DEFAULT 0,
  `FonPerde` int(11) DEFAULT 0,
  `KüçükStorPerde` int(11) DEFAULT 0,
  `KüçükZebraPerde` int(11) DEFAULT 0,
  `KruvazePerde` int(11) DEFAULT 0,
  `Güneşlik` int(11) DEFAULT 0,
  `OrtaStorPerde` int(11) DEFAULT 0,
  `UzunStorPerde` int(11) DEFAULT 0,
  `OrtaZebraPerde` int(11) DEFAULT 0,
  `UzunZebraPerde` int(11) DEFAULT 0,
  `KadifePerde` int(11) DEFAULT 0,
  `Abiye` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `siparisdurumu`
--

INSERT INTO `siparisdurumu` (`makbuzno`, `idmusteri`, `ad`, `soyad`, `siparisno`, `siparistarihi`, `teslimtarihi`, `teslimdurumu`, `siparistutari`, `BayanTakım`, `BayanTakımÜtü`, `Bluz`, `BluzÜtü`, `Ceket`, `CeketÜtü`, `Damatlık`, `DamatlıkÜtü`, `DeriMont`, `Döpiyes`, `DöpiyesÜtü`, `Elbise`, `ElbiseÜtü`, `Etek`, `EtekÜtü`, `GeceElbisesi`, `GeceElbisesiÜtü`, `Gömlek`, `GömlekÜtü`, `İpekEşarp`, `İpekEşarpÜtü`, `İpekŞal`, `İpekŞalÜtü`, `Kaban`, `KabanÜtü`, `Kazak`, `KazakÜtü`, `İpekBluz`, `İpekBluzÜtü`, `Mont`, `MontÜtü`, `Palto`, `PaltoÜtü`, `Pantolon`, `PantolonÜtü`, `Pardesü`, `PardesüÜtü`, `Şort`, `ŞortÜtü`, `TakımElbise`, `TakımElbiseÜtü`, `Trençkot`, `TrençkotÜtü`, `Tişört`, `TişörtÜtü`, `Yelek`, `YelekÜtü`, `DörtKMasaÖrtüsüÜtü`, `SekizKMasaÖrtüsüÜtü`, `OnikiKMasaÖrtüsüÜtü`, `YastıkÜtü`, `YatakÖrtüsüÜtü`, `Alez`, `Battaniye`, `ElyafYorgan`, `KazTüyüYorgan`, `DörtKMasaÖrtüsü`, `SekizKMasaÖrtüsü`, `OnikiKMasaÖrtüsü`, `Nevresim`, `PamukYorgan`, `Yastık`, `YatakÖrtüsü`, `Çarşaf`, `CamBalkon`, `Gelinlik`, `TülPerde`, `FonPerde`, `KüçükStorPerde`, `KüçükZebraPerde`, `KruvazePerde`, `Güneşlik`, `OrtaStorPerde`, `UzunStorPerde`, `OrtaZebraPerde`, `UzunZebraPerde`, `KadifePerde`, `Abiye`) VALUES
(1, 5, 'Ali', 'Sağmen', 1, '01.08.2021', '  .  .    ', 1, 80, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 5, 'Ali', 'Sağmen', 2, '01.08.2021', '  .  .    ', 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 5, 'Ali', 'Sağmen', 3, '01.09.2021', '  .  .    ', 1, 30, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 67, 'deneme', 'deneme', 1, '03.08.2021', '06.08.2021', 1, 90, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 69, 'burak', 'duman', 1, '18.01.2022', '19.01.2022', 1, 60, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sipariskayit`
--

CREATE TABLE `sipariskayit` (
  `idsipariskayit` int(11) NOT NULL,
  `ad` varchar(45) DEFAULT NULL,
  `soyad` varchar(45) DEFAULT NULL,
  `BayanTakım` int(11) DEFAULT 0,
  `BayanTakımÜtü` int(11) DEFAULT 0,
  `Bluz` int(11) DEFAULT 0,
  `BluzÜtü` int(11) DEFAULT 0,
  `Ceket` int(11) DEFAULT 0,
  `CeketÜtü` int(11) DEFAULT 0,
  `Damatlık` int(11) DEFAULT 0,
  `DamatlıkÜtü` int(11) DEFAULT 0,
  `DeriMont` int(11) DEFAULT 0,
  `Döpiyes` int(11) DEFAULT 0,
  `DöpiyesÜtü` int(11) DEFAULT 0,
  `Elbise` int(11) DEFAULT 0,
  `ElbiseÜtü` int(11) DEFAULT 0,
  `Etek` int(11) DEFAULT 0,
  `EtekÜtü` int(11) DEFAULT 0,
  `GeceElbisesi` int(11) DEFAULT 0,
  `GeceElbisesiÜtü` int(11) DEFAULT 0,
  `Gömlek` int(11) DEFAULT 0,
  `GömlekÜtü` int(11) DEFAULT 0,
  `İpekEşarp` int(11) DEFAULT 0,
  `İpekEşarpÜtü` int(11) DEFAULT 0,
  `İpekŞal` int(11) DEFAULT 0,
  `İpekŞalÜtü` int(11) DEFAULT 0,
  `Kaban` int(11) DEFAULT 0,
  `KabanÜtü` int(11) DEFAULT 0,
  `Kazak` int(11) DEFAULT 0,
  `KazakÜtü` int(11) DEFAULT 0,
  `İpekBluz` int(11) DEFAULT 0,
  `İpekBluzÜtü` int(11) DEFAULT 0,
  `Mont` int(11) DEFAULT 0,
  `MontÜtü` int(11) DEFAULT 0,
  `Palto` int(11) DEFAULT 0,
  `PaltoÜtü` int(11) DEFAULT 0,
  `Pantolon` int(11) DEFAULT 0,
  `PantolonÜtü` int(11) DEFAULT 0,
  `Pardesü` int(11) DEFAULT 0,
  `PardesüÜtü` int(11) DEFAULT 0,
  `Şort` int(11) DEFAULT 0,
  `ŞortÜtü` int(11) DEFAULT 0,
  `TakımElbise` int(11) DEFAULT 0,
  `TakımElbiseÜtü` int(11) DEFAULT 0,
  `Trençkot` int(11) DEFAULT 0,
  `TrençkotÜtü` int(11) DEFAULT 0,
  `Tişört` int(11) DEFAULT 0,
  `TişörtÜtü` int(11) DEFAULT 0,
  `Yelek` int(11) DEFAULT 0,
  `YelekÜtü` int(11) DEFAULT 0,
  `DörtKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `SekizKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `OnikiKMasaÖrtüsüÜtü` int(11) DEFAULT 0,
  `YastıkÜtü` int(11) DEFAULT 0,
  `YatakÖrtüsüÜtü` int(11) DEFAULT 0,
  `Alez` int(11) DEFAULT 0,
  `Battaniye` int(11) DEFAULT 0,
  `ElyafYorgan` int(11) DEFAULT 0,
  `KazTüyüYorgan` int(11) DEFAULT 0,
  `DörtKMasaÖrtüsü` int(11) DEFAULT 0,
  `SekizKMasaÖrtüsü` int(11) DEFAULT 0,
  `OnikiKMasaÖrtüsü` int(11) DEFAULT 0,
  `Nevresim` int(11) DEFAULT 0,
  `PamukYorgan` int(11) DEFAULT 0,
  `Yastık` int(11) DEFAULT 0,
  `YatakÖrtüsü` int(11) DEFAULT 0,
  `Çarşaf` int(11) DEFAULT 0,
  `CamBalkon` int(11) DEFAULT 0,
  `Gelinlik` int(11) DEFAULT 0,
  `TülPerde` int(11) DEFAULT 0,
  `FonPerde` int(11) DEFAULT 0,
  `KüçükStorPerde` int(11) DEFAULT 0,
  `KüçükZebraPerde` int(11) DEFAULT 0,
  `KruvazePerde` int(11) DEFAULT 0,
  `Güneşlik` int(11) DEFAULT 0,
  `OrtaStorPerde` int(11) DEFAULT 0,
  `UzunStorPerde` int(11) DEFAULT 0,
  `OrtaZebraPerde` int(11) DEFAULT 0,
  `UzunZebraPerde` int(11) DEFAULT 0,
  `KadifePerde` int(11) DEFAULT 0,
  `Abiye` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `sipariskayit`
--

INSERT INTO `sipariskayit` (`idsipariskayit`, `ad`, `soyad`, `BayanTakım`, `BayanTakımÜtü`, `Bluz`, `BluzÜtü`, `Ceket`, `CeketÜtü`, `Damatlık`, `DamatlıkÜtü`, `DeriMont`, `Döpiyes`, `DöpiyesÜtü`, `Elbise`, `ElbiseÜtü`, `Etek`, `EtekÜtü`, `GeceElbisesi`, `GeceElbisesiÜtü`, `Gömlek`, `GömlekÜtü`, `İpekEşarp`, `İpekEşarpÜtü`, `İpekŞal`, `İpekŞalÜtü`, `Kaban`, `KabanÜtü`, `Kazak`, `KazakÜtü`, `İpekBluz`, `İpekBluzÜtü`, `Mont`, `MontÜtü`, `Palto`, `PaltoÜtü`, `Pantolon`, `PantolonÜtü`, `Pardesü`, `PardesüÜtü`, `Şort`, `ŞortÜtü`, `TakımElbise`, `TakımElbiseÜtü`, `Trençkot`, `TrençkotÜtü`, `Tişört`, `TişörtÜtü`, `Yelek`, `YelekÜtü`, `DörtKMasaÖrtüsüÜtü`, `SekizKMasaÖrtüsüÜtü`, `OnikiKMasaÖrtüsüÜtü`, `YastıkÜtü`, `YatakÖrtüsüÜtü`, `Alez`, `Battaniye`, `ElyafYorgan`, `KazTüyüYorgan`, `DörtKMasaÖrtüsü`, `SekizKMasaÖrtüsü`, `OnikiKMasaÖrtüsü`, `Nevresim`, `PamukYorgan`, `Yastık`, `YatakÖrtüsü`, `Çarşaf`, `CamBalkon`, `Gelinlik`, `TülPerde`, `FonPerde`, `KüçükStorPerde`, `KüçükZebraPerde`, `KruvazePerde`, `Güneşlik`, `OrtaStorPerde`, `UzunStorPerde`, `OrtaZebraPerde`, `UzunZebraPerde`, `KadifePerde`, `Abiye`) VALUES
(1, 'Abdullah', 'Cavlak', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 'Ahmet', 'Özgentürk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(3, 'Ahu', 'Gökçe', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, 'Ahu', 'Güverte', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 'Ali', 'Sağmen', 9, 0, 6, 0, 4, 0, 16, 0, 5, 0, 0, 1, 0, 4, 0, 1, 0, 6, 0, 0, 0, 2, 0, 9, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(6, 'Aslı', 'Özdağ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(7, 'Alper', 'Akdamar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(8, 'Tuğçe', 'Aytutuldu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(9, 'Amira Şiar', 'Erdem', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(10, 'Aslı', 'İçingül Güler', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(11, 'Aslı', 'İşgen', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(12, 'Aslı', 'Şah', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(13, 'Asuman', 'Türkdalı', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(14, 'Atilla', 'Laçin', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(15, 'Abdullah', 'Sharm', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(16, 'Aycan', 'Durak', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(17, 'Ayça', 'Güçlü', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(18, 'Ayfer', 'Kıral', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(19, 'Ayfer', 'Manav', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(20, 'Aysel', 'Küçük', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(21, 'Aysel', 'Özdemir', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(22, 'Ayşe', 'Arslan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(23, 'Ayşe', 'Arslantürk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(24, 'Ayşe ', 'Avcı', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, 'Ayşe', 'Bilgetağ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(26, 'Ayşe', 'Ceylan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(27, 'Ayşe', 'Kaymaz', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(28, 'Ayşe', 'Nisanoğlu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(29, 'Ayşe', 'Sabuncu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(30, 'Ayşe', 'Turhan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(31, 'Ayşe', 'Yılmaz', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(32, 'Ayşegül', 'Donma', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(33, 'Ayşegül', 'Üstüngel', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(34, 'Ayşen', 'Öner', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(35, 'Aytül', 'Akgül', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(36, 'Banu', 'Kadıoğlu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(37, 'Banu', 'Sorar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(38, 'Başak', 'Alboğa', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(39, 'Bedriye ', 'İncedal', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(40, 'Berrin', 'Özdemir', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(41, 'Bilge', 'Göllü', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(42, 'Bilge', 'Gümüş', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(43, 'Bilin', 'Çetinkaya', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(44, 'Birgül', 'Okuyan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(45, 'Birgül', 'Tuhanioğlu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(46, 'Birsel', 'Ünsal', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(47, 'Buket', 'Bozcalar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(48, 'Buket', 'Büyüknacar', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(49, 'Burcu', 'Oluğ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(50, 'Burcu', 'Özkendir', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(51, 'Burcu', 'Uzun', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(52, 'Burçin', 'Özdemir', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(53, 'Büşra', 'Keçeli', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(54, 'Büşra', 'Pütün', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(55, 'Canan', 'hanım', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(56, 'Canan', 'Yıldızgil', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(57, 'Cansu', 'Nisanoğlu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(58, 'Cemile', 'Erdoğan', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(59, 'Cemile', 'Potuk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(60, 'Cennet', 'Narcıoğlu', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(61, 'Cevahir', 'Güneş', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(62, 'Ceyhun', 'Armadamyhome', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(63, 'Ceylan', 'Avcı', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(64, 'Cihan', 'Döner', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(65, 'biran can', 'türe', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(66, 'Burak', 'Duman', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(67, 'deneme', 'deneme', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(68, 'asd', 'asd', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(69, 'burak', 'duman', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `toplamkazanc`
--

CREATE TABLE `toplamkazanc` (
  `ToplamKazanç` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `toplamkazanc`
--

INSERT INTO `toplamkazanc` (`ToplamKazanç`) VALUES
(268);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ürünler`
--

CREATE TABLE `ürünler` (
  `btkt` double DEFAULT NULL,
  `btü` double DEFAULT NULL,
  `bluzkt` double DEFAULT NULL,
  `bluzü` double DEFAULT NULL,
  `ceketkt` double DEFAULT NULL,
  `ceketü` double DEFAULT NULL,
  `damatlıkkt` double DEFAULT NULL,
  `damatlıkü` double DEFAULT NULL,
  `derimontkt` double DEFAULT NULL,
  `döpiyeskt` double DEFAULT NULL,
  `döpiyesü` double DEFAULT NULL,
  `elbisekt` double DEFAULT NULL,
  `elbiseü` double DEFAULT NULL,
  `etekkt` double DEFAULT NULL,
  `etekü` double DEFAULT NULL,
  `gekt` double DEFAULT NULL,
  `geü` double DEFAULT NULL,
  `gömlekkt` double DEFAULT NULL,
  `gömlekü` double DEFAULT NULL,
  `iekt` double DEFAULT NULL,
  `ieü` double DEFAULT NULL,
  `işkt` double DEFAULT NULL,
  `işü` double DEFAULT NULL,
  `kabankt` double DEFAULT NULL,
  `kabanü` double DEFAULT NULL,
  `kazakkt` double DEFAULT NULL,
  `kazakü` double DEFAULT NULL,
  `ibkt` double DEFAULT NULL,
  `ibü` double DEFAULT NULL,
  `montkt` double DEFAULT NULL,
  `montü` double DEFAULT NULL,
  `paltokt` double DEFAULT NULL,
  `paltoü` double DEFAULT NULL,
  `pantolonkt` double DEFAULT NULL,
  `pantolonü` double DEFAULT NULL,
  `pardesükt` double DEFAULT NULL,
  `pardesüü` double DEFAULT NULL,
  `tekt` double DEFAULT NULL,
  `teü` double DEFAULT NULL,
  `trençkotkt` double DEFAULT NULL,
  `trençkotü` double DEFAULT NULL,
  `tişörtkt` double DEFAULT NULL,
  `tişörtü` double DEFAULT NULL,
  `yelekkt` double DEFAULT NULL,
  `yelekü` double DEFAULT NULL,
  `dkmöü` double DEFAULT NULL,
  `skmöü` double DEFAULT NULL,
  `onikikmöü` double DEFAULT NULL,
  `nevresimü` double DEFAULT NULL,
  `yastıkü` double DEFAULT NULL,
  `yöü` double DEFAULT NULL,
  `alezy` double DEFAULT NULL,
  `battaniyey` double DEFAULT NULL,
  `elyafyorgany` double DEFAULT NULL,
  `kaztüyüyorgany` double DEFAULT NULL,
  `dkmöy` double DEFAULT NULL,
  `skmöy` double DEFAULT NULL,
  `onikikmöy` double DEFAULT NULL,
  `nevresimy` double DEFAULT NULL,
  `pamukyorgany` double DEFAULT NULL,
  `yastıky` double DEFAULT NULL,
  `yatakörtüsüy` double DEFAULT NULL,
  `çarşafy` double DEFAULT NULL,
  `cambalkony` double DEFAULT NULL,
  `gelinliky` double DEFAULT NULL,
  `tülperdey` double DEFAULT NULL,
  `fonperdey` double DEFAULT NULL,
  `bstorperdey` double DEFAULT NULL,
  `bzebraperdey` double DEFAULT NULL,
  `kruvazeperdey` double DEFAULT NULL,
  `güneşliky` double DEFAULT NULL,
  `istorperdey` double DEFAULT NULL,
  `üstorperdey` double DEFAULT NULL,
  `izebraperdey` double DEFAULT NULL,
  `üzebraperdey` double DEFAULT NULL,
  `şortkt` double NOT NULL,
  `şortü` double NOT NULL,
  `kadifeperdey` double NOT NULL,
  `abiyey` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Tablo döküm verisi `ürünler`
--

INSERT INTO `ürünler` (`btkt`, `btü`, `bluzkt`, `bluzü`, `ceketkt`, `ceketü`, `damatlıkkt`, `damatlıkü`, `derimontkt`, `döpiyeskt`, `döpiyesü`, `elbisekt`, `elbiseü`, `etekkt`, `etekü`, `gekt`, `geü`, `gömlekkt`, `gömlekü`, `iekt`, `ieü`, `işkt`, `işü`, `kabankt`, `kabanü`, `kazakkt`, `kazakü`, `ibkt`, `ibü`, `montkt`, `montü`, `paltokt`, `paltoü`, `pantolonkt`, `pantolonü`, `pardesükt`, `pardesüü`, `tekt`, `teü`, `trençkotkt`, `trençkotü`, `tişörtkt`, `tişörtü`, `yelekkt`, `yelekü`, `dkmöü`, `skmöü`, `onikikmöü`, `nevresimü`, `yastıkü`, `yöü`, `alezy`, `battaniyey`, `elyafyorgany`, `kaztüyüyorgany`, `dkmöy`, `skmöy`, `onikikmöy`, `nevresimy`, `pamukyorgany`, `yastıky`, `yatakörtüsüy`, `çarşafy`, `cambalkony`, `gelinliky`, `tülperdey`, `fonperdey`, `bstorperdey`, `bzebraperdey`, `kruvazeperdey`, `güneşliky`, `istorperdey`, `üstorperdey`, `izebraperdey`, `üzebraperdey`, `şortkt`, `şortü`, `kadifeperdey`, `abiyey`) VALUES
(30, 15, 10, 6, 20, 10, 50, 20, 80, 25, 12.5, 20, 8, 10, 6, 40, 20, 8, 2.5, 10, 5, 10, 5, 25, 12.5, 10, 3, 15, 7.5, 18, 9, 28, 13, 9, 3, 28, 13, 30, 15, 25, 12.5, 8, 2.5, 8, 3, 4, 6, 10, 15, 2.5, 15, 25, 25, 25, 40, 8, 12, 20, 35, 35, 10, 30, 12.5, 10, 200, 4, 7, 25, 25, 5, 4, 30, 35, 30, 35, 7, 3, 8, 40);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `aylikkazanc`
--
ALTER TABLE `aylikkazanc`
  ADD PRIMARY KEY (`No`);

--
-- Tablo için indeksler `bakiye`
--
ALTER TABLE `bakiye`
  ADD PRIMARY KEY (`idbakiye`);

--
-- Tablo için indeksler `gunlukkazanc`
--
ALTER TABLE `gunlukkazanc`
  ADD PRIMARY KEY (`No`);

--
-- Tablo için indeksler `musteriler`
--
ALTER TABLE `musteriler`
  ADD PRIMARY KEY (`no`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `aylikkazanc`
--
ALTER TABLE `aylikkazanc`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Tablo için AUTO_INCREMENT değeri `gunlukkazanc`
--
ALTER TABLE `gunlukkazanc`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

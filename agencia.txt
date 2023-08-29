-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2023 a las 03:56:00
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `matriculacionvehicular`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agencia`
--

CREATE TABLE `agencia` (
  `id` tinyint(3) UNSIGNED NOT NULL,
  `descripcion` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `horainicio` time NOT NULL,
  `horafin` time NOT NULL,
  `foto` varchar(20) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `agencia`
--

INSERT INTO `agencia` (`id`, `descripcion`, `direccion`, `telefono`, `horainicio`, `horafin`, `foto`) VALUES
(1, 'Los Chillos', 'Gnral. Ruminiahui', '6054880', '09:00:00', '18:00:00', 'chillos.webp'),
(2, 'Cotocollao', 'La prensa', '6048114', '09:00:00', '18:00:00', 'bicentenario.jpg'),
(3, 'Quitumbe', 'Av. Mariscal Sucre', '1268268', '09:00:00', '18:00:00', 'guajalo.jpg'),
(4, 'Florida', 'Av. de La prensa', '2596484', '09:00:00', '18:00:00', 'floridaAlta.jpg'),
(5, 'Carapungo', 'Pedro Ramos', '3002568', '09:00:00', '18:00:00', 'inca.jpg'),
(13, 'San Carlos', 'inca', '2596848', '08:19:00', '14:19:00', 'floridaAlta.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agencia`
--
ALTER TABLE `agencia`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agencia`
--
ALTER TABLE `agencia`
  MODIFY `id` tinyint(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 01, 2024 at 12:55 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empdatabase`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `fetchdata` (IN `p_dno` INT)   BEGIN
    SELECT EMP.Ename, DEPT.Dname
    FROM EMP
    JOIN DEPT ON EMP.deptno = DEPT.deptno
    WHERE EMP.deptno = p_dno;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dept`
--

CREATE TABLE `dept` (
  `Deptno` int(2) NOT NULL,
  `Dname` varchar(14) DEFAULT NULL,
  `Loc` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dept`
--

INSERT INTO `dept` (`Deptno`, `Dname`, `Loc`) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `Empno` int(4) NOT NULL,
  `Ename` varchar(10) DEFAULT NULL,
  `Job` varchar(9) DEFAULT NULL,
  `Mgr` int(4) DEFAULT NULL,
  `Hiredate` date DEFAULT NULL,
  `Sal` decimal(7,2) DEFAULT NULL,
  `Comm` decimal(7,2) DEFAULT NULL,
  `Deptno` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, 0.00, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, 0.00, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, 0.00, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, 0.00, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 3000.00, 0.00, 20),
(7839, 'KING', 'PRESIDENT', 0, '1981-11-17', 5000.00, 0.00, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', 1500.00, 0.00, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100.00, 0.00, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', 950.00, 0.00, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000.00, 0.00, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, 0.00, 10),
(7938, 'vivek', 'manager', 1234, '2018-07-13', 8000.00, 500.00, 10);

--
-- Triggers `emp`
--
DELIMITER $$
CREATE TRIGGER `emp_sal` AFTER UPDATE ON `emp` FOR EACH ROW BEGIN
    	INSERT INTO emp_log SET ACTION = 'New Salary';
    END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `emp_sal_update` AFTER UPDATE ON `emp` FOR EACH ROW BEGIN
    	INSERT INTO emp_log SET ACTION = 'New Salary';
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `emp_log`
--

CREATE TABLE `emp_log` (
  `Emp_id` int(5) NOT NULL,
  `Log_date` datetime DEFAULT current_timestamp(),
  `New_salary` int(10) DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Rno` int(2) NOT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `pin` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Stand-in structure for view `v1`
-- (See below for the actual view)
--
CREATE TABLE `v1` (
`Ename` varchar(10)
,`Job` varchar(9)
,`Dname` varchar(14)
,`Loc` varchar(13)
);

-- --------------------------------------------------------

--
-- Structure for view `v1`
--
DROP TABLE IF EXISTS `v1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v1`  AS SELECT `e`.`Ename` AS `Ename`, `e`.`Job` AS `Job`, `d`.`Dname` AS `Dname`, `d`.`Loc` AS `Loc` FROM (`emp` `e` join `dept` `d` on(`e`.`Deptno` = `d`.`Deptno`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dept`
--
ALTER TABLE `dept`
  ADD PRIMARY KEY (`Deptno`);

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`Empno`),
  ADD KEY `mul` (`Deptno`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Rno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dept`
--
ALTER TABLE `dept`
  MODIFY `Deptno` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `Empno` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7939;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Rno` int(2) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

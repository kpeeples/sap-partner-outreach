CREATE SCHEMA REDHATSAPDEMO;

-- Uncomment the following 'TRUNCATE' line to purge data before dropping
-- (truncates cannot be rolled back and are therefore permanent)

--TRUNCATE TABLE AllFlightData;
DROP TABLE IF EXISTS AllFlightData CASCADE;

-- (generated from AllFlightData)

CREATE TABLE AllFlightData
(
  airline_iata       VARCHAR(4) NOT NULL,
  airlineName        VARCHAR(45),
  departTime         VARCHAR(20),
  arriveTime         VARCHAR(20),
  actualArriveTime   VARCHAR(20),
  actualDepartTime   VARCHAR(20),
  flightDate         VARCHAR(20) NOT NULL,
  fromAirport        VARCHAR(4),
  toAirport          VARCHAR(4),
  flightNo           VARCHAR(45) NOT NULL,
  gate               VARCHAR(45),
  terminal           VARCHAR(45),
  d:countryFrom      VARCHAR(4000),
  d:cityFrom         VARCHAR(4000),
  d:airportFrom      VARCHAR(4000),
  d:countryTo        VARCHAR(4000),
  d:cityTo           VARCHAR(4000),
  status             VARCHAR(45)
);

ALTER TABLE AllFlightData
  ADD CONSTRAINT IATA_PK
    PRIMARY KEY (airline_iata,departTime,arriveTime,fromAirport,toAirport,flightDate);

-- Uncomment the following 'TRUNCATE' line to purge data before dropping
-- (truncates cannot be rolled back and are therefore permanent)

--TRUNCATE TABLE airport_maps;
DROP TABLE IF EXISTS airport_maps CASCADE;

CREATE TABLE airport_maps
(
  iata             VARCHAR(4) NOT NULL,
  image_title      VARCHAR(45) NOT NULL,
  image_subtitle   VARCHAR(45) NOT NULL,
  image_name       VARCHAR(45),
  sequence         INTEGER() NOT NULL
);

ALTER TABLE airport_maps
  ADD CONSTRAINT PRIMARY
    PRIMARY KEY (iata,image_title,image_subtitle);
    
INSERT INTO `REDHATSAPDEMO`.`airport_maps`
('iata',
'image_title',
'image_subtitle',
'image_name',
'sequence')
VALUES
('JFK',	'John F. Kennedy International Airport',	'Airport Overview',	'jfk_airport_360_wl',	1);
('JFK',	'John F. Kennedy International Airport',	'Terminal 1',	'jfk_terminal_1_540_nl',	2);
('JFK',	'John F. Kennedy International Airport',	'Terminal 2',	'jfk_terminal_2_540_nl',	3);
('JFK',	'John F. Kennedy International Airport',	'Terminal 4',	'jfk_terminal_4_540_nl',	4);
('JFK',	'John F. Kennedy International Airport',	'Terminal 5',	'jfk_terminal_5_540_nl',	5);
('JFK',	'John F. Kennedy International Airport',	'Terminal 6',	'jfk_terminal_7_540_nl',	6);
('JFK',	'John F. Kennedy International Airport',	'Terminal7',	'jfk_terminal_8_540_nl',	7);
('LAS',	'McCarran International Airport (LAS)',	'Airport Overview',	'las_terminal',	1);
('LAS',	'McCarran International Airport (LAS)',	'Terminal 1: Concourse A', Concourse B',	'las_concourse_a_b_c_540_nl',	2);
('LAS',	'McCarran International Airport (LAS)',	'Terminal 1: Concourse D',	'las_concourse_d_540_nl',	3);
('LAS',	'McCarran International Airport (LAS)',	'Terminal 3',	'las_terminal_3_540_nl',	4);


INSERT INTO `REDHATSAPDEMO`.`liveFlightFeed`
(`airline_iata`,
`airlineName`,
`departTime`,
`arriveTime`,
`actualArriveTime`,
`actualDepartTime`,
`flightDate`,
`fromAirport`,
`toAirport`,
`flightNo`,
`gate`,
`terminal`,
`status`)
VALUES
('AA', 'American Airlines', 'PT11H00M00S', 'PT14H01M00S', 'PT17H01M00S', 'PT14H01M00S', '2013-11-13T00:00:00', 'JFK', 'SFO', '0017', 'C70', 'Terminal 2', 'DELAYED');
('AA', 'American Airlines', 'PT12H00M00S', 'PT15H01M00S', 'PT12H01M00S', 'PT12H01M00S', '2013-03-13T00:00:00', 'JFK', 'SFO', '0124', 'C66', 'Terminal 2', 'ON TIME');






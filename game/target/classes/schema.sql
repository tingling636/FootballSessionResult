DROP TABLE IF EXISTS Game_Result;
  
CREATE TABLE Game_Result (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  game_date DATE NOT NULL,
  home_team VARCHAR(250) NOT NULL,
  home_score INT(10) NOT NULL,
  away_team VARCHAR(250) DEFAULT NULL,
  away_score INT(10) NOT NULL
);
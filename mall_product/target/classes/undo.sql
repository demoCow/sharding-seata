DROP TABLE IF EXISTS undo_log;
CREATE TABLE undo_log (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  branch_id BIGINT(20) NOT NULL,
  xid VARCHAR(100) NOT NULL,
  context VARCHAR(128) NOT NULL,
  rollback_info LONGBLOB NOT NULL,
  log_status INT(11) NOT NULL,
  log_created DATETIME NOT NULL,
  log_modified DATETIME NOT NULL,
  ext VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX ux_undo_log (xid, branch_id)
)
ENGINE = INNODB
AUTO_INCREMENT = 1
CHARACTER SET utf8
COLLATE utf8_general_ci
ROW_FORMAT = DYNAMIC;
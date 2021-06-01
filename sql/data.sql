CREATE TABLE `account_info` (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `account_name` varchar(100) DEFAULT NULL COMMENT '户主姓名',
  `account_no` varchar(100) DEFAULT NULL COMMENT '户主id',
  `account_password` varchar(100) DEFAULT NULL COMMENT '帐户密码',
  `account_balance` double DEFAULT NULL COMMENT '帐户余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账户表';

CREATE TABLE `undo_log` (
  `id` bigint(20) DEFAULT NULL COMMENT 'id',
  `branch_id` varchar(100) DEFAULT NULL COMMENT '分支id',
  `xid` varchar(100) DEFAULT NULL COMMENT '事务id',
  `context` varchar(128) DEFAULT NULL COMMENT '内容',
  `rollback_info` longblob COMMENT '回滚信息',
  `log_status` int(11) DEFAULT NULL COMMENT '日志状态',
  `log_created` datetime DEFAULT NULL COMMENT '日志创建',
  `log_modified` datetime DEFAULT NULL COMMENT '日志修改',
  `ext` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='undo log表';
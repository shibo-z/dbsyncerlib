## symmetric-client

## 目录说明
```text
symmetric-client
 ├── build
 │   ├── libs
 │   │   └── symmetric-client-3.14.x-SNAPSHOT.jar --打包的Jar包
 │   └── resources
 │       └── main
 │           ├── symmetric-ext-points.xml
 │           ├── symmetric-jmx.xml
 │           ├── symmetric-messages.properties
 │           ├── symmetric-modules.properties
 │           └── sym_batch.xsd
 └── src
     └── main
         ├── java
         │   └── org
         │       └── jumpmind
         │           └── symmetric
         │               ├── AbstractCommandLauncher.java
         │               ├── ClientSymmetricEngine.java
         │               ├── db --定义各数据库的方言与触发器模板
         │               │   ├── AbstractEmbeddedSymmetricDialect.java
         │               │   ├── AbstractEmbeddedTrigger.java
         │               │   ├── ase
         │               │   │   ├── Ase16TriggerTemplate.java
         │               │   │   ├── AseSymmetricDialect.java
         │               │   │   └── AseTriggerTemplate.java
         │               │   ├── db2
         │               │   │   ├── Db2As400SymmetricDialect.java
         │               │   │   ├── Db2As400TriggerTemplate.java
         │               │   │   ├── Db2SymmetricDialect.java
         │               │   │   ├── Db2TriggerTemplate.java
         │               │   │   ├── Db2v9SymmetricDialect.java
         │               │   │   ├── Db2zOsSymmetricDialect.java
         │               │   │   └── Db2zOsTriggerTemplate.java
         │               │   ├── derby
         │               │   │   ├── DerbyFunctions.java
         │               │   │   ├── DerbySymmetricDialect.java
         │               │   │   └── DerbyTriggerTemplate.java
         │               │   ├── EmbeddedDbFunctions.java
         │               │   ├── firebird
         │               │   │   ├── Firebird20SymmetricDialect.java
         │               │   │   ├── Firebird20TriggerTemplate.java
         │               │   │   ├── Firebird21SymmetricDialect.java
         │               │   │   ├── Firebird21TriggerTemplate.java
         │               │   │   ├── FirebirdSymmetricDialect.java
         │               │   │   └── FirebirdTriggerTemplate.java
         │               │   ├── generic
         │               │   │   ├── GenericSymmetricDialect.java
         │               │   │   └── GenericTriggerTemplate.java
         │               │   ├── h2
         │               │   │   ├── H2Functions.java
         │               │   │   ├── H2SymmetricDialect.java
         │               │   │   ├── H2Trigger.java
         │               │   │   └── H2TriggerTemplate.java
         │               │   ├── hana
         │               │   │   ├── HanaSymmetricDialect.java
         │               │   │   └── HanaTriggerTemplate.java
         │               │   ├── hsqldb
         │               │   │   ├── HsqlDbFunctions.java
         │               │   │   ├── HsqlDbSymmetricDialect.java
         │               │   │   ├── HsqlDbTrigger.java
         │               │   │   └── HsqlDbTriggerTemplate.java
         │               │   ├── hsqldb2
         │               │   │   ├── HsqlDb2SymmetricDialect.java
         │               │   │   └── HsqlDb2TriggerTemplate.java
         │               │   ├── informix
         │               │   │   ├── InformixSymmetricDialect.java
         │               │   │   └── InformixTriggerTemplate.java
         │               │   ├── ingres
         │               │   │   ├── IngresSqlTriggerTemplate.java
         │               │   │   └── IngresSymmetricDialect.java
         │               │   ├── interbase
         │               │   │   ├── InterbaseSymmetricDialect.java
         │               │   │   └── InterbaseTriggerTemplate.java
         │               │   ├── ISymmetricDialectFactory.java
         │               │   ├── JdbcSymmetricDialectFactory.java
         │               │   ├── mariadb
         │               │   │   └── MariaDBSymmetricDialect.java
         │               │   ├── mssql
         │               │   │   ├── MsSql2008SymmetricDialect.java
         │               │   │   ├── MsSql2008TriggerTemplate.java
         │               │   │   ├── MsSql2016SymmetricDialect.java
         │               │   │   ├── MsSql2016TriggerTemplate.java
         │               │   │   ├── MsSqlSymmetricDialect.java
         │               │   │   └── MsSqlTriggerTemplate.java
         │               │   ├── mssql2000
         │               │   │   ├── MsSql2000SymmetricDialect.java
         │               │   │   └── MsSql2000TriggerTemplate.java
         │               │   ├── mysql
         │               │   │   ├── MySqlSymmetricDialect.java
         │               │   │   └── MySqlTriggerTemplate.java
         │               │   ├── nuodb
         │               │   │   ├── NuoDbSymmetricDialect.java
         │               │   │   └── NuoDbTriggerTemplate.java
         │               │   ├── oracle
         │               │   │   ├── OracleSymmetricDialect.java
         │               │   │   └── OracleTriggerTemplate.java
         │               │   ├── postgresql
         │               │   │   ├── GreenplumSymmetricDialect.java
         │               │   │   ├── GreenplumTriggerTemplate.java
         │               │   │   ├── PostgreSqlSymmetricDialect.java
         │               │   │   └── PostgreSqlTriggerTemplate.java
         │               │   ├── raima
         │               │   │   ├── RaimaSymmetricDialect.java
         │               │   │   └── RaimaTriggerTemplate.java
         │               │   ├── redshift
         │               │   │   ├── RedshiftSymmetricDialect.java
         │               │   │   └── RedshiftTriggerTemplate.java
         │               │   ├── sqlanywhere
         │               │   │   ├── SqlAnywhere12SymmetricDialect.java
         │               │   │   ├── SqlAnywhere12TriggerTemplate.java
         │               │   │   ├── SqlAnywhereSymmetricDialect.java
         │               │   │   └── SqlAnywhereTriggerTemplate.java
         │               │   ├── sqlite
         │               │   │   └── SqliteJdbcSymmetricDialect.java
         │               │   ├── tibero
         │               │   │   ├── TiberoSymmetricDialect.java
         │               │   │   └── TiberoTriggerTemplate.java
         │               │   └── voltdb
         │               │       ├── VoltDbSymmetricDialect.java
         │               │       └── VoltDbTriggerTemplate.java
         │               ├── DbCompareCommand.java
         │               ├── DbExportCommand.java
         │               ├── DbFillCommand.java
         │               ├── DbImportCommand.java
         │               ├── DbSqlCommand.java
         │               ├── ext
         │               │   ├── BulkDataLoaderFactory.java
         │               │   └── FtpDataLoaderFactory.java
         │               ├── io
         │               │   ├── AbstractBulkDatabaseWriter.java
         │               │   ├── FtpDataWriter.java
         │               │   ├── HbaseDatabaseWriter.java
         │               │   ├── HbaseDataLoaderFactory.java
         │               │   ├── JdbcBatchBulkDatabaseWriter.java
         │               │   └── MongoConstants.java
         │               ├── JmxCommand.java
         │               ├── job --各种任务
         │               │   ├── AbstractJob.java
         │               │   ├── BshJob.java
         │               │   ├── BuiltInJobs.java
         │               │   ├── FileSyncPullJob.java
         │               │   ├── FileSyncPushJob.java
         │               │   ├── FileSyncTrackerJob.java
         │               │   ├── HeartbeatJob.java
         │               │   ├── IncomingPurgeJob.java
         │               │   ├── InitialLoadExtractorJob.java
         │               │   ├── InitialLoadJob.java
         │               │   ├── JavaJob.java
         │               │   ├── JobCreator.java
         │               │   ├── JobDefaults.java
         │               │   ├── JobManager.java
         │               │   ├── JobManagerSqlMap.java
         │               │   ├── JobMapper.java
         │               │   ├── LogMinerJob.java
         │               │   ├── MonitorJob.java
         │               │   ├── OfflinePullJob.java
         │               │   ├── OfflinePushJob.java
         │               │   ├── OracleNoOrderHeartbeat.java
         │               │   ├── OracleNoOrderHeartbeatSqlMap.java
         │               │   ├── OutgoingPurgeJob.java
         │               │   ├── PullJob.java
         │               │   ├── PushJob.java
         │               │   ├── RefreshCacheJob.java
         │               │   ├── ReportStatusJob.java
         │               │   ├── RouterJob.java
         │               │   ├── SqlJob.java
         │               │   ├── StageManagementJob.java
         │               │   ├── StatisticFlushJob.java
         │               │   ├── SyncConfigJob.java
         │               │   ├── SyncTriggersJob.java
         │               │   └── WatchdogJob.java
         │               ├── Message.java
         │               ├── service
         │               │   ├── impl
         │               │   │   └── ClientExtensionService.java
         │               │   └── jmx
         │               │       ├── NodeManagementService.java
         │               │       └── ParameterManagementService.java
         │               ├── SymmetricAdmin.java
         │               └── util
         │                   ├── ISnapshotUtilListener.java
         │                   └── SnapshotUtil.java
         └── resources
             ├── symmetric-ext-points.xml
             ├── symmetric-jmx.xml
             ├── symmetric-messages.properties
             ├── symmetric-modules.properties
             └── sym_batch.xsd
```
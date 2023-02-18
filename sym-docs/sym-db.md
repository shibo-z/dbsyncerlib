## symmetric-db

## 目录说明
```text
symmetric-db
 └── src
     ├── main
     │   ├── java
     │   │   └── org
     │   │       └── jumpmind
     │   │           └── db
     │   │               ├── alter
     │   │               │   ├── AddColumnChange.java
     │   │               │   ├── AddForeignKeyChange.java
     │   │               │   ├── AddIndexChange.java
     │   │               │   ├── AddPrimaryKeyChange.java
     │   │               │   ├── AddTableChange.java
     │   │               │   ├── ColumnAutoIncrementChange.java
     │   │               │   ├── ColumnChange.java
     │   │               │   ├── ColumnDataTypeChange.java
     │   │               │   ├── ColumnDefaultValueChange.java
     │   │               │   ├── ColumnGeneratedChange.java
     │   │               │   ├── ColumnRequiredChange.java
     │   │               │   ├── ColumnSizeChange.java
     │   │               │   ├── CopyColumnValueChange.java
     │   │               │   ├── GeneratedColumnDefinitionChange.java
     │   │               │   ├── IModelChange.java
     │   │               │   ├── ModelComparator.java
     │   │               │   ├── PrimaryKeyChange.java
     │   │               │   ├── RemoveColumnChange.java
     │   │               │   ├── RemoveForeignKeyChange.java
     │   │               │   ├── RemoveIndexChange.java
     │   │               │   ├── RemovePrimaryKeyChange.java
     │   │               │   ├── RemoveTableChange.java
     │   │               │   ├── TableChange.java
     │   │               │   └── TableChangeImplBase.java
     │   │               ├── io
     │   │               │   ├── DatabaseXmlAsciiDocBuilder.java
     │   │               │   ├── DatabaseXmlUtil.java
     │   │               │   ├── Issue.java
     │   │               │   ├── ReleaseNotesConstants.java
     │   │               │   └── ReleaseNotesGenerator.java
     │   │               ├── model
     │   │               │   ├── CatalogSchema.java
     │   │               │   ├── Column.java
     │   │               │   ├── ColumnTypes.java
     │   │               │   ├── CompressionTypes.java
     │   │               │   ├── Database.java
     │   │               │   ├── ForeignKey.java
     │   │               │   ├── IIndex.java
     │   │               │   ├── IndexColumn.java
     │   │               │   ├── IndexImpBase.java
     │   │               │   ├── JdbcTypeCategory.java
     │   │               │   ├── ModelException.java
     │   │               │   ├── NonUniqueIndex.java
     │   │               │   ├── PlatformColumn.java
     │   │               │   ├── PlatformIndex.java
     │   │               │   ├── Reference.java
     │   │               │   ├── Table.java
     │   │               │   ├── Transaction.java
     │   │               │   ├── Trigger.java
     │   │               │   ├── TypeMap.java
     │   │               │   └── UniqueIndex.java
     │   │               ├── platform
     │   │               │   ├── AbstractDatabasePlatform.java
     │   │               │   ├── AbstractDdlBuilder.java
     │   │               │   ├── ase
     │   │               │   │   └── AseDdlBuilder.java
     │   │               │   ├── cassandra
     │   │               │   │   ├── CassandraDdlBuilder.java
     │   │               │   │   ├── CassandraDdlReader.java
     │   │               │   │   ├── CassandraDMLStatement.java
     │   │               │   │   ├── CassandraPlatform.java
     │   │               │   │   ├── CassandraSqlTemplate.java
     │   │               │   │   └── CassandraSqlTransaction.java
     │   │               │   ├── DatabaseInfo.java
     │   │               │   ├── DatabaseMetaDataWrapper.java
     │   │               │   ├── DatabaseNamesConstants.java
     │   │               │   ├── DatabaseVersion.java
     │   │               │   ├── db2
     │   │               │   │   └── Db2DdlBuilder.java
     │   │               │   ├── DdlBuilderFactory.java
     │   │               │   ├── DdlException.java
     │   │               │   ├── DefaultValueHelper.java
     │   │               │   ├── derby
     │   │               │   │   └── DerbyDdlBuilder.java
     │   │               │   ├── DmlStatementFactory.java
     │   │               │   ├── firebird
     │   │               │   │   ├── FirebirdDdlBuilder.java
     │   │               │   │   └── FirebirdDialect1DdlBuilder.java
     │   │               │   ├── greenplum
     │   │               │   │   └── GreenplumDdlBuilder.java
     │   │               │   ├── h2
     │   │               │   │   └── H2DdlBuilder.java
     │   │               │   ├── hbase
     │   │               │   │   ├── HbaseDdlBuilder.java
     │   │               │   │   └── HbaseDmlStatement.java
     │   │               │   ├── hsqldb
     │   │               │   │   └── HsqlDbDdlBuilder.java
     │   │               │   ├── hsqldb2
     │   │               │   │   └── HsqlDb2DdlBuilder.java
     │   │               │   ├── IAlterDatabaseInterceptor.java
     │   │               │   ├── IDatabasePlatform.java
     │   │               │   ├── IDatabasePlatformFactory.java
     │   │               │   ├── IDdlBuilder.java
     │   │               │   ├── IDdlBuilderFactory.java
     │   │               │   ├── IDdlReader.java
     │   │               │   ├── IDmlStatementFactory.java
     │   │               │   ├── informix
     │   │               │   │   └── InformixDdlBuilder.java
     │   │               │   ├── ingres
     │   │               │   │   └── IngresDdlBuilder.java
     │   │               │   ├── interbase
     │   │               │   │   └── InterbaseDdlBuilder.java
     │   │               │   ├── kafka
     │   │               │   │   ├── KafkaDdlBuilder.java
     │   │               │   │   ├── KafkaDdlReader.java
     │   │               │   │   ├── KafkaPlatform.java
     │   │               │   │   └── KafkaSqlTemplate.java
     │   │               │   ├── MetaDataColumnDescriptor.java
     │   │               │   ├── mssql
     │   │               │   │   ├── MsSql2000DdlBuilder.java
     │   │               │   │   ├── MsSql2005DdlBuilder.java
     │   │               │   │   ├── MsSql2008DdlBuilder.java
     │   │               │   │   ├── MsSql2016DdlBuilder.java
     │   │               │   │   └── MsSqlDmlStatement.java
     │   │               │   ├── mysql
     │   │               │   │   ├── MySqlDdlBuilder.java
     │   │               │   │   └── MySqlDmlStatement.java
     │   │               │   ├── nuodb
     │   │               │   │   └── NuoDbDdlBuilder.java
     │   │               │   ├── oracle
     │   │               │   │   ├── Oracle122DdlBuilder.java
     │   │               │   │   ├── OracleDdlBuilder.java
     │   │               │   │   └── OracleDmlStatement.java
     │   │               │   ├── PermissionResult.java
     │   │               │   ├── PermissionType.java
     │   │               │   ├── PlatformUtils.java
     │   │               │   ├── postgresql
     │   │               │   │   ├── PostgreSqlDdlBuilder.java
     │   │               │   │   ├── PostgreSqlDdlBuilder95.java
     │   │               │   │   ├── PostgreSqlDmlStatement.java
     │   │               │   │   └── PostgreSqlDmlStatement95.java
     │   │               │   ├── raima
     │   │               │   │   └── RaimaDdlBuilder.java
     │   │               │   ├── redshift
     │   │               │   │   ├── RedshiftDdlBuilder.java
     │   │               │   │   └── RedshiftDmlStatement.java
     │   │               │   ├── sqlanywhere
     │   │               │   │   ├── SqlAnywhereDdlBuilder.java
     │   │               │   │   └── SqlAnywhereDmlStatement.java
     │   │               │   ├── sqlite
     │   │               │   │   ├── AbstractSqlRowMapper.java
     │   │               │   │   ├── SqliteDdlBuilder.java
     │   │               │   │   ├── SqliteDdlReader.java
     │   │               │   │   └── SqliteDmlStatement.java
     │   │               │   ├── tibero
     │   │               │   │   ├── TiberoDdlBuilder.java
     │   │               │   │   └── TiberoDmlStatement.java
     │   │               │   └── voltdb
     │   │               │       └── VoltDbDdlBuilder.java
     │   │               ├── sql
     │   │               │   ├── AbstractJavaDriverSqlTemplate.java
     │   │               │   ├── AbstractSqlTemplate.java
     │   │               │   ├── BulkSqlException.java
     │   │               │   ├── ChangeCatalogConnectionHandler.java
     │   │               │   ├── ColumnNotFoundException.java
     │   │               │   ├── ConcurrencySqlException.java
     │   │               │   ├── DataTruncationException.java
     │   │               │   ├── DmlStatement.java
     │   │               │   ├── DmlStatementOptions.java
     │   │               │   ├── IConnectionHandler.java
     │   │               │   ├── InvalidSqlException.java
     │   │               │   ├── ISqlReadCursor.java
     │   │               │   ├── ISqlResultsListener.java
     │   │               │   ├── ISqlRowMapper.java
     │   │               │   ├── ISqlStatementSource.java
     │   │               │   ├── ISqlTemplate.java
     │   │               │   ├── ISqlTransaction.java
     │   │               │   ├── ISqlTransactionListener.java
     │   │               │   ├── ListSqlStatementSource.java
     │   │               │   ├── LogSqlBuilder.java
     │   │               │   ├── LogSqlResultsListener.java
     │   │               │   ├── mapper
     │   │               │   │   ├── DateMapper.java
     │   │               │   │   ├── LongMapper.java
     │   │               │   │   ├── NumberMapper.java
     │   │               │   │   ├── RowMapper.java
     │   │               │   │   └── StringMapper.java
     │   │               │   ├── NamedParameterUtils.java
     │   │               │   ├── ParsedSql.java
     │   │               │   ├── Row.java
     │   │               │   ├── SqlConstants.java
     │   │               │   ├── SqlException.java
     │   │               │   ├── SqlList.java
     │   │               │   ├── SqlScript.java
     │   │               │   ├── SqlScriptException.java
     │   │               │   ├── SqlScriptReader.java
     │   │               │   ├── SqlTemplateSettings.java
     │   │               │   ├── SqlToken.java
     │   │               │   ├── SqlTransactionListenerAdapter.java
     │   │               │   ├── SqlUtils.java
     │   │               │   ├── TableNotFoundException.java
     │   │               │   └── UniqueKeyException.java
     │   │               └── util
     │   │                   ├── BinaryEncoding.java
     │   │                   ├── ConfigDatabaseUpgrader.java
     │   │                   ├── DatabaseConstants.java
     │   │                   ├── MultiInstanceofPredicate.java
     │   │                   └── TableRow.java
     │   └── resources
     │       └── org
     │           └── jumpmind
     │               └── db
     │                   └── io
     │                       └── mapping.xml
     └── schema
         └── database.xsd
```
## symmetric-io

## 目录说明
```text
symmetric-core
 ├── build
 │   └── libs
 │       └── symmetric-core-3.14.x-SNAPSHOT.jar
 └── src
     └── main
         ├── java
         │   └── org
         │       └── jumpmind
         │           └── symmetric
         │               ├── AbstractSymmetricEngine.java
         │               ├── cache
         │               │   ├── CacheManager.java
         │               │   ├── ConfigurationCache.java
         │               │   ├── DataLoaderCache.java
         │               │   ├── FileSyncCache.java
         │               │   ├── GroupletCache.java
         │               │   ├── ICacheManager.java
         │               │   ├── LoadFilterCache.java
         │               │   ├── MonitorCache.java
         │               │   ├── NodeCache.java
         │               │   ├── TransformCache.java
         │               │   ├── TriggerRouterCache.java
         │               │   └── TriggerRouterRoutersCache.java
         │               ├── common
         │               │   ├── ConfigurationChangedHelper.java
         │               │   ├── ConfigurationVersionHelper.java
         │               │   ├── Constants.java
         │               │   ├── ContextConstants.java
         │               │   ├── ErrorConstants.java
         │               │   ├── InfoConstants.java
         │               │   ├── ParameterConstants.java
         │               │   ├── ServerConstants.java
         │               │   ├── SystemConstants.java
         │               │   ├── TableConstants.java
         │               │   └── TokenConstants.java
         │               ├── config
         │               │   ├── INodeIdCreator.java
         │               │   ├── INodeIdGenerator.java
         │               │   ├── IParameterFilter.java
         │               │   ├── IParameterSaveFilter.java
         │               │   ├── ITableResolver.java
         │               │   ├── ITriggerCreationListener.java
         │               │   ├── NodeIdCreatorAdaptor.java
         │               │   ├── TriggerCreationAdapter.java
         │               │   ├── TriggerFailureListener.java
         │               │   ├── TriggerRouterSelector.java
         │               │   └── TriggerSelector.java
         │               ├── db
         │               │   ├── AbstractSymmetricDialect.java
         │               │   ├── AbstractTriggerTemplate.java
         │               │   ├── DatabaseUpgradeListener.java
         │               │   ├── DbNotSupportedException.java
         │               │   ├── ISoftwareUpgradeListener.java
         │               │   ├── ISymmetricDialect.java
         │               │   ├── LogSqlResultsInstallListener.java
         │               │   ├── SequenceIdentifier.java
         │               │   ├── SoftwareUpgradeListener.java
         │               │   └── sqlite
         │               │       ├── SqliteSymmetricDialect.java
         │               │       └── SqliteTriggerTemplate.java
         │               ├── EngineAlreadyRegisteredException.java
         │               ├── ext
         │               │   ├── ExtensionPointMetaData.java
         │               │   ├── IConfigurationChangedListener.java
         │               │   ├── IDatabaseInstallStatementListener.java
         │               │   ├── IDatabaseUpgradeListener.java
         │               │   ├── IHeartbeatListener.java
         │               │   ├── INodeGroupExtensionPoint.java
         │               │   ├── INodeRegistrationAuthenticator.java
         │               │   ├── INodeRegistrationListener.java
         │               │   ├── IOfflineServerListener.java
         │               │   ├── IOutgoingBatchFilter.java
         │               │   ├── IPurgeListener.java
         │               │   ├── IRegistrationRedirect.java
         │               │   ├── ISymmetricEngineAware.java
         │               │   └── ISymmetricEngineLifecycle.java
         │               ├── extract
         │               │   ├── ColumnsAccordingToTriggerHistory.java
         │               │   ├── ExtractDataReaderFactory.java
         │               │   ├── IExtractDataReaderFactory.java
         │               │   ├── MultiBatchStagingWriter.java
         │               │   ├── SelectFromSource.java
         │               │   ├── SelectFromSymDataSource.java
         │               │   ├── SelectFromTableEvent.java
         │               │   └── SelectFromTableSource.java
         │               ├── file
         │               │   ├── BashFileSyncZipScript.java
         │               │   ├── BeanShellFileSyncZipScript.java
         │               │   ├── DirectorySnapshot.java
         │               │   ├── FileConflictException.java
         │               │   ├── FileSyncUtils.java
         │               │   ├── FileSyncZipDataWriter.java
         │               │   ├── FileSyncZipScript.java
         │               │   ├── FileTriggerFileModifiedListener.java
         │               │   ├── FileTriggerTracker.java
         │               │   ├── IFileConflictResolver.java
         │               │   └── PathResolutionException.java
         │               ├── io
         │               │   ├── data
         │               │   │   └── transform
         │               │   │       ├── BshColumnTransform.java
         │               │   │       ├── JavaColumnTransform.java
         │               │   │       ├── LookupColumnTransform.java
         │               │   │       ├── ParameterColumnTransform.java
         │               │   │       └── VariableColumnTransform.java
         │               │   ├── DbCompare.java
         │               │   ├── DbCompareConfig.java
         │               │   ├── DbCompareDiffWriter.java
         │               │   ├── DbCompareReport.java
         │               │   ├── DbCompareRow.java
         │               │   ├── DbCompareTables.java
         │               │   ├── DbCompareUtil.java
         │               │   ├── DbValueComparator.java
         │               │   ├── DefaultOfflineClientListener.java
         │               │   ├── FirstUseFileOutputStream.java
         │               │   ├── IOfflineClientListener.java
         │               │   └── stage
         │               │       ├── BatchStagingManager.java
         │               │       └── SimpleStagingDataWriter.java
         │               ├── ISymmetricEngine.java
         │               ├── ITypedPropertiesFactory.java
         │               ├── job
         │               │   ├── DefaultOfflineServerListener.java
         │               │   ├── IJob.java
         │               │   ├── IJobManager.java
         │               │   └── PushHeartbeatListener.java
         │               ├── load
         │               │   ├── AbstractDataLoaderFactory.java
         │               │   ├── BshDatabaseWriterFilter.java
         │               │   ├── ConfigurationChangedDatabaseWriterFilter.java
         │               │   ├── DefaultDataLoaderFactory.java
         │               │   ├── DefaultReloadGenerator.java
         │               │   ├── DynamicDatabaseWriterFilter.java
         │               │   ├── IClientReloadListener.java
         │               │   ├── IDataLoaderFactory.java
         │               │   ├── ILoadSyncLifecycleListener.java
         │               │   ├── IReloadGenerator.java
         │               │   ├── IReloadListener.java
         │               │   ├── IReloadVariableFilter.java
         │               │   ├── JavaDatabaseWriterFilter.java
         │               │   ├── SchemaPerNodeDataLoaderFilter.java
         │               │   └── SQLDatabaseWriterFilter.java
         │               ├── model
         │               │   ├── AbstractBatch.java
         │               │   ├── BatchAck.java
         │               │   ├── BatchAckResult.java
         │               │   ├── BatchId.java
         │               │   ├── BatchSummary.java
         │               │   ├── Channel.java
         │               │   ├── ChannelMap.java
         │               │   ├── Data.java
         │               │   ├── DatabaseParameter.java
         │               │   ├── DataEvent.java
         │               │   ├── DataGap.java
         │               │   ├── DataMetaData.java
         │               │   ├── Extension.java
         │               │   ├── ExtractRequest.java
         │               │   ├── FileConflictStrategy.java
         │               │   ├── FileSnapshot.java
         │               │   ├── FileTrigger.java
         │               │   ├── FileTriggerRouter.java
         │               │   ├── Grouplet.java
         │               │   ├── GroupletLink.java
         │               │   ├── IModelObject.java
         │               │   ├── IncomingBatch.java
         │               │   ├── IncomingBatchSummary.java
         │               │   ├── IncomingError.java
         │               │   ├── JobDefinition.java
         │               │   ├── LoadFilter.java
         │               │   ├── Lock.java
         │               │   ├── Monitor.java
         │               │   ├── MonitorEvent.java
         │               │   ├── NetworkedNode.java
         │               │   ├── Node.java
         │               │   ├── NodeChannel.java
         │               │   ├── NodeChannelControl.java
         │               │   ├── NodeCommunication.java
         │               │   ├── NodeGroup.java
         │               │   ├── NodeGroupChannelWindow.java
         │               │   ├── NodeGroupLink.java
         │               │   ├── NodeGroupLinkAction.java
         │               │   ├── NodeHost.java
         │               │   ├── NodeSecurity.java
         │               │   ├── NodeStatus.java
         │               │   ├── Notification.java
         │               │   ├── OutgoingBatch.java
         │               │   ├── OutgoingBatches.java
         │               │   ├── OutgoingBatchSummary.java
         │               │   ├── OutgoingBatchWithPayload.java
         │               │   ├── ProcessInfo.java
         │               │   ├── ProcessInfoDataWriter.java
         │               │   ├── ProcessInfoKey.java
         │               │   ├── ProcessType.java
         │               │   ├── RegistrationRequest.java
         │               │   ├── RemoteNodeStatus.java
         │               │   ├── RemoteNodeStatuses.java
         │               │   ├── Router.java
         │               │   ├── Sequence.java
         │               │   ├── TableReloadRequest.java
         │               │   ├── TableReloadRequestKey.java
         │               │   ├── TableReloadStatus.java
         │               │   ├── Trigger.java
         │               │   ├── TriggerHistory.java
         │               │   ├── TriggerReBuildReason.java
         │               │   ├── TriggerRouter.java
         │               │   └── TriggerRouterGrouplet.java
         │               ├── monitor
         │               │   ├── AbstractMonitorType.java
         │               │   ├── BatchErrorWrapper.java
         │               │   ├── IMonitorType.java
         │               │   ├── MonitorTypeBatchError.java
         │               │   ├── MonitorTypeBatchUnsent.java
         │               │   ├── MonitorTypeBlock.java
         │               │   ├── MonitorTypeCpu.java
         │               │   ├── MonitorTypeDataGap.java
         │               │   ├── MonitorTypeDisk.java
         │               │   ├── MonitorTypeFileHandles.java
         │               │   ├── MonitorTypeLoadAverage.java
         │               │   ├── MonitorTypeLog.java
         │               │   ├── MonitorTypeMemory.java
         │               │   ├── MonitorTypeOfflineNodes.java
         │               │   └── MonitorTypeUnrouted.java
         │               ├── notification
         │               │   ├── INotificationType.java
         │               │   ├── NotificationTypeEmail.java
         │               │   └── NotificationTypeLog.java
         │               ├── route
         │               │   ├── AbstractDataGapRouteCursor.java
         │               │   ├── AbstractDataRouter.java
         │               │   ├── AbstractFileParsingRouter.java
         │               │   ├── AuditTableDataRouter.java
         │               │   ├── BshDataRouter.java
         │               │   ├── ChannelRouterContext.java
         │               │   ├── ColumnMatchDataRouter.java
         │               │   ├── CommonBatchCollisionException.java
         │               │   ├── ConfigurationChangedDataRouter.java
         │               │   ├── ConvertToReloadRouter.java
         │               │   ├── CSVRouter.java
         │               │   ├── DataGapDetector.java
         │               │   ├── DataGapFastDetector.java
         │               │   ├── DataGapRouteCursor.java
         │               │   ├── DataGapRouteMultiCursor.java
         │               │   ├── DataGapRouteReader.java
         │               │   ├── DataMemoryCursor.java
         │               │   ├── DBFRouter.java
         │               │   ├── DefaultBatchAlgorithm.java
         │               │   ├── DefaultDataRouter.java
         │               │   ├── DelayRoutingException.java
         │               │   ├── FileSyncDataRouter.java
         │               │   ├── IBatchAlgorithm.java
         │               │   ├── IDataGapRouteCursor.java
         │               │   ├── IDataRouter.java
         │               │   ├── IDataToRouteReader.java
         │               │   ├── JavaDataRouter.java
         │               │   ├── LookupTableDataRouter.java
         │               │   ├── NonTransactionalBatchAlgorithm.java
         │               │   ├── parse
         │               │   │   ├── DBFException.java
         │               │   │   ├── DBFField.java
         │               │   │   └── DBFReader.java
         │               │   ├── SimpleRouterContext.java
         │               │   ├── SubSelectDataRouter.java
         │               │   ├── TPSRouter.java
         │               │   └── TransactionalBatchAlgorithm.java
         │               ├── security
         │               │   └── INodePasswordFilter.java
         │               ├── service
         │               │   ├── ClusterConstants.java
         │               │   ├── FilterCriterion.java
         │               │   ├── IAcknowledgeService.java
         │               │   ├── IBandwidthService.java
         │               │   ├── IClusterInstanceGenerator.java
         │               │   ├── IClusterService.java
         │               │   ├── IConfigurationService.java
         │               │   ├── IContextService.java
         │               │   ├── IDataExtractorService.java
         │               │   ├── IDataLoaderService.java
         │               │   ├── IDataService.java
         │               │   ├── IExtensionService.java
         │               │   ├── IFileSyncService.java
         │               │   ├── IGroupletService.java
         │               │   ├── IIncomingBatchService.java
         │               │   ├── IInitialLoadService.java
         │               │   ├── ILoadFilterService.java
         │               │   ├── ILogMinerService.java
         │               │   ├── IMailService.java
         │               │   ├── IMonitorService.java
         │               │   ├── impl
         │               │   │   ├── AbstractOfflineDetectorService.java
         │               │   │   ├── AbstractParameterService.java
         │               │   │   ├── AbstractService.java
         │               │   │   ├── AbstractSqlMap.java
         │               │   │   ├── AcknowledgeService.java
         │               │   │   ├── AcknowledgeServiceSqlMap.java
         │               │   │   ├── BandwidthService.java
         │               │   │   ├── ClusterLockRefreshListener.java
         │               │   │   ├── ClusterService.java
         │               │   │   ├── ClusterServiceSqlMap.java
         │               │   │   ├── ConfigurationService.java
         │               │   │   ├── ConfigurationServiceSqlMap.java
         │               │   │   ├── ContextService.java
         │               │   │   ├── ContextServiceSqlMap.java
         │               │   │   ├── DataExtractorService.java
         │               │   │   ├── DataExtractorServiceSqlMap.java
         │               │   │   ├── DataLoaderService.java
         │               │   │   ├── DataLoaderServiceSqlMap.java
         │               │   │   ├── DataService.java
         │               │   │   ├── DataServiceSqlMap.java
         │               │   │   ├── ExtensionService.java
         │               │   │   ├── ExtensionServiceSqlMap.java
         │               │   │   ├── FileSyncExtractorService.java
         │               │   │   ├── FileSyncService.java
         │               │   │   ├── FileSyncServiceSqlMap.java
         │               │   │   ├── GroupletService.java
         │               │   │   ├── GroupletServiceSqlMap.java
         │               │   │   ├── IncomingBatchService.java
         │               │   │   ├── IncomingBatchServiceSqlMap.java
         │               │   │   ├── InitialLoadService.java
         │               │   │   ├── ISqlMap.java
         │               │   │   ├── LoadFilterService.java
         │               │   │   ├── LoadFilterServiceSqlMap.java
         │               │   │   ├── MailService.java
         │               │   │   ├── ManageIncomingBatchListener.java
         │               │   │   ├── MonitorService.java
         │               │   │   ├── MonitorServiceSqlMap.java
         │               │   │   ├── NodeCommunicationService.java
         │               │   │   ├── NodeCommunicationServiceSqlMap.java
         │               │   │   ├── NodeService.java
         │               │   │   ├── NodeServiceSqlMap.java
         │               │   │   ├── OfflinePullService.java
         │               │   │   ├── OfflinePushService.java
         │               │   │   ├── OutgoingBatchService.java
         │               │   │   ├── OutgoingBatchServiceSqlMap.java
         │               │   │   ├── ParameterService.java
         │               │   │   ├── ParameterServiceSqlMap.java
         │               │   │   ├── PullService.java
         │               │   │   ├── PurgeService.java
         │               │   │   ├── PurgeServiceSqlMap.java
         │               │   │   ├── PushService.java
         │               │   │   ├── RegistrationService.java
         │               │   │   ├── RegistrationServiceSqlMap.java
         │               │   │   ├── RouterService.java
         │               │   │   ├── RouterServiceSqlMap.java
         │               │   │   ├── SequenceService.java
         │               │   │   ├── SequenceServiceSqlMap.java
         │               │   │   ├── StatisticService.java
         │               │   │   ├── StatisticServiceSqlMap.java
         │               │   │   ├── TransformService.java
         │               │   │   ├── TransformServiceSqlMap.java
         │               │   │   ├── TriggerRouterService.java
         │               │   │   ├── TriggerRouterServiceSqlMap.java
         │               │   │   ├── UpdateService.java
         │               │   │   └── UpdateServiceSqlMap.java
         │               │   ├── InitialLoadPendingException.java
         │               │   ├── INodeCommunicationService.java
         │               │   ├── INodeService.java
         │               │   ├── IOfflineDetectorService.java
         │               │   ├── IOfflinePullService.java
         │               │   ├── IOfflinePushService.java
         │               │   ├── IOutgoingBatchService.java
         │               │   ├── IParameterService.java
         │               │   ├── IPullService.java
         │               │   ├── IPurgeService.java
         │               │   ├── IPushService.java
         │               │   ├── IRegistrationService.java
         │               │   ├── IRouterService.java
         │               │   ├── ISequenceService.java
         │               │   ├── IService.java
         │               │   ├── IStatisticService.java
         │               │   ├── ITransformService.java
         │               │   ├── ITriggerRouterService.java
         │               │   ├── IUpdateService.java
         │               │   ├── RegistrationFailedException.java
         │               │   ├── RegistrationNotOpenException.java
         │               │   ├── RegistrationPendingException.java
         │               │   ├── RegistrationRedirectException.java
         │               │   └── RegistrationRequiredException.java
         │               ├── statistic
         │               │   ├── AbstractNodeHostStats.java
         │               │   ├── AbstractStatsByPeriodMap.java
         │               │   ├── ChannelStats.java
         │               │   ├── ChannelStatsByPeriodMap.java
         │               │   ├── HostStats.java
         │               │   ├── HostStatsByPeriodMap.java
         │               │   ├── IStatisticManager.java
         │               │   ├── JobStats.java
         │               │   ├── NodeStatsByPeriodMap.java
         │               │   ├── RouterStats.java
         │               │   ├── StatisticConstants.java
         │               │   └── StatisticManager.java
         │               ├── SymmetricException.java
         │               ├── SymmetricPushClient.java
         │               ├── SyntaxParsingException.java
         │               ├── transport
         │               │   ├── AbstractTransportManager.java
         │               │   ├── AuthenticationException.java
         │               │   ├── BandwidthTestResults.java
         │               │   ├── BatchBufferedWriter.java
         │               │   ├── ConcurrentConnectionManager.java
         │               │   ├── ConnectionRejectedException.java
         │               │   ├── file
         │               │   │   ├── FileIncomingTransport.java
         │               │   │   ├── FileOutgoingTransport.java
         │               │   │   └── FileTransportManager.java
         │               │   ├── http
         │               │   │   ├── ConscryptHelper.java
         │               │   │   ├── Http2Connection.java
         │               │   │   ├── HttpBandwidthUrlSelector.java
         │               │   │   ├── HttpConnection.java
         │               │   │   ├── HttpIncomingTransport.java
         │               │   │   ├── HttpOutgoingTransport.java
         │               │   │   ├── HttpTransportManager.java
         │               │   │   ├── SelfSignedX509TrustManager.java
         │               │   │   └── SimpleHostnameVerifier.java
         │               │   ├── IAcknowledgeEventListener.java
         │               │   ├── IConcurrentConnectionManager.java
         │               │   ├── IIncomingTransport.java
         │               │   ├── internal
         │               │   │   ├── InternalIncomingTransport.java
         │               │   │   ├── InternalOutgoingTransport.java
         │               │   │   ├── InternalOutgoingWithResponseTransport.java
         │               │   │   └── InternalTransportManager.java
         │               │   ├── IOutgoingTransport.java
         │               │   ├── IOutgoingWithResponseTransport.java
         │               │   ├── ISyncUrlExtension.java
         │               │   ├── ITransportManager.java
         │               │   ├── ITransportResource.java
         │               │   ├── ITransportResourceHandler.java
         │               │   ├── NoContentException.java
         │               │   ├── NoReservationException.java
         │               │   ├── OfflineException.java
         │               │   ├── ServiceUnavailableException.java
         │               │   ├── SyncDisabledException.java
         │               │   ├── TransportException.java
         │               │   ├── TransportManagerFactory.java
         │               │   └── TransportUtils.java
         │               ├── util
         │               │   ├── CounterStat.java
         │               │   ├── CounterStatComparator.java
         │               │   ├── DefaultNodeIdCreator.java
         │               │   ├── KeystoreTypedPropertiesFactory.java
         │               │   ├── LogSummaryAppenderUtils.java
         │               │   ├── MavenArtifact.java
         │               │   ├── ModuleException.java
         │               │   ├── ModuleManager.java
         │               │   ├── PropertiesFactoryBean.java
         │               │   ├── PropertiesUtil.java
         │               │   ├── SuperClassExclusion.java
         │               │   ├── SymmetricUtils.java
         │               │   └── TypedPropertiesFactory.java
         │               ├── Version.java
         │               └── web
         │                   └── WebConstants.java
         └── resources
             ├── load-schema-at-target.bsh --执行数据库中建sym表的脚本
             ├── symmetric-default.properties --数据库+文件的engine配置示例
             ├── symmetric-schema.xml --sym表描述
             └── symmetricds.asciiart --bunner
```
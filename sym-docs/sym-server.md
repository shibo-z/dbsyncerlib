## symmetric-server
[返回首页](sym.md)

## 流程

## 目录说明
```text
symmetric-server
 └── src
     ├── databases --firebird和interbase的支持库文件
     │   ├── firebird
     │   │   ├── ... 
     │   └── interbase
     │       ├── ...
     ├── main
     │   ├── deploy --官方的symmetric-server-xxx.zip快速体验程序的内容
     │   │   ├── ...
     │   └── java
     │       └── org
     │           └── jumpmind
     │               └── symmetric
     │                   ├── integrate
     │                   │   ├── AbstractTextPublisherDataLoaderFilter.java
     │                   │   ├── AbstractXmlPublisherExtensionPoint.java
     │                   │   ├── IPublisher.java
     │                   │   ├── IPublisherFilter.java
     │                   │   ├── LogFilePublisher.java
     │                   │   ├── RunSqlReloadListener.java
     │                   │   ├── SimpleJmsPublisher.java
     │                   │   ├── TemplatedPublisherDataLoaderFilter.java
     │                   │   ├── XmlPublisherDatabaseWriterFilter.java
     │                   │   └── XmlPublisherDataRouter.java
     │                   ├── map
     │                   │   ├── ColumnDataFilters.java
     │                   │   ├── ConstantValueFilter.java
     │                   │   ├── IValueFilter.java
     │                   │   └── TableColumnValueFilter.java
     │                   ├── SymmetricLauncher.java
     │                   ├── SymmetricWebServer.java
     │                   └── web
     │                       ├── AbstractCompressionUriHandler.java
     │                       ├── AbstractUriHandler.java
     │                       ├── AckUriHandler.java
     │                       ├── AuthenticationInterceptor.java
     │                       ├── AuthenticationSession.java
     │                       ├── BandwidthSamplerUriHandler.java
     │                       ├── compression
     │                       │   ├── CompressionResponseStream.java
     │                       │   └── CompressionServletResponseWrapper.java
     │                       ├── ConfigurationUriHandler.java
     │                       ├── CopyNodeUriHandler.java
     │                       ├── FailedEngineInfo.java
     │                       ├── FileSyncPullUriHandler.java
     │                       ├── FileSyncPushUriHandler.java
     │                       ├── HttpMethodFilter.java
     │                       ├── IInterceptor.java
     │                       ├── InfoUriHandler.java
     │                       ├── IUriHandler.java
     │                       ├── LogRequestResponseFilter.java
     │                       ├── NodeConcurrencyInterceptor.java
     │                       ├── PingUriHandler.java
     │                       ├── PullUriHandler.java
     │                       ├── PushStatusUriHandler.java
     │                       ├── PushUriHandler.java
     │                       ├── RegistrationUriHandler.java
     │                       ├── rest
     │                       │   ├── InternalServerErrorException.java
     │                       │   ├── model
     │                       │   │   ├── Batch.java
     │                       │   │   ├── BatchAckResults.java
     │                       │   │   ├── BatchResult.java
     │                       │   │   ├── BatchResults.java
     │                       │   │   ├── BatchSummaries.java
     │                       │   │   ├── BatchSummary.java
     │                       │   │   ├── ChannelStatus.java
     │                       │   │   ├── Column.java
     │                       │   │   ├── Engine.java
     │                       │   │   ├── EngineList.java
     │                       │   │   ├── Heartbeat.java
     │                       │   │   ├── Identity.java
     │                       │   │   ├── Node.java
     │                       │   │   ├── NodeList.java
     │                       │   │   ├── NodeStatus.java
     │                       │   │   ├── PullDataResults.java
     │                       │   │   ├── QueryResults.java
     │                       │   │   ├── RegistrationInfo.java
     │                       │   │   ├── RestError.java
     │                       │   │   ├── Row.java
     │                       │   │   ├── SendSchemaRequest.java
     │                       │   │   ├── SendSchemaResponse.java
     │                       │   │   └── TableName.java
     │                       │   ├── NotAllowedException.java
     │                       │   ├── NotFoundException.java
     │                       │   ├── RestConfig.java
     │                       │   ├── RestService.java
     │                       │   ├── SwaggerConfig.java
     │                       │   └── WebAppConfig.java
     │                       ├── ServerSymmetricEngine.java
     │                       ├── ServletUtils.java
     │                       ├── SymmetricContextListener.java
     │                       ├── SymmetricEngineHolder.java
     │                       ├── SymmetricEngineStarter.java
     │                       └── SymmetricServlet.java
     └── shortcuts --本地客户端的快捷方式
         ├── ...
```
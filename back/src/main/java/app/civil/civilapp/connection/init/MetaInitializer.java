//package app.civil.civilapp.connection.init;
//
//import app.civil.civilapp.connection.meta.dto.ConfigMeta;
//import app.civil.civilapp.connection.meta.dto.InMemoryMetaConfig;
//import app.civil.civilapp.connection.meta.service.ConfigMetaService;
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.DependsOn;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component("metaInitializer")
//@DependsOn("dataSourceInitializer")
//@RequiredArgsConstructor
//@Slf4j
//public class MetaInitializer {
//    private final ConfigMetaService configMetaService;
//
//    @PostConstruct
//    public void init() {
//        log.info("Meta Initializer");
//        List<ConfigMeta> configMetaList = configMetaService.getConfigMetaList();
//
//        InMemoryMetaConfig.setMetaConfigList(configMetaList);
//    }
//}

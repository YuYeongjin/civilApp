package app.civil.civilapp.connection.init;

import io.uws.ubn.core.datasource.dto.DataSourceDTO;
import io.uws.ubn.core.datasource.dto.DataSourceListDTO;
import io.uws.ubn.core.datasource.service.DataSourceService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "dataSourceInitializer")
@RequiredArgsConstructor
@Slf4j
public class DataSourceInitializer {

    private final DataSourceService dataSourceService;

    @PostConstruct
    public void init() {
        log.info("DataSource Initializer");
        List<DataSourceDTO> dataSources = dataSourceService.getDataSourceList();
        DataSourceListDTO.setDataSourceList(dataSources);
    }
}

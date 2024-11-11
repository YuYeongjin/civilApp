package app.civil.civilapp.connection.meta.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

public class InMemoryMetaConfig {
    @Getter
    @Setter
    private static List<ConfigMeta> metaConfigList;

    public static Optional<ConfigMeta> getConfigMeta(String key) {
        return metaConfigList.stream().filter(configMeta -> configMeta.getKey().equals(key)).findAny();
    }
}

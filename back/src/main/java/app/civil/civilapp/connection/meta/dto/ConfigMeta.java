package app.civil.civilapp.connection.meta.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigMeta {
    private String uuid;
    private String key;
    private String value;
    private int index;
}

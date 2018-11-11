package com.justplay1994.github.oracle2es.core.service.model.mapping;

import lombok.Data;

/**
 * Created by JustPlay1994 on 2018/11/11.
 * https://github.com/JustPlay1994
 */

@Data
public class DateTypeModel {
    String type = "date";
    String format = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis";
}

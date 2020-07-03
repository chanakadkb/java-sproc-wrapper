package org.zalando.sprocwrapper.dsprovider;

import java.util.List;

import javax.sql.DataSource;

/**
 * @author  jmussler
 */
public interface DataSourceProvider {
    int getDataSourceId(int virtualShardId);

    DataSource getDataSource(int virtualShardId);

    List<Integer> getDistinctShardIds();
}

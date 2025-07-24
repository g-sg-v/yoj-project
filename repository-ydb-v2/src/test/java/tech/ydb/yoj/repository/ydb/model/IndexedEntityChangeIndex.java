package tech.ydb.yoj.repository.ydb.model;

import lombok.Value;
import tech.ydb.yoj.databind.schema.Column;
import tech.ydb.yoj.databind.schema.GlobalIndex;
import tech.ydb.yoj.databind.schema.Table;
import tech.ydb.yoj.repository.db.Entity;

@Value
@GlobalIndex(name = "key_index", fields = {"keyId"})
@GlobalIndex(name = "value_index", fields = {"valueId"})
@Table(name = "table_with_indexes")
public class IndexedEntityChangeIndex implements Entity<IndexedEntityChangeIndex> {
    @Column(name = "version_id")
    Id id;
    @Column(name = "key_id")
    String keyId;
    @Column(name = "value_id")
    String valueId;
    @Column
    String valueId2;

    @Value
    public static class Id implements Entity.Id<IndexedEntityChangeIndex> {
        @Column(name = "version_id")
        String versionId;
    }
}

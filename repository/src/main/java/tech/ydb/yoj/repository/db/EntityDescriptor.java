package tech.ydb.yoj.repository.db;

import tech.ydb.yoj.databind.schema.Schema;

import javax.annotation.Nullable;

public record EntityDescriptor<E extends Entity<E>>(Class<E> clazz, @Nullable String tableName) {
    public String getTableName(Schema<E> schema) {
        return tableName != null ? tableName : schema.getName();
    }

    public static <E extends Entity<E>> EntityDescriptor<E> of(Class<E> clazz) {
        return new EntityDescriptor<>(clazz, null);
    }
}

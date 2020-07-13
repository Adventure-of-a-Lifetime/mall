package com.boss.mall.typeHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/12 19:09
 */
@SuppressWarnings("unchecked")
public class typeHandler<T extends Object> extends BaseTypeHandler<T> {
    private static final ObjectMapper mapper = new ObjectMapper();
    private Class<T> classType;

    public typeHandler(Class<T> classType) {
        if (classType == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.classType = classType;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, T t, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, this.toJson(t));
    }

    @Override
    public T getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return this.toObject(resultSet.getString(s));
    }

    @Override
    public T getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return this.toObject(resultSet.getString(i));
    }

    @Override
    public T getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return this.toObject(callableStatement.getString(i));
    }

    private String toJson(T object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private T toObject(String content) {
        if (content != null && !content.isEmpty()) {
            try {
                return mapper.readValue(content, classType);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return null;
        }
    }
}

package com.example.custom_scalar_type.type;

import com.apollographql.android.api.graphql.ScalarType;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public enum CustomType implements ScalarType {
  DATE {
    @Override
    public String typeName() {
      return "Date";
    }

    @Override
    public Class javaType() {
      return Date.class;
    }
  }
}

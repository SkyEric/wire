// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/differentpackage/bar.proto at 5:1
package com.squareup.differentpackage.protos.bar;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import okio.ByteString;

public final class Bar extends Message<Bar> {
  public static final ProtoAdapter<Bar> ADAPTER = ProtoAdapter.newMessageAdapter(Bar.class);

  private static final long serialVersionUID = 0L;

  public Bar() {
    this(ByteString.EMPTY);
  }

  public Bar(ByteString unknownFields) {
    super(unknownFields);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof Bar;
  }

  @Override
  public int hashCode() {
    return unknownFields().hashCode();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Bar, Builder> {
    public Builder() {
    }

    @Override
    public Bar build() {
      return new Bar(buildUnknownFields());
    }
  }

  public static final class Baz extends Message<Baz> {
    public static final ProtoAdapter<Baz> ADAPTER = ProtoAdapter.newMessageAdapter(Baz.class);

    private static final long serialVersionUID = 0L;

    public Baz() {
      this(ByteString.EMPTY);
    }

    public Baz(ByteString unknownFields) {
      super(unknownFields);
    }

    @Override
    public Baz.Builder newBuilder() {
      Baz.Builder builder = new Baz.Builder();
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      return other instanceof Baz;
    }

    @Override
    public int hashCode() {
      return unknownFields().hashCode();
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<Baz, Baz.Builder> {
      public Builder() {
      }

      @Override
      public Baz build() {
        return new Baz(buildUnknownFields());
      }
    }

    public static final class Moo extends Message<Moo> {
      public static final ProtoAdapter<Moo> ADAPTER = ProtoAdapter.newMessageAdapter(Moo.class);

      private static final long serialVersionUID = 0L;

      public static final String DEFAULT_BOO = "";

      @WireField(
          tag = 1,
          adapter = "com.squareup.wire.ProtoAdapter#STRING"
      )
      public final String boo;

      public Moo(String boo) {
        this(boo, ByteString.EMPTY);
      }

      public Moo(String boo, ByteString unknownFields) {
        super(unknownFields);
        this.boo = boo;
      }

      @Override
      public Moo.Builder newBuilder() {
        Moo.Builder builder = new Moo.Builder();
        builder.boo = boo;
        builder.addUnknownFields(unknownFields());
        return builder;
      }

      @Override
      public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Moo)) return false;
        Moo o = (Moo) other;
        return equals(unknownFields(), o.unknownFields())
            && equals(boo, o.boo);
      }

      @Override
      public int hashCode() {
        int result = super.hashCode;
        if (result == 0) {
          result = unknownFields().hashCode();
          result = result * 37 + (boo != null ? boo.hashCode() : 0);
          super.hashCode = result;
        }
        return result;
      }

      public static final class Builder extends com.squareup.wire.Message.Builder<Moo, Moo.Builder> {
        public String boo;

        public Builder() {
        }

        public Builder boo(String boo) {
          this.boo = boo;
          return this;
        }

        @Override
        public Moo build() {
          return new Moo(boo, buildUnknownFields());
        }
      }
    }
  }
}

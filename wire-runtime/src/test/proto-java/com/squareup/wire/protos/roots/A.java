// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 34:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

/**
 * Used to test --roots flag of WireCompiler
 *
 * A -> B -> C
 *  \
 *   -> D
 *
 * E -> E.F
 *  \
 *   -> G
 *
 * H -> E.F
 *
 * I -> nothing
 */
public final class A extends Message<A> {
  public static final ProtoAdapter<A> ADAPTER = ProtoAdapter.newMessageAdapter(A.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.roots.B#ADAPTER"
  )
  public final B c;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.roots.D#ADAPTER"
  )
  public final D d;

  public A(B c, D d) {
    this(c, d, ByteString.EMPTY);
  }

  public A(B c, D d, ByteString unknownFields) {
    super(unknownFields);
    this.c = c;
    this.d = d;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.c = c;
    builder.d = d;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof A)) return false;
    A o = (A) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(c, o.c)
        && equals(d, o.d);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (c != null ? c.hashCode() : 0);
      result = result * 37 + (d != null ? d.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<A, Builder> {
    public B c;

    public D d;

    public Builder() {
    }

    public Builder c(B c) {
      this.c = c;
      return this;
    }

    public Builder d(D d) {
      this.d = d;
      return this;
    }

    @Override
    public A build() {
      return new A(c, d, buildUnknownFields());
    }
  }
}

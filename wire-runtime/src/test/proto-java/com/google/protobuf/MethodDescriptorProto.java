// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto at 227:1
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Describes a method of a service.
 */
public final class MethodDescriptorProto extends Message<MethodDescriptorProto, MethodDescriptorProto.Builder> {
  public static final ProtoAdapter<MethodDescriptorProto> ADAPTER = new ProtoAdapter_MethodDescriptorProto();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_INPUT_TYPE = "";

  public static final String DEFAULT_OUTPUT_TYPE = "";

  public static final Boolean DEFAULT_CLIENT_STREAMING = false;

  public static final Boolean DEFAULT_SERVER_STREAMING = false;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String input_type;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String output_type;

  @WireField(
      tag = 4,
      adapter = "com.google.protobuf.MethodOptions#ADAPTER"
  )
  public final MethodOptions options;

  /**
   * Identifies if client streams multiple client messages
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean client_streaming;

  /**
   * Identifies if server streams multiple server messages
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean server_streaming;

  public MethodDescriptorProto(String name, String input_type, String output_type, MethodOptions options, Boolean client_streaming, Boolean server_streaming) {
    this(name, input_type, output_type, options, client_streaming, server_streaming, ByteString.EMPTY);
  }

  public MethodDescriptorProto(String name, String input_type, String output_type, MethodOptions options, Boolean client_streaming, Boolean server_streaming, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.input_type = input_type;
    this.output_type = output_type;
    this.options = options;
    this.client_streaming = client_streaming;
    this.server_streaming = server_streaming;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.input_type = input_type;
    builder.output_type = output_type;
    builder.options = options;
    builder.client_streaming = client_streaming;
    builder.server_streaming = server_streaming;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodDescriptorProto)) return false;
    MethodDescriptorProto o = (MethodDescriptorProto) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(name, o.name)
        && Internal.equals(input_type, o.input_type)
        && Internal.equals(output_type, o.output_type)
        && Internal.equals(options, o.options)
        && Internal.equals(client_streaming, o.client_streaming)
        && Internal.equals(server_streaming, o.server_streaming);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (input_type != null ? input_type.hashCode() : 0);
      result = result * 37 + (output_type != null ? output_type.hashCode() : 0);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      result = result * 37 + (client_streaming != null ? client_streaming.hashCode() : 0);
      result = result * 37 + (server_streaming != null ? server_streaming.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (input_type != null) builder.append(", input_type=").append(input_type);
    if (output_type != null) builder.append(", output_type=").append(output_type);
    if (options != null) builder.append(", options=").append(options);
    if (client_streaming != null) builder.append(", client_streaming=").append(client_streaming);
    if (server_streaming != null) builder.append(", server_streaming=").append(server_streaming);
    return builder.replace(0, 2, "MethodDescriptorProto{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MethodDescriptorProto, Builder> {
    public String name;

    public String input_type;

    public String output_type;

    public MethodOptions options;

    public Boolean client_streaming;

    public Boolean server_streaming;

    public Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Input and output type names.  These are resolved in the same way as
     * FieldDescriptorProto.type_name, but must refer to a message type.
     */
    public Builder input_type(String input_type) {
      this.input_type = input_type;
      return this;
    }

    public Builder output_type(String output_type) {
      this.output_type = output_type;
      return this;
    }

    public Builder options(MethodOptions options) {
      this.options = options;
      return this;
    }

    /**
     * Identifies if client streams multiple client messages
     */
    public Builder client_streaming(Boolean client_streaming) {
      this.client_streaming = client_streaming;
      return this;
    }

    /**
     * Identifies if server streams multiple server messages
     */
    public Builder server_streaming(Boolean server_streaming) {
      this.server_streaming = server_streaming;
      return this;
    }

    @Override
    public MethodDescriptorProto build() {
      return new MethodDescriptorProto(name, input_type, output_type, options, client_streaming, server_streaming, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MethodDescriptorProto extends ProtoAdapter<MethodDescriptorProto> {
    ProtoAdapter_MethodDescriptorProto() {
      super(FieldEncoding.LENGTH_DELIMITED, MethodDescriptorProto.class);
    }

    @Override
    public int encodedSize(MethodDescriptorProto value) {
      return (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) : 0)
          + (value.input_type != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.input_type) : 0)
          + (value.output_type != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.output_type) : 0)
          + (value.options != null ? MethodOptions.ADAPTER.encodedSizeWithTag(4, value.options) : 0)
          + (value.client_streaming != null ? ProtoAdapter.BOOL.encodedSizeWithTag(5, value.client_streaming) : 0)
          + (value.server_streaming != null ? ProtoAdapter.BOOL.encodedSizeWithTag(6, value.server_streaming) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MethodDescriptorProto value) throws IOException {
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      if (value.input_type != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.input_type);
      if (value.output_type != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.output_type);
      if (value.options != null) MethodOptions.ADAPTER.encodeWithTag(writer, 4, value.options);
      if (value.client_streaming != null) ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.client_streaming);
      if (value.server_streaming != null) ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.server_streaming);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MethodDescriptorProto decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.input_type(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.output_type(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.options(MethodOptions.ADAPTER.decode(reader)); break;
          case 5: builder.client_streaming(ProtoAdapter.BOOL.decode(reader)); break;
          case 6: builder.server_streaming(ProtoAdapter.BOOL.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public MethodDescriptorProto redact(MethodDescriptorProto value) {
      Builder builder = value.newBuilder();
      if (builder.options != null) builder.options = MethodOptions.ADAPTER.redact(builder.options);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

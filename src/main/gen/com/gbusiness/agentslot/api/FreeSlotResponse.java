// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.FreeSlotResponse}
 *
 * <pre>
 * Response for FreeSlotRequest
 * </pre>
 */
public  final class FreeSlotResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.FreeSlotResponse)
    FreeSlotResponseOrBuilder {
  // Use FreeSlotResponse.newBuilder() to construct.
  private FreeSlotResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FreeSlotResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FreeSlotResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder subBuilder = null;
            if (apiError_ != null) {
              subBuilder = apiError_.toBuilder();
            }
            apiError_ = input.readMessage(com.gbusiness.agentslot.api.StatusOuterClass.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(apiError_);
              apiError_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_FreeSlotResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_FreeSlotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.FreeSlotResponse.class, com.gbusiness.agentslot.api.FreeSlotResponse.Builder.class);
  }

  public static final int API_ERROR_FIELD_NUMBER = 1;
  private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  public boolean hasApiError() {
    return apiError_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  public com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError() {
    return apiError_ == null ? com.gbusiness.agentslot.api.StatusOuterClass.Status.getDefaultInstance() : apiError_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  public com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder getApiErrorOrBuilder() {
    return getApiError();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (apiError_ != null) {
      output.writeMessage(1, getApiError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApiError());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.FreeSlotResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.FreeSlotResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.gbusiness.agentslot.api.FreeSlotResponse}
   *
   * <pre>
   * Response for FreeSlotRequest
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.FreeSlotResponse)
      com.gbusiness.agentslot.api.FreeSlotResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_FreeSlotResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_FreeSlotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.FreeSlotResponse.class, com.gbusiness.agentslot.api.FreeSlotResponse.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.FreeSlotResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (apiErrorBuilder_ == null) {
        apiError_ = null;
      } else {
        apiError_ = null;
        apiErrorBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_FreeSlotResponse_descriptor;
    }

    public com.gbusiness.agentslot.api.FreeSlotResponse getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.FreeSlotResponse.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.FreeSlotResponse build() {
      com.gbusiness.agentslot.api.FreeSlotResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.FreeSlotResponse buildPartial() {
      com.gbusiness.agentslot.api.FreeSlotResponse result = new com.gbusiness.agentslot.api.FreeSlotResponse(this);
      if (apiErrorBuilder_ == null) {
        result.apiError_ = apiError_;
      } else {
        result.apiError_ = apiErrorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.FreeSlotResponse) {
        return mergeFrom((com.gbusiness.agentslot.api.FreeSlotResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.FreeSlotResponse other) {
      if (other == com.gbusiness.agentslot.api.FreeSlotResponse.getDefaultInstance()) return this;
      if (other.hasApiError()) {
        mergeApiError(other.getApiError());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gbusiness.agentslot.api.FreeSlotResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.FreeSlotResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.StatusOuterClass.Status, com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder, com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder> apiErrorBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public boolean hasApiError() {
      return apiErrorBuilder_ != null || apiError_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError() {
      if (apiErrorBuilder_ == null) {
        return apiError_ == null ? com.gbusiness.agentslot.api.StatusOuterClass.Status.getDefaultInstance() : apiError_;
      } else {
        return apiErrorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public Builder setApiError(com.gbusiness.agentslot.api.StatusOuterClass.Status value) {
      if (apiErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiError_ = value;
        onChanged();
      } else {
        apiErrorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public Builder setApiError(
        com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder builderForValue) {
      if (apiErrorBuilder_ == null) {
        apiError_ = builderForValue.build();
        onChanged();
      } else {
        apiErrorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public Builder mergeApiError(com.gbusiness.agentslot.api.StatusOuterClass.Status value) {
      if (apiErrorBuilder_ == null) {
        if (apiError_ != null) {
          apiError_ =
            com.gbusiness.agentslot.api.StatusOuterClass.Status.newBuilder(apiError_).mergeFrom(value).buildPartial();
        } else {
          apiError_ = value;
        }
        onChanged();
      } else {
        apiErrorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public Builder clearApiError() {
      if (apiErrorBuilder_ == null) {
        apiError_ = null;
        onChanged();
      } else {
        apiError_ = null;
        apiErrorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder getApiErrorBuilder() {
      
      onChanged();
      return getApiErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder getApiErrorOrBuilder() {
      if (apiErrorBuilder_ != null) {
        return apiErrorBuilder_.getMessageOrBuilder();
      } else {
        return apiError_ == null ?
            com.gbusiness.agentslot.api.StatusOuterClass.Status.getDefaultInstance() : apiError_;
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.StatusOuterClass.Status, com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder, com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder> 
        getApiErrorFieldBuilder() {
      if (apiErrorBuilder_ == null) {
        apiErrorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gbusiness.agentslot.api.StatusOuterClass.Status, com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder, com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder>(
                getApiError(),
                getParentForChildren(),
                isClean());
        apiError_ = null;
      }
      return apiErrorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.FreeSlotResponse)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.FreeSlotResponse)
  private static final com.gbusiness.agentslot.api.FreeSlotResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.FreeSlotResponse();
  }

  public static com.gbusiness.agentslot.api.FreeSlotResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FreeSlotResponse>
      PARSER = new com.google.protobuf.AbstractParser<FreeSlotResponse>() {
    public FreeSlotResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FreeSlotResponse(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<FreeSlotResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FreeSlotResponse> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.FreeSlotResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.ListSlotsRequest}
 *
 * <pre>
 * Request to get the free slots.
 * </pre>
 */
public  final class ListSlotsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.ListSlotsRequest)
    ListSlotsRequestOrBuilder {
  // Use ListSlotsRequest.newBuilder() to construct.
  private ListSlotsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListSlotsRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListSlotsRequest(
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
            com.gbusiness.agentslot.api.TimeInterval.Builder subBuilder = null;
            if (timeInterval_ != null) {
              subBuilder = timeInterval_.toBuilder();
            }
            timeInterval_ = input.readMessage(com.gbusiness.agentslot.api.TimeInterval.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timeInterval_);
              timeInterval_ = subBuilder.buildPartial();
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
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_ListSlotsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_ListSlotsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.ListSlotsRequest.class, com.gbusiness.agentslot.api.ListSlotsRequest.Builder.class);
  }

  public static final int TIMEINTERVAL_FIELD_NUMBER = 1;
  private com.gbusiness.agentslot.api.TimeInterval timeInterval_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
   *
   * <pre>
   * Day for which to retrieve the free slots.
   * </pre>
   */
  public boolean hasTimeInterval() {
    return timeInterval_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
   *
   * <pre>
   * Day for which to retrieve the free slots.
   * </pre>
   */
  public com.gbusiness.agentslot.api.TimeInterval getTimeInterval() {
    return timeInterval_ == null ? com.gbusiness.agentslot.api.TimeInterval.getDefaultInstance() : timeInterval_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
   *
   * <pre>
   * Day for which to retrieve the free slots.
   * </pre>
   */
  public com.gbusiness.agentslot.api.TimeIntervalOrBuilder getTimeIntervalOrBuilder() {
    return getTimeInterval();
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
    if (timeInterval_ != null) {
      output.writeMessage(1, getTimeInterval());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimeInterval());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.ListSlotsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.ListSlotsRequest prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.ListSlotsRequest}
   *
   * <pre>
   * Request to get the free slots.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.ListSlotsRequest)
      com.gbusiness.agentslot.api.ListSlotsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_ListSlotsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_ListSlotsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.ListSlotsRequest.class, com.gbusiness.agentslot.api.ListSlotsRequest.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.ListSlotsRequest.newBuilder()
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
      if (timeIntervalBuilder_ == null) {
        timeInterval_ = null;
      } else {
        timeInterval_ = null;
        timeIntervalBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_ListSlotsRequest_descriptor;
    }

    public com.gbusiness.agentslot.api.ListSlotsRequest getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.ListSlotsRequest.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.ListSlotsRequest build() {
      com.gbusiness.agentslot.api.ListSlotsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.ListSlotsRequest buildPartial() {
      com.gbusiness.agentslot.api.ListSlotsRequest result = new com.gbusiness.agentslot.api.ListSlotsRequest(this);
      if (timeIntervalBuilder_ == null) {
        result.timeInterval_ = timeInterval_;
      } else {
        result.timeInterval_ = timeIntervalBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.ListSlotsRequest) {
        return mergeFrom((com.gbusiness.agentslot.api.ListSlotsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.ListSlotsRequest other) {
      if (other == com.gbusiness.agentslot.api.ListSlotsRequest.getDefaultInstance()) return this;
      if (other.hasTimeInterval()) {
        mergeTimeInterval(other.getTimeInterval());
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
      com.gbusiness.agentslot.api.ListSlotsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.ListSlotsRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gbusiness.agentslot.api.TimeInterval timeInterval_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder> timeIntervalBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public boolean hasTimeInterval() {
      return timeIntervalBuilder_ != null || timeInterval_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval getTimeInterval() {
      if (timeIntervalBuilder_ == null) {
        return timeInterval_ == null ? com.gbusiness.agentslot.api.TimeInterval.getDefaultInstance() : timeInterval_;
      } else {
        return timeIntervalBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public Builder setTimeInterval(com.gbusiness.agentslot.api.TimeInterval value) {
      if (timeIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeInterval_ = value;
        onChanged();
      } else {
        timeIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public Builder setTimeInterval(
        com.gbusiness.agentslot.api.TimeInterval.Builder builderForValue) {
      if (timeIntervalBuilder_ == null) {
        timeInterval_ = builderForValue.build();
        onChanged();
      } else {
        timeIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public Builder mergeTimeInterval(com.gbusiness.agentslot.api.TimeInterval value) {
      if (timeIntervalBuilder_ == null) {
        if (timeInterval_ != null) {
          timeInterval_ =
            com.gbusiness.agentslot.api.TimeInterval.newBuilder(timeInterval_).mergeFrom(value).buildPartial();
        } else {
          timeInterval_ = value;
        }
        onChanged();
      } else {
        timeIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public Builder clearTimeInterval() {
      if (timeIntervalBuilder_ == null) {
        timeInterval_ = null;
        onChanged();
      } else {
        timeInterval_ = null;
        timeIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval.Builder getTimeIntervalBuilder() {
      
      onChanged();
      return getTimeIntervalFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeIntervalOrBuilder getTimeIntervalOrBuilder() {
      if (timeIntervalBuilder_ != null) {
        return timeIntervalBuilder_.getMessageOrBuilder();
      } else {
        return timeInterval_ == null ?
            com.gbusiness.agentslot.api.TimeInterval.getDefaultInstance() : timeInterval_;
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.TimeInterval timeInterval = 1;</code>
     *
     * <pre>
     * Day for which to retrieve the free slots.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder> 
        getTimeIntervalFieldBuilder() {
      if (timeIntervalBuilder_ == null) {
        timeIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder>(
                getTimeInterval(),
                getParentForChildren(),
                isClean());
        timeInterval_ = null;
      }
      return timeIntervalBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.ListSlotsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.ListSlotsRequest)
  private static final com.gbusiness.agentslot.api.ListSlotsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.ListSlotsRequest();
  }

  public static com.gbusiness.agentslot.api.ListSlotsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSlotsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListSlotsRequest>() {
    public ListSlotsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListSlotsRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ListSlotsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSlotsRequest> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.ListSlotsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


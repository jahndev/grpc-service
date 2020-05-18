// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.RemoveMeetingProfileRequest}
 *
 * <pre>
 * Request to remove an existing meeting profile.
 * </pre>
 */
public  final class RemoveMeetingProfileRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.RemoveMeetingProfileRequest)
    RemoveMeetingProfileRequestOrBuilder {
  // Use RemoveMeetingProfileRequest.newBuilder() to construct.
  private RemoveMeetingProfileRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RemoveMeetingProfileRequest() {
    meetingProfileId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RemoveMeetingProfileRequest(
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
            String s = input.readStringRequireUtf8();

            meetingProfileId_ = s;
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
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RemoveMeetingProfileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RemoveMeetingProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.class, com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.Builder.class);
  }

  public static final int MEETING_PROFILE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object meetingProfileId_;
  /**
   * <code>optional string meeting_profile_id = 1;</code>
   *
   * <pre>
   * Id of the meeting profile to be removed.
   * </pre>
   */
  public java.lang.String getMeetingProfileId() {
    java.lang.Object ref = meetingProfileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      meetingProfileId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string meeting_profile_id = 1;</code>
   *
   * <pre>
   * Id of the meeting profile to be removed.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getMeetingProfileIdBytes() {
    java.lang.Object ref = meetingProfileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      meetingProfileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMeetingProfileIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, meetingProfileId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMeetingProfileIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, meetingProfileId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.RemoveMeetingProfileRequest}
   *
   * <pre>
   * Request to remove an existing meeting profile.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.RemoveMeetingProfileRequest)
      com.gbusiness.agentslot.api.RemoveMeetingProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RemoveMeetingProfileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RemoveMeetingProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.class, com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.newBuilder()
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
      meetingProfileId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RemoveMeetingProfileRequest_descriptor;
    }

    public com.gbusiness.agentslot.api.RemoveMeetingProfileRequest getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.RemoveMeetingProfileRequest build() {
      com.gbusiness.agentslot.api.RemoveMeetingProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.RemoveMeetingProfileRequest buildPartial() {
      com.gbusiness.agentslot.api.RemoveMeetingProfileRequest result = new com.gbusiness.agentslot.api.RemoveMeetingProfileRequest(this);
      result.meetingProfileId_ = meetingProfileId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.RemoveMeetingProfileRequest) {
        return mergeFrom((com.gbusiness.agentslot.api.RemoveMeetingProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.RemoveMeetingProfileRequest other) {
      if (other == com.gbusiness.agentslot.api.RemoveMeetingProfileRequest.getDefaultInstance()) return this;
      if (!other.getMeetingProfileId().isEmpty()) {
        meetingProfileId_ = other.meetingProfileId_;
        onChanged();
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
      com.gbusiness.agentslot.api.RemoveMeetingProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.RemoveMeetingProfileRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object meetingProfileId_ = "";
    /**
     * <code>optional string meeting_profile_id = 1;</code>
     *
     * <pre>
     * Id of the meeting profile to be removed.
     * </pre>
     */
    public java.lang.String getMeetingProfileId() {
      java.lang.Object ref = meetingProfileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        meetingProfileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string meeting_profile_id = 1;</code>
     *
     * <pre>
     * Id of the meeting profile to be removed.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMeetingProfileIdBytes() {
      java.lang.Object ref = meetingProfileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        meetingProfileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string meeting_profile_id = 1;</code>
     *
     * <pre>
     * Id of the meeting profile to be removed.
     * </pre>
     */
    public Builder setMeetingProfileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      meetingProfileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string meeting_profile_id = 1;</code>
     *
     * <pre>
     * Id of the meeting profile to be removed.
     * </pre>
     */
    public Builder clearMeetingProfileId() {
      
      meetingProfileId_ = getDefaultInstance().getMeetingProfileId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string meeting_profile_id = 1;</code>
     *
     * <pre>
     * Id of the meeting profile to be removed.
     * </pre>
     */
    public Builder setMeetingProfileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      meetingProfileId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.RemoveMeetingProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.RemoveMeetingProfileRequest)
  private static final com.gbusiness.agentslot.api.RemoveMeetingProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.RemoveMeetingProfileRequest();
  }

  public static com.gbusiness.agentslot.api.RemoveMeetingProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveMeetingProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveMeetingProfileRequest>() {
    public RemoveMeetingProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new RemoveMeetingProfileRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<RemoveMeetingProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveMeetingProfileRequest> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.RemoveMeetingProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

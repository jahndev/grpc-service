// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.GetMeetingProfilesRequest}
 *
 * <pre>
 * Request for retrieving meeting profiles.
 * </pre>
 */
public  final class GetMeetingProfilesRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.GetMeetingProfilesRequest)
    GetMeetingProfilesRequestOrBuilder {
  // Use GetMeetingProfilesRequest.newBuilder() to construct.
  private GetMeetingProfilesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetMeetingProfilesRequest() {
    meetingProfileId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetMeetingProfilesRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              meetingProfileId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            meetingProfileId_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        meetingProfileId_ = meetingProfileId_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.GetMeetingProfilesRequest.class, com.gbusiness.agentslot.api.GetMeetingProfilesRequest.Builder.class);
  }

  public static final int MEETING_PROFILE_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList meetingProfileId_;
  /**
   * <code>repeated string meeting_profile_id = 1;</code>
   *
   * <pre>
   * List of meeting profile ids to retrieve.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getMeetingProfileIdList() {
    return meetingProfileId_;
  }
  /**
   * <code>repeated string meeting_profile_id = 1;</code>
   *
   * <pre>
   * List of meeting profile ids to retrieve.
   * </pre>
   */
  public int getMeetingProfileIdCount() {
    return meetingProfileId_.size();
  }
  /**
   * <code>repeated string meeting_profile_id = 1;</code>
   *
   * <pre>
   * List of meeting profile ids to retrieve.
   * </pre>
   */
  public java.lang.String getMeetingProfileId(int index) {
    return meetingProfileId_.get(index);
  }
  /**
   * <code>repeated string meeting_profile_id = 1;</code>
   *
   * <pre>
   * List of meeting profile ids to retrieve.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getMeetingProfileIdBytes(int index) {
    return meetingProfileId_.getByteString(index);
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
    for (int i = 0; i < meetingProfileId_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, meetingProfileId_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < meetingProfileId_.size(); i++) {
        dataSize += computeStringSizeNoTag(meetingProfileId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMeetingProfileIdList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.GetMeetingProfilesRequest prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.GetMeetingProfilesRequest}
   *
   * <pre>
   * Request for retrieving meeting profiles.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.GetMeetingProfilesRequest)
      com.gbusiness.agentslot.api.GetMeetingProfilesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.GetMeetingProfilesRequest.class, com.gbusiness.agentslot.api.GetMeetingProfilesRequest.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.GetMeetingProfilesRequest.newBuilder()
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
      meetingProfileId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesRequest_descriptor;
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesRequest getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.GetMeetingProfilesRequest.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesRequest build() {
      com.gbusiness.agentslot.api.GetMeetingProfilesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesRequest buildPartial() {
      com.gbusiness.agentslot.api.GetMeetingProfilesRequest result = new com.gbusiness.agentslot.api.GetMeetingProfilesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        meetingProfileId_ = meetingProfileId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.meetingProfileId_ = meetingProfileId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.GetMeetingProfilesRequest) {
        return mergeFrom((com.gbusiness.agentslot.api.GetMeetingProfilesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.GetMeetingProfilesRequest other) {
      if (other == com.gbusiness.agentslot.api.GetMeetingProfilesRequest.getDefaultInstance()) return this;
      if (!other.meetingProfileId_.isEmpty()) {
        if (meetingProfileId_.isEmpty()) {
          meetingProfileId_ = other.meetingProfileId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMeetingProfileIdIsMutable();
          meetingProfileId_.addAll(other.meetingProfileId_);
        }
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
      com.gbusiness.agentslot.api.GetMeetingProfilesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.GetMeetingProfilesRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList meetingProfileId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMeetingProfileIdIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        meetingProfileId_ = new com.google.protobuf.LazyStringArrayList(meetingProfileId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getMeetingProfileIdList() {
      return meetingProfileId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public int getMeetingProfileIdCount() {
      return meetingProfileId_.size();
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public java.lang.String getMeetingProfileId(int index) {
      return meetingProfileId_.get(index);
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMeetingProfileIdBytes(int index) {
      return meetingProfileId_.getByteString(index);
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public Builder setMeetingProfileId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMeetingProfileIdIsMutable();
      meetingProfileId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public Builder addMeetingProfileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMeetingProfileIdIsMutable();
      meetingProfileId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public Builder addAllMeetingProfileId(
        java.lang.Iterable<java.lang.String> values) {
      ensureMeetingProfileIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, meetingProfileId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public Builder clearMeetingProfileId() {
      meetingProfileId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string meeting_profile_id = 1;</code>
     *
     * <pre>
     * List of meeting profile ids to retrieve.
     * </pre>
     */
    public Builder addMeetingProfileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMeetingProfileIdIsMutable();
      meetingProfileId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.GetMeetingProfilesRequest)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.GetMeetingProfilesRequest)
  private static final com.gbusiness.agentslot.api.GetMeetingProfilesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.GetMeetingProfilesRequest();
  }

  public static com.gbusiness.agentslot.api.GetMeetingProfilesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMeetingProfilesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetMeetingProfilesRequest>() {
    public GetMeetingProfilesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetMeetingProfilesRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetMeetingProfilesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMeetingProfilesRequest> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.GetMeetingProfilesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


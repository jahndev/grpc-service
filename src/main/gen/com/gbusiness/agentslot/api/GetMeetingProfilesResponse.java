// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.GetMeetingProfilesResponse}
 *
 * <pre>
 * Response for GetMeetingsProfileRequest.
 * </pre>
 */
public  final class GetMeetingProfilesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.GetMeetingProfilesResponse)
    GetMeetingProfilesResponseOrBuilder {
  // Use GetMeetingProfilesResponse.newBuilder() to construct.
  private GetMeetingProfilesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetMeetingProfilesResponse() {
    meetingProfiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetMeetingProfilesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              meetingProfiles_ = new java.util.ArrayList<com.gbusiness.agentslot.api.MeetingProfile>();
              mutable_bitField0_ |= 0x00000001;
            }
            meetingProfiles_.add(input.readMessage(com.gbusiness.agentslot.api.MeetingProfile.parser(), extensionRegistry));
            break;
          }
          case 18: {
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        meetingProfiles_ = java.util.Collections.unmodifiableList(meetingProfiles_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.GetMeetingProfilesResponse.class, com.gbusiness.agentslot.api.GetMeetingProfilesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MEETING_PROFILES_FIELD_NUMBER = 1;
  private java.util.List<com.gbusiness.agentslot.api.MeetingProfile> meetingProfiles_;
  /**
   * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
   *
   * <pre>
   * List of retrieved meeting profiles.
   * </pre>
   */
  public java.util.List<com.gbusiness.agentslot.api.MeetingProfile> getMeetingProfilesList() {
    return meetingProfiles_;
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
   *
   * <pre>
   * List of retrieved meeting profiles.
   * </pre>
   */
  public java.util.List<? extends com.gbusiness.agentslot.api.MeetingProfileOrBuilder> 
      getMeetingProfilesOrBuilderList() {
    return meetingProfiles_;
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
   *
   * <pre>
   * List of retrieved meeting profiles.
   * </pre>
   */
  public int getMeetingProfilesCount() {
    return meetingProfiles_.size();
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
   *
   * <pre>
   * List of retrieved meeting profiles.
   * </pre>
   */
  public com.gbusiness.agentslot.api.MeetingProfile getMeetingProfiles(int index) {
    return meetingProfiles_.get(index);
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
   *
   * <pre>
   * List of retrieved meeting profiles.
   * </pre>
   */
  public com.gbusiness.agentslot.api.MeetingProfileOrBuilder getMeetingProfilesOrBuilder(
      int index) {
    return meetingProfiles_.get(index);
  }

  public static final int API_ERROR_FIELD_NUMBER = 2;
  private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
   * </pre>
   */
  public boolean hasApiError() {
    return apiError_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
   * </pre>
   */
  public com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError() {
    return apiError_ == null ? com.gbusiness.agentslot.api.StatusOuterClass.Status.getDefaultInstance() : apiError_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
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
    for (int i = 0; i < meetingProfiles_.size(); i++) {
      output.writeMessage(1, meetingProfiles_.get(i));
    }
    if (apiError_ != null) {
      output.writeMessage(2, getApiError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < meetingProfiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, meetingProfiles_.get(i));
    }
    if (apiError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApiError());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.GetMeetingProfilesResponse prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.GetMeetingProfilesResponse}
   *
   * <pre>
   * Response for GetMeetingsProfileRequest.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.GetMeetingProfilesResponse)
      com.gbusiness.agentslot.api.GetMeetingProfilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.GetMeetingProfilesResponse.class, com.gbusiness.agentslot.api.GetMeetingProfilesResponse.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.GetMeetingProfilesResponse.newBuilder()
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
        getMeetingProfilesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (meetingProfilesBuilder_ == null) {
        meetingProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        meetingProfilesBuilder_.clear();
      }
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
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetMeetingProfilesResponse_descriptor;
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesResponse getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.GetMeetingProfilesResponse.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesResponse build() {
      com.gbusiness.agentslot.api.GetMeetingProfilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.GetMeetingProfilesResponse buildPartial() {
      com.gbusiness.agentslot.api.GetMeetingProfilesResponse result = new com.gbusiness.agentslot.api.GetMeetingProfilesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (meetingProfilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          meetingProfiles_ = java.util.Collections.unmodifiableList(meetingProfiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.meetingProfiles_ = meetingProfiles_;
      } else {
        result.meetingProfiles_ = meetingProfilesBuilder_.build();
      }
      if (apiErrorBuilder_ == null) {
        result.apiError_ = apiError_;
      } else {
        result.apiError_ = apiErrorBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.GetMeetingProfilesResponse) {
        return mergeFrom((com.gbusiness.agentslot.api.GetMeetingProfilesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.GetMeetingProfilesResponse other) {
      if (other == com.gbusiness.agentslot.api.GetMeetingProfilesResponse.getDefaultInstance()) return this;
      if (meetingProfilesBuilder_ == null) {
        if (!other.meetingProfiles_.isEmpty()) {
          if (meetingProfiles_.isEmpty()) {
            meetingProfiles_ = other.meetingProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMeetingProfilesIsMutable();
            meetingProfiles_.addAll(other.meetingProfiles_);
          }
          onChanged();
        }
      } else {
        if (!other.meetingProfiles_.isEmpty()) {
          if (meetingProfilesBuilder_.isEmpty()) {
            meetingProfilesBuilder_.dispose();
            meetingProfilesBuilder_ = null;
            meetingProfiles_ = other.meetingProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            meetingProfilesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getMeetingProfilesFieldBuilder() : null;
          } else {
            meetingProfilesBuilder_.addAllMessages(other.meetingProfiles_);
          }
        }
      }
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
      com.gbusiness.agentslot.api.GetMeetingProfilesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.GetMeetingProfilesResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.gbusiness.agentslot.api.MeetingProfile> meetingProfiles_ =
      java.util.Collections.emptyList();
    private void ensureMeetingProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        meetingProfiles_ = new java.util.ArrayList<com.gbusiness.agentslot.api.MeetingProfile>(meetingProfiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder> meetingProfilesBuilder_;

    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public java.util.List<com.gbusiness.agentslot.api.MeetingProfile> getMeetingProfilesList() {
      if (meetingProfilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(meetingProfiles_);
      } else {
        return meetingProfilesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public int getMeetingProfilesCount() {
      if (meetingProfilesBuilder_ == null) {
        return meetingProfiles_.size();
      } else {
        return meetingProfilesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile getMeetingProfiles(int index) {
      if (meetingProfilesBuilder_ == null) {
        return meetingProfiles_.get(index);
      } else {
        return meetingProfilesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder setMeetingProfiles(
        int index, com.gbusiness.agentslot.api.MeetingProfile value) {
      if (meetingProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.set(index, value);
        onChanged();
      } else {
        meetingProfilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder setMeetingProfiles(
        int index, com.gbusiness.agentslot.api.MeetingProfile.Builder builderForValue) {
      if (meetingProfilesBuilder_ == null) {
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        meetingProfilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder addMeetingProfiles(com.gbusiness.agentslot.api.MeetingProfile value) {
      if (meetingProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.add(value);
        onChanged();
      } else {
        meetingProfilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder addMeetingProfiles(
        int index, com.gbusiness.agentslot.api.MeetingProfile value) {
      if (meetingProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.add(index, value);
        onChanged();
      } else {
        meetingProfilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder addMeetingProfiles(
        com.gbusiness.agentslot.api.MeetingProfile.Builder builderForValue) {
      if (meetingProfilesBuilder_ == null) {
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.add(builderForValue.build());
        onChanged();
      } else {
        meetingProfilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder addMeetingProfiles(
        int index, com.gbusiness.agentslot.api.MeetingProfile.Builder builderForValue) {
      if (meetingProfilesBuilder_ == null) {
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        meetingProfilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder addAllMeetingProfiles(
        java.lang.Iterable<? extends com.gbusiness.agentslot.api.MeetingProfile> values) {
      if (meetingProfilesBuilder_ == null) {
        ensureMeetingProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, meetingProfiles_);
        onChanged();
      } else {
        meetingProfilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder clearMeetingProfiles() {
      if (meetingProfilesBuilder_ == null) {
        meetingProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        meetingProfilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public Builder removeMeetingProfiles(int index) {
      if (meetingProfilesBuilder_ == null) {
        ensureMeetingProfilesIsMutable();
        meetingProfiles_.remove(index);
        onChanged();
      } else {
        meetingProfilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile.Builder getMeetingProfilesBuilder(
        int index) {
      return getMeetingProfilesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfileOrBuilder getMeetingProfilesOrBuilder(
        int index) {
      if (meetingProfilesBuilder_ == null) {
        return meetingProfiles_.get(index);  } else {
        return meetingProfilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public java.util.List<? extends com.gbusiness.agentslot.api.MeetingProfileOrBuilder> 
         getMeetingProfilesOrBuilderList() {
      if (meetingProfilesBuilder_ != null) {
        return meetingProfilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(meetingProfiles_);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile.Builder addMeetingProfilesBuilder() {
      return getMeetingProfilesFieldBuilder().addBuilder(
          com.gbusiness.agentslot.api.MeetingProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile.Builder addMeetingProfilesBuilder(
        int index) {
      return getMeetingProfilesFieldBuilder().addBuilder(
          index, com.gbusiness.agentslot.api.MeetingProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.MeetingProfile meeting_profiles = 1;</code>
     *
     * <pre>
     * List of retrieved meeting profiles.
     * </pre>
     */
    public java.util.List<com.gbusiness.agentslot.api.MeetingProfile.Builder> 
         getMeetingProfilesBuilderList() {
      return getMeetingProfilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder> 
        getMeetingProfilesFieldBuilder() {
      if (meetingProfilesBuilder_ == null) {
        meetingProfilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder>(
                meetingProfiles_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        meetingProfiles_ = null;
      }
      return meetingProfilesBuilder_;
    }

    private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.StatusOuterClass.Status, com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder, com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder> apiErrorBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
     * </pre>
     */
    public boolean hasApiError() {
      return apiErrorBuilder_ != null || apiError_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
     * </pre>
     */
    public com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder getApiErrorBuilder() {
      
      onChanged();
      return getApiErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
     *
     * <pre>
     * If any error occurred, this field is set with proper information.
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


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.GetMeetingProfilesResponse)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.GetMeetingProfilesResponse)
  private static final com.gbusiness.agentslot.api.GetMeetingProfilesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.GetMeetingProfilesResponse();
  }

  public static com.gbusiness.agentslot.api.GetMeetingProfilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMeetingProfilesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetMeetingProfilesResponse>() {
    public GetMeetingProfilesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetMeetingProfilesResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetMeetingProfilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMeetingProfilesResponse> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.GetMeetingProfilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

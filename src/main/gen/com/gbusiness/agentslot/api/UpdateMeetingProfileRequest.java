// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.UpdateMeetingProfileRequest}
 *
 * <pre>
 * Request to update an existing meeting profile.
 * </pre>
 */
public  final class UpdateMeetingProfileRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.UpdateMeetingProfileRequest)
    UpdateMeetingProfileRequestOrBuilder {
  // Use UpdateMeetingProfileRequest.newBuilder() to construct.
  private UpdateMeetingProfileRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateMeetingProfileRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateMeetingProfileRequest(
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
            com.gbusiness.agentslot.api.MeetingProfile.Builder subBuilder = null;
            if (meetingProfile_ != null) {
              subBuilder = meetingProfile_.toBuilder();
            }
            meetingProfile_ = input.readMessage(com.gbusiness.agentslot.api.MeetingProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(meetingProfile_);
              meetingProfile_ = subBuilder.buildPartial();
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
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_UpdateMeetingProfileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_UpdateMeetingProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.class, com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.Builder.class);
  }

  public static final int MEETING_PROFILE_FIELD_NUMBER = 1;
  private com.gbusiness.agentslot.api.MeetingProfile meetingProfile_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
   *
   * <pre>
   * MeetingProfile object containing the information of the meeting prpfile.
   * The meeting_profile_id is required and can not be changed.
   * </pre>
   */
  public boolean hasMeetingProfile() {
    return meetingProfile_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
   *
   * <pre>
   * MeetingProfile object containing the information of the meeting prpfile.
   * The meeting_profile_id is required and can not be changed.
   * </pre>
   */
  public com.gbusiness.agentslot.api.MeetingProfile getMeetingProfile() {
    return meetingProfile_ == null ? com.gbusiness.agentslot.api.MeetingProfile.getDefaultInstance() : meetingProfile_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
   *
   * <pre>
   * MeetingProfile object containing the information of the meeting prpfile.
   * The meeting_profile_id is required and can not be changed.
   * </pre>
   */
  public com.gbusiness.agentslot.api.MeetingProfileOrBuilder getMeetingProfileOrBuilder() {
    return getMeetingProfile();
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
    if (meetingProfile_ != null) {
      output.writeMessage(1, getMeetingProfile());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (meetingProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMeetingProfile());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.UpdateMeetingProfileRequest}
   *
   * <pre>
   * Request to update an existing meeting profile.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.UpdateMeetingProfileRequest)
      com.gbusiness.agentslot.api.UpdateMeetingProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_UpdateMeetingProfileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_UpdateMeetingProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.class, com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.newBuilder()
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
      if (meetingProfileBuilder_ == null) {
        meetingProfile_ = null;
      } else {
        meetingProfile_ = null;
        meetingProfileBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_UpdateMeetingProfileRequest_descriptor;
    }

    public com.gbusiness.agentslot.api.UpdateMeetingProfileRequest getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.UpdateMeetingProfileRequest build() {
      com.gbusiness.agentslot.api.UpdateMeetingProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.UpdateMeetingProfileRequest buildPartial() {
      com.gbusiness.agentslot.api.UpdateMeetingProfileRequest result = new com.gbusiness.agentslot.api.UpdateMeetingProfileRequest(this);
      if (meetingProfileBuilder_ == null) {
        result.meetingProfile_ = meetingProfile_;
      } else {
        result.meetingProfile_ = meetingProfileBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.UpdateMeetingProfileRequest) {
        return mergeFrom((com.gbusiness.agentslot.api.UpdateMeetingProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.UpdateMeetingProfileRequest other) {
      if (other == com.gbusiness.agentslot.api.UpdateMeetingProfileRequest.getDefaultInstance()) return this;
      if (other.hasMeetingProfile()) {
        mergeMeetingProfile(other.getMeetingProfile());
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
      com.gbusiness.agentslot.api.UpdateMeetingProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.UpdateMeetingProfileRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gbusiness.agentslot.api.MeetingProfile meetingProfile_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder> meetingProfileBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public boolean hasMeetingProfile() {
      return meetingProfileBuilder_ != null || meetingProfile_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile getMeetingProfile() {
      if (meetingProfileBuilder_ == null) {
        return meetingProfile_ == null ? com.gbusiness.agentslot.api.MeetingProfile.getDefaultInstance() : meetingProfile_;
      } else {
        return meetingProfileBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public Builder setMeetingProfile(com.gbusiness.agentslot.api.MeetingProfile value) {
      if (meetingProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meetingProfile_ = value;
        onChanged();
      } else {
        meetingProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public Builder setMeetingProfile(
        com.gbusiness.agentslot.api.MeetingProfile.Builder builderForValue) {
      if (meetingProfileBuilder_ == null) {
        meetingProfile_ = builderForValue.build();
        onChanged();
      } else {
        meetingProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public Builder mergeMeetingProfile(com.gbusiness.agentslot.api.MeetingProfile value) {
      if (meetingProfileBuilder_ == null) {
        if (meetingProfile_ != null) {
          meetingProfile_ =
            com.gbusiness.agentslot.api.MeetingProfile.newBuilder(meetingProfile_).mergeFrom(value).buildPartial();
        } else {
          meetingProfile_ = value;
        }
        onChanged();
      } else {
        meetingProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public Builder clearMeetingProfile() {
      if (meetingProfileBuilder_ == null) {
        meetingProfile_ = null;
        onChanged();
      } else {
        meetingProfile_ = null;
        meetingProfileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfile.Builder getMeetingProfileBuilder() {
      
      onChanged();
      return getMeetingProfileFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    public com.gbusiness.agentslot.api.MeetingProfileOrBuilder getMeetingProfileOrBuilder() {
      if (meetingProfileBuilder_ != null) {
        return meetingProfileBuilder_.getMessageOrBuilder();
      } else {
        return meetingProfile_ == null ?
            com.gbusiness.agentslot.api.MeetingProfile.getDefaultInstance() : meetingProfile_;
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.MeetingProfile meeting_profile = 1;</code>
     *
     * <pre>
     * MeetingProfile object containing the information of the meeting prpfile.
     * The meeting_profile_id is required and can not be changed.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder> 
        getMeetingProfileFieldBuilder() {
      if (meetingProfileBuilder_ == null) {
        meetingProfileBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gbusiness.agentslot.api.MeetingProfile, com.gbusiness.agentslot.api.MeetingProfile.Builder, com.gbusiness.agentslot.api.MeetingProfileOrBuilder>(
                getMeetingProfile(),
                getParentForChildren(),
                isClean());
        meetingProfile_ = null;
      }
      return meetingProfileBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.UpdateMeetingProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.UpdateMeetingProfileRequest)
  private static final com.gbusiness.agentslot.api.UpdateMeetingProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.UpdateMeetingProfileRequest();
  }

  public static com.gbusiness.agentslot.api.UpdateMeetingProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMeetingProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMeetingProfileRequest>() {
    public UpdateMeetingProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateMeetingProfileRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UpdateMeetingProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMeetingProfileRequest> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.UpdateMeetingProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


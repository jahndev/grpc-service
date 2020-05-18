// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse}
 *
 * <pre>
 * Response for GetAgentSlotsSettings
 * </pre>
 */
public  final class GetAgentSlotsSettingsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)
    GetAgentSlotsSettingsResponseOrBuilder {
  // Use GetAgentSlotsSettingsResponse.newBuilder() to construct.
  private GetAgentSlotsSettingsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetAgentSlotsSettingsResponse() {
    workingHours_ = java.util.Collections.emptyList();
    timeBetweenMeetingsInMinutes_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetAgentSlotsSettingsResponse(
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
              workingHours_ = new java.util.ArrayList<com.gbusiness.agentslot.api.TimeInterval>();
              mutable_bitField0_ |= 0x00000001;
            }
            workingHours_.add(input.readMessage(com.gbusiness.agentslot.api.TimeInterval.parser(), extensionRegistry));
            break;
          }
          case 16: {

            timeBetweenMeetingsInMinutes_ = input.readInt32();
            break;
          }
          case 26: {
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
        workingHours_ = java.util.Collections.unmodifiableList(workingHours_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetAgentSlotsSettingsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetAgentSlotsSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.class, com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int WORKING_HOURS_FIELD_NUMBER = 1;
  private java.util.List<com.gbusiness.agentslot.api.TimeInterval> workingHours_;
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  public java.util.List<com.gbusiness.agentslot.api.TimeInterval> getWorkingHoursList() {
    return workingHours_;
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  public java.util.List<? extends com.gbusiness.agentslot.api.TimeIntervalOrBuilder> 
      getWorkingHoursOrBuilderList() {
    return workingHours_;
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  public int getWorkingHoursCount() {
    return workingHours_.size();
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  public com.gbusiness.agentslot.api.TimeInterval getWorkingHours(int index) {
    return workingHours_.get(index);
  }
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  public com.gbusiness.agentslot.api.TimeIntervalOrBuilder getWorkingHoursOrBuilder(
      int index) {
    return workingHours_.get(index);
  }

  public static final int TIME_BETWEEN_MEETINGS_IN_MINUTES_FIELD_NUMBER = 2;
  private int timeBetweenMeetingsInMinutes_;
  /**
   * <code>optional int32 time_between_meetings_in_minutes = 2;</code>
   *
   * <pre>
   * Time between each meeting start time presented to the end user.
   * </pre>
   */
  public int getTimeBetweenMeetingsInMinutes() {
    return timeBetweenMeetingsInMinutes_;
  }

  public static final int API_ERROR_FIELD_NUMBER = 3;
  private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  public boolean hasApiError() {
    return apiError_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  public com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError() {
    return apiError_ == null ? com.gbusiness.agentslot.api.StatusOuterClass.Status.getDefaultInstance() : apiError_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
    for (int i = 0; i < workingHours_.size(); i++) {
      output.writeMessage(1, workingHours_.get(i));
    }
    if (timeBetweenMeetingsInMinutes_ != 0) {
      output.writeInt32(2, timeBetweenMeetingsInMinutes_);
    }
    if (apiError_ != null) {
      output.writeMessage(3, getApiError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < workingHours_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, workingHours_.get(i));
    }
    if (timeBetweenMeetingsInMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, timeBetweenMeetingsInMinutes_);
    }
    if (apiError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getApiError());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse}
   *
   * <pre>
   * Response for GetAgentSlotsSettings
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)
      com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetAgentSlotsSettingsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetAgentSlotsSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.class, com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.newBuilder()
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
        getWorkingHoursFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (workingHoursBuilder_ == null) {
        workingHours_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        workingHoursBuilder_.clear();
      }
      timeBetweenMeetingsInMinutes_ = 0;

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
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_GetAgentSlotsSettingsResponse_descriptor;
    }

    public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse build() {
      com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse buildPartial() {
      com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse result = new com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (workingHoursBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          workingHours_ = java.util.Collections.unmodifiableList(workingHours_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.workingHours_ = workingHours_;
      } else {
        result.workingHours_ = workingHoursBuilder_.build();
      }
      result.timeBetweenMeetingsInMinutes_ = timeBetweenMeetingsInMinutes_;
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
      if (other instanceof com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse) {
        return mergeFrom((com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse other) {
      if (other == com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse.getDefaultInstance()) return this;
      if (workingHoursBuilder_ == null) {
        if (!other.workingHours_.isEmpty()) {
          if (workingHours_.isEmpty()) {
            workingHours_ = other.workingHours_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorkingHoursIsMutable();
            workingHours_.addAll(other.workingHours_);
          }
          onChanged();
        }
      } else {
        if (!other.workingHours_.isEmpty()) {
          if (workingHoursBuilder_.isEmpty()) {
            workingHoursBuilder_.dispose();
            workingHoursBuilder_ = null;
            workingHours_ = other.workingHours_;
            bitField0_ = (bitField0_ & ~0x00000001);
            workingHoursBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getWorkingHoursFieldBuilder() : null;
          } else {
            workingHoursBuilder_.addAllMessages(other.workingHours_);
          }
        }
      }
      if (other.getTimeBetweenMeetingsInMinutes() != 0) {
        setTimeBetweenMeetingsInMinutes(other.getTimeBetweenMeetingsInMinutes());
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
      com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.gbusiness.agentslot.api.TimeInterval> workingHours_ =
      java.util.Collections.emptyList();
    private void ensureWorkingHoursIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        workingHours_ = new java.util.ArrayList<com.gbusiness.agentslot.api.TimeInterval>(workingHours_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder> workingHoursBuilder_;

    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public java.util.List<com.gbusiness.agentslot.api.TimeInterval> getWorkingHoursList() {
      if (workingHoursBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workingHours_);
      } else {
        return workingHoursBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public int getWorkingHoursCount() {
      if (workingHoursBuilder_ == null) {
        return workingHours_.size();
      } else {
        return workingHoursBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval getWorkingHours(int index) {
      if (workingHoursBuilder_ == null) {
        return workingHours_.get(index);
      } else {
        return workingHoursBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder setWorkingHours(
        int index, com.gbusiness.agentslot.api.TimeInterval value) {
      if (workingHoursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkingHoursIsMutable();
        workingHours_.set(index, value);
        onChanged();
      } else {
        workingHoursBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder setWorkingHours(
        int index, com.gbusiness.agentslot.api.TimeInterval.Builder builderForValue) {
      if (workingHoursBuilder_ == null) {
        ensureWorkingHoursIsMutable();
        workingHours_.set(index, builderForValue.build());
        onChanged();
      } else {
        workingHoursBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder addWorkingHours(com.gbusiness.agentslot.api.TimeInterval value) {
      if (workingHoursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkingHoursIsMutable();
        workingHours_.add(value);
        onChanged();
      } else {
        workingHoursBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder addWorkingHours(
        int index, com.gbusiness.agentslot.api.TimeInterval value) {
      if (workingHoursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkingHoursIsMutable();
        workingHours_.add(index, value);
        onChanged();
      } else {
        workingHoursBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder addWorkingHours(
        com.gbusiness.agentslot.api.TimeInterval.Builder builderForValue) {
      if (workingHoursBuilder_ == null) {
        ensureWorkingHoursIsMutable();
        workingHours_.add(builderForValue.build());
        onChanged();
      } else {
        workingHoursBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder addWorkingHours(
        int index, com.gbusiness.agentslot.api.TimeInterval.Builder builderForValue) {
      if (workingHoursBuilder_ == null) {
        ensureWorkingHoursIsMutable();
        workingHours_.add(index, builderForValue.build());
        onChanged();
      } else {
        workingHoursBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder addAllWorkingHours(
        java.lang.Iterable<? extends com.gbusiness.agentslot.api.TimeInterval> values) {
      if (workingHoursBuilder_ == null) {
        ensureWorkingHoursIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workingHours_);
        onChanged();
      } else {
        workingHoursBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder clearWorkingHours() {
      if (workingHoursBuilder_ == null) {
        workingHours_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        workingHoursBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public Builder removeWorkingHours(int index) {
      if (workingHoursBuilder_ == null) {
        ensureWorkingHoursIsMutable();
        workingHours_.remove(index);
        onChanged();
      } else {
        workingHoursBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval.Builder getWorkingHoursBuilder(
        int index) {
      return getWorkingHoursFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeIntervalOrBuilder getWorkingHoursOrBuilder(
        int index) {
      if (workingHoursBuilder_ == null) {
        return workingHours_.get(index);  } else {
        return workingHoursBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public java.util.List<? extends com.gbusiness.agentslot.api.TimeIntervalOrBuilder> 
         getWorkingHoursOrBuilderList() {
      if (workingHoursBuilder_ != null) {
        return workingHoursBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workingHours_);
      }
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval.Builder addWorkingHoursBuilder() {
      return getWorkingHoursFieldBuilder().addBuilder(
          com.gbusiness.agentslot.api.TimeInterval.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public com.gbusiness.agentslot.api.TimeInterval.Builder addWorkingHoursBuilder(
        int index) {
      return getWorkingHoursFieldBuilder().addBuilder(
          index, com.gbusiness.agentslot.api.TimeInterval.getDefaultInstance());
    }
    /**
     * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
     *
     * <pre>
     * List of disjoint time intervals representing the hours
     * where service is available.
     * </pre>
     */
    public java.util.List<com.gbusiness.agentslot.api.TimeInterval.Builder> 
         getWorkingHoursBuilderList() {
      return getWorkingHoursFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder> 
        getWorkingHoursFieldBuilder() {
      if (workingHoursBuilder_ == null) {
        workingHoursBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.gbusiness.agentslot.api.TimeInterval, com.gbusiness.agentslot.api.TimeInterval.Builder, com.gbusiness.agentslot.api.TimeIntervalOrBuilder>(
                workingHours_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        workingHours_ = null;
      }
      return workingHoursBuilder_;
    }

    private int timeBetweenMeetingsInMinutes_ ;
    /**
     * <code>optional int32 time_between_meetings_in_minutes = 2;</code>
     *
     * <pre>
     * Time between each meeting start time presented to the end user.
     * </pre>
     */
    public int getTimeBetweenMeetingsInMinutes() {
      return timeBetweenMeetingsInMinutes_;
    }
    /**
     * <code>optional int32 time_between_meetings_in_minutes = 2;</code>
     *
     * <pre>
     * Time between each meeting start time presented to the end user.
     * </pre>
     */
    public Builder setTimeBetweenMeetingsInMinutes(int value) {
      
      timeBetweenMeetingsInMinutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 time_between_meetings_in_minutes = 2;</code>
     *
     * <pre>
     * Time between each meeting start time presented to the end user.
     * </pre>
     */
    public Builder clearTimeBetweenMeetingsInMinutes() {
      
      timeBetweenMeetingsInMinutes_ = 0;
      onChanged();
      return this;
    }

    private com.gbusiness.agentslot.api.StatusOuterClass.Status apiError_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.StatusOuterClass.Status, com.gbusiness.agentslot.api.StatusOuterClass.Status.Builder, com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder> apiErrorBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
     *
     * <pre>
     * If any errors occurred, this field is set with proper information.
     * </pre>
     */
    public boolean hasApiError() {
      return apiErrorBuilder_ != null || apiError_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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
     * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)
  private static final com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse();
  }

  public static com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAgentSlotsSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAgentSlotsSettingsResponse>() {
    public GetAgentSlotsSettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetAgentSlotsSettingsResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetAgentSlotsSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAgentSlotsSettingsResponse> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

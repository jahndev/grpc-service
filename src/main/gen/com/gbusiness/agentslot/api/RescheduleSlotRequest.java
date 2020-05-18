// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

/**
 * Protobuf type {@code com.gbusiness.agentslot.api.RescheduleSlotRequest}
 *
 * <pre>
 * Request to reschedule an agent slot.
 * </pre>
 */
public  final class RescheduleSlotRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.gbusiness.agentslot.api.RescheduleSlotRequest)
    RescheduleSlotRequestOrBuilder {
  // Use RescheduleSlotRequest.newBuilder() to construct.
  private RescheduleSlotRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RescheduleSlotRequest() {
    agentSlotIt_ = "";
    newAgentSlotDate_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RescheduleSlotRequest(
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

            agentSlotIt_ = s;
            break;
          }
          case 18: {
            com.gbusiness.agentslot.api.AgentPreferences.Builder subBuilder = null;
            if (agentPreferences_ != null) {
              subBuilder = agentPreferences_.toBuilder();
            }
            agentPreferences_ = input.readMessage(com.gbusiness.agentslot.api.AgentPreferences.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(agentPreferences_);
              agentPreferences_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            newAgentSlotDate_ = input.readInt32();
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
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RescheduleSlotRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RescheduleSlotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbusiness.agentslot.api.RescheduleSlotRequest.class, com.gbusiness.agentslot.api.RescheduleSlotRequest.Builder.class);
  }

  public static final int AGENT_SLOT_IT_FIELD_NUMBER = 1;
  private volatile java.lang.Object agentSlotIt_;
  /**
   * <code>optional string agent_slot_it = 1;</code>
   *
   * <pre>
   * Agent slot id of the slot to be rescheduled.
   * </pre>
   */
  public java.lang.String getAgentSlotIt() {
    java.lang.Object ref = agentSlotIt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentSlotIt_ = s;
      return s;
    }
  }
  /**
   * <code>optional string agent_slot_it = 1;</code>
   *
   * <pre>
   * Agent slot id of the slot to be rescheduled.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getAgentSlotItBytes() {
    java.lang.Object ref = agentSlotIt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentSlotIt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_PREFERENCES_FIELD_NUMBER = 2;
  private com.gbusiness.agentslot.api.AgentPreferences agentPreferences_;
  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
   *
   * <pre>
   * Specifies preferences for selecting the agent for the new slot.
   * </pre>
   */
  public boolean hasAgentPreferences() {
    return agentPreferences_ != null;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
   *
   * <pre>
   * Specifies preferences for selecting the agent for the new slot.
   * </pre>
   */
  public com.gbusiness.agentslot.api.AgentPreferences getAgentPreferences() {
    return agentPreferences_ == null ? com.gbusiness.agentslot.api.AgentPreferences.getDefaultInstance() : agentPreferences_;
  }
  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
   *
   * <pre>
   * Specifies preferences for selecting the agent for the new slot.
   * </pre>
   */
  public com.gbusiness.agentslot.api.AgentPreferencesOrBuilder getAgentPreferencesOrBuilder() {
    return getAgentPreferences();
  }

  public static final int NEW_AGENT_SLOT_DATE_FIELD_NUMBER = 3;
  private int newAgentSlotDate_;
  /**
   * <code>optional int32 new_agent_slot_date = 3;</code>
   *
   * <pre>
   * If set, try to reschedule at the time specified by new_agent_slot_date.
   * </pre>
   */
  public int getNewAgentSlotDate() {
    return newAgentSlotDate_;
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
    if (!getAgentSlotItBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, agentSlotIt_);
    }
    if (agentPreferences_ != null) {
      output.writeMessage(2, getAgentPreferences());
    }
    if (newAgentSlotDate_ != 0) {
      output.writeInt32(3, newAgentSlotDate_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAgentSlotItBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, agentSlotIt_);
    }
    if (agentPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgentPreferences());
    }
    if (newAgentSlotDate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, newAgentSlotDate_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.gbusiness.agentslot.api.RescheduleSlotRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbusiness.agentslot.api.RescheduleSlotRequest prototype) {
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
   * Protobuf type {@code com.gbusiness.agentslot.api.RescheduleSlotRequest}
   *
   * <pre>
   * Request to reschedule an agent slot.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gbusiness.agentslot.api.RescheduleSlotRequest)
      com.gbusiness.agentslot.api.RescheduleSlotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RescheduleSlotRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RescheduleSlotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbusiness.agentslot.api.RescheduleSlotRequest.class, com.gbusiness.agentslot.api.RescheduleSlotRequest.Builder.class);
    }

    // Construct using com.gbusiness.agentslot.api.RescheduleSlotRequest.newBuilder()
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
      agentSlotIt_ = "";

      if (agentPreferencesBuilder_ == null) {
        agentPreferences_ = null;
      } else {
        agentPreferences_ = null;
        agentPreferencesBuilder_ = null;
      }
      newAgentSlotDate_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbusiness.agentslot.api.AgentSlotServiceProto.internal_static_com_gbusiness_agentslot_api_RescheduleSlotRequest_descriptor;
    }

    public com.gbusiness.agentslot.api.RescheduleSlotRequest getDefaultInstanceForType() {
      return com.gbusiness.agentslot.api.RescheduleSlotRequest.getDefaultInstance();
    }

    public com.gbusiness.agentslot.api.RescheduleSlotRequest build() {
      com.gbusiness.agentslot.api.RescheduleSlotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gbusiness.agentslot.api.RescheduleSlotRequest buildPartial() {
      com.gbusiness.agentslot.api.RescheduleSlotRequest result = new com.gbusiness.agentslot.api.RescheduleSlotRequest(this);
      result.agentSlotIt_ = agentSlotIt_;
      if (agentPreferencesBuilder_ == null) {
        result.agentPreferences_ = agentPreferences_;
      } else {
        result.agentPreferences_ = agentPreferencesBuilder_.build();
      }
      result.newAgentSlotDate_ = newAgentSlotDate_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbusiness.agentslot.api.RescheduleSlotRequest) {
        return mergeFrom((com.gbusiness.agentslot.api.RescheduleSlotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbusiness.agentslot.api.RescheduleSlotRequest other) {
      if (other == com.gbusiness.agentslot.api.RescheduleSlotRequest.getDefaultInstance()) return this;
      if (!other.getAgentSlotIt().isEmpty()) {
        agentSlotIt_ = other.agentSlotIt_;
        onChanged();
      }
      if (other.hasAgentPreferences()) {
        mergeAgentPreferences(other.getAgentPreferences());
      }
      if (other.getNewAgentSlotDate() != 0) {
        setNewAgentSlotDate(other.getNewAgentSlotDate());
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
      com.gbusiness.agentslot.api.RescheduleSlotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbusiness.agentslot.api.RescheduleSlotRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object agentSlotIt_ = "";
    /**
     * <code>optional string agent_slot_it = 1;</code>
     *
     * <pre>
     * Agent slot id of the slot to be rescheduled.
     * </pre>
     */
    public java.lang.String getAgentSlotIt() {
      java.lang.Object ref = agentSlotIt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentSlotIt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string agent_slot_it = 1;</code>
     *
     * <pre>
     * Agent slot id of the slot to be rescheduled.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getAgentSlotItBytes() {
      java.lang.Object ref = agentSlotIt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentSlotIt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string agent_slot_it = 1;</code>
     *
     * <pre>
     * Agent slot id of the slot to be rescheduled.
     * </pre>
     */
    public Builder setAgentSlotIt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      agentSlotIt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string agent_slot_it = 1;</code>
     *
     * <pre>
     * Agent slot id of the slot to be rescheduled.
     * </pre>
     */
    public Builder clearAgentSlotIt() {
      
      agentSlotIt_ = getDefaultInstance().getAgentSlotIt();
      onChanged();
      return this;
    }
    /**
     * <code>optional string agent_slot_it = 1;</code>
     *
     * <pre>
     * Agent slot id of the slot to be rescheduled.
     * </pre>
     */
    public Builder setAgentSlotItBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      agentSlotIt_ = value;
      onChanged();
      return this;
    }

    private com.gbusiness.agentslot.api.AgentPreferences agentPreferences_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.AgentPreferences, com.gbusiness.agentslot.api.AgentPreferences.Builder, com.gbusiness.agentslot.api.AgentPreferencesOrBuilder> agentPreferencesBuilder_;
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public boolean hasAgentPreferences() {
      return agentPreferencesBuilder_ != null || agentPreferences_ != null;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public com.gbusiness.agentslot.api.AgentPreferences getAgentPreferences() {
      if (agentPreferencesBuilder_ == null) {
        return agentPreferences_ == null ? com.gbusiness.agentslot.api.AgentPreferences.getDefaultInstance() : agentPreferences_;
      } else {
        return agentPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public Builder setAgentPreferences(com.gbusiness.agentslot.api.AgentPreferences value) {
      if (agentPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentPreferences_ = value;
        onChanged();
      } else {
        agentPreferencesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public Builder setAgentPreferences(
        com.gbusiness.agentslot.api.AgentPreferences.Builder builderForValue) {
      if (agentPreferencesBuilder_ == null) {
        agentPreferences_ = builderForValue.build();
        onChanged();
      } else {
        agentPreferencesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public Builder mergeAgentPreferences(com.gbusiness.agentslot.api.AgentPreferences value) {
      if (agentPreferencesBuilder_ == null) {
        if (agentPreferences_ != null) {
          agentPreferences_ =
            com.gbusiness.agentslot.api.AgentPreferences.newBuilder(agentPreferences_).mergeFrom(value).buildPartial();
        } else {
          agentPreferences_ = value;
        }
        onChanged();
      } else {
        agentPreferencesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public Builder clearAgentPreferences() {
      if (agentPreferencesBuilder_ == null) {
        agentPreferences_ = null;
        onChanged();
      } else {
        agentPreferences_ = null;
        agentPreferencesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public com.gbusiness.agentslot.api.AgentPreferences.Builder getAgentPreferencesBuilder() {
      
      onChanged();
      return getAgentPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    public com.gbusiness.agentslot.api.AgentPreferencesOrBuilder getAgentPreferencesOrBuilder() {
      if (agentPreferencesBuilder_ != null) {
        return agentPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return agentPreferences_ == null ?
            com.gbusiness.agentslot.api.AgentPreferences.getDefaultInstance() : agentPreferences_;
      }
    }
    /**
     * <code>optional .com.gbusiness.agentslot.api.AgentPreferences agent_preferences = 2;</code>
     *
     * <pre>
     * Specifies preferences for selecting the agent for the new slot.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.gbusiness.agentslot.api.AgentPreferences, com.gbusiness.agentslot.api.AgentPreferences.Builder, com.gbusiness.agentslot.api.AgentPreferencesOrBuilder> 
        getAgentPreferencesFieldBuilder() {
      if (agentPreferencesBuilder_ == null) {
        agentPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.gbusiness.agentslot.api.AgentPreferences, com.gbusiness.agentslot.api.AgentPreferences.Builder, com.gbusiness.agentslot.api.AgentPreferencesOrBuilder>(
                getAgentPreferences(),
                getParentForChildren(),
                isClean());
        agentPreferences_ = null;
      }
      return agentPreferencesBuilder_;
    }

    private int newAgentSlotDate_ ;
    /**
     * <code>optional int32 new_agent_slot_date = 3;</code>
     *
     * <pre>
     * If set, try to reschedule at the time specified by new_agent_slot_date.
     * </pre>
     */
    public int getNewAgentSlotDate() {
      return newAgentSlotDate_;
    }
    /**
     * <code>optional int32 new_agent_slot_date = 3;</code>
     *
     * <pre>
     * If set, try to reschedule at the time specified by new_agent_slot_date.
     * </pre>
     */
    public Builder setNewAgentSlotDate(int value) {
      
      newAgentSlotDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 new_agent_slot_date = 3;</code>
     *
     * <pre>
     * If set, try to reschedule at the time specified by new_agent_slot_date.
     * </pre>
     */
    public Builder clearNewAgentSlotDate() {
      
      newAgentSlotDate_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.gbusiness.agentslot.api.RescheduleSlotRequest)
  }

  // @@protoc_insertion_point(class_scope:com.gbusiness.agentslot.api.RescheduleSlotRequest)
  private static final com.gbusiness.agentslot.api.RescheduleSlotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbusiness.agentslot.api.RescheduleSlotRequest();
  }

  public static com.gbusiness.agentslot.api.RescheduleSlotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RescheduleSlotRequest>
      PARSER = new com.google.protobuf.AbstractParser<RescheduleSlotRequest>() {
    public RescheduleSlotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new RescheduleSlotRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<RescheduleSlotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RescheduleSlotRequest> getParserForType() {
    return PARSER;
  }

  public com.gbusiness.agentslot.api.RescheduleSlotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


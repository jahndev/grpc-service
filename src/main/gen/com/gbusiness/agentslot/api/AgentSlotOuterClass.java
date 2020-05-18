// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot.proto

package com.gbusiness.agentslot.api;

public final class AgentSlotOuterClass {
  private AgentSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gbusiness_agentslot_api_AgentSlot_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_gbusiness_agentslot_api_AgentSlot_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gbusiness_agentslot_api_TimeInterval_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_gbusiness_agentslot_api_TimeInterval_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gbusiness_agentslot_api_MeetingProfile_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_gbusiness_agentslot_api_MeetingProfile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020agent_slot.proto\022\033com.gbusiness.agents" +
      "lot.api\"\262\001\n\tAgentSlot\022\n\n\002id\030\001 \001(\t\022\020\n\010age" +
      "nt_id\030\002 \001(\t\022\r\n\005index\030\003 \001(\005\0227\n\006status\030\004 \001" +
      "(\0162\'.com.gbusiness.agentslot.api.SlotSta" +
      "tus\022?\n\014timeInterval\030\005 \001(\0132).com.gbusines" +
      "s.agentslot.api.TimeInterval\"(\n\014TimeInte" +
      "rval\022\014\n\004from\030\001 \001(\t\022\n\n\002to\030\002 \001(\t\"\276\001\n\016Meeti" +
      "ngProfile\022\n\n\002id\030\001 \001(\t\022#\n\033meeting_duratio" +
      "n_in_minutes\030\002 \001(\005\022\'\n\037pre_padding_durati" +
      "on_in_minutes\030\003 \001(\005\022(\n post_padding_dura",
      "tion_in_minutes\030\004 \001(\005\022(\n time_between_me" +
      "etings_in_minutes\030\005 \001(\005*[\n\nSlotStatus\022\027\n" +
      "\023UNKNOWN_SLOT_STATUS\020\000\022\r\n\tCONFIRMED\020\001\022\014\n" +
      "\010RESERVED\020\002\022\r\n\tCANCELLED\020\003\022\010\n\004FREE\020\004B\037\n\033" +
      "com.gbusiness.agentslot.apiP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_gbusiness_agentslot_api_AgentSlot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gbusiness_agentslot_api_AgentSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_gbusiness_agentslot_api_AgentSlot_descriptor,
        new java.lang.String[] { "Id", "AgentId", "Index", "Status", "TimeInterval", });
    internal_static_com_gbusiness_agentslot_api_TimeInterval_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gbusiness_agentslot_api_TimeInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_gbusiness_agentslot_api_TimeInterval_descriptor,
        new java.lang.String[] { "From", "To", });
    internal_static_com_gbusiness_agentslot_api_MeetingProfile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_gbusiness_agentslot_api_MeetingProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_gbusiness_agentslot_api_MeetingProfile_descriptor,
        new java.lang.String[] { "Id", "MeetingDurationInMinutes", "PrePaddingDurationInMinutes", "PostPaddingDurationInMinutes", "TimeBetweenMeetingsInMinutes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
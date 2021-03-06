// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot.proto

package com.gbusiness.agentslot.api;

public interface MeetingProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.MeetingProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Unique identifier for a meeting profile with following format:
   * "meeting_profile/[uid]"
   * </pre>
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Unique identifier for a meeting profile with following format:
   * "meeting_profile/[uid]"
   * </pre>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional int32 meeting_duration_in_minutes = 2;</code>
   *
   * <pre>
   * Duration of the meetings in minutes.
   * </pre>
   */
  int getMeetingDurationInMinutes();

  /**
   * <code>optional int32 pre_padding_duration_in_minutes = 3;</code>
   *
   * <pre>
   * Duration of the padding before the meeting in minutes.
   * </pre>
   */
  int getPrePaddingDurationInMinutes();

  /**
   * <code>optional int32 post_padding_duration_in_minutes = 4;</code>
   *
   * <pre>
   * Duration of the padding after the meeting in minutes.
   * </pre>
   */
  int getPostPaddingDurationInMinutes();

  /**
   * <code>optional int32 time_between_meetings_in_minutes = 5;</code>
   *
   * <pre>
   * Time between the possible start times of the meetings.
   * </pre>
   */
  int getTimeBetweenMeetingsInMinutes();
}

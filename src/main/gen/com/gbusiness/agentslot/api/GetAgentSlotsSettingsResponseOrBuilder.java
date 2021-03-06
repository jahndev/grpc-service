// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

public interface GetAgentSlotsSettingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.GetAgentSlotsSettingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  java.util.List<com.gbusiness.agentslot.api.TimeInterval> 
      getWorkingHoursList();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  com.gbusiness.agentslot.api.TimeInterval getWorkingHours(int index);
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  int getWorkingHoursCount();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  java.util.List<? extends com.gbusiness.agentslot.api.TimeIntervalOrBuilder> 
      getWorkingHoursOrBuilderList();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.TimeInterval working_hours = 1;</code>
   *
   * <pre>
   * List of disjoint time intervals representing the hours
   * where service is available.
   * </pre>
   */
  com.gbusiness.agentslot.api.TimeIntervalOrBuilder getWorkingHoursOrBuilder(
      int index);

  /**
   * <code>optional int32 time_between_meetings_in_minutes = 2;</code>
   *
   * <pre>
   * Time between each meeting start time presented to the end user.
   * </pre>
   */
  int getTimeBetweenMeetingsInMinutes();

  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  boolean hasApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 3;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder getApiErrorOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

public interface ListSlotsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.ListSlotsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.gbusiness.agentslot.api.AgentSlot slots = 1;</code>
   *
   * <pre>
   * List of indices representing the free slots of the requested day.
   * These indices are used in conjunction with time_between_meetings_in_minutes
   * to determine the start time of the slots.
   * i.e. Having time_between_meetings_in_minutes = 30
   * and free_slots = [16, 18, 30] would represent
   * start_times = [16 * 30/60, 18 * 30/60, 30 * 30/60] = [8am, 9am, 3pm]
   * </pre>
   */
  java.util.List<com.gbusiness.agentslot.api.AgentSlot> 
      getSlotsList();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.AgentSlot slots = 1;</code>
   *
   * <pre>
   * List of indices representing the free slots of the requested day.
   * These indices are used in conjunction with time_between_meetings_in_minutes
   * to determine the start time of the slots.
   * i.e. Having time_between_meetings_in_minutes = 30
   * and free_slots = [16, 18, 30] would represent
   * start_times = [16 * 30/60, 18 * 30/60, 30 * 30/60] = [8am, 9am, 3pm]
   * </pre>
   */
  com.gbusiness.agentslot.api.AgentSlot getSlots(int index);
  /**
   * <code>repeated .com.gbusiness.agentslot.api.AgentSlot slots = 1;</code>
   *
   * <pre>
   * List of indices representing the free slots of the requested day.
   * These indices are used in conjunction with time_between_meetings_in_minutes
   * to determine the start time of the slots.
   * i.e. Having time_between_meetings_in_minutes = 30
   * and free_slots = [16, 18, 30] would represent
   * start_times = [16 * 30/60, 18 * 30/60, 30 * 30/60] = [8am, 9am, 3pm]
   * </pre>
   */
  int getSlotsCount();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.AgentSlot slots = 1;</code>
   *
   * <pre>
   * List of indices representing the free slots of the requested day.
   * These indices are used in conjunction with time_between_meetings_in_minutes
   * to determine the start time of the slots.
   * i.e. Having time_between_meetings_in_minutes = 30
   * and free_slots = [16, 18, 30] would represent
   * start_times = [16 * 30/60, 18 * 30/60, 30 * 30/60] = [8am, 9am, 3pm]
   * </pre>
   */
  java.util.List<? extends com.gbusiness.agentslot.api.AgentSlotOrBuilder> 
      getSlotsOrBuilderList();
  /**
   * <code>repeated .com.gbusiness.agentslot.api.AgentSlot slots = 1;</code>
   *
   * <pre>
   * List of indices representing the free slots of the requested day.
   * These indices are used in conjunction with time_between_meetings_in_minutes
   * to determine the start time of the slots.
   * i.e. Having time_between_meetings_in_minutes = 30
   * and free_slots = [16, 18, 30] would represent
   * start_times = [16 * 30/60, 18 * 30/60, 30 * 30/60] = [8am, 9am, 3pm]
   * </pre>
   */
  com.gbusiness.agentslot.api.AgentSlotOrBuilder getSlotsOrBuilder(
      int index);

  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  boolean hasApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 2;</code>
   *
   * <pre>
   * If any errors occurred, this field is set with proper information.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder getApiErrorOrBuilder();
}
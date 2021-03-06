// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

public interface RescheduleSlotResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.RescheduleSlotResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.gbusiness.agentslot.api.RescheduleStatus reschedule_status = 1;</code>
   *
   * <pre>
   * Status of the reschedule response.
   * </pre>
   */
  int getRescheduleStatusValue();
  /**
   * <code>optional .com.gbusiness.agentslot.api.RescheduleStatus reschedule_status = 1;</code>
   *
   * <pre>
   * Status of the reschedule response.
   * </pre>
   */
  com.gbusiness.agentslot.api.RescheduleStatus getRescheduleStatus();

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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_slot_service.proto

package com.gbusiness.agentslot.api;

public interface RemoveMeetingProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.RemoveMeetingProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
   * If the meeting profile was successfully removed, this field is empty.
   * </pre>
   */
  boolean hasApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
   * If the meeting profile was successfully removed, this field is empty.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.Status getApiError();
  /**
   * <code>optional .com.gbusiness.agentslot.api.Status api_error = 1;</code>
   *
   * <pre>
   * If any error occurred, this field is set with proper information.
   * If the meeting profile was successfully removed, this field is empty.
   * </pre>
   */
  com.gbusiness.agentslot.api.StatusOuterClass.StatusOrBuilder getApiErrorOrBuilder();
}
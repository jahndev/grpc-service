// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent_service.proto

package com.gbusiness.agentslot.api;

public interface UpdateAgentProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gbusiness.agentslot.api.UpdateAgentProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentProfile agent_profile = 1;</code>
   *
   * <pre>
   * Agent profile object containing the new information of the profile.
   * The agent_profile_id is required and can not be changed.
   * </pre>
   */
  boolean hasAgentProfile();
  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentProfile agent_profile = 1;</code>
   *
   * <pre>
   * Agent profile object containing the new information of the profile.
   * The agent_profile_id is required and can not be changed.
   * </pre>
   */
  com.gbusiness.agentslot.api.AgentProfile getAgentProfile();
  /**
   * <code>optional .com.gbusiness.agentslot.api.AgentProfile agent_profile = 1;</code>
   *
   * <pre>
   * Agent profile object containing the new information of the profile.
   * The agent_profile_id is required and can not be changed.
   * </pre>
   */
  com.gbusiness.agentslot.api.AgentProfileOrBuilder getAgentProfileOrBuilder();
}

package com.gbusiness.agentslot.converter;

/**
 * Handles convertions to and from proto data types
 *
 * @param <T>
 * @param <P>
 */
public interface Converter<T, P> {

    P toProto(T model);

    T fromProto(P proto);

    /**
     * Utility method to build proto ids like "proto_name/1" from 1
     *
     * @param name
     * @param id
     * @return
     */
    static String buildProtoId(String name, Integer id) {
        return String.format("%s/%d", name, id);
    }

    /**
     * Utility method to extract model ids from protos like 1 from "proto_name/1"
     *
     * @param protoId
     * @return
     */
    static Integer extractModelId(String protoId) {
        return Integer.parseInt(protoId.split("/")[1]);
    }
}

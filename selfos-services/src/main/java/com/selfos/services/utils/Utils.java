package com.selfos.services.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Utils {

    /**
     * will return a json object of the form:
     * {"result": <resultStatus>}
     */
    public static String result(String resultStatus) {
        // create result object
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put(Constants.RESULT, resultStatus);
        return objectNode.toString();
    }
}

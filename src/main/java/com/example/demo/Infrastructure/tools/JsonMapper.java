package com.example.demo.Infrastructure.tools;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;

public class JsonMapper extends JMapperAPI {
    static JMapperAPI jmapperApi = new JMapperAPI();

    public static Object toJsonMapper(Object input , Class out){
        // note basics : JMapper API tool use to map two model class
        //      * `GLOBAL` map if both have same field
        jmapperApi.add(mappedClass(out).add(global().excludedAttributes("NameID")).add(attribute("NameID").value("name")));
        JMapper userMapper = new JMapper<>
                (out,input.getClass(),jmapperApi);

        return userMapper.getDestination(input);
    }
}

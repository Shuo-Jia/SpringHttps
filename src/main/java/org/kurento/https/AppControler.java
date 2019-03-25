package org.kurento.https;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppControler {

    @RequestMapping(value = "/log/uploadPegasusLog")
    public String welcome(
            @RequestParam(value = "time",required = false, defaultValue = "0") String time,
            @RequestParam(value = "server_node",required = false, defaultValue = "0") String server_node,
            @RequestParam(value = "client",required = false, defaultValue = "0") String client,
            @RequestParam(value = "method",required = false, defaultValue = "0") String method,
            @RequestParam(value = "app_name",required = false, defaultValue = "0") String table_name,
            @RequestParam(value = "app_id",required = false, defaultValue = "0") String app_id,
            @RequestParam(value = "hash_key",required = false, defaultValue = "0") String hash_key,
            @RequestParam(value = "sort_key",required = false, defaultValue = "0") String sort_key,
            @RequestParam(value = "start_sort_key", required = false, defaultValue = "0") String start_sort_key,
            @RequestParam(value = "stop_sort_key", required = false, defaultValue = "0") String stop_sort_key,
            @RequestParam(value = "time_used",required = false, defaultValue = "0") long time_used) {
        System.out.println(
                "time:" + time + " server_node:" + server_node + " client:" + client + " method:" + method +
                        " app_name:" + table_name + " app_id:" + app_id + " hash_key:" + hash_key + " start_sort_key:" +
                        start_sort_key + " stop_sort_key:" + stop_sort_key + " time_used:" + time_used + "\n"
        );
        return "home.html";
    }
}

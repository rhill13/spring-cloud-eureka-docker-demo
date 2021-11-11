package biz.rookware.demoeurekaclientsentence;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sentence")
public class SentenceController {
    
    private final DiscoveryClient discoveryClient;

    public SentenceController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping
    public @ResponseBody String getSentence() {
        return 
            getWord("demo-eureka-client-subject") + " "
            + getWord("demo-eureka-client-verb") + " "
            + getWord("demo-eureka-client-article") + " "
            + getWord("demo-eureka-client-adjective") + " "
            + getWord("demo-eureka-client-noun") + "."
      ;
    }

    public String getWord(String service) {
        List<ServiceInstance> list = discoveryClient.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
    
}

package app.civil.civilapp.service.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Map<String, String> main() {
        Map<String,String> result=new HashMap<>();

        result.put("result","ok");
        return result;
    }
}

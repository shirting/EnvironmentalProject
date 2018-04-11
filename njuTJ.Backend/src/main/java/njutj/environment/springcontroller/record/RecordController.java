package njutj.environment.springcontroller.record;

import njutj.environment.response.Response;
import njutj.environment.vo.record.SpeciesCheckVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecordController {

    @RequestMapping(method = RequestMethod.POST, path = "record/waitForCheck", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response> waitForCheck(@RequestBody SpeciesCheckVo speciesCheckVo) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "record/check", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response> check(@RequestBody SpeciesCheckVo speciesCheckVo) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "record/check", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response> check(@RequestBody SpeciesCheckVo speciesCheckVo) {
        return null;
    }
}

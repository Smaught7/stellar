package net.atos.server;

import net.atos.model.Constellation;
import net.atos.model.Star;
import net.atos.service.StellarService;
import net.atos.service.StellarServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StellarREST {

    @Autowired
    StellarService stellarServiceImplementation;

    @GetMapping("/constellations")
    public List<Constellation> getAllConstellations(@RequestParam(value="query", required=false) String query) {
        return stellarServiceImplementation.getConstellations(query);
    }

    @RequestMapping(value="/constellations/{constellationAbbreviation}/stars", method = RequestMethod.GET)
    public List<Star> getStarsForConstellation(@PathVariable("constellationAbbreviation") String constellationAbbreviation) {
        return stellarServiceImplementation.getStarsForConstellation(constellationAbbreviation);
    }

    @RequestMapping(value = "/constellation", method = RequestMethod.POST)
    public ResponseEntity addConstellation(Constellation constellation) {
        Constellation newConstellation = stellarServiceImplementation.addConstellation(constellation);
        return new ResponseEntity<>(newConstellation, HttpStatus.CREATED);
        /*Constellation newConstellation = stellarService.addConstellation(constellation);
        return new ResponseEntity<>(newConstellation, HttpStatus.CREATED);*/
    }

    @RequestMapping(value = "/star", method = RequestMethod.POST)
    public ResponseEntity addStar(Star star) {
        Star newStar = stellarServiceImplementation.addStar(star);
        return new ResponseEntity<>(newStar, HttpStatus.CREATED);
    }
}



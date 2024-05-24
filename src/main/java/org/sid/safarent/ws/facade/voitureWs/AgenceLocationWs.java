package org.sid.safarent.ws.facade.voitureWs;

import com.cloudinary.Cloudinary;
import org.sid.safarent.bean.voitureBean.AgenceLocation;
import org.sid.safarent.security.util.uploadImage.ConverterImage;
import org.sid.safarent.service.facade.voitureService.AgenceLocationService;
import org.sid.safarent.ws.converter.voitureConverter.AgenceLocationConverter;
import org.sid.safarent.ws.dto.voitureDto.AgenceLocationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/api/agenceLocation/")
public class AgenceLocationWs {
    private AgenceLocationService agenceLocationService;
    @Autowired
    private AgenceLocationConverter converter ;

    public AgenceLocationWs(AgenceLocationService agenceLocationService) {
        this.agenceLocationService = agenceLocationService;
    }


    @Autowired
    private Cloudinary cloudinary;

    @Autowired
    private ConverterImage converterImage;

    @PostMapping
    public int save(@RequestBody AgenceLocationDto agenceLocationDto) {
        AgenceLocation agenceLocation = converter.toBean(agenceLocationDto);
        return agenceLocationService.save(agenceLocation);
    }
    @GetMapping("iceAgLoc/{iceAgLoc}")
    public AgenceLocationDto findByiceAgLoc(@PathVariable Long iceAgLoc)  {
        return converter.toDto(agenceLocationService.findByiceAgLoc(iceAgLoc));
    }
    @GetMapping
    public List<AgenceLocationDto> findAll() {
        return converter.toDto(agenceLocationService.findAll());
    }


    @Transactional
    @DeleteMapping("iceAgLoc/{iceAgLoc}")
    public int deleteByiceAgLoc(@PathVariable  Long  iceAgLoc) {
        return agenceLocationService.deleteByIceAgLoc(iceAgLoc);
    }

    @GetMapping("/username/{username}")
    public AgenceLocation findByUsername(@PathVariable  String username) {
        return agenceLocationService.findByUsername(username);
    }


    //logo************************************************************************
    @PutMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public int update(
            @RequestPart("agenceLocation") AgenceLocationDto agenceLocationDto,
            @RequestPart("logo") MultipartFile file
    )
    {
        try {
            AgenceLocation agenceLocation=converter.toBean(agenceLocationDto);
            String logo = converterImage.uploadImage(file);
            agenceLocation.setImagePaths(logo);
            return agenceLocationService.update(agenceLocation);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-9999999");
            return -99999;
        }
    }
    //logo************************************************************************

}

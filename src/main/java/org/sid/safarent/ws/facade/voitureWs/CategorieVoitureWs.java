package org.sid.safarent.ws.facade.voitureWs;


import org.sid.safarent.bean.voitureBean.CategorieVoiture;
import org.sid.safarent.security.util.uploadImage.ConverterImage;
import org.sid.safarent.service.facade.voitureService.CategorieVoitureService;
import org.sid.safarent.ws.converter.voitureConverter.CategorieVoitureConverter;
import org.sid.safarent.ws.dto.voitureDto.CategorieVoitureDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("api/safarent/manager/categorieVoiture/")


public class CategorieVoitureWs {

    @Autowired
    private CategorieVoitureService categorieVoitureService;

    @Autowired
    private CategorieVoitureConverter converter;

    @Autowired
    private ConverterImage converterImage;
    @GetMapping("libelle/{libelle}")
    public CategorieVoitureDto findByLibelle(@PathVariable String libelle) {
        return converter.toDto(categorieVoitureService.findByLibelle(libelle));
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public int save(  @RequestPart("categoriesVoiture") CategorieVoitureDto categorieVoitureDto,
                      @RequestPart("photo") MultipartFile file) {
        try {
            CategorieVoiture categorieVoiture=converter.toBean(categorieVoitureDto);
            String logo = converterImage.uploadImage(file);
            categorieVoiture.setImagePaths(logo);
            return categorieVoitureService.save(categorieVoiture);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-9999999");
            return -99999;
        }
    }


    @GetMapping("")
    public List<CategorieVoitureDto> findAll() {
        return converter.toDto(categorieVoitureService.findAll());
    }
    @DeleteMapping("libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return categorieVoitureService.deleteByLibelle(libelle);
    }

    @PutMapping
    public int update(@RequestBody UpdateCategories updateCategories) {
        System.out.println(updateCategories);
        return categorieVoitureService.update(updateCategories.libelle,updateCategories.libelleNew);
    }

}

class UpdateCategories{
    public   String libelle;
    public   String libelleNew;
}

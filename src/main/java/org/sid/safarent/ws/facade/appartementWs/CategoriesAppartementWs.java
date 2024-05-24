package org.sid.safarent.ws.facade.appartementWs;

import com.cloudinary.Cloudinary;
import org.sid.safarent.bean.appartementBean.CategoriesAppartement;
import org.sid.safarent.security.util.uploadImage.ConverterImage;
import org.sid.safarent.service.facade.appartementService.CategoriesAppartementService;
import org.sid.safarent.ws.converter.appartementConverter.CategoriesAppartementConverter;
import org.sid.safarent.ws.dto.appartementDto.CategoriesAppartementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categoriesAppartemen/")
public class CategoriesAppartementWs {

    @Autowired
    private Cloudinary cloudinary;

    @Autowired
    private ConverterImage converterImage;

    //mohammed ezzaim
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public int save(  @RequestPart("categoriesAppartemet") CategoriesAppartementDto categoriesAppartementDto,
                      @RequestPart("photo") MultipartFile file) {
        try {
            CategoriesAppartement categoriesAppartement=categoriesAppartementConverter.toBean(categoriesAppartementDto);
            String logo = converterImage.uploadImage(file);
            categoriesAppartement.setImagePaths(logo);
            return categoriesAppartementService.save(categoriesAppartement);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-9999999");
            return -99999;
        }


    }

    @GetMapping
    public List<CategoriesAppartementDto> findAll() {
        return categoriesAppartementConverter.toDto(categoriesAppartementService.findAll());
    }

    @GetMapping("/libelle/{libelle}")
    public CategoriesAppartementDto findByLibelle(@PathVariable String libelle) {
        return categoriesAppartementConverter.toDto(categoriesAppartementService.findByLibelle(libelle));
    }

    @DeleteMapping("libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return categoriesAppartementService.deleteByLibelle(libelle);
    }

    @PutMapping
    public int update(@RequestBody UpdateCategories updateCategories) {
        return categoriesAppartementService.update(updateCategories.libelle,updateCategories.libelleNew);
    }

    private final CategoriesAppartementService categoriesAppartementService;
    private final CategoriesAppartementConverter categoriesAppartementConverter;

    public CategoriesAppartementWs(CategoriesAppartementService categoriesAppartementService, CategoriesAppartementConverter categoriesAppartementConverter) {
        this.categoriesAppartementService = categoriesAppartementService;
        this.categoriesAppartementConverter = categoriesAppartementConverter;
    }
}

class UpdateCategories{
  public   String libelle;
  public   String libelleNew;
}

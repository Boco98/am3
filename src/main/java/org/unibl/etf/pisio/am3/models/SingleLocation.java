package org.unibl.etf.pisio.am3.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SingleLocation  extends Location{
    //entitete ne koristimo u nasim dto klasama
    //potrebna nam je asset klasa
    private List<Asset> assets;
}

package com.udea.apifestivos.interfaces;

import java.util.Date;
import java.util.List;

import com.udea.apifestivos.entities.dto.FestivoDto;

public interface IFestivoServicio {

    public boolean esFestivo(Date Fecha);

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFechaValida(String strFecha);

}

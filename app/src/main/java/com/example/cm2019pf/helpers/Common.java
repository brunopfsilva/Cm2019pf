package com.example.cm2019pf.helpers;


/**
 * Created by Pedro on 16/05/2017.
 */

public class Common {



    public static final String URL_HOSPITAL_PRINCIPAL = "http://tempos.min-saude.pt/api.php/";
    public static final String URL_API_LISTA_INSTITUICAO_TEMPO_ESPERA = "http://tempos.min-saude.pt/api.php/"
            ;
    //url show nearby places
    public static final String URL_API_EXIBE_HOSPITAIS_PROXIMOS = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=restaurant&keyword=cruise&key=YOUR_API_KEY";







    public static boolean isNullOrEmptyString(String content) {
        return (content != null && !content.trim().isEmpty() ? false : true);
    }


}

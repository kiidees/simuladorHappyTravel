/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Date;

/**
 *
 * @author jklm2
 */
public class Fecha {
    String fecha;
    Date dateFecha;
    
    public String convertir(String fecha){
        //yyyy-mm-dd
        //Fri Oct 18 15:51:24 CDT 2019
        String yyyy, mm="",dd;
        yyyy=fecha.substring(fecha.length()-4, fecha.length());
        switch(fecha.substring(4, 7)){
            case "Jan": mm="01"; break;
            case "Feb": mm="02"; break;
            case "Mar": mm="03"; break;
            case "Apr": mm="04"; break;
            case "May": mm="05"; break;
            case "Jun": mm="06"; break;
            case "Jul": mm="07"; break;
            case "Aug": mm="08"; break;
            case "Sep": mm="09"; break;
            case "Oct": mm="10"; break;
            case "Nov": mm="11"; break;
            case "Dec": mm="12"; break;
        }
        dd=fecha.substring(8, 10);
        return yyyy+"-"+mm+"-"+dd;
    }
    
}

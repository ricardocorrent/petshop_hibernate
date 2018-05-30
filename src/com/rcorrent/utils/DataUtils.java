/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author rcorrent
 */
public class DataUtils {
    
    private static final SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    private static final SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String dateToString(Date date) {

        try {
            return formatDate.format(date);
        } catch (Exception ex) {
            return null;
        }
    }
    
    
      public static Date stringToDate(String date) {

        try {
            return formatDate.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }

      
         public static String dateTimeToString(Date date) {

        try {
            return formatDateTime.format(date);
        } catch (Exception ex) {
            return null;
        }
    }
    
    
      public static Date stringToDateTime(String date) {

        try {
            return formatDateTime.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }  
    
    public static Date localDateToDate(LocalDate date) {

        try {
            ZonedDateTime zdt = date.atStartOfDay(ZoneId.of("America/Sao_Paulo"));

            return java.util.Date.from(zdt.toInstant());
        } catch (Exception ex) {

            return null;
        }

    }
    
}

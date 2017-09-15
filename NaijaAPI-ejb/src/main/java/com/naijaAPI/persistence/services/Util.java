/**
 *Class Name: Util
 *Project Name: NaijaAPI-ejb
 *Developer: Onyedika Okafor
 *Version Info:
 *Create Date: Apr 19, 2017 3:18:03 PM
 */
package com.naijaAPI.persistence.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author Onyedika Okafor
 */
@Stateless
public class Util {

    @EJB
    PortalPersistence persistence;

   

}

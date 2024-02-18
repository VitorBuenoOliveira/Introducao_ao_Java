package VerifDate;

import java.util.Calendar;

class VerifDate{
    public static boolean ehSabado(int dia, int mes, int ano){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, dia);
        cal.set(Calendar.MONTH, mes-1);
        cal.set(Calendar.YEAR,ano);
        return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
    }

    public static void main(String[] args){
        System.out.println("O dia 11/09/2001 foi sabado? " + ehSabado(12,9,2002));
    }
}



package app.civil.civilapp.util;

import app.civil.civilapp.dto.weather.WeatherContents;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WeatherConverter {


    public static List<WeatherContents> convert(Map<String, String> test) {
        List<String> listString = new ArrayList<String>();
        listString = List.of(test.get("test").split("\n"));
        List<WeatherContents> weatherContents = new ArrayList<>();
        for(  int i =0; i < listString.size() ; i++) {
            if (listString.get(i).startsWith("#")) {
                System.out.println(listString.get(i));
            } else {
                List<String> data = List.of(listString.get(i).split(" "));
                WeatherContents weather = new WeatherContents().builder()
                        .date(data.get(0).substring(0, 6))
                        .TM(data.get(0).substring(7))
                        .STN(data.get(1))
                        .WD(data.get(2))
                        .WS(data.get(3))
                        .GST_WD(data.get(4))
                        .GST_TM(data.get(5))
                        .PA(data.get(6))
                        .PS(data.get(7))
                        .PT(data.get(8))
                        .PR(data.get(9))
                        .TA(data.get(10))
                        .TD(data.get(11))
                        .HM(data.get(12))
                        .PV(data.get(13))
                        .RN(data.get(14))
                        .RN_DAY(data.get(15))
                        .RN_JUN(data.get(16))
                        .RN_INT(data.get(17))
                        .SD_HR3(data.get(18))
                        .SD_DAY(data.get(19))
                        .SD_TOT(data.get(20))
                        .WC(data.get(21))
                        .WP(data.get(22))
                        .WW(data.get(23))
                        .CA_TOT(data.get(24))
                        .CA_MID(data.get(25))
                        .CH_MIN(data.get(26))
                        .CT(data.get(27))
                        .CT_TOP(data.get(28))
                        .CT_MID(data.get(29))
                        .CT_LOW(data.get(30))
                        .VS(data.get(31))
                        .SS(data.get(32))
                        .SI(data.get(33))
                        .ST_GD(data.get(34))
                        .TS(data.get(35))
                        .TE_005(data.get(36))
                        .TE_01(data.get(37))
                        .TE_02(data.get(38))
                        .TE_03(data.get(39))
                        .ST_SEA(data.get(40))
                        .WH(data.get(41))
                        .BF(data.get(42))
                        .IR(data.get(43))
                        .IX(data.get(44))
                        .build();
                weatherContents.add(weather);
//                System.out.println(weather.toString());
            }
        }

        return weatherContents;

    }
}


package app.civil.civilapp.dto.weather;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Spot {
    String STN_ID ;// 지점번호
    String LON ;// 경도(degree)
    String LAT ; // 위도(degree)
    String STN_SP ;// 지점 특성코드
    String HT ;// 노장 해발고도 (m)
    String HT_PA ;// 기압계 해발고도 (m)
    String HT_TA ;// 온도계 지상높이 (m)
    String HT_WD ;// 풍향/풍속계 지상높이 (m)
    String HT_RN ;// 우량계 지상높이 (m)
    String STN_CD ;// 지점코드 : 항공등에서 사용
    String STN_KO ;// 지점명(한글)
    String STN_EN ;// 지점명(영문)
    String STN_AD ;// 관리관서번호
    String FCT_ID ;// 예보구역코드
    String LAW_ID ;// 법정동코드
    String BASIN ;// 수계코드

    @Override
    public String toString() {
        return
                "STN_ID=" + STN_ID + ", LON= " + LON + ", LAT=" + LAT + ", STN_SP=" + STN_SP + ", HT=" + HT
                        + ", HT_PA=" + HT_PA + ", HT_TA=" + HT_TA + ", HT_WD=" + HT_WD + ", HT_RN=" + HT_RN
                        + ", STN_CD=" + STN_CD + ", STN_KO=" + STN_KO + ", STN_EN=" + STN_EN + ", STN_AD=" + STN_AD + ", FCT_ID=" + FCT_ID
                        + ", LAW_ID=" + LAW_ID + ", BASIN=" + BASIN
                ;
    }
}
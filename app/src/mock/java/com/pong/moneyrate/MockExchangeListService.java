package com.pong.moneyrate;

import android.os.Handler;
import android.support.annotation.NonNull;

import com.pong.moneyrate.feature.exchange.list.model.DailyExchangeListResponse;
import com.pong.moneyrate.feature.exchange.list.service.ExchangeListService;
import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.moneyrate.utils.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 27/7/2560.
 */

public class MockExchangeListService implements ExchangeListService {
    @Override
    public void loadExchangeList(String date, @NonNull final OnExchangeListCallback callback) {
        ExchangeDetail usd = new ExchangeDetail();
        usd.setPeriod(DateUtils.getFormattedDate("yyyy-MM-dd", new Date()));
        usd.setCurrencyId("USD");
        usd.setCurrencyNameTh("สหรัฐอเมริกา : ดอลลาร์ (USD)");
        usd.setCurrencyNameEng("USA : DOLLAR (USD)");
        usd.setBuyingSight("33.2589000");
        usd.setBuyingTransfer("33.3400000");
        usd.setSelling("33.6586000");
        usd.setMidRate("33.4993000");

        ExchangeDetail gbp = new ExchangeDetail();
        gbp.setPeriod(DateUtils.getFormattedDate("yyyy-MM-dd", new Date()));
        gbp.setCurrencyId("GBP");
        gbp.setCurrencyNameTh("อังกฤษ : ปอนด์สเตอร์ลิง (GBP)");
        gbp.setCurrencyNameEng("UNITED KINGDOM : POUND STERING (GBP)");
        gbp.setBuyingSight("43.0688000");
        gbp.setBuyingTransfer("43.1949000");
        gbp.setSelling("44.0972000");
        gbp.setMidRate("43.6461000");

        ExchangeDetail eur = new ExchangeDetail();
        eur.setPeriod(DateUtils.getFormattedDate("yyyy-MM-dd", new Date()));
        eur.setCurrencyId("EUR");
        eur.setCurrencyNameTh("ยูโรโซน : ยูโร (EUR)");
        eur.setCurrencyNameEng("EURO ZONE : EURO (EUR)");
        eur.setBuyingSight("38.5245000");
        eur.setBuyingTransfer("38.6262000");
        eur.setSelling("39.3434000");
        eur.setMidRate("38.9848000");

        ExchangeDetail jpy = new ExchangeDetail();
        jpy.setPeriod(DateUtils.getFormattedDate("yyyy-MM-dd", new Date()));
        jpy.setCurrencyId("JPY");
        jpy.setCurrencyNameTh("ญี่ปุ่น : เยน (100 เยน) (JPY)");
        jpy.setCurrencyNameEng("JAPAN : YEN (100 YEN) (JPY)");
        jpy.setBuyingSight("29.5025000");
        jpy.setBuyingTransfer("29.5858000");
        jpy.setSelling("30.2856000");
        jpy.setMidRate("29.9357000");

        List<ExchangeDetail> list = new ArrayList<>();
        list.add(usd);
        list.add(gbp);
        list.add(eur);
        list.add(jpy);

        DailyExchangeListResponse.ResultBean.DataBean.DataHeaderBean header
                = new DailyExchangeListResponse.ResultBean.DataBean.DataHeaderBean();

        header.setReport_name_eng("Rates of Exchange of Commercial Banks in Bangkok Metropolis (2002-present)");
        header.setReport_name_th("อัตราแลกเปลี่ยนเฉลี่ยของธนาคารพาณิชย์ในกรุงเทพมหานคร (2545");
        header.setReport_uoq_name_eng("(Unit : Baht / 1 Unit of Foreign Currency)");
        header.setReport_uoq_name_th("(หน่วย : บาท ต่อ 1 หน่วยเงินตราต่างปร");

        DailyExchangeListResponse.ResultBean.DataBean data = new DailyExchangeListResponse.ResultBean.DataBean();
        data.setData_detail(list);
        data.setData_header(header);

        DailyExchangeListResponse.ResultBean result = new DailyExchangeListResponse.ResultBean();
        result.setSuccess("true");
        result.setApi("Daily Weighted-average Interbank Exchange Rate - THB / USD");
        result.setTimestamp(DateUtils.getFormattedDate("yyyy-MM-dd HH:mm:ss", new Date()));
        result.setData(data);

        final DailyExchangeListResponse response = new DailyExchangeListResponse();
        response.setResult(result);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onApiSuccess(response);
            }
        }, 2000);

//        callback.onApiSuccess(response);
    }
}

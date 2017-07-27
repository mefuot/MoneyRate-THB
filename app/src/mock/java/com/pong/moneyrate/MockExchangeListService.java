package com.pong.moneyrate;

import android.support.annotation.NonNull;

import com.pong.moneyrate.feature.list.model.DailyExchangeListResponse;
import com.pong.moneyrate.feature.list.service.ExchangeListService;
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
    public void loadExchangeList(String date, @NonNull OnExchangeListCallback callback) {
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
        gbp.setCurrencyId("USD");
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
        jpy.setCurrencyId("EUR");
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

        DailyExchangeListResponse.ResultBean.DataBean data = new DailyExchangeListResponse.ResultBean.DataBean();
        data.setData_detail(list);

        DailyExchangeListResponse.ResultBean result = new DailyExchangeListResponse.ResultBean();
        result.setSuccess("true");
        result.setApi("Daily Weighted-average Interbank Exchange Rate - THB / USD");
        result.setTimestamp(DateUtils.getFormattedDate("yyyy-MM-dd HH:mm:ss", new Date()));
        result.setData(data);

        DailyExchangeListResponse response = new DailyExchangeListResponse();
        response.setResult(result);

        callback.onApiSuccess(response);
    }
}

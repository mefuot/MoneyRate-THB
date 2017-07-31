package com.pong.moneyrate.feature.exchange.list.model;

import com.pong.moneyrate.model.ExchangeDetail;

import java.util.List;

/**
 * Created by User on 27/7/2560.
 */

public class DailyExchangeListResponse {

    /**
     * result : {"success":"true","api":"Daily Weighted-average Interbank Exchange Rate - THB / USD","timestamp":"2017-07-27 15:58:56","data":{"data_header":{"report_name_eng":"Rates of Exchange of Commercial Banks in Bangkok Metropolis (2002-present)","report_name_th":"อัตราแลกเปลี่ยนเฉลี่ยของธนาคารพาณิชย์ในกรุงเทพมหานคร (2545-ปัจจุบัน)","report_uoq_name_eng":"(Unit : Baht / 1 Unit of Foreign Currency)","report_uoq_name_th":"(หน่วย : บาท ต่อ 1 หน่วยเงินตราต่างประเทศ)","report_source_of_data":[{"source_of_data_eng":"Bank of Thailand","source_of_data_th":"ธนาคารแห่งประเทศไทย"}],"report_remark":[{"report_remark_eng":"Since Nov 16, 2015 the data regarding Buying Transfer Rate of PKR has been changed to Buying Rate using Foreign Exchange Rates (THOMSON REUTERS) with Bangkok Market Crossing.","report_remark_th":"ตั้งแต่วันที่ 16 พ.ย. 2558 ข้อมูลในอัตราซื้อเงินโอนของสกุล PKR ได้เปลี่ยนเป็นอัตราซื้อที่ใช้อัตราในตลาดต่างประเทศ (ทอมสันรอยเตอร์) คำนวณผ่านอัตราซื้อขายเงินดอลลาร์ สรอ. ในตลาดกรุงเทพฯ"}],"last_updated":"2017-07-26"},"data_detail":[{"period":"2017-07-26","currency_id":"USD","currency_name_th":"สหรัฐอเมริกา : ดอลลาร์ (USD)","currency_name_eng":"USA : DOLLAR (USD) ","buying_sight":"33.2589000","buying_transfer":"33.3400000","selling":"33.6586000","mid_rate":"33.4993000"},{"period":"2017-07-26","currency_id":"GBP","currency_name_th":"อังกฤษ : ปอนด์สเตอร์ลิง (GBP)","currency_name_eng":"UNITED KINGDOM : POUND STERING (GBP)","buying_sight":"43.0688000","buying_transfer":"43.1949000","selling":"44.0972000","mid_rate":"43.6461000"},{"period":"2017-07-26","currency_id":"EUR","currency_name_th":"ยูโรโซน : ยูโร (EUR)","currency_name_eng":"EURO ZONE : EURO (EUR)","buying_sight":"38.5245000","buying_transfer":"38.6262000","selling":"39.3434000","mid_rate":"38.9848000"},{"period":"2017-07-26","currency_id":"JPY","currency_name_th":"ญี่ปุ่น : เยน (100 เยน) (JPY)","currency_name_eng":"JAPAN : YEN (100 YEN) (JPY) ","buying_sight":"29.5025000","buying_transfer":"29.5858000","selling":"30.2856000","mid_rate":"29.9357000"},{"period":"2017-07-26","currency_id":"HKD","currency_name_th":"ฮ่องกง : ดอลลาร์ (HKD) ","currency_name_eng":"HONG KONG : DOLLAR (HKD)","buying_sight":"4.2371000","buying_transfer":"4.2516000","selling":"4.3264000","mid_rate":"4.2890000"},{"period":"2017-07-26","currency_id":"MYR","currency_name_th":"มาเลเซีย : ริงกิต (MYR)","currency_name_eng":"MALAYSIA : RINGGIT (MYR)","buying_sight":"7.6733000","buying_transfer":"7.7170000","selling":"7.9286000","mid_rate":"7.8228000"},{"period":"2017-07-26","currency_id":"SGD","currency_name_th":"สิงคโปร์ : ดอลลาร์ (SGD) ","currency_name_eng":"SINGAPORE : DOLLAR (SGD)","buying_sight":"24.2348000","buying_transfer":"24.3053000","selling":"24.8528000","mid_rate":"24.5791000"},{"period":"2017-07-26","currency_id":"BND","currency_name_th":"บรูไนดารุสซาลาม : ดอลลาร์ (BND)","currency_name_eng":"BRUNEI : DOLLAR (BND) ","buying_sight":"23.8500000","buying_transfer":"24.2738000","selling":"24.8594000","mid_rate":"24.5666000"},{"period":"2017-07-26","currency_id":"PHP","currency_name_th":"ฟิลิปปินส์ : เปโซ (PHP) ","currency_name_eng":"PHILIPPINES : PESO (PHP) ","buying_sight":"0.6459000","buying_transfer":"0.6511000","selling":"0.6745000","mid_rate":"0.6628000"},{"period":"2017-07-26","currency_id":"IDR","currency_name_th":"อินโดนิเซีย : รูเปีย (1,000 รูเปีย) (IDR)","currency_name_eng":"INDONESIA : RUPIAH (1,000 RUPIAH) (IDR)","buying_sight":"2.3672000","buying_transfer":"2.3827000","selling":"2.6591000","mid_rate":"2.5209000"},{"period":"2017-07-26","currency_id":"INR","currency_name_th":"อินเดีย : รูปี (INR) ","currency_name_eng":"INDIA : RUPEE (INR)","buying_sight":"0.4721000","buying_transfer":"0.4892000","selling":"0.5516000","mid_rate":"0.5204000"},{"period":"2017-07-26","currency_id":"CHF","currency_name_th":"สวิสเซอร์แลนด์ : ฟรังก์ (CHF)","currency_name_eng":"SWITZERLAND : FRANC (CHF) ","buying_sight":"34.7501000","buying_transfer":"34.8409000","selling":"35.4934000","mid_rate":"35.1672000"},{"period":"2017-07-26","currency_id":"AUD","currency_name_th":"ออสเตรเลีย : ดอลลาร์ (AUD)","currency_name_eng":"AUSTRALIA : DOLLAR (AUD) ","buying_sight":"26.0541000","buying_transfer":"26.1286000","selling":"26.8801000","mid_rate":"26.5044000"},{"period":"2017-07-26","currency_id":"NZD","currency_name_th":"นิวซีแลนด์ : ดอลลาร์ (NZD)","currency_name_eng":"NEW ZEALAND : DOLLAR (NZD)","buying_sight":"24.4916000","buying_transfer":"24.5730000","selling":"25.1691000","mid_rate":"24.8711000"},{"period":"2017-07-26","currency_id":"PKR","currency_name_th":"ปากีสถาน : รูปี (PKR) ","currency_name_eng":"PAKISTAN : RUPEE (PKR)","buying_sight":"","buying_transfer":"0.3167000","selling":"0.3197000","mid_rate":"0.3182000"},{"period":"2017-07-26","currency_id":"CAD","currency_name_th":"แคนาดา : ดอลลาร์ (CAD)","currency_name_eng":"CANADA : DOLLAR (CAD)","buying_sight":"26.4449000","buying_transfer":"26.5293000","selling":"27.0060000","mid_rate":"26.7677000"},{"period":"2017-07-26","currency_id":"SEK","currency_name_th":"สวีเดน : โครนา (SEK)","currency_name_eng":"SWEDEN : KRONA (SEK)","buying_sight":"4.0231000","buying_transfer":"4.0401000","selling":"4.1178000","mid_rate":"4.0790000"},{"period":"2017-07-26","currency_id":"DKK","currency_name_th":"เดนมาร์ก : โครน (DKK)","currency_name_eng":"DENMARK : KRONE (DKK) ","buying_sight":"5.1818000","buying_transfer":"5.1981000","selling":"5.2894000","mid_rate":"5.2438000"},{"period":"2017-07-26","currency_id":"NOK","currency_name_th":"นอร์เวย์ : โครน (NOK) ","currency_name_eng":"NORWAY : KRONE (NOK)","buying_sight":"4.1427000","buying_transfer":"4.1573000","selling":"4.2385000","mid_rate":"4.1979000"},{"period":"2017-07-26","currency_id":"CNY","currency_name_th":"จีน : หยวน เรนมินบิ (CNY)","currency_name_eng":"CHINA : YUAN RENMINBI (CNY)","buying_sight":"4.8887000","buying_transfer":"4.9105000","selling":"5.0193000","mid_rate":"4.9649000"},{"period":"2017-07-26","currency_id":"MXN","currency_name_th":"เม็กซิโก : เปโซ (MXN)","currency_name_eng":"MEXICO : PESO (MXN)","buying_sight":"","buying_transfer":"1.8755000","selling":"1.8934000","mid_rate":"1.8845000"},{"period":"2017-07-26","currency_id":"ZAR","currency_name_th":"แอฟริกาใต้ : แรนด์ (ZAR)","currency_name_eng":"SOUTH AFRICA : RAND (ZAR)","buying_sight":"","buying_transfer":"2.5484000","selling":"2.5728000","mid_rate":"2.5606000"},{"period":"2017-07-26","currency_id":"MMK","currency_name_th":"พม่า : จัต (MMK)","currency_name_eng":"MYANMAR : KYAT (MMK) ","buying_sight":"","buying_transfer":"0.0243000","selling":"0.0246000","mid_rate":"0.0245000"},{"period":"2017-07-26","currency_id":"KRW","currency_name_th":"เกาหลีใต้ : วอน (KRW) ","currency_name_eng":"SOUTH KOREA : WON (KRW) ","buying_sight":"","buying_transfer":"0.0298000","selling":"0.0301000","mid_rate":"0.0300000"},{"period":"2017-07-26","currency_id":"TWD","currency_name_th":"ไต้หวัน : ดอลลาร์ (TWD) ","currency_name_eng":"TAIWAN : DOLLAR (TWD)","buying_sight":"","buying_transfer":"1.0985000","selling":"1.1090000","mid_rate":"1.1038000"},{"period":"2017-07-26","currency_id":"KWD","currency_name_th":"คูเวต : ดีนาร์ (KWD)","currency_name_eng":"KUWAIT : DINAR (KWD) ","buying_sight":"","buying_transfer":"110.2878000","selling":"111.3417000","mid_rate":"110.8148000"},{"period":"2017-07-26","currency_id":"SAR","currency_name_th":"ซาอุดีอาระเบีย : ริยาล (SAR)","currency_name_eng":"SAUDI ARABIA : RIYAL (SAR)","buying_sight":"","buying_transfer":"8.8904000","selling":"8.9754000","mid_rate":"8.9329000"},{"period":"2017-07-26","currency_id":"AED","currency_name_th":"สหรัฐอาหรับเอมิเรตส์ : ดีแรห์ม (AED) ","currency_name_eng":"UNITED ARAB EMIRATES : DIRHAM (AED)","buying_sight":"","buying_transfer":"9.0770000","selling":"9.1638000","mid_rate":"9.1204000"},{"period":"2017-07-26","currency_id":"BDT","currency_name_th":"บังกลาเทศ : ตากา (BDT)","currency_name_eng":"BANGLADESH : TAKA (BDT)","buying_sight":"","buying_transfer":"0.4105000","selling":"0.4144000","mid_rate":"0.4125000"},{"period":"2017-07-26","currency_id":"CZK","currency_name_th":"สาธารณรัฐเช็ก : คราวน์ (CZK)","currency_name_eng":"CZECH REPUBLIC : KORUNA (CZK)","buying_sight":"","buying_transfer":"1.4913000","selling":"1.5055000","mid_rate":"1.4984000"},{"period":"2017-07-26","currency_id":"KHR","currency_name_th":"กัมพูชา : เรียล (KHR)","currency_name_eng":"CAMBODIA : RIEL (KHR) ","buying_sight":"","buying_transfer":"0.0081000","selling":"0.0082000","mid_rate":"0.0082000"},{"period":"2017-07-26","currency_id":"KES","currency_name_th":"เคนยา : ชิลลิ่ง (KES)","currency_name_eng":"KENYA : SHILLING (KES) ","buying_sight":"","buying_transfer":"0.3209000","selling":"0.3240000","mid_rate":"0.3225000"},{"period":"2017-07-26","currency_id":"LAK","currency_name_th":"ลาว : กีบ (LAK)","currency_name_eng":"LAO PEOPLE'S DEMOCRATIC REPUBLIC : KIP (LAK)","buying_sight":"","buying_transfer":"0.0040000","selling":"0.0041000","mid_rate":"0.0041000"},{"period":"2017-07-26","currency_id":"RUB","currency_name_th":"รัสเซีย : รูเบิล (RUB)","currency_name_eng":"RUSSIAN FEDERATION : RUBLE (RUB) ","buying_sight":"","buying_transfer":"0.5568000","selling":"0.5621000","mid_rate":"0.5595000"},{"period":"2017-07-26","currency_id":"VND","currency_name_th":"เวียดนาม : ดอง (VND)","currency_name_eng":"VIET NAM : DONG (VND) ","buying_sight":"","buying_transfer":"0.0015000","selling":"0.0015000","mid_rate":"0.0015000"},{"period":"2017-07-26","currency_id":"EGP","currency_name_th":"อียิปต์ : ปอนด์ อียิปต์ (EGP)","currency_name_eng":"EGYPT : EGYPTIAN POUND (EGP) ","buying_sight":"","buying_transfer":"1.8605000","selling":"1.8783000","mid_rate":"1.8694000"},{"period":"2017-07-26","currency_id":"PLN","currency_name_th":"โปแลนด์ : สล็อตตี (PLN)","currency_name_eng":"POLAND : ZLOTY (PLN) ","buying_sight":"","buying_transfer":"9.1053000","selling":"9.1923000","mid_rate":"9.1488000"},{"period":"2017-07-26","currency_id":"LKR","currency_name_th":"ศรีลังกา : รูปี ศรีลังกา (LKR)","currency_name_eng":"SRI LANKA : SRI LANKA RUPEE (LKR) ","buying_sight":"","buying_transfer":"0.2173000","selling":"0.2194000","mid_rate":"0.2184000"},{"period":"2017-07-26","currency_id":"IQD","currency_name_th":"อิรัก : ดีนาร์ อิรัก (IQD)","currency_name_eng":"IRAQ : IRAQI DINAR (IQD) ","buying_sight":"","buying_transfer":"0.0285000","selling":"0.0288000","mid_rate":"0.0287000"},{"period":"2017-07-26","currency_id":"BHD","currency_name_th":"บาห์เรน : ดีนาร์ บาห์เรน (BHD)","currency_name_eng":"BAHRAIN : BAHRAIN DINAR (BHD) ","buying_sight":"","buying_transfer":"88.4116000","selling":"89.2564000","mid_rate":"88.8340000"},{"period":"2017-07-26","currency_id":"OMR","currency_name_th":"โอมาน : เรียล โอมาน (OMR)","currency_name_eng":"OMAN : RIAL OMANI (OMR) ","buying_sight":"","buying_transfer":"86.6199000","selling":"87.4476000","mid_rate":"87.0338000"},{"period":"2017-07-26","currency_id":"JOD","currency_name_th":"จอร์แดน : ดอลลาร์ จอร์แดน (JOD)","currency_name_eng":"JORDAN : JORDANIAN DINAR (JOD) ","buying_sight":"","buying_transfer":"47.0041000","selling":"47.4533000","mid_rate":"47.2287000"},{"period":"2017-07-26","currency_id":"QAR","currency_name_th":"กาตาร์ : เรียล กาตาร์ (QAR)","currency_name_eng":"QATAR : QATARI RIAL (QAR) ","buying_sight":"","buying_transfer":"9.0808000","selling":"9.1675000","mid_rate":"9.1242000"},{"period":"2017-07-26","currency_id":"MVR","currency_name_th":"มัลดีฟส์ : รูฟียา (MVR)","currency_name_eng":"MALDIVES : RUFIYAA (MVR) ","buying_sight":"","buying_transfer":"2.1441000","selling":"2.1645000","mid_rate":"2.1543000"},{"period":"2017-07-26","currency_id":"NPR","currency_name_th":"เนปาล : รูปี เนปาล (NPR)","currency_name_eng":"NEPAL : NEPALESE RUPEE (NPR) ","buying_sight":"","buying_transfer":"0.3238000","selling":"0.3269000","mid_rate":"0.3254000"},{"period":"2017-07-26","currency_id":"PGK","currency_name_th":"ปาปัวนิวกินี : คีนา (PGK)","currency_name_eng":"PAPUA NEW GUINEA : KINA (PGK) ","buying_sight":"","buying_transfer":"10.5121000","selling":"10.6126000","mid_rate":"10.5624000"},{"period":"2017-07-26","currency_id":"ILS","currency_name_th":"อิสราเอล : เชคเกิล อิสราเอล (ILS)","currency_name_eng":"ISRAEL : NEW ISRAELI SHEKEL (ILS) ","buying_sight":"","buying_transfer":"9.3267000","selling":"9.4158000","mid_rate":"9.3713000"},{"period":"2017-07-26","currency_id":"HUF","currency_name_th":"ฮังการี : ฟอรินท์ (HUF)","currency_name_eng":"HUNGARY : FORINT (HUF) ","buying_sight":"","buying_transfer":"0.1271000","selling":"0.1283000","mid_rate":"0.1277000"}]}}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * success : true
         * api : Daily Weighted-average Interbank Exchange Rate - THB / USD
         * timestamp : 2017-07-27 15:58:56
         * data : {"data_header":{"report_name_eng":"Rates of Exchange of Commercial Banks in Bangkok Metropolis (2002-present)","report_name_th":"อัตราแลกเปลี่ยนเฉลี่ยของธนาคารพาณิชย์ในกรุงเทพมหานคร (2545-ปัจจุบัน)","report_uoq_name_eng":"(Unit : Baht / 1 Unit of Foreign Currency)","report_uoq_name_th":"(หน่วย : บาท ต่อ 1 หน่วยเงินตราต่างประเทศ)","report_source_of_data":[{"source_of_data_eng":"Bank of Thailand","source_of_data_th":"ธนาคารแห่งประเทศไทย"}],"report_remark":[{"report_remark_eng":"Since Nov 16, 2015 the data regarding Buying Transfer Rate of PKR has been changed to Buying Rate using Foreign Exchange Rates (THOMSON REUTERS) with Bangkok Market Crossing.","report_remark_th":"ตั้งแต่วันที่ 16 พ.ย. 2558 ข้อมูลในอัตราซื้อเงินโอนของสกุล PKR ได้เปลี่ยนเป็นอัตราซื้อที่ใช้อัตราในตลาดต่างประเทศ (ทอมสันรอยเตอร์) คำนวณผ่านอัตราซื้อขายเงินดอลลาร์ สรอ. ในตลาดกรุงเทพฯ"}],"last_updated":"2017-07-26"},"data_detail":[{"period":"2017-07-26","currency_id":"USD","currency_name_th":"สหรัฐอเมริกา : ดอลลาร์ (USD)","currency_name_eng":"USA : DOLLAR (USD) ","buying_sight":"33.2589000","buying_transfer":"33.3400000","selling":"33.6586000","mid_rate":"33.4993000"},{"period":"2017-07-26","currency_id":"GBP","currency_name_th":"อังกฤษ : ปอนด์สเตอร์ลิง (GBP)","currency_name_eng":"UNITED KINGDOM : POUND STERING (GBP)","buying_sight":"43.0688000","buying_transfer":"43.1949000","selling":"44.0972000","mid_rate":"43.6461000"},{"period":"2017-07-26","currency_id":"EUR","currency_name_th":"ยูโรโซน : ยูโร (EUR)","currency_name_eng":"EURO ZONE : EURO (EUR)","buying_sight":"38.5245000","buying_transfer":"38.6262000","selling":"39.3434000","mid_rate":"38.9848000"},{"period":"2017-07-26","currency_id":"JPY","currency_name_th":"ญี่ปุ่น : เยน (100 เยน) (JPY)","currency_name_eng":"JAPAN : YEN (100 YEN) (JPY) ","buying_sight":"29.5025000","buying_transfer":"29.5858000","selling":"30.2856000","mid_rate":"29.9357000"},{"period":"2017-07-26","currency_id":"HKD","currency_name_th":"ฮ่องกง : ดอลลาร์ (HKD) ","currency_name_eng":"HONG KONG : DOLLAR (HKD)","buying_sight":"4.2371000","buying_transfer":"4.2516000","selling":"4.3264000","mid_rate":"4.2890000"},{"period":"2017-07-26","currency_id":"MYR","currency_name_th":"มาเลเซีย : ริงกิต (MYR)","currency_name_eng":"MALAYSIA : RINGGIT (MYR)","buying_sight":"7.6733000","buying_transfer":"7.7170000","selling":"7.9286000","mid_rate":"7.8228000"},{"period":"2017-07-26","currency_id":"SGD","currency_name_th":"สิงคโปร์ : ดอลลาร์ (SGD) ","currency_name_eng":"SINGAPORE : DOLLAR (SGD)","buying_sight":"24.2348000","buying_transfer":"24.3053000","selling":"24.8528000","mid_rate":"24.5791000"},{"period":"2017-07-26","currency_id":"BND","currency_name_th":"บรูไนดารุสซาลาม : ดอลลาร์ (BND)","currency_name_eng":"BRUNEI : DOLLAR (BND) ","buying_sight":"23.8500000","buying_transfer":"24.2738000","selling":"24.8594000","mid_rate":"24.5666000"},{"period":"2017-07-26","currency_id":"PHP","currency_name_th":"ฟิลิปปินส์ : เปโซ (PHP) ","currency_name_eng":"PHILIPPINES : PESO (PHP) ","buying_sight":"0.6459000","buying_transfer":"0.6511000","selling":"0.6745000","mid_rate":"0.6628000"},{"period":"2017-07-26","currency_id":"IDR","currency_name_th":"อินโดนิเซีย : รูเปีย (1,000 รูเปีย) (IDR)","currency_name_eng":"INDONESIA : RUPIAH (1,000 RUPIAH) (IDR)","buying_sight":"2.3672000","buying_transfer":"2.3827000","selling":"2.6591000","mid_rate":"2.5209000"},{"period":"2017-07-26","currency_id":"INR","currency_name_th":"อินเดีย : รูปี (INR) ","currency_name_eng":"INDIA : RUPEE (INR)","buying_sight":"0.4721000","buying_transfer":"0.4892000","selling":"0.5516000","mid_rate":"0.5204000"},{"period":"2017-07-26","currency_id":"CHF","currency_name_th":"สวิสเซอร์แลนด์ : ฟรังก์ (CHF)","currency_name_eng":"SWITZERLAND : FRANC (CHF) ","buying_sight":"34.7501000","buying_transfer":"34.8409000","selling":"35.4934000","mid_rate":"35.1672000"},{"period":"2017-07-26","currency_id":"AUD","currency_name_th":"ออสเตรเลีย : ดอลลาร์ (AUD)","currency_name_eng":"AUSTRALIA : DOLLAR (AUD) ","buying_sight":"26.0541000","buying_transfer":"26.1286000","selling":"26.8801000","mid_rate":"26.5044000"},{"period":"2017-07-26","currency_id":"NZD","currency_name_th":"นิวซีแลนด์ : ดอลลาร์ (NZD)","currency_name_eng":"NEW ZEALAND : DOLLAR (NZD)","buying_sight":"24.4916000","buying_transfer":"24.5730000","selling":"25.1691000","mid_rate":"24.8711000"},{"period":"2017-07-26","currency_id":"PKR","currency_name_th":"ปากีสถาน : รูปี (PKR) ","currency_name_eng":"PAKISTAN : RUPEE (PKR)","buying_sight":"","buying_transfer":"0.3167000","selling":"0.3197000","mid_rate":"0.3182000"},{"period":"2017-07-26","currency_id":"CAD","currency_name_th":"แคนาดา : ดอลลาร์ (CAD)","currency_name_eng":"CANADA : DOLLAR (CAD)","buying_sight":"26.4449000","buying_transfer":"26.5293000","selling":"27.0060000","mid_rate":"26.7677000"},{"period":"2017-07-26","currency_id":"SEK","currency_name_th":"สวีเดน : โครนา (SEK)","currency_name_eng":"SWEDEN : KRONA (SEK)","buying_sight":"4.0231000","buying_transfer":"4.0401000","selling":"4.1178000","mid_rate":"4.0790000"},{"period":"2017-07-26","currency_id":"DKK","currency_name_th":"เดนมาร์ก : โครน (DKK)","currency_name_eng":"DENMARK : KRONE (DKK) ","buying_sight":"5.1818000","buying_transfer":"5.1981000","selling":"5.2894000","mid_rate":"5.2438000"},{"period":"2017-07-26","currency_id":"NOK","currency_name_th":"นอร์เวย์ : โครน (NOK) ","currency_name_eng":"NORWAY : KRONE (NOK)","buying_sight":"4.1427000","buying_transfer":"4.1573000","selling":"4.2385000","mid_rate":"4.1979000"},{"period":"2017-07-26","currency_id":"CNY","currency_name_th":"จีน : หยวน เรนมินบิ (CNY)","currency_name_eng":"CHINA : YUAN RENMINBI (CNY)","buying_sight":"4.8887000","buying_transfer":"4.9105000","selling":"5.0193000","mid_rate":"4.9649000"},{"period":"2017-07-26","currency_id":"MXN","currency_name_th":"เม็กซิโก : เปโซ (MXN)","currency_name_eng":"MEXICO : PESO (MXN)","buying_sight":"","buying_transfer":"1.8755000","selling":"1.8934000","mid_rate":"1.8845000"},{"period":"2017-07-26","currency_id":"ZAR","currency_name_th":"แอฟริกาใต้ : แรนด์ (ZAR)","currency_name_eng":"SOUTH AFRICA : RAND (ZAR)","buying_sight":"","buying_transfer":"2.5484000","selling":"2.5728000","mid_rate":"2.5606000"},{"period":"2017-07-26","currency_id":"MMK","currency_name_th":"พม่า : จัต (MMK)","currency_name_eng":"MYANMAR : KYAT (MMK) ","buying_sight":"","buying_transfer":"0.0243000","selling":"0.0246000","mid_rate":"0.0245000"},{"period":"2017-07-26","currency_id":"KRW","currency_name_th":"เกาหลีใต้ : วอน (KRW) ","currency_name_eng":"SOUTH KOREA : WON (KRW) ","buying_sight":"","buying_transfer":"0.0298000","selling":"0.0301000","mid_rate":"0.0300000"},{"period":"2017-07-26","currency_id":"TWD","currency_name_th":"ไต้หวัน : ดอลลาร์ (TWD) ","currency_name_eng":"TAIWAN : DOLLAR (TWD)","buying_sight":"","buying_transfer":"1.0985000","selling":"1.1090000","mid_rate":"1.1038000"},{"period":"2017-07-26","currency_id":"KWD","currency_name_th":"คูเวต : ดีนาร์ (KWD)","currency_name_eng":"KUWAIT : DINAR (KWD) ","buying_sight":"","buying_transfer":"110.2878000","selling":"111.3417000","mid_rate":"110.8148000"},{"period":"2017-07-26","currency_id":"SAR","currency_name_th":"ซาอุดีอาระเบีย : ริยาล (SAR)","currency_name_eng":"SAUDI ARABIA : RIYAL (SAR)","buying_sight":"","buying_transfer":"8.8904000","selling":"8.9754000","mid_rate":"8.9329000"},{"period":"2017-07-26","currency_id":"AED","currency_name_th":"สหรัฐอาหรับเอมิเรตส์ : ดีแรห์ม (AED) ","currency_name_eng":"UNITED ARAB EMIRATES : DIRHAM (AED)","buying_sight":"","buying_transfer":"9.0770000","selling":"9.1638000","mid_rate":"9.1204000"},{"period":"2017-07-26","currency_id":"BDT","currency_name_th":"บังกลาเทศ : ตากา (BDT)","currency_name_eng":"BANGLADESH : TAKA (BDT)","buying_sight":"","buying_transfer":"0.4105000","selling":"0.4144000","mid_rate":"0.4125000"},{"period":"2017-07-26","currency_id":"CZK","currency_name_th":"สาธารณรัฐเช็ก : คราวน์ (CZK)","currency_name_eng":"CZECH REPUBLIC : KORUNA (CZK)","buying_sight":"","buying_transfer":"1.4913000","selling":"1.5055000","mid_rate":"1.4984000"},{"period":"2017-07-26","currency_id":"KHR","currency_name_th":"กัมพูชา : เรียล (KHR)","currency_name_eng":"CAMBODIA : RIEL (KHR) ","buying_sight":"","buying_transfer":"0.0081000","selling":"0.0082000","mid_rate":"0.0082000"},{"period":"2017-07-26","currency_id":"KES","currency_name_th":"เคนยา : ชิลลิ่ง (KES)","currency_name_eng":"KENYA : SHILLING (KES) ","buying_sight":"","buying_transfer":"0.3209000","selling":"0.3240000","mid_rate":"0.3225000"},{"period":"2017-07-26","currency_id":"LAK","currency_name_th":"ลาว : กีบ (LAK)","currency_name_eng":"LAO PEOPLE'S DEMOCRATIC REPUBLIC : KIP (LAK)","buying_sight":"","buying_transfer":"0.0040000","selling":"0.0041000","mid_rate":"0.0041000"},{"period":"2017-07-26","currency_id":"RUB","currency_name_th":"รัสเซีย : รูเบิล (RUB)","currency_name_eng":"RUSSIAN FEDERATION : RUBLE (RUB) ","buying_sight":"","buying_transfer":"0.5568000","selling":"0.5621000","mid_rate":"0.5595000"},{"period":"2017-07-26","currency_id":"VND","currency_name_th":"เวียดนาม : ดอง (VND)","currency_name_eng":"VIET NAM : DONG (VND) ","buying_sight":"","buying_transfer":"0.0015000","selling":"0.0015000","mid_rate":"0.0015000"},{"period":"2017-07-26","currency_id":"EGP","currency_name_th":"อียิปต์ : ปอนด์ อียิปต์ (EGP)","currency_name_eng":"EGYPT : EGYPTIAN POUND (EGP) ","buying_sight":"","buying_transfer":"1.8605000","selling":"1.8783000","mid_rate":"1.8694000"},{"period":"2017-07-26","currency_id":"PLN","currency_name_th":"โปแลนด์ : สล็อตตี (PLN)","currency_name_eng":"POLAND : ZLOTY (PLN) ","buying_sight":"","buying_transfer":"9.1053000","selling":"9.1923000","mid_rate":"9.1488000"},{"period":"2017-07-26","currency_id":"LKR","currency_name_th":"ศรีลังกา : รูปี ศรีลังกา (LKR)","currency_name_eng":"SRI LANKA : SRI LANKA RUPEE (LKR) ","buying_sight":"","buying_transfer":"0.2173000","selling":"0.2194000","mid_rate":"0.2184000"},{"period":"2017-07-26","currency_id":"IQD","currency_name_th":"อิรัก : ดีนาร์ อิรัก (IQD)","currency_name_eng":"IRAQ : IRAQI DINAR (IQD) ","buying_sight":"","buying_transfer":"0.0285000","selling":"0.0288000","mid_rate":"0.0287000"},{"period":"2017-07-26","currency_id":"BHD","currency_name_th":"บาห์เรน : ดีนาร์ บาห์เรน (BHD)","currency_name_eng":"BAHRAIN : BAHRAIN DINAR (BHD) ","buying_sight":"","buying_transfer":"88.4116000","selling":"89.2564000","mid_rate":"88.8340000"},{"period":"2017-07-26","currency_id":"OMR","currency_name_th":"โอมาน : เรียล โอมาน (OMR)","currency_name_eng":"OMAN : RIAL OMANI (OMR) ","buying_sight":"","buying_transfer":"86.6199000","selling":"87.4476000","mid_rate":"87.0338000"},{"period":"2017-07-26","currency_id":"JOD","currency_name_th":"จอร์แดน : ดอลลาร์ จอร์แดน (JOD)","currency_name_eng":"JORDAN : JORDANIAN DINAR (JOD) ","buying_sight":"","buying_transfer":"47.0041000","selling":"47.4533000","mid_rate":"47.2287000"},{"period":"2017-07-26","currency_id":"QAR","currency_name_th":"กาตาร์ : เรียล กาตาร์ (QAR)","currency_name_eng":"QATAR : QATARI RIAL (QAR) ","buying_sight":"","buying_transfer":"9.0808000","selling":"9.1675000","mid_rate":"9.1242000"},{"period":"2017-07-26","currency_id":"MVR","currency_name_th":"มัลดีฟส์ : รูฟียา (MVR)","currency_name_eng":"MALDIVES : RUFIYAA (MVR) ","buying_sight":"","buying_transfer":"2.1441000","selling":"2.1645000","mid_rate":"2.1543000"},{"period":"2017-07-26","currency_id":"NPR","currency_name_th":"เนปาล : รูปี เนปาล (NPR)","currency_name_eng":"NEPAL : NEPALESE RUPEE (NPR) ","buying_sight":"","buying_transfer":"0.3238000","selling":"0.3269000","mid_rate":"0.3254000"},{"period":"2017-07-26","currency_id":"PGK","currency_name_th":"ปาปัวนิวกินี : คีนา (PGK)","currency_name_eng":"PAPUA NEW GUINEA : KINA (PGK) ","buying_sight":"","buying_transfer":"10.5121000","selling":"10.6126000","mid_rate":"10.5624000"},{"period":"2017-07-26","currency_id":"ILS","currency_name_th":"อิสราเอล : เชคเกิล อิสราเอล (ILS)","currency_name_eng":"ISRAEL : NEW ISRAELI SHEKEL (ILS) ","buying_sight":"","buying_transfer":"9.3267000","selling":"9.4158000","mid_rate":"9.3713000"},{"period":"2017-07-26","currency_id":"HUF","currency_name_th":"ฮังการี : ฟอรินท์ (HUF)","currency_name_eng":"HUNGARY : FORINT (HUF) ","buying_sight":"","buying_transfer":"0.1271000","selling":"0.1283000","mid_rate":"0.1277000"}]}
         */

        private String success;
        private String api;
        private String timestamp;
        private DataBean data;

        public String getSuccess() {
            return success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }

        public String getApi() {
            return api;
        }

        public void setApi(String api) {
            this.api = api;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * data_header : {"report_name_eng":"Rates of Exchange of Commercial Banks in Bangkok Metropolis (2002-present)","report_name_th":"อัตราแลกเปลี่ยนเฉลี่ยของธนาคารพาณิชย์ในกรุงเทพมหานคร (2545-ปัจจุบัน)","report_uoq_name_eng":"(Unit : Baht / 1 Unit of Foreign Currency)","report_uoq_name_th":"(หน่วย : บาท ต่อ 1 หน่วยเงินตราต่างประเทศ)","report_source_of_data":[{"source_of_data_eng":"Bank of Thailand","source_of_data_th":"ธนาคารแห่งประเทศไทย"}],"report_remark":[{"report_remark_eng":"Since Nov 16, 2015 the data regarding Buying Transfer Rate of PKR has been changed to Buying Rate using Foreign Exchange Rates (THOMSON REUTERS) with Bangkok Market Crossing.","report_remark_th":"ตั้งแต่วันที่ 16 พ.ย. 2558 ข้อมูลในอัตราซื้อเงินโอนของสกุล PKR ได้เปลี่ยนเป็นอัตราซื้อที่ใช้อัตราในตลาดต่างประเทศ (ทอมสันรอยเตอร์) คำนวณผ่านอัตราซื้อขายเงินดอลลาร์ สรอ. ในตลาดกรุงเทพฯ"}],"last_updated":"2017-07-26"}
             * data_detail : [{"period":"2017-07-26","currency_id":"USD","currency_name_th":"สหรัฐอเมริกา : ดอลลาร์ (USD)","currency_name_eng":"USA : DOLLAR (USD) ","buying_sight":"33.2589000","buying_transfer":"33.3400000","selling":"33.6586000","mid_rate":"33.4993000"},{"period":"2017-07-26","currency_id":"GBP","currency_name_th":"อังกฤษ : ปอนด์สเตอร์ลิง (GBP)","currency_name_eng":"UNITED KINGDOM : POUND STERING (GBP)","buying_sight":"43.0688000","buying_transfer":"43.1949000","selling":"44.0972000","mid_rate":"43.6461000"},{"period":"2017-07-26","currency_id":"EUR","currency_name_th":"ยูโรโซน : ยูโร (EUR)","currency_name_eng":"EURO ZONE : EURO (EUR)","buying_sight":"38.5245000","buying_transfer":"38.6262000","selling":"39.3434000","mid_rate":"38.9848000"},{"period":"2017-07-26","currency_id":"JPY","currency_name_th":"ญี่ปุ่น : เยน (100 เยน) (JPY)","currency_name_eng":"JAPAN : YEN (100 YEN) (JPY) ","buying_sight":"29.5025000","buying_transfer":"29.5858000","selling":"30.2856000","mid_rate":"29.9357000"},{"period":"2017-07-26","currency_id":"HKD","currency_name_th":"ฮ่องกง : ดอลลาร์ (HKD) ","currency_name_eng":"HONG KONG : DOLLAR (HKD)","buying_sight":"4.2371000","buying_transfer":"4.2516000","selling":"4.3264000","mid_rate":"4.2890000"},{"period":"2017-07-26","currency_id":"MYR","currency_name_th":"มาเลเซีย : ริงกิต (MYR)","currency_name_eng":"MALAYSIA : RINGGIT (MYR)","buying_sight":"7.6733000","buying_transfer":"7.7170000","selling":"7.9286000","mid_rate":"7.8228000"},{"period":"2017-07-26","currency_id":"SGD","currency_name_th":"สิงคโปร์ : ดอลลาร์ (SGD) ","currency_name_eng":"SINGAPORE : DOLLAR (SGD)","buying_sight":"24.2348000","buying_transfer":"24.3053000","selling":"24.8528000","mid_rate":"24.5791000"},{"period":"2017-07-26","currency_id":"BND","currency_name_th":"บรูไนดารุสซาลาม : ดอลลาร์ (BND)","currency_name_eng":"BRUNEI : DOLLAR (BND) ","buying_sight":"23.8500000","buying_transfer":"24.2738000","selling":"24.8594000","mid_rate":"24.5666000"},{"period":"2017-07-26","currency_id":"PHP","currency_name_th":"ฟิลิปปินส์ : เปโซ (PHP) ","currency_name_eng":"PHILIPPINES : PESO (PHP) ","buying_sight":"0.6459000","buying_transfer":"0.6511000","selling":"0.6745000","mid_rate":"0.6628000"},{"period":"2017-07-26","currency_id":"IDR","currency_name_th":"อินโดนิเซีย : รูเปีย (1,000 รูเปีย) (IDR)","currency_name_eng":"INDONESIA : RUPIAH (1,000 RUPIAH) (IDR)","buying_sight":"2.3672000","buying_transfer":"2.3827000","selling":"2.6591000","mid_rate":"2.5209000"},{"period":"2017-07-26","currency_id":"INR","currency_name_th":"อินเดีย : รูปี (INR) ","currency_name_eng":"INDIA : RUPEE (INR)","buying_sight":"0.4721000","buying_transfer":"0.4892000","selling":"0.5516000","mid_rate":"0.5204000"},{"period":"2017-07-26","currency_id":"CHF","currency_name_th":"สวิสเซอร์แลนด์ : ฟรังก์ (CHF)","currency_name_eng":"SWITZERLAND : FRANC (CHF) ","buying_sight":"34.7501000","buying_transfer":"34.8409000","selling":"35.4934000","mid_rate":"35.1672000"},{"period":"2017-07-26","currency_id":"AUD","currency_name_th":"ออสเตรเลีย : ดอลลาร์ (AUD)","currency_name_eng":"AUSTRALIA : DOLLAR (AUD) ","buying_sight":"26.0541000","buying_transfer":"26.1286000","selling":"26.8801000","mid_rate":"26.5044000"},{"period":"2017-07-26","currency_id":"NZD","currency_name_th":"นิวซีแลนด์ : ดอลลาร์ (NZD)","currency_name_eng":"NEW ZEALAND : DOLLAR (NZD)","buying_sight":"24.4916000","buying_transfer":"24.5730000","selling":"25.1691000","mid_rate":"24.8711000"},{"period":"2017-07-26","currency_id":"PKR","currency_name_th":"ปากีสถาน : รูปี (PKR) ","currency_name_eng":"PAKISTAN : RUPEE (PKR)","buying_sight":"","buying_transfer":"0.3167000","selling":"0.3197000","mid_rate":"0.3182000"},{"period":"2017-07-26","currency_id":"CAD","currency_name_th":"แคนาดา : ดอลลาร์ (CAD)","currency_name_eng":"CANADA : DOLLAR (CAD)","buying_sight":"26.4449000","buying_transfer":"26.5293000","selling":"27.0060000","mid_rate":"26.7677000"},{"period":"2017-07-26","currency_id":"SEK","currency_name_th":"สวีเดน : โครนา (SEK)","currency_name_eng":"SWEDEN : KRONA (SEK)","buying_sight":"4.0231000","buying_transfer":"4.0401000","selling":"4.1178000","mid_rate":"4.0790000"},{"period":"2017-07-26","currency_id":"DKK","currency_name_th":"เดนมาร์ก : โครน (DKK)","currency_name_eng":"DENMARK : KRONE (DKK) ","buying_sight":"5.1818000","buying_transfer":"5.1981000","selling":"5.2894000","mid_rate":"5.2438000"},{"period":"2017-07-26","currency_id":"NOK","currency_name_th":"นอร์เวย์ : โครน (NOK) ","currency_name_eng":"NORWAY : KRONE (NOK)","buying_sight":"4.1427000","buying_transfer":"4.1573000","selling":"4.2385000","mid_rate":"4.1979000"},{"period":"2017-07-26","currency_id":"CNY","currency_name_th":"จีน : หยวน เรนมินบิ (CNY)","currency_name_eng":"CHINA : YUAN RENMINBI (CNY)","buying_sight":"4.8887000","buying_transfer":"4.9105000","selling":"5.0193000","mid_rate":"4.9649000"},{"period":"2017-07-26","currency_id":"MXN","currency_name_th":"เม็กซิโก : เปโซ (MXN)","currency_name_eng":"MEXICO : PESO (MXN)","buying_sight":"","buying_transfer":"1.8755000","selling":"1.8934000","mid_rate":"1.8845000"},{"period":"2017-07-26","currency_id":"ZAR","currency_name_th":"แอฟริกาใต้ : แรนด์ (ZAR)","currency_name_eng":"SOUTH AFRICA : RAND (ZAR)","buying_sight":"","buying_transfer":"2.5484000","selling":"2.5728000","mid_rate":"2.5606000"},{"period":"2017-07-26","currency_id":"MMK","currency_name_th":"พม่า : จัต (MMK)","currency_name_eng":"MYANMAR : KYAT (MMK) ","buying_sight":"","buying_transfer":"0.0243000","selling":"0.0246000","mid_rate":"0.0245000"},{"period":"2017-07-26","currency_id":"KRW","currency_name_th":"เกาหลีใต้ : วอน (KRW) ","currency_name_eng":"SOUTH KOREA : WON (KRW) ","buying_sight":"","buying_transfer":"0.0298000","selling":"0.0301000","mid_rate":"0.0300000"},{"period":"2017-07-26","currency_id":"TWD","currency_name_th":"ไต้หวัน : ดอลลาร์ (TWD) ","currency_name_eng":"TAIWAN : DOLLAR (TWD)","buying_sight":"","buying_transfer":"1.0985000","selling":"1.1090000","mid_rate":"1.1038000"},{"period":"2017-07-26","currency_id":"KWD","currency_name_th":"คูเวต : ดีนาร์ (KWD)","currency_name_eng":"KUWAIT : DINAR (KWD) ","buying_sight":"","buying_transfer":"110.2878000","selling":"111.3417000","mid_rate":"110.8148000"},{"period":"2017-07-26","currency_id":"SAR","currency_name_th":"ซาอุดีอาระเบีย : ริยาล (SAR)","currency_name_eng":"SAUDI ARABIA : RIYAL (SAR)","buying_sight":"","buying_transfer":"8.8904000","selling":"8.9754000","mid_rate":"8.9329000"},{"period":"2017-07-26","currency_id":"AED","currency_name_th":"สหรัฐอาหรับเอมิเรตส์ : ดีแรห์ม (AED) ","currency_name_eng":"UNITED ARAB EMIRATES : DIRHAM (AED)","buying_sight":"","buying_transfer":"9.0770000","selling":"9.1638000","mid_rate":"9.1204000"},{"period":"2017-07-26","currency_id":"BDT","currency_name_th":"บังกลาเทศ : ตากา (BDT)","currency_name_eng":"BANGLADESH : TAKA (BDT)","buying_sight":"","buying_transfer":"0.4105000","selling":"0.4144000","mid_rate":"0.4125000"},{"period":"2017-07-26","currency_id":"CZK","currency_name_th":"สาธารณรัฐเช็ก : คราวน์ (CZK)","currency_name_eng":"CZECH REPUBLIC : KORUNA (CZK)","buying_sight":"","buying_transfer":"1.4913000","selling":"1.5055000","mid_rate":"1.4984000"},{"period":"2017-07-26","currency_id":"KHR","currency_name_th":"กัมพูชา : เรียล (KHR)","currency_name_eng":"CAMBODIA : RIEL (KHR) ","buying_sight":"","buying_transfer":"0.0081000","selling":"0.0082000","mid_rate":"0.0082000"},{"period":"2017-07-26","currency_id":"KES","currency_name_th":"เคนยา : ชิลลิ่ง (KES)","currency_name_eng":"KENYA : SHILLING (KES) ","buying_sight":"","buying_transfer":"0.3209000","selling":"0.3240000","mid_rate":"0.3225000"},{"period":"2017-07-26","currency_id":"LAK","currency_name_th":"ลาว : กีบ (LAK)","currency_name_eng":"LAO PEOPLE'S DEMOCRATIC REPUBLIC : KIP (LAK)","buying_sight":"","buying_transfer":"0.0040000","selling":"0.0041000","mid_rate":"0.0041000"},{"period":"2017-07-26","currency_id":"RUB","currency_name_th":"รัสเซีย : รูเบิล (RUB)","currency_name_eng":"RUSSIAN FEDERATION : RUBLE (RUB) ","buying_sight":"","buying_transfer":"0.5568000","selling":"0.5621000","mid_rate":"0.5595000"},{"period":"2017-07-26","currency_id":"VND","currency_name_th":"เวียดนาม : ดอง (VND)","currency_name_eng":"VIET NAM : DONG (VND) ","buying_sight":"","buying_transfer":"0.0015000","selling":"0.0015000","mid_rate":"0.0015000"},{"period":"2017-07-26","currency_id":"EGP","currency_name_th":"อียิปต์ : ปอนด์ อียิปต์ (EGP)","currency_name_eng":"EGYPT : EGYPTIAN POUND (EGP) ","buying_sight":"","buying_transfer":"1.8605000","selling":"1.8783000","mid_rate":"1.8694000"},{"period":"2017-07-26","currency_id":"PLN","currency_name_th":"โปแลนด์ : สล็อตตี (PLN)","currency_name_eng":"POLAND : ZLOTY (PLN) ","buying_sight":"","buying_transfer":"9.1053000","selling":"9.1923000","mid_rate":"9.1488000"},{"period":"2017-07-26","currency_id":"LKR","currency_name_th":"ศรีลังกา : รูปี ศรีลังกา (LKR)","currency_name_eng":"SRI LANKA : SRI LANKA RUPEE (LKR) ","buying_sight":"","buying_transfer":"0.2173000","selling":"0.2194000","mid_rate":"0.2184000"},{"period":"2017-07-26","currency_id":"IQD","currency_name_th":"อิรัก : ดีนาร์ อิรัก (IQD)","currency_name_eng":"IRAQ : IRAQI DINAR (IQD) ","buying_sight":"","buying_transfer":"0.0285000","selling":"0.0288000","mid_rate":"0.0287000"},{"period":"2017-07-26","currency_id":"BHD","currency_name_th":"บาห์เรน : ดีนาร์ บาห์เรน (BHD)","currency_name_eng":"BAHRAIN : BAHRAIN DINAR (BHD) ","buying_sight":"","buying_transfer":"88.4116000","selling":"89.2564000","mid_rate":"88.8340000"},{"period":"2017-07-26","currency_id":"OMR","currency_name_th":"โอมาน : เรียล โอมาน (OMR)","currency_name_eng":"OMAN : RIAL OMANI (OMR) ","buying_sight":"","buying_transfer":"86.6199000","selling":"87.4476000","mid_rate":"87.0338000"},{"period":"2017-07-26","currency_id":"JOD","currency_name_th":"จอร์แดน : ดอลลาร์ จอร์แดน (JOD)","currency_name_eng":"JORDAN : JORDANIAN DINAR (JOD) ","buying_sight":"","buying_transfer":"47.0041000","selling":"47.4533000","mid_rate":"47.2287000"},{"period":"2017-07-26","currency_id":"QAR","currency_name_th":"กาตาร์ : เรียล กาตาร์ (QAR)","currency_name_eng":"QATAR : QATARI RIAL (QAR) ","buying_sight":"","buying_transfer":"9.0808000","selling":"9.1675000","mid_rate":"9.1242000"},{"period":"2017-07-26","currency_id":"MVR","currency_name_th":"มัลดีฟส์ : รูฟียา (MVR)","currency_name_eng":"MALDIVES : RUFIYAA (MVR) ","buying_sight":"","buying_transfer":"2.1441000","selling":"2.1645000","mid_rate":"2.1543000"},{"period":"2017-07-26","currency_id":"NPR","currency_name_th":"เนปาล : รูปี เนปาล (NPR)","currency_name_eng":"NEPAL : NEPALESE RUPEE (NPR) ","buying_sight":"","buying_transfer":"0.3238000","selling":"0.3269000","mid_rate":"0.3254000"},{"period":"2017-07-26","currency_id":"PGK","currency_name_th":"ปาปัวนิวกินี : คีนา (PGK)","currency_name_eng":"PAPUA NEW GUINEA : KINA (PGK) ","buying_sight":"","buying_transfer":"10.5121000","selling":"10.6126000","mid_rate":"10.5624000"},{"period":"2017-07-26","currency_id":"ILS","currency_name_th":"อิสราเอล : เชคเกิล อิสราเอล (ILS)","currency_name_eng":"ISRAEL : NEW ISRAELI SHEKEL (ILS) ","buying_sight":"","buying_transfer":"9.3267000","selling":"9.4158000","mid_rate":"9.3713000"},{"period":"2017-07-26","currency_id":"HUF","currency_name_th":"ฮังการี : ฟอรินท์ (HUF)","currency_name_eng":"HUNGARY : FORINT (HUF) ","buying_sight":"","buying_transfer":"0.1271000","selling":"0.1283000","mid_rate":"0.1277000"}]
             */

            private DataHeaderBean data_header;
            private List<ExchangeDetail> data_detail;

            public DataHeaderBean getData_header() {
                return data_header;
            }

            public void setData_header(DataHeaderBean data_header) {
                this.data_header = data_header;
            }

            public List<ExchangeDetail> getData_detail() {
                return data_detail;
            }

            public void setData_detail(List<ExchangeDetail> data_detail) {
                this.data_detail = data_detail;
            }

            public static class DataHeaderBean {
                /**
                 * report_name_eng : Rates of Exchange of Commercial Banks in Bangkok Metropolis (2002-present)
                 * report_name_th : อัตราแลกเปลี่ยนเฉลี่ยของธนาคารพาณิชย์ในกรุงเทพมหานคร (2545-ปัจจุบัน)
                 * report_uoq_name_eng : (Unit : Baht / 1 Unit of Foreign Currency)
                 * report_uoq_name_th : (หน่วย : บาท ต่อ 1 หน่วยเงินตราต่างประเทศ)
                 * report_source_of_data : [{"source_of_data_eng":"Bank of Thailand","source_of_data_th":"ธนาคารแห่งประเทศไทย"}]
                 * report_remark : [{"report_remark_eng":"Since Nov 16, 2015 the data regarding Buying Transfer Rate of PKR has been changed to Buying Rate using Foreign Exchange Rates (THOMSON REUTERS) with Bangkok Market Crossing.","report_remark_th":"ตั้งแต่วันที่ 16 พ.ย. 2558 ข้อมูลในอัตราซื้อเงินโอนของสกุล PKR ได้เปลี่ยนเป็นอัตราซื้อที่ใช้อัตราในตลาดต่างประเทศ (ทอมสันรอยเตอร์) คำนวณผ่านอัตราซื้อขายเงินดอลลาร์ สรอ. ในตลาดกรุงเทพฯ"}]
                 * last_updated : 2017-07-26
                 */

                private String report_name_eng;
                private String report_name_th;
                private String report_uoq_name_eng;
                private String report_uoq_name_th;
                private String last_updated;
                private List<ReportSourceOfDataBean> report_source_of_data;
                private List<ReportRemarkBean> report_remark;

                public String getReport_name_eng() {
                    return report_name_eng;
                }

                public void setReport_name_eng(String report_name_eng) {
                    this.report_name_eng = report_name_eng;
                }

                public String getReport_name_th() {
                    return report_name_th;
                }

                public void setReport_name_th(String report_name_th) {
                    this.report_name_th = report_name_th;
                }

                public String getReport_uoq_name_eng() {
                    return report_uoq_name_eng;
                }

                public void setReport_uoq_name_eng(String report_uoq_name_eng) {
                    this.report_uoq_name_eng = report_uoq_name_eng;
                }

                public String getReport_uoq_name_th() {
                    return report_uoq_name_th;
                }

                public void setReport_uoq_name_th(String report_uoq_name_th) {
                    this.report_uoq_name_th = report_uoq_name_th;
                }

                public String getLast_updated() {
                    return last_updated;
                }

                public void setLast_updated(String last_updated) {
                    this.last_updated = last_updated;
                }

                public List<ReportSourceOfDataBean> getReport_source_of_data() {
                    return report_source_of_data;
                }

                public void setReport_source_of_data(List<ReportSourceOfDataBean> report_source_of_data) {
                    this.report_source_of_data = report_source_of_data;
                }

                public List<ReportRemarkBean> getReport_remark() {
                    return report_remark;
                }

                public void setReport_remark(List<ReportRemarkBean> report_remark) {
                    this.report_remark = report_remark;
                }

                public static class ReportSourceOfDataBean {
                    /**
                     * source_of_data_eng : Bank of Thailand
                     * source_of_data_th : ธนาคารแห่งประเทศไทย
                     */

                    private String source_of_data_eng;
                    private String source_of_data_th;

                    public String getSource_of_data_eng() {
                        return source_of_data_eng;
                    }

                    public void setSource_of_data_eng(String source_of_data_eng) {
                        this.source_of_data_eng = source_of_data_eng;
                    }

                    public String getSource_of_data_th() {
                        return source_of_data_th;
                    }

                    public void setSource_of_data_th(String source_of_data_th) {
                        this.source_of_data_th = source_of_data_th;
                    }
                }

                public static class ReportRemarkBean {
                    /**
                     * report_remark_eng : Since Nov 16, 2015 the data regarding Buying Transfer Rate of PKR has been changed to Buying Rate using Foreign Exchange Rates (THOMSON REUTERS) with Bangkok Market Crossing.
                     * report_remark_th : ตั้งแต่วันที่ 16 พ.ย. 2558 ข้อมูลในอัตราซื้อเงินโอนของสกุล PKR ได้เปลี่ยนเป็นอัตราซื้อที่ใช้อัตราในตลาดต่างประเทศ (ทอมสันรอยเตอร์) คำนวณผ่านอัตราซื้อขายเงินดอลลาร์ สรอ. ในตลาดกรุงเทพฯ
                     */

                    private String report_remark_eng;
                    private String report_remark_th;

                    public String getReport_remark_eng() {
                        return report_remark_eng;
                    }

                    public void setReport_remark_eng(String report_remark_eng) {
                        this.report_remark_eng = report_remark_eng;
                    }

                    public String getReport_remark_th() {
                        return report_remark_th;
                    }

                    public void setReport_remark_th(String report_remark_th) {
                        this.report_remark_th = report_remark_th;
                    }
                }
            }
        }
    }
}

package PosGateway.Exchange.Hps;

import java.util.Hashtable;

import org.ksoap2.serialization.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.ksoap2.serialization.PropertyInfo;

public class PosReportBatchDetailRspTypeDetails extends AttributeContainer implements KvmSerializable {

    public Integer GatewayTxnId = 0;

    public java.util.Date TxnUtcDT;

    public String TxnStatus;

    public String SiteTrace;

    public String DebitCreditInd;

    public String SaleReturnInd;

    public String CardSwiped;

    public String CardType;

    public String MaskedCardNbr;

    public String CardHolderLastName;

    public String CardHolderFirstName;

    public String CardHolderAddr;

    public String CardHolderCity;

    public String CardHolderState;

    public String CardHolderZip;

    public String CardHolderPhone;

    public String CardHolderEmail;

    public BigDecimal GratuityAmtInfo = BigDecimal.ZERO;

    public BigDecimal CashbackAmtInfo = BigDecimal.ZERO;

    public BigDecimal AuthAmt = BigDecimal.ZERO;

    public BigDecimal SettlementAmt = BigDecimal.ZERO;

    public String RspCode;

    public String RspText;

    public String AuthCode;

    public String AVSRsltCode;

    public String CVVRsltCode;

    public String DirectMktInvoiceNbr;

    public Integer DirectMktShipMonth = 0;

    public Integer DirectMktShipDay = 0;

    public String CPCCardHolderPONbr;

    public String CPCTaxType;

    public BigDecimal CPCTaxAmt = BigDecimal.ZERO;

    public Enums.tzoneConversionType TzConversion = Enums.tzoneConversionType.Merchant;

    public java.util.Date TxnDT;

    public BigDecimal Amt = BigDecimal.ZERO;

    public LodgingDataType LodgingData;

    public String ClerkID;

    public String ServiceName;

    public AdditionalTxnFieldsType AdditionalTxnFields;

    public CredentialDataType CredentialData;

    public BigDecimal ConvenienceAmtInfo;

    public BigDecimal ShippingAmtInfo;

    public ArrayList<AttachmentInfoType> AttachmentInfo = new ArrayList<AttachmentInfoType>();

    public String PaymentMethodKey;

    public RecurringDataType RecurringData;

    public BigDecimal SurchargeAmtInfo;

    public PosReportBatchDetailRspTypeDetails() {
    }

    public PosReportBatchDetailRspTypeDetails(AttributeContainer inObj, ExtendedSoapSerializationEnvelope envelope) {

        if (inObj == null)
            return;


        SoapObject soapObject = (SoapObject) inObj;
        if (soapObject.hasProperty("GatewayTxnId")) {
            Object obj = soapObject.getProperty("GatewayTxnId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.GatewayTxnId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.GatewayTxnId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("TxnUtcDT")) {
            Object obj = soapObject.getProperty("TxnUtcDT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TxnUtcDT = Helper.ConvertFromWebService(j.toString());
                }
            } else if (obj != null && obj instanceof java.util.Date) {
                this.TxnUtcDT = (java.util.Date) obj;
            }
        }
        if (soapObject.hasProperty("TxnStatus")) {
            Object obj = soapObject.getProperty("TxnStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TxnStatus = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.TxnStatus = (String) obj;
            }
        }
        if (soapObject.hasProperty("SiteTrace")) {
            Object obj = soapObject.getProperty("SiteTrace");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SiteTrace = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.SiteTrace = (String) obj;
            }
        }
        if (soapObject.hasProperty("DebitCreditInd")) {
            Object obj = soapObject.getProperty("DebitCreditInd");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DebitCreditInd = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.DebitCreditInd = (String) obj;
            }
        }
        if (soapObject.hasProperty("SaleReturnInd")) {
            Object obj = soapObject.getProperty("SaleReturnInd");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SaleReturnInd = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.SaleReturnInd = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardSwiped")) {
            Object obj = soapObject.getProperty("CardSwiped");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardSwiped = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardSwiped = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardType")) {
            Object obj = soapObject.getProperty("CardType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardType = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardType = (String) obj;
            }
        }
        if (soapObject.hasProperty("MaskedCardNbr")) {
            Object obj = soapObject.getProperty("MaskedCardNbr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.MaskedCardNbr = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.MaskedCardNbr = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderLastName")) {
            Object obj = soapObject.getProperty("CardHolderLastName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderLastName = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderLastName = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderFirstName")) {
            Object obj = soapObject.getProperty("CardHolderFirstName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderFirstName = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderFirstName = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderAddr")) {
            Object obj = soapObject.getProperty("CardHolderAddr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderAddr = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderAddr = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderCity")) {
            Object obj = soapObject.getProperty("CardHolderCity");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderCity = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderCity = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderState")) {
            Object obj = soapObject.getProperty("CardHolderState");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderState = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderState = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderZip")) {
            Object obj = soapObject.getProperty("CardHolderZip");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderZip = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderZip = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderPhone")) {
            Object obj = soapObject.getProperty("CardHolderPhone");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderPhone = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderPhone = (String) obj;
            }
        }
        if (soapObject.hasProperty("CardHolderEmail")) {
            Object obj = soapObject.getProperty("CardHolderEmail");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CardHolderEmail = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CardHolderEmail = (String) obj;
            }
        }
        if (soapObject.hasProperty("GratuityAmtInfo")) {
            Object obj = soapObject.getProperty("GratuityAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.GratuityAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.GratuityAmtInfo = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("CashbackAmtInfo")) {
            Object obj = soapObject.getProperty("CashbackAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CashbackAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.CashbackAmtInfo = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("AuthAmt")) {
            Object obj = soapObject.getProperty("AuthAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.AuthAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.AuthAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("SettlementAmt")) {
            Object obj = soapObject.getProperty("SettlementAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SettlementAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.SettlementAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("RspCode")) {
            Object obj = soapObject.getProperty("RspCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.RspCode = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.RspCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("RspText")) {
            Object obj = soapObject.getProperty("RspText");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.RspText = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.RspText = (String) obj;
            }
        }
        if (soapObject.hasProperty("AuthCode")) {
            Object obj = soapObject.getProperty("AuthCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.AuthCode = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.AuthCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("AVSRsltCode")) {
            Object obj = soapObject.getProperty("AVSRsltCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.AVSRsltCode = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.AVSRsltCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("CVVRsltCode")) {
            Object obj = soapObject.getProperty("CVVRsltCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CVVRsltCode = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CVVRsltCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("DirectMktInvoiceNbr")) {
            Object obj = soapObject.getProperty("DirectMktInvoiceNbr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DirectMktInvoiceNbr = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.DirectMktInvoiceNbr = (String) obj;
            }
        }
        if (soapObject.hasProperty("DirectMktShipMonth")) {
            Object obj = soapObject.getProperty("DirectMktShipMonth");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DirectMktShipMonth = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.DirectMktShipMonth = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("DirectMktShipDay")) {
            Object obj = soapObject.getProperty("DirectMktShipDay");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DirectMktShipDay = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.DirectMktShipDay = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CPCCardHolderPONbr")) {
            Object obj = soapObject.getProperty("CPCCardHolderPONbr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CPCCardHolderPONbr = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CPCCardHolderPONbr = (String) obj;
            }
        }
        if (soapObject.hasProperty("CPCTaxType")) {
            Object obj = soapObject.getProperty("CPCTaxType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CPCTaxType = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.CPCTaxType = (String) obj;
            }
        }
        if (soapObject.hasProperty("CPCTaxAmt")) {
            Object obj = soapObject.getProperty("CPCTaxAmt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.CPCTaxAmt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.CPCTaxAmt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("TzConversion")) {
            Object obj = soapObject.getProperty("TzConversion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TzConversion = Enums.tzoneConversionType.fromString(j.toString());
                }
            } else if (obj != null && obj instanceof Enums.tzoneConversionType) {
                this.TzConversion = (Enums.tzoneConversionType) obj;
            }
        }
        if (soapObject.hasProperty("TxnDT")) {
            Object obj = soapObject.getProperty("TxnDT");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.TxnDT = Helper.ConvertFromWebService(j.toString());
                }
            } else if (obj != null && obj instanceof java.util.Date) {
                this.TxnDT = (java.util.Date) obj;
            }
        }
        if (soapObject.hasProperty("Amt")) {
            Object obj = soapObject.getProperty("Amt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.Amt = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.Amt = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("LodgingData")) {
            Object j = soapObject.getProperty("LodgingData");
            this.LodgingData = (LodgingDataType) envelope.get(j, LodgingDataType.class);
        }
        if (soapObject.hasProperty("ClerkID")) {
            Object obj = soapObject.getProperty("ClerkID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ClerkID = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.ClerkID = (String) obj;
            }
        }
        if (soapObject.hasProperty("ServiceName")) {
            Object obj = soapObject.getProperty("ServiceName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ServiceName = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.ServiceName = (String) obj;
            }
        }
        if (soapObject.hasProperty("AdditionalTxnFields")) {
            Object j = soapObject.getProperty("AdditionalTxnFields");
            this.AdditionalTxnFields = (AdditionalTxnFieldsType) envelope.get(j, AdditionalTxnFieldsType.class);
        }
        if (soapObject.hasProperty("CredentialData")) {
            Object j = soapObject.getProperty("CredentialData");
            this.CredentialData = (CredentialDataType) envelope.get(j, CredentialDataType.class);
        }
        if (soapObject.hasProperty("ConvenienceAmtInfo")) {
            Object obj = soapObject.getProperty("ConvenienceAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ConvenienceAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.ConvenienceAmtInfo = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("ShippingAmtInfo")) {
            Object obj = soapObject.getProperty("ShippingAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.ShippingAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.ShippingAmtInfo = (BigDecimal) obj;
            }
        }
        if (soapObject.hasProperty("AttachmentInfo")) {
            int size = soapObject.getPropertyCount();
            this.AttachmentInfo = new ArrayList<AttachmentInfoType>();
            for (int i0 = 0; i0 < size; i0++) {
                PropertyInfo info = new PropertyInfo();
                soapObject.getPropertyInfo(i0, info);
                Object obj = info.getValue();
                if (obj != null && info.name.equals("AttachmentInfo")) {
                    Object j = info.getValue();
                    AttachmentInfoType j1 = (AttachmentInfoType) envelope.get(j, AttachmentInfoType.class);
                    this.AttachmentInfo.add(j1);
                }
            }
        }
        if (soapObject.hasProperty("PaymentMethodKey")) {
            Object obj = soapObject.getProperty("PaymentMethodKey");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.PaymentMethodKey = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.PaymentMethodKey = (String) obj;
            }
        }
        if (soapObject.hasProperty("RecurringData")) {
            Object j = soapObject.getProperty("RecurringData");
            this.RecurringData = (RecurringDataType) envelope.get(j, RecurringDataType.class);
        }
        if (soapObject.hasProperty("SurchargeAmtInfo")) {
            Object obj = soapObject.getProperty("SurchargeAmtInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.SurchargeAmtInfo = new BigDecimal(j.toString());
                }
            } else if (obj != null && obj instanceof BigDecimal) {
                this.SurchargeAmtInfo = (BigDecimal) obj;
            }
        }


    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (propertyIndex == 0) {
            return GatewayTxnId;
        }
        if (propertyIndex == 1) {
            return TxnUtcDT;
        }
        if (propertyIndex == 2) {
            return TxnStatus != null ? TxnStatus : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 3) {
            return SiteTrace != null ? SiteTrace : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 4) {
            return DebitCreditInd != null ? DebitCreditInd : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 5) {
            return SaleReturnInd != null ? SaleReturnInd : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 6) {
            return CardSwiped != null ? CardSwiped : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 7) {
            return CardType != null ? CardType : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 8) {
            return MaskedCardNbr != null ? MaskedCardNbr : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 9) {
            return CardHolderLastName != null ? CardHolderLastName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 10) {
            return CardHolderFirstName != null ? CardHolderFirstName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 11) {
            return CardHolderAddr != null ? CardHolderAddr : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 12) {
            return CardHolderCity != null ? CardHolderCity : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 13) {
            return CardHolderState != null ? CardHolderState : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 14) {
            return CardHolderZip != null ? CardHolderZip : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 15) {
            return CardHolderPhone != null ? CardHolderPhone : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 16) {
            return CardHolderEmail != null ? CardHolderEmail : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 17) {
            return GratuityAmtInfo != null ? GratuityAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 18) {
            return CashbackAmtInfo != null ? CashbackAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 19) {
            return AuthAmt != null ? AuthAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 20) {
            return SettlementAmt != null ? SettlementAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 21) {
            return RspCode != null ? RspCode : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 22) {
            return RspText != null ? RspText : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 23) {
            return AuthCode != null ? AuthCode : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 24) {
            return AVSRsltCode != null ? AVSRsltCode : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 25) {
            return CVVRsltCode != null ? CVVRsltCode : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 26) {
            return DirectMktInvoiceNbr != null ? DirectMktInvoiceNbr : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 27) {
            return DirectMktShipMonth;
        }
        if (propertyIndex == 28) {
            return DirectMktShipDay;
        }
        if (propertyIndex == 29) {
            return CPCCardHolderPONbr != null ? CPCCardHolderPONbr : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 30) {
            return CPCTaxType != null ? CPCTaxType : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 31) {
            return CPCTaxAmt != null ? CPCTaxAmt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 32) {
            return TzConversion != null ? TzConversion.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 33) {
            return TxnDT;
        }
        if (propertyIndex == 34) {
            return Amt != null ? Amt.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 35) {
            return LodgingData != null ? LodgingData : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 36) {
            return ClerkID != null ? ClerkID : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 37) {
            return ServiceName != null ? ServiceName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 38) {
            return AdditionalTxnFields != null ? AdditionalTxnFields : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 39) {
            return CredentialData != null ? CredentialData : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 40) {
            return ConvenienceAmtInfo != null ? ConvenienceAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 41) {
            return ShippingAmtInfo != null ? ShippingAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 42) {
            return PaymentMethodKey != null ? PaymentMethodKey : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 43) {
            return RecurringData != null ? RecurringData : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 44) {
            return SurchargeAmtInfo != null ? SurchargeAmtInfo.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex >= +45 && propertyIndex < +45 + this.AttachmentInfo.size()) {
            return AttachmentInfo.get(propertyIndex - (+45));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 45 + AttachmentInfo.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "GatewayTxnId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 1) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TxnUtcDT";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 2) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TxnStatus";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 3) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SiteTrace";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 4) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DebitCreditInd";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 5) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SaleReturnInd";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 6) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardSwiped";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 7) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardType";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 8) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "MaskedCardNbr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 9) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderLastName";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 10) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderFirstName";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 11) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderAddr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 12) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderCity";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 13) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderState";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 14) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderZip";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 15) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderPhone";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 16) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CardHolderEmail";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 17) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "GratuityAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 18) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CashbackAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 19) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AuthAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 20) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SettlementAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 21) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "RspCode";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 22) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "RspText";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 23) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AuthCode";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 24) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AVSRsltCode";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 25) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CVVRsltCode";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 26) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DirectMktInvoiceNbr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 27) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "DirectMktShipMonth";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 28) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "DirectMktShipDay";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 29) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CPCCardHolderPONbr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 30) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CPCTaxType";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 31) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CPCTaxAmt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 32) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TzConversion";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 33) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TxnDT";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 34) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Amt";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 35) {
            info.type = LodgingDataType.class;
            info.name = "LodgingData";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 36) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ClerkID";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 37) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ServiceName";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 38) {
            info.type = AdditionalTxnFieldsType.class;
            info.name = "AdditionalTxnFields";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 39) {
            info.type = CredentialDataType.class;
            info.name = "CredentialData";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 40) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ConvenienceAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 41) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ShippingAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 42) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "PaymentMethodKey";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 43) {
            info.type = RecurringDataType.class;
            info.name = "RecurringData";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 44) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SurchargeAmtInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex >= +45 && propertyIndex <= +45 + this.AttachmentInfo.size()) {
            info.type = AttachmentInfoType.class;
            info.name = "AttachmentInfo";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}

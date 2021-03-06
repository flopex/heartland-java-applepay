package PosGateway.Exchange.Hps;

import java.util.Hashtable;

import org.ksoap2.serialization.*;

public class ManageSettingsReqType extends AttributeContainer implements KvmSerializable {

    public String MerchNbr;

    public Integer DeviceId;

    public ManageSettingsReqTypeSettingActions SettingActions;

    public ManageSettingsReqType() {
    }

    public ManageSettingsReqType(AttributeContainer inObj, ExtendedSoapSerializationEnvelope envelope) {

        if (inObj == null)
            return;


        SoapObject soapObject = (SoapObject) inObj;
        if (soapObject.hasProperty("MerchNbr")) {
            Object obj = soapObject.getProperty("MerchNbr");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.MerchNbr = j.toString();
                }
            } else if (obj != null && obj instanceof String) {
                this.MerchNbr = (String) obj;
            }
        }
        if (soapObject.hasProperty("DeviceId")) {
            Object obj = soapObject.getProperty("DeviceId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                if (j.toString() != null) {
                    this.DeviceId = Integer.parseInt(j.toString());
                }
            } else if (obj != null && obj instanceof Integer) {
                this.DeviceId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("SettingActions")) {
            Object j = soapObject.getProperty("SettingActions");
            this.SettingActions = (ManageSettingsReqTypeSettingActions) envelope.get(j, ManageSettingsReqTypeSettingActions.class);
        }


    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (propertyIndex == 0) {
            return MerchNbr != null ? MerchNbr : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 1) {
            return DeviceId != null ? DeviceId : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 2) {
            return SettingActions != null ? SettingActions : SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "MerchNbr";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 1) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "DeviceId";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
        if (propertyIndex == 2) {
            info.type = ManageSettingsReqTypeSettingActions.class;
            info.name = "SettingActions";
            info.namespace = "http://Hps.Exchange.PosGateway";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}

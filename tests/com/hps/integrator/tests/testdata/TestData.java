package com.hps.integrator.tests.testdata;

import com.hps.integrator.applepay.ecv1.PaymentData;
import com.hps.integrator.infrastructure.HpsException;

public class TestData {
    public static final String PAYMENT_TOKEN_MC_3DS_JSON = "{\n" +
            "    \"data\": \"XXXXXXXXXXAs10FfwmMthvxrp4BB0MudUwk/xrYkerm0zrkK24ICMDL3a6pyz9uC3bTyvuTSk4S0fbewBBWIwVeCXbr8qD6DRkUe8od77LgY0gdK4P0PvIvEzrOHe0eH9/UZ32RijNaQ+1xt+Y0lJ53NAUzuymynO4kFHXTdUTKWOl6qxYhI3sckpLot6108AYy4EDEaG+Y2iENjzIHYlI6t/mOgYUn7EZAYM1148UhxVKpdAkDBna3BL/GLFxP7vT3CoW87zjscUCEbbqbTMZPkcJa2B21kbDABItQjI9gYlkJjprd3ltx3r2reO8Ea8UtEVCOM6Tg4D4L3H/KXUZiLLeFTK+BUksPbdjQVgOBI14rjfNKgenujUmPxetI5B9XPMaNcBErKdw==\",\n" +
            "    \"header\": {\n" +
            "        \"ephemeralPublicKey\": \"XXXXXXXXXXZIzj0CAQYIKoZIzj0DAQcDQgAElJ0FU66tKNvnBqvkykrTsVw37gw1kRW2jLd4N4jqvqGuHB+KaiWcrMKEI5SI0AKTgR6zIEnYahZmOd4ScZHqOQ==\",\n" +
            "        \"publicKeyHash\": \"XXXXXXXXXX/t54x445nFoX8BcHVeenIHikQRURYqjuY=\",\n" +
            "        \"transactionId\": \"XXXXXXXXXX561c4b4c1c5d2c4de38b124f01a67bbe3ab8910b91a8991c293c71\"\n" +
            "    },\n" +
            "    \"signature\": \"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\",\n" +
            "    \"version\": \"EC_v1\"\n" +
            "}";

    public static final String PAYMENT_DATA_VISA_DECRYPTED_JSON = "{\n" +
            "    \"applicationExpirationDate\": \"200228\",\n" +
            "    \"applicationPrimaryAccountNumber\": \"4111111111111111\",\n" +
            "    \"currencyCode\": \"840\",\n" +
            "    \"deviceManufacturerIdentifier\": \"040010030273\",\n" +
            "    \"paymentData\": {\n" +
            "        \"eciIndicator\": \"5\",\n" +
            "        \"onlinePaymentCryptogram\": \"XXXXf98AAajXbDRg3HSUMAACAAA=\"\n" +
            "    },\n" +
            "    \"paymentDataType\": \"3DSecure\",\n" +
            "    \"transactionAmount\": 100\n" +
            "}\n";

    public static final String PAYMENT_DATA_AMEX_DECRYPTED_JSON = "{\n" +
            "    \"applicationExpirationDate\": \"190228\",\n" +
            "    \"applicationPrimaryAccountNumber\": \"372700699251018\",\n" +
            "    \"currencyCode\": \"840\",\n" +
            "    \"deviceManufacturerIdentifier\": \"030010030273\",\n" +
            "    \"paymentData\": {\n" +
            "        \"onlinePaymentCryptogram\": \"XXXXXXXXUImjWgXRSUccwAACgAAGhgEDoLABAAhAgAABAAAABJ0vEw==\"\n" +
            "    },\n" +
            "    \"paymentDataType\": \"3DSecure\",\n" +
            "    \"transactionAmount\": 100\n" +
            "}\n";

    public static final String PAYMENT_DATA_MC_DECRYPTED_JSON = "{\n" +
            "    \"applicationExpirationDate\": \"171130\",\n" +
            "    \"applicationPrimaryAccountNumber\": \"5473500000000014\",\n" +
            "    \"currencyCode\": \"840\",\n" +
            "    \"deviceManufacturerIdentifier\": \"050110030273\",\n" +
            "    \"paymentData\": {\n" +
            "        \"onlinePaymentCryptogram\": \"XXXXbKK+J9Z5AAWj9GzwAoABFA==\"\n" +
            "    },\n" +
            "    \"paymentDataType\": \"3DSecure\",\n" +
            "    \"transactionAmount\": 1\n" +
            "}\n";

    public static final String PRIVATE_KEY_FILE_PATH = "res/keystore.p12";

    public static final String PRIVATE_KEY_PASSWORD = "heartland";

    public static PaymentData VisaPaymentData() throws HpsException {
        return new PaymentData(PAYMENT_DATA_VISA_DECRYPTED_JSON);
    }

    public static PaymentData AmexPaymentData() throws HpsException {
        return new PaymentData(PAYMENT_DATA_AMEX_DECRYPTED_JSON);
    }

    public static PaymentData McPaymentData() throws HpsException {
        return new PaymentData(PAYMENT_DATA_MC_DECRYPTED_JSON);
    }
}
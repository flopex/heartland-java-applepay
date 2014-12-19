## Heartland SecureSubmit Java SDK
This SDK allows Java developers to build on Heartland Payment System's Payment Gateway.

```java
PaymentToken token = new PaymentToken("{{PKPaymentToken_JSON}}");
DecryptService service = new DecryptService("MyKeyStore.p12", "MyKeyStorePassword");
PaymentData data = service.decrypt(token);

HpsCharge response = creditService.charge(token, cardholderdata, true);
```

## Requirements
- Java 1.7
- ApplePay MerchantID Certificate in p12 format

## Contributing

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

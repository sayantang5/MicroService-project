@Data
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZellePaymentResponseData {
	
 private ZelleStatus status;
 private PaymentResponse paymentResponse;

}

@Data
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentResponse {
	
	private String batchId;
	private List<PaymentStatus> paymentStatus;
	

}


@Data 
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentStatus {
	
	
	private String endToEndId;
    private String uetr;
    private String status;
    private String errorCode;
    private String errorDesc;

}





Response format


{
  "status": {
    "code": "PF_200",
    "desc": "Success"
  },
  "paymentResponse": {
    "batchId": "TRUIST-1596471684",
    "paymentStatus": [
      {
        "endToEndId": "123456789987654321",
        "uetr": "7b0b8e7e-6893-4b36-93bc-c68aabaf5859",
        "status": "SUCCESS",
        "errorCode": "",
        "errorDesc": ""
      },
      {
        "endToEndId": "123456789987654322",
        "uetr": "e6cd77b8-b7b4-4d7c-8845-fadfee9952bd",
        "status": "FAIL",
        "errorCode": "Error Code",
        "errorDesc": "Error Description"
      },
      {
        "endToEndId": "123456789987654323",
        "uetr": "e6cd77b8-b7b4-4d7c-8845-fadfee9952bd",
        "status": "INVALID DATA",
        "errorCode": "Error Code",
        "errorDesc": "Describe for which field validation got failed"
      }
      
    ]
  }
}




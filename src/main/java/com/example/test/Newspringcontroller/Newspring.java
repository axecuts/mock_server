package com.example.test.Newspringcontroller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import com.example.test.Folderstat.FolderStats;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/rest")
public class Newspring {

    @RequestMapping(value="/calculateStatus",method = GET)
    @ResponseBody
    public FolderStats greeting(@RequestParam("path") String path) {
        return FolderStats.check(path);
    }

    @RequestMapping(value = "/services/customer/managecustomerdata/plandetails/v3", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getPlanDetails(@RequestParam("id") String id) throws Exception {
        String response=null;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss.SSSXXX");
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date date = calendar.getTime();
        simpleDateFormat.format(date);
        if (id.equals("6358848011")) {

            response="{\"getCustomerCurrentPlanDetailsResMsg\": {\"ebmHeader\": {\"consumerTransactionId\": \"onlineF12345\"},\"dataArea\": {\"getCustomerCurrentPlanDetailsResponse\": {\"status\": {\"statusCode\": \"GetCustomerCurrentPlanDetails-0000-S\",\"statusDescription\": \"Request Processed Successfully\"},\"logicalResource\": {\"identification\": {\"id\": null}},\"customerAccount\": {\"identification\": {\"id\": \"26798\",\"type\": \"BillingAccountNumber\"}},\"boosters\": {\"boosterDetails\": [{\"productSpecification\": {\"name\": \"International Roaming @ 3599 Unlimited Incoming- 10 days pack - Zone B\",\"productNumber\": \"S1-YTZ162\",\"validFor\": \"2019-09-11 03:09:32.271+05:30\",\"eventDate\":\"{{now offset='-2 days' format='yyyy-MM-dd hh:MM:ss.SSSXXX'}}\",\"productSpecCharacteristic\": [{\"identification\": {\"name\": \"ConsentEnabled\",\"value\": \"1\"}},{\"identification\": {\"name\": \"ConsentActive\",\"value\": \"1\"}}]}}]}}}}}";
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}

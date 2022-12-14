package com.jphaugla.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;


import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


//  setting unrealistically low TTL here for demo purposes
@RedisHash(value="Transaction", timeToLive = 1000)

public class Transaction  {
    private @Id String tranId;
    private @Indexed String accountNo;
    // debit or credit
    private String amountType;
    private @Indexed String merchantAccount;
    private String referenceKeyType;
    private String referenceKeyValue;
    private String originalAmount;
    private String amount;
    private String tranCd ;
    private String description;
    private Date initialDate;
    private Date settlementDate;
    private Date postingDate;
    //  this is authorized, posted, settled
    private @Indexed String status   ;
    private @Indexed String transactionReturn;
    private String location;
    //  could not get this to set ttl
    // private @TimeToLive Long expiration;

}
